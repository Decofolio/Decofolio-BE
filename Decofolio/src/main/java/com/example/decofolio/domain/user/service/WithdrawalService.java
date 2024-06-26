package com.example.decofolio.domain.user.service;

import com.example.decofolio.domain.user.controller.dto.request.WithdrawalRequest;
import com.example.decofolio.domain.user.domain.User;
import com.example.decofolio.domain.user.domain.repository.UserRepository;
import com.example.decofolio.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@RequiredArgsConstructor
@Service
public class WithdrawalService {
    private final UserRepository userRepository;
    private final UserFacade userFacade;

    @Transactional
    public void execute(WithdrawalRequest request) {
        User user = userFacade.getCurrentUser();

        userFacade.checkPassword(user, request.getPassword());

        userRepository.delete(user);
    }
}
