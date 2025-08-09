package com.courseapp.ourcourseplatform.user;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseapp.ourcourseplatform.ResourceNotFoundException;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    public UserEntity addUser(UserEntity user) {
        return userRepository.save(user);
    }
    public UserEntity getUserById(ObjectId id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }
    public void deleteUser(ObjectId id) {
        userRepository.deleteById(id);
    }
    public UserEntity updateUser(ObjectId id, UserEntity user) {
        UserEntity existingUser = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        existingUser.setUsername(user.getUsername());
        existingUser.setEmail(user.getEmail());
        // Update other fields as necessary
        return userRepository.save(existingUser);
    }
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }
}
