package com.example.decofolio.domain.viewcount.controller.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViewCountResponse {
    private Long feedId;
    private int viewCount;

    public ViewCountResponse(Long feedId, int viewCount) {
        this.feedId = feedId;
        this.viewCount = viewCount;
    }

    public Long getFeedId() {
        return feedId;
    }

    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}

