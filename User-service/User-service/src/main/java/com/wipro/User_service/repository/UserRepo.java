package com.wipro.User_service.repository;

import com.wipro.User_service.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<Users,Integer> {
    Optional<Users> findBySavingnumber(String savingnumber);
}
