package com.mymagiccard.adapters.api.mapper;

import com.mymagiccard.domain.model.Carte;
import com.mymagiccard.adapters.api.response.carte.CarteResponse;
import org.mapstruct.Mapper;

@Mapper
public interface CartesApiMapper {

    CarteResponse mapToResponse(Carte model);

}
