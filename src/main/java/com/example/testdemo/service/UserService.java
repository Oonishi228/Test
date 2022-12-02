package com.example.testdemo.service;

import com.example.testdemo.entity.User;
import com.example.testdemo.entity.User;
import com.example.testdemo.form.CreateForm;
import com.example.testdemo.form.UpdateForm;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(int id) throws Exception;

    List<User> findByResidence(String residence);

    List<User> findByName(String Name);

    List<User> findByNameAndResidence(String name, String residence);

    void createUser(CreateForm form);

    void updateUser(int id, UpdateForm form);

    void deleteById(int id);
}
