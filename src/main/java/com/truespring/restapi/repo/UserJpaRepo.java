package com.truespring.restapi.repo;

import com.truespring.restapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepo extends JpaRepository<User, Long> {
}
