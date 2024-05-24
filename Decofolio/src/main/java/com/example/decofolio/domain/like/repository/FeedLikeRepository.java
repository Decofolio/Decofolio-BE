package com.example.decofolio.domain.like.repository;

import com.example.decofolio.domain.feed.domain.Feed;
import com.example.decofolio.domain.like.FeedLike;
import com.example.decofolio.domain.like.FeedLikeId;
import com.example.decofolio.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FeedLikeRepository extends JpaRepository<FeedLike, FeedLikeId> {

    Optional<FeedLike> findByFeedAndUser(Feed feed, User user);

    Long countByUser(User user);
}