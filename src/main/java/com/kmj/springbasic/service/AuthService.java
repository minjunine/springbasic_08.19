package com.kmj.springbasic.service;

import com.kmj.springbasic.dto.PostUserRequestDto;
import com.kmj.springbasic.dto.SignInRequestDto;

import jakarta.validation.Valid;

public interface AuthService {
    String signUp(@Valid PostUserRequestDto requestBody);

    String signIn(@Valid SignInRequestDto requestBody);
}
