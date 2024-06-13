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

    public List<SearchResponse> execute(String tag1, String tag2, String tag3) {

        List<Feed> feeds;

        if (tag1 != null && tag2 != null && tag3 != null) {
            feeds = feedRepository.findByTag1AndTag2AndTag3(tag1, tag2, tag3);
        } else if (tag1 != null && tag2 != null && tag3.equals("''")) {
            feeds = feedRepository.findByTag1AndTag2(tag1, tag2);
        } else if (tag1.equals("''") && tag2 != null && tag3 != null) {
            feeds = feedRepository.findByTag2AndTag3(tag2, tag3);
        } else if (tag1 != null && tag2.equals("''") && tag3 != null) {
            feeds = feedRepository.findByTag1AndTag3(tag1, tag3);
        } else if (tag1.equals("''") && tag2.equals("''") && tag3 != null) {
            feeds = feedRepository.findByTag3(tag3);
        } else if (tag1.equals("''") && tag2 != null&& tag3.equals("''")) {
            feeds = feedRepository.findByTag2(tag2);
        } else if (tag1 != null && tag1.equals("''") && tag2.equals("''")) {
            feeds = feedRepository.findByTag1(tag1);
        } else {
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
