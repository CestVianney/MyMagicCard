package com.swagger.swaggerApi.adapters.api.mapper;

import com.swagger.swaggerApi.adapters.api.response.EditionResponse;
import com.swagger.swaggerApi.domain.model.Edition;
import org.mapstruct.Mapper;

@Mapper
public interface EditionApiMapper {

    EditionResponse mapToResponse(Edition model);

}
