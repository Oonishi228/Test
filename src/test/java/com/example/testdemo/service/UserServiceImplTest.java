package com.example.testdemo.service;

import com.example.testdemo.entity.User;
import com.example.testdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @InjectMocks
    UserServiceImpl userServiceImpl;

    @Mock
    UserMapper userMapper;

    @Test
    public void 存在するユーザーのIDを指定したときに正常にユーザーが返されること() throws Exception {
        doReturn(Optional.of(new User(1, "koyama", "tokyo"))).when(userMapper).findById(1);

        User actual = userServiceImpl.findById(1);
        assertThat(actual.getId()).isEqualTo(1);
        assertThat(actual.getName()).isEqualTo("koyama");
        assertThat(actual.getResidence()).isEqualTo("tokyo");

    }
}
