package heech.hellcoding.user.service;

import heech.hellcoding.user.domain.User;
import heech.hellcoding.user.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Test
    void getUserList() {
        List<User> result = userService.getUserList();
        assertThat(result.size()).isEqualTo(1000);
    }

    @Test
    void insertUser() {
        User user = new User();
        user.setName("홍길동");

        User resultUser = userService.insertUser(user);

        User result = userService.getUser(resultUser.getId()).get();
        assertThat(result.getName()).isEqualTo(user.getName());
    }

    @Test
    void deleteUser() {
        User user = new User();
        user.setName("홍길동");

        User resultUser = userService.insertUser(user);
        //TODO 삭제 test 작성하기

    }

}