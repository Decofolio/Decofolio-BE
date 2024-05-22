package com.example.decofolio.domain.feed.controller.dto;

import com.example.decofolio.domain.feed.controller.dto.request.NoticeFeedRequest;
import com.example.decofolio.domain.feed.controller.dto.request.UpdateFeedRequest;
import com.example.decofolio.domain.feed.controller.dto.response.FeedListResponse;
import com.example.decofolio.domain.feed.service.DeleteFeedService;
import com.example.decofolio.domain.feed.service.FeedListService;
import com.example.decofolio.domain.feed.service.NoticeFeedService;
import com.example.decofolio.domain.feed.service.UpdateFeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/feed")
@RestController
public class FeedController {

    private final NoticeFeedService noticeFeedService;
    private final UpdateFeedService updateFeedService;
    private final DeleteFeedService deleteFeedService;
    private final FeedListService feedListService;

    //포트폴리오 작성
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void noticeFeed(@RequestBody @Valid NoticeFeedRequest noticeFeedRequest) {
        noticeFeedService.execute(noticeFeedRequest);
    }

    //포트폴리오 삭제
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{feed-id}")
    public void deleteFeed(@PathVariable("feed-id") Long feedId) {
        deleteFeedService.execute(feedId);
    }

    //포트폴리오 수정
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/{feed-id}")
    public void updateFeed(@PathVariable("feed-id") Long feedId, @RequestBody @Valid UpdateFeedRequest updateFeedRequest) {
        updateFeedService.execute(feedId, updateFeedRequest);
    }

    //포트폴리오 목록
    @GetMapping
    public List<FeedListResponse> getFeedList() {
        return feedListService.getFeedList();
    }
}

