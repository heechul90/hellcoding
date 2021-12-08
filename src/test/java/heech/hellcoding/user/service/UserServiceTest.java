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
        Assertions.assertThat(result.size()).isEqualTo(1000);
    }

    @Test
    void insertUser() {
        //given
        User user = new User();
        user.setName("홍길동");

        //when
        User u = userService.insertUser(user);

        //then
        User result = userService.getUser(u.getId()).get();
        Assertions.assertThat(result.getName()).isEqualTo(user.getName());
    }

}