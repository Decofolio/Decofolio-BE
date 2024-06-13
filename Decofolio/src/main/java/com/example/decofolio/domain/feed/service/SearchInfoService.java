package com.example.decofolio.domain.feed.service;

import com.example.decofolio.domain.feed.controller.dto.response.SearchResponse;
import com.example.decofolio.domain.feed.domain.Feed;
import com.example.decofolio.domain.feed.domain.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchInfoService {

    private final FeedRepository feedRepository;

    public List<SearchResponse> execute(String title) {

        List<Feed> feeds;

        if (title != null) {
            feeds = feedRepository.findByTitle(title);
        }else {
            feeds = feedRepository.findAll();
        }

        return feeds.stream()
                .map(SearchInfoService::mapTerms)
                .collect(Collectors.toList());
    }

    public static SearchResponse mapTerms(Feed feed) {
        return new SearchResponse(
                feed.getFeedId(),
                feed.getTitle(),
                feed.getTag1(),
                feed.getTag2(),
                feed.getTag3()
        );
    }
}
