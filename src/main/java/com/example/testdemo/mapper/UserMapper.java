package com.example.testdemo.mapper;

import com.example.testdemo.entity.User;
import com.example.testdemo.entity.User;
import com.example.testdemo.form.CreateForm;
import com.example.testdemo.form.UpdateForm;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users")
    List<User> findAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    Optional<User> findById(int id);

    @Select("SELECT * FROM users WHERE name = #{name}")
    List<User> findByName(String name);

    @Select("SELECT * FROM users WHERE residence = #{residence}")
    List<User> findByResidence(String residence);

    @Select("SELECT * FROM users WHERE name = #{name} AND residence = #{residence}")
    List<User> findByNameAndResidence(String name, String residence);

    @Insert("INSERT INTO users (name, residence) VALUES (#{name}, #{residence})")
    void create(CreateForm form);

    @Update("UPDATE users SET name = #{name}, residence = #{residence} WHERE id = #{id}")
    void update(UpdateForm form);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void deleteById(int id);
}
