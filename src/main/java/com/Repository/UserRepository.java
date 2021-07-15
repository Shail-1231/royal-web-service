package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bean.UserBean;

public interface UserRepository extends JpaRepository<UserBean, Integer> {

}
