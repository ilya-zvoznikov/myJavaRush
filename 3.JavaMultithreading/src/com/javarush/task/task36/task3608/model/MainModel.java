package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.model.service.UserService;
import com.javarush.task.task36.task3608.model.service.UserServiceImpl;

import java.util.List;

public class MainModel implements Model {
    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

    private List<User> getAllUsers(List<User> list) {
        return userService.filterOnlyActiveUsers(list);
    }

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(this.getAllUsers(userService.getUsersBetweenLevels(1, 100)));
        modelData.setDisplayDeletedUserList(false);
    }

    @Override
    public void loadDeletedUsers() {
        List<User> users = this.getAllUsers(userService.getAllDeletedUsers());
        modelData.setDisplayDeletedUserList(true);
        modelData.setUsers(users);
    }

    @Override
    public void loadUserById(long userId) {
        User user = userService.getUsersById(userId);
        modelData.setActiveUser(user);
    }

    @Override
    public void deleteUserById(long id) {
        userService.deleteUser(id);
        User user = userService.getUsersById(id);
        modelData.getActiveUser();
    }
}
