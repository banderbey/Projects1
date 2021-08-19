package com.example.project1.model;


import com.example.project1.model.UserDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<UserDAO,String> {

}
