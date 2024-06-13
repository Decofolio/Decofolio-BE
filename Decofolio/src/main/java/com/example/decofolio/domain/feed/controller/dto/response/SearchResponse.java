package com.example.decofolio.domain.feed.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class SearchResponse {

    private Long feedId;
    //제목
    private String title;

    private String tag1;

    private String tag2;

    private String tag3;

}
