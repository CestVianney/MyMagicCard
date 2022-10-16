package com.swagger.swaggerApi.adapters.api;

import com.swagger.swaggerApi.adapters.api.mapper.CartesParamApiMapper;
import com.swagger.swaggerApi.adapters.api.response.carte.CarteParamResponse;
import com.swagger.swaggerApi.domain.ports.api.CartesApiPort;
import com.swagger.swaggerApi.domain.service.impl.CartesAppServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/cartes")
@Api(value = "cartes", tags = "cartes")
@AllArgsConstructor
public class CartesApiController implements CartesApiPort {

    private CartesAppServiceImpl service;

    private CartesParamApiMapper cartesParamApiMapper;

    @Override
    @ApiOperation("Récupération de l'ensemble des cartes de la bibliothèque")
    @GetMapping(path = "/cartes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CarteParamResponse> getAllCards() {
            return cartesParamApiMapper.mapsToResponse(this.service.getCartes());
    }

    @Override
    @ApiOperation("Récupération d'une liste de cartes dont le nom contient")
    @GetMapping(path = "/carte", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CarteParamResponse> findByNameBeginning(@ApiParam("Valeur contenue dans le nom") String name) {
        if(name == null){
            name = "";
        }
        return cartesParamApiMapper.mapsToResponse(this.service.getCartesBeginningWith(name));
    }

}
