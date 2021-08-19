/*
package com.example.project1.service.imp;

import com.example.project1.model.UserDAO;
import com.example.project1.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@ComponentScan({"com.example.project1.controller"})
@EnableJpaRepositories("com.example.project1.repository")
public class UserServiceImp implements UserService {
    @Autowired
    private final UserRepository userRepository;


    @Override
    public void addUser(UserDTO userDTO) {
        UserDAO userDAO = new UserDAO();
        userDAO.setName(userDTO.getName());
        userRepository.save(userDAO);
    }
}
*/
