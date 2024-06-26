package com.example.decofolio.domain.feed.service;

import com.example.decofolio.domain.feed.controller.dto.response.FeedListResponse;
import com.example.decofolio.domain.feed.domain.Feed;
import com.example.decofolio.domain.feed.domain.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class FeedListService {

    private final FeedRepository feedRepository;

    public List<FeedListResponse> getFeedList() {
        List<Feed> feedList = (List<Feed>) feedRepository.findAll();

        // 피드 목록을 담을 리스트
        List<FeedListResponse> feedResponses = new ArrayList<>();

        for (Feed feed : feedList) {
            // 각 피드에 대한 정보를 추출하여 FeedResponse 객체로 변환
            FeedListResponse feedResponse = buildFeedResponse(feed);

            // 변환된 피드 정보를 리스트에 추가
            feedResponses.add(feedResponse);
        }

        return feedResponses;
    }

    private FeedListResponse buildFeedResponse(Feed feed) {
        // 피드 정보를 FeedResponse 객체로 변환하여 반환
        return FeedListResponse.builder()
                .feedId(feed.getFeedId())
                .title(feed.getTitle())
                .tag1(feed.getTag1())
                .tag2(feed.getTag2())
                .tag3(feed.getTag3())
                .build();
    }
}