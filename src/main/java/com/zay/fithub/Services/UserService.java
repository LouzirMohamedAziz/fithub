package com.zay.fithub.Services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.zay.fithub.Entities.User;
import com.zay.fithub.Repositories.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cart not found with id: " + id));
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
