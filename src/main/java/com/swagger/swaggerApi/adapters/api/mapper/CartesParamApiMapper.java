package com.swagger.swaggerApi.adapters.api.mapper;

import com.swagger.swaggerApi.adapters.api.response.carte.CarteParamResponse;
import com.swagger.swaggerApi.domain.model.CarteParam;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(uses = EditionApiMapper.class)
public interface CartesParamApiMapper {

    List<CarteParamResponse> mapsToResponse(List<CarteParam> model);

}
