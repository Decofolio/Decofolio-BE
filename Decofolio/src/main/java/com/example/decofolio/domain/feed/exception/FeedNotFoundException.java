package com.example.decofolio.domain.feed.exception;

import com.example.decofolio.global.error.exception.CustomException;
import com.example.decofolio.global.error.exception.ErrorCode;

public class FeedNotFoundException extends CustomException {

    public static final FeedNotFoundException EXCEPTION =
            new FeedNotFoundException();

    private FeedNotFoundException() {
        super(ErrorCode.FEED_NOT_FOUUND);
    }
}
