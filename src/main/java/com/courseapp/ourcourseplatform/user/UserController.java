package com.courseapp.ourcourseplatform.user;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    
    @GetMapping("/all")
    public List<UserEntity> getUsers() {
        return userService.getUsers();
    }
    @PostMapping("/add")
    public UserEntity addUser(@RequestBody UserEntity user) {
        return userService.addUser(user);
    }
    @GetMapping("/{id}/get")
    public UserEntity getUserById(@PathVariable ObjectId id) {
        return userService.getUserById(id);
    }
    @DeleteMapping("/{id}/delete")
    public void deleteUser(@PathVariable ObjectId id) {
        userService.deleteUser(id);
    }
    @PutMapping("/{id}/update")
    public UserEntity updateUser(@PathVariable ObjectId id, @RequestBody UserEntity user) {
        return userService.updateUser(id, user);
    }
    @DeleteMapping("/deleteAll")
    public void deleteAllUsers() {
        userService.deleteAllUsers();
    }
}
    