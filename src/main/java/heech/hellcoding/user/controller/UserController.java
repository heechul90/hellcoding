package heech.hellcoding.user.controller;

import heech.hellcoding.user.domain.User;
import heech.hellcoding.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long id, @RequestBody User user) {
        Optional<User> findUser = userService.getUser(id);
        if (!findUser.isPresent()) {
            throw new IllegalStateException(id + " 는 없는 id 입니다.");
        }
        User updateUser = new User();
        updateUser.setId(id);
        updateUser.setName(user.getName());
        final User resultUser = userService.insertUser(updateUser);
        return ResponseEntity.ok(resultUser);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}
