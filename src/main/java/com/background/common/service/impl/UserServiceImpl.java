package com.background.common.service.impl;

import com.background.common.service.UserService;
import com.background.domain.model.User;
import com.background.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by umhyein on 2017. 10. 31..
 */
@Component
@Transactional( readOnly = true )
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> allUser() {
        return userRepository.allUser();
    }
}
