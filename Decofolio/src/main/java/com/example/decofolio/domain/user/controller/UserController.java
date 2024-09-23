package com.example.decofolio.domain.user.controller;

import com.example.decofolio.domain.user.controller.dto.request.SignUpRequest;
import com.example.decofolio.domain.user.controller.dto.request.UpdateInfoRequest;
import com.example.decofolio.domain.user.controller.dto.request.WithdrawalRequest;
import com.example.decofolio.domain.user.service.SignUpService;
import com.example.decofolio.domain.user.service.UpdateInfoService;
import com.example.decofolio.domain.user.service.UserLogoutService;
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
    private final UserLogoutService userLogoutService;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void signUp(@RequestBody @Valid SignUpRequest signUpRequest) {
        signUpService.execute(signUpRequest);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping
    public void Withdrawal(@RequestBody @Valid WithdrawalRequest request) {
        withdrawalService.execute(request);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping
    public void updateUser(@RequestBody @Valid UpdateInfoRequest updateInfoRequest) {
        updateInfoService.execute(updateInfoRequest);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/logout")
    public void logout() {
        userLogoutService.execute();
    }
}
