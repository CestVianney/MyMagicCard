package com.mymagiccard.adapters.api.mapper;

import com.mymagiccard.domain.model.CarteParam;
import com.mymagiccard.adapters.api.response.carte.CarteParamResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(uses = EditionApiMapper.class)
public interface CartesParamApiMapper {

    List<CarteParamResponse> mapsToResponse(List<CarteParam> model);

}
