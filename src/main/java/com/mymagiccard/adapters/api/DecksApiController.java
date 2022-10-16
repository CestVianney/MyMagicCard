package com.mymagiccard.adapters.api;

import com.mymagiccard.adapters.api.mapper.DeckApiMapper;
import com.mymagiccard.adapters.api.response.deck.DeckCartesResponse;
import com.mymagiccard.domain.model.Deck;
import com.mymagiccard.domain.model.User;
import com.mymagiccard.domain.ports.api.DecksApiPort;
import com.mymagiccard.domain.service.impl.CartesAppServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/decks")
@Api(value = "decks", tags = "decks")
@AllArgsConstructor
public class DecksApiController implements DecksApiPort {

    private CartesAppServiceImpl service;

    private DeckApiMapper deckApiMapper;

    @Override
    @ApiOperation("Ajout d'un deck en base")
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/createDeck",
            produces = "application/json; charset = UTF-8"
    )
    public void postNewDeck(@ApiParam(name = "name", value = "Nom du deck", required = true) @RequestParam String name,
                            @ApiParam(name = "username", value = "Nom de l'utilisateur", required = true) @RequestParam String username) {
        Deck deck = new Deck();
        User user = new User();
        user.setName(username);
        deck.setName(name);
        deck.setUser(user);

        service.postDeckToDb(deck);
    }

    @Override
    @ApiOperation("Ajout d'une carte dans un deck")
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/postCarteToDeck",
            produces = "application/json; charset = UTF-8"
    )
    public void postCartesToDeck(@ApiParam(name = "idDeck", value = "Nom du deck", required = true) @RequestParam Integer idDeck,
                            @ApiParam(name = "idCarte", value = "Id de la carte", required = true) @RequestParam Integer idCarte) {
        service.postCarteToDeckDb(idDeck, idCarte);
    }

    @Override
    @ApiOperation("Récupérer la liste de cartes d'un deck")
    @GetMapping(path = "/deck", produces = MediaType.APPLICATION_JSON_VALUE)
    public DeckCartesResponse getDeckCards(@ApiParam(value = "deckName", required = true) @RequestParam Integer deckId) {
        return deckApiMapper.mapDeckCartesToResponse(this.service.getDeckCartes(deckId));
    }
}
