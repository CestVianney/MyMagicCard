package com.mymagiccard.adapters.api.response;

import com.mymagiccard.adapters.api.response.deck.DeckResponse;
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
