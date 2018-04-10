package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
<<<<<<< HEAD
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

//import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;
//import java.io.InputStreamReader;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
=======
>>>>>>> ec70b27a87d6854e65316b122c5560c063f30757

public class Client {
    public class SocketThread extends Thread {

<<<<<<< HEAD
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage("Участник " + userName + " присоединился к чату");
        }

        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage("Участник " + userName + " покинул чат");
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this) {
                Client.this.notify();
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException {
            while (true) {
                Message message = Client.this.connection.receive();
                if (message.getType() == MessageType.NAME_REQUEST) {
                    connection.send(new Message(MessageType.USER_NAME, getUserName()));
                } else if (message.getType() == MessageType.NAME_ACCEPTED) {
                    notifyConnectionStatusChanged(true);
                    break;
                } else throw new IOException("Unexpected MessageType");
            }
        }

        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            while (true) {
                Message message = Client.this.connection.receive();
                if (message.getType() == MessageType.TEXT) processIncomingMessage(message.getData());
                else if (message.getType() == MessageType.USER_ADDED) informAboutAddingNewUser(message.getData());
                else if (message.getType() == MessageType.USER_REMOVED) informAboutDeletingNewUser(message.getData());
                else throw new IOException("Unexpected MessageType");
            }
        }

        @Override
        public void run() {
            try {
                Socket socket = new Socket(getServerAddress(), getServerPort());
                Client.this.connection = new Connection(socket);
                clientHandshake();
                clientMainLoop();
            } catch (Exception e) {
                notifyConnectionStatusChanged(false);
            }

        }
=======
>>>>>>> ec70b27a87d6854e65316b122c5560c063f30757
    }

    protected Connection connection;
    private volatile boolean clientConnected = false;

<<<<<<< HEAD
    protected String getServerAddress() {
        ConsoleHelper.writeMessage("Введите адрес сервера");
        String serverAddress = ConsoleHelper.readString();
        /*Pattern pattern = Pattern.compile("^(((([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]))|(localhost))$");
        Matcher matcher = pattern.matcher(serverAddress);
        if (matcher.matches()) return serverAddress;*/
        return serverAddress;
    }

    protected int getServerPort() {
        ConsoleHelper.writeMessage("Введите номер порта сервера");
        int serverPort = ConsoleHelper.readInt();
        /*Pattern pattern = Pattern.compile("^(102[5-9]|10[3-9][0-9]|1[1-9][0-9]{2}|[2-9][0-9]{3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])$");
        Matcher matcher = pattern.matcher(String.valueOf(serverPort));
        if (matcher.matches()) return serverPort;*/
        return serverPort;
    }

    protected String getUserName() {
        ConsoleHelper.writeMessage("Введите имя");
        String userName = ConsoleHelper.readString();
        return userName;
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            Message message = new Message(MessageType.TEXT, text);
            connection.send(message);
        } catch (IOException e) {
            clientConnected = false;
            ConsoleHelper.writeMessage("Произошла ошибка");
        }
    }

    public void run() {
        SocketThread socketThread = getSocketThread();
        socketThread.setDaemon(true);
        socketThread.start();
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                ConsoleHelper.writeMessage("Возникла ошибка");
                return;
            }
        }
        if (clientConnected) {
            ConsoleHelper.writeMessage("Соединение установлено. Для выхода наберите команду 'exit'.");
        } else {
            ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");
        }
        while (clientConnected) {
            String text = ConsoleHelper.readString();
            if ("exit".equals(text)) return;
            if (shouldSendTextFromConsole()) sendTextMessage(text);
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

=======
>>>>>>> ec70b27a87d6854e65316b122c5560c063f30757
}
