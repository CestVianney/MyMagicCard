package com.swagger.swaggerApi.domain.ports.api;

import com.swagger.swaggerApi.adapters.api.response.UserResponse;

import java.util.List;

public interface UsersApiPort {

    void postNewUser(String username, String password);

    UserResponse getUserDecks(String username);

    List<String> getUserList();

    boolean findUserAuth(String username, String password);

}
