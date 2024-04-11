package com.example.decofolio.domain.auth.controller.dto;

import com.example.decofolio.domain.auth.controller.dto.response.TokenResponse;
import com.example.decofolio.domain.auth.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/auth")
@RestController
public class AuthController {

    private final TokenService tokenService;

    @PutMapping("/token")
    public TokenResponse userTokenRefresh(@RequestHeader("Refresh-Token") String refreshToken) {
        return tokenService.execute(refreshToken);
    }
}
