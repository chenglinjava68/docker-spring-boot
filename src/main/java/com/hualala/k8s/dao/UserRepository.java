package com.hualala.k8s.dao;

import com.hualala.k8s.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

}
