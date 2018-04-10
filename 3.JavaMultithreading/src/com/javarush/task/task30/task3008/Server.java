package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap();

    public static void sendBroadcastMessage(Message message) {
        for (Map.Entry<String, Connection> client : connectionMap.entrySet()
                ) {
            try {
                client.getValue().send(message);
            } catch (IOException e) {
                System.out.println("Сообщение не отправлено");
            }
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage("Установлено новое соединение с удаленным адресом " + socket.getRemoteSocketAddress());
            String newClientName = "";
            try (Connection connection = new Connection(socket)) {
                newClientName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, newClientName));
                sendListOfUsers(connection, newClientName);
                serverMainLoop(connection, newClientName);
            } catch (Exception e) {
                ConsoleHelper.writeMessage("Произошла ошибка при обмене данными с удаленным адресом");
            }
            if (newClientName != null && !"".equals(newClientName)) {
                connectionMap.remove(newClientName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, newClientName));
            }
            ConsoleHelper.writeMessage("Соединение с удаленным адресом закрыто");
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            String name;
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message answer = connection.receive();
                if (answer.getType() == MessageType.USER_NAME) {
                    name = answer.getData();
                    if (!name.equals("") && name != null && !connectionMap.containsKey(name)) {
                        connectionMap.put(name, connection);
                        connection.send(new Message(MessageType.NAME_ACCEPTED));
                        break;
                    }
                }
            }
            return name;
        }

        private void sendListOfUsers(Connection connection, String userName) throws IOException {
            for (Map.Entry<String, Connection> client : connectionMap.entrySet()
                    ) {
                String name = client.getKey();
                if (!userName.equals(name)) {
                    connection.send(new Message(MessageType.USER_ADDED, name));
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    String messageText = userName + ": " + message.getData();
                    sendBroadcastMessage(new Message(MessageType.TEXT, messageText));
                } else {
//                    System.out.println("Это не текстовое сообщение");
                    ConsoleHelper.writeMessage("Это не текстовое сообщение!");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int port = ConsoleHelper.readInt();
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Сервер запущен");
            while (true) {
                Socket s = serverSocket.accept();
                Handler handler = new Handler(s);
                handler.start();
            }
        } catch (Exception e) {
            System.out.println("Ошибка подключения");
            serverSocket.close();
        }
    }
}
