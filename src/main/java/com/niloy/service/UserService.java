package com.niloy.service;

import com.niloy.modal.User;

public interface UserService {

    User findUserProfileByJwt(String jwt)throws Exception;

    User findUserByEmail(String email)throws Exception;

    User findUserById(long userId)throws Exception;

    User UpdateUserProjectSize(User user, int number);
}
