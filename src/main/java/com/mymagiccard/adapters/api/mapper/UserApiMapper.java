package com.mymagiccard.adapters.api.mapper;

import com.mymagiccard.adapters.api.response.UserResponse;
import com.mymagiccard.domain.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserApiMapper {

    UserResponse mapToResponse(User model);

}
