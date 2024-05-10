package com.example.decofolio.domain.feed.domain.repository;

import com.example.decofolio.domain.feed.domain.Feed;
import org.springframework.data.repository.CrudRepository;

public interface FeedRepository extends CrudRepository<Feed, Long> {
    Feed findByFeedId(Long feedId);
}

