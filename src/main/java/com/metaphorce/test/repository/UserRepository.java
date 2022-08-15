package com.metaphorce.test.repository;

import com.metaphorce.test.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>  {
}
