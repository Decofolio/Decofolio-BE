package com.example.decofolio.domain.user.controller;

import com.example.decofolio.domain.user.controller.dto.request.SignUpRequest;
import com.example.decofolio.domain.user.controller.dto.request.UpdateInfoRequest;
import com.example.decofolio.domain.user.service.LogoutService;
import com.example.decofolio.domain.user.service.SignUpService;
import com.example.decofolio.domain.user.service.UpdateInfoService;
import com.example.decofolio.domain.user.service.WithdrawalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private final SignUpService signUpService;
    private final WithdrawalService withdrawalService;
    private final UpdateInfoService updateInfoService;
    private final LogoutService logoutService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void signUp(@RequestBody @Valid SignUpRequest signUpRequest) {
        signUpService.execute(signUpRequest);
    }

    
}
