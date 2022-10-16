package com.swagger.swaggerApi.adapters.api.mapper;

import com.swagger.swaggerApi.adapters.api.response.UserResponse;
import com.swagger.swaggerApi.domain.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserApiMapper {

    UserResponse mapToResponse(User model);

}
