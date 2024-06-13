package com.example.decofolio.domain.feed.domain.repository;

import com.example.decofolio.domain.feed.domain.Feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FeedRepository extends JpaRepository<Feed, Long> {
    Feed findByFeedId(Long feedId);

    List<Feed> findByTag1AndTag2AndTag3(String tag1, String tag2, String tag3);

    List<Feed> findByTag1AndTag2(String tag1, String tag2);

    List<Feed> findByTag2AndTag3(String tag2, String tag3);

    List<Feed> findByTag1AndTag3(String tag1, String tag3);

    List<Feed> findByTag1(String tag1);

    List<Feed> findByTag2(String tag2);

    List<Feed> findByTag3(String tag3);

}

