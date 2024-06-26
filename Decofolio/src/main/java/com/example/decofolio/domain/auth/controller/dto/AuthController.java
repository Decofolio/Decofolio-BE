package com.example.decofolio.domain.auth.controller.dto;

import com.example.decofolio.domain.auth.controller.dto.request.SignInRequest;
import com.example.decofolio.domain.auth.controller.dto.response.TokenResponse;
import com.example.decofolio.domain.auth.service.SignInService;
import com.example.decofolio.domain.auth.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/auth")
@RestController
public class AuthController {

    private final TokenService tokenService;
    private final SignInService signInService;

    //토큰 재발급
    @PutMapping("/token")
    public TokenResponse userTokenRefresh(@RequestHeader("Refresh-Token") String refreshToken) {
        return tokenService.execute(refreshToken);
    }

    //로그인
    @PostMapping("/login")
    public TokenResponse signIn(@RequestBody @Valid SignInRequest signInRequest) {
        return signInService.execute(signInRequest);
    }
}
