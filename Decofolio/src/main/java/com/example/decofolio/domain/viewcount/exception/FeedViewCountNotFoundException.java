package com.example.decofolio.domain.viewcount.exception;

import com.example.decofolio.global.error.exception.CustomException;
import com.example.decofolio.global.error.exception.ErrorCode;

public class FeedViewCountNotFoundException extends CustomException {

    public static final CustomException EXCEPTION = new FeedViewCountNotFoundException();

    public FeedViewCountNotFoundException() {
        super(ErrorCode.FEED_VIEW_COUNT_NOT_FOUND);
    }
}