package com.mymagiccard.adapters.api.mapper;

import com.mymagiccard.adapters.api.response.EditionResponse;
import com.mymagiccard.domain.model.Edition;
import org.mapstruct.Mapper;

@Mapper
public interface EditionApiMapper {

    EditionResponse mapToResponse(Edition model);

}
