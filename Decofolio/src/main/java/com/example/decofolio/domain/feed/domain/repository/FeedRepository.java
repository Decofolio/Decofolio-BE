package com.example.decofolio.domain.feed.domain.repository;

import com.example.decofolio.domain.feed.domain.Feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FeedRepository extends JpaRepository<Feed, Long> {
    Feed findByFeedId(Long feedId);

    List<Feed> findByTitle(String title);

}

