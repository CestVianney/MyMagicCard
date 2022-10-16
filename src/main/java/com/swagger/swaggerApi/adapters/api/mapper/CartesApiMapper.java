package com.swagger.swaggerApi.adapters.api.mapper;

import com.swagger.swaggerApi.adapters.api.response.carte.CarteResponse;
import com.swagger.swaggerApi.domain.model.Carte;
import org.mapstruct.Mapper;

@Mapper
public interface CartesApiMapper {

    CarteResponse mapToResponse(Carte model);

}
