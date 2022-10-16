package com.swagger.swaggerApi.adapters.api;

import com.swagger.swaggerApi.adapters.api.mapper.UserApiMapper;
import com.swagger.swaggerApi.adapters.api.response.UserResponse;
import com.swagger.swaggerApi.domain.model.User;
import com.swagger.swaggerApi.domain.ports.api.UsersApiPort;
import com.swagger.swaggerApi.domain.service.impl.CartesAppServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
@Api(value = "users", tags = "users")
@AllArgsConstructor
public class UsersApiController implements UsersApiPort {

    private CartesAppServiceImpl service;

    private UserApiMapper userApiMapper;

    @Override
    @ApiOperation("Récupérer la liste de decks de l'utilisateur")
    @GetMapping(path = "/userDecks", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse getUserDecks(@ApiParam("username") String username) {
        return userApiMapper.mapToResponse(this.service.getUserDecks(username));
    }

    @Override
    @ApiOperation("Trouver si un utilisateur existe ou non")
    @GetMapping(path = "/existingUser", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean findUserAuth(String username, String password) {
        return this.service.getUserAuth(username, password);
    }

    @Override
    @ApiOperation("Insertion d'un nouvel utilisateur en base")
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/createUser",
            produces = "application/json; charset=UTF-8")
    public void postNewUser(@ApiParam(name = "username" ,value = "Nom de l'utilisateur", required = true) @RequestParam String username,
                            @ApiParam(name = "password", value = "Mot de passe de l'utilisateur", required = true) @RequestParam String password) {
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        service.postUserToDb(user);
    }

    @Override
    @ApiOperation("Récupération de la liste des utilisateurs")
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/getUsers",
            produces = "application/json; charset=UTF-8")
    public List<String> getUserList() {
        return service.getUserList();
    }

}
