package com.swagger.swaggerApi.domain.ports.api;

import com.swagger.swaggerApi.adapters.api.response.carte.CarteParamResponse;

import java.util.List;

public interface CartesApiPort {

    List<CarteParamResponse> getAllCards();

    List<CarteParamResponse> findByNameBeginning(String name);

}
