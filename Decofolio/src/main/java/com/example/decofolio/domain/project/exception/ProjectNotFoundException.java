package com.example.decofolio.domain.project.exception;


import com.example.decofolio.global.error.exception.CustomException;
import com.example.decofolio.global.error.exception.ErrorCode;

public class ProjectNotFoundException extends CustomException {

    public static final CustomException EXCEPTION = new ProjectNotFoundException();

    public ProjectNotFoundException() {
        super(ErrorCode.FEED_NOT_FOUUND);
    }
}