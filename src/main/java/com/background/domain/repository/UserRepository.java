package com.background.domain.repository;

import com.background.domain.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by umhyein on 2017. 10. 30..
 */
@Repository
public interface UserRepository {

    List<User> allUser();
}
