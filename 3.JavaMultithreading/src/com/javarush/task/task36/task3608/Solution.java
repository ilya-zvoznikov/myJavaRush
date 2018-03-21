package com.javarush.task.task36.task3608;

import com.javarush.task.task36.task3608.controller.*;
import com.javarush.task.task36.task3608.model.*;
import com.javarush.task.task36.task3608.view.*;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();

        usersView.fireEventOpenUserEditForm(126L);

        editUserView.fireEventUserDeleted(124L);

        usersView.fireEventShowDeletedUsers();
    }
}