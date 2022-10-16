package com.mymagiccard.domain.ports.api;

import com.mymagiccard.adapters.api.response.UserResponse;

import java.util.List;

public interface UsersApiPort {

    void postNewUser(String username, String password);

    UserResponse getUserDecks(String username);

    List<String> getUserList();

    boolean findUserAuth(String username, String password);

}
