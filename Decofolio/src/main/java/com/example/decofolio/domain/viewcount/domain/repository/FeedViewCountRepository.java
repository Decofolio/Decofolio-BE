package com.example.decofolio.domain.viewcount.domain.repository;


import com.example.decofolio.domain.viewcount.domain.FeedViewCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FeedViewCountRepository extends JpaRepository<FeedViewCount, Long> {
    FeedViewCount findByFeedId(Long feedId);

}
