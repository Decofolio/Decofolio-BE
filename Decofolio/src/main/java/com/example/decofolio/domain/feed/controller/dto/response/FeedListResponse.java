package com.example.decofolio.domain.feed.controller.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FeedListResponse {
    private Long feedId;
    //제목
    private String title;

    private String tag1;

    private String tag2;

    private String tag3;

}
