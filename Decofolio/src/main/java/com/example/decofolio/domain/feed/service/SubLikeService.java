package com.example.decofolio.domain.feed.service;

import com.example.decofolio.domain.feed.domain.Feed;
import com.example.decofolio.domain.feed.domain.repository.FeedRepository;
import com.example.decofolio.domain.feed.exception.FeedNotFoundException;
import com.example.decofolio.domain.like.FeedLike;
import com.example.decofolio.domain.like.repository.FeedLikeRepository;
import com.example.decofolio.domain.user.domain.User;
import com.example.decofolio.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class SubLikeService {

    private final FeedLikeRepository feedLikeRepository;
    private final FeedRepository feedRepository;
    private final UserFacade userFacade;

    @Transactional
    public void execute(Long feedId) {
        User user = userFacade.getCurrentUser();

        Feed feed = feedRepository.findById(feedId)
                .orElseThrow(() -> FeedNotFoundException.EXCEPTION);

        if (isAlreadyLike(feed, user)) {
            feedLikeRepository.delete(FeedLike.builder()
                    .feed(feed)
                    .user(user)
                    .build());
        }
    }

    private boolean isAlreadyLike(Feed feed, User user) {
        return feedLikeRepository.findByFeedAndUser(feed, user).isPresent();
    }
}