package com.mymagiccard.domain.ports.api;

import com.mymagiccard.adapters.api.response.carte.CarteParamResponse;

import java.util.List;

public interface CartesApiPort {

    List<CarteParamResponse> findByNameBeginning(String name);

}
