package heech.hellcoding.user.controller;

import heech.hellcoding.user.domain.User;
import heech.hellcoding.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @PostMapping("/insert")
    public User insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
