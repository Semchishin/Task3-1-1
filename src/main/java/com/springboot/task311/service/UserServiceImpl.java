package com.springboot.task311.service;

import com.springboot.task311.model.User;
import com.springboot.task311.repository.UserRepository;
import org.springframework.stereotype.Service;



import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }


    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User showUserById(long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);

    }
    @Override
    public void updateUser(User user){
        userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
