package com.swagger.swaggerApi.adapters.api.response;

import com.swagger.swaggerApi.adapters.api.response.deck.DeckResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserResponse {
    private String name;
    private String password;
    private List<DeckResponse> decks;
}
