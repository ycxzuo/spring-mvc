package com.yczuoxin.repository;

import com.yczuoxin.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getUser();
}
