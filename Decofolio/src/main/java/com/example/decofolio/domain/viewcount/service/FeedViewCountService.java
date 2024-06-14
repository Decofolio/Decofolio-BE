package com.example.decofolio.domain.viewcount.service;

import com.example.decofolio.domain.viewcount.domain.FeedViewCount;
import com.example.decofolio.domain.viewcount.domain.repository.FeedViewCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FeedViewCountService {

    @Autowired
    private FeedViewCountRepository repository;

    @Transactional
    public int incrementViewCount(Long feedId) {
        FeedViewCount feedViewCount = repository.findByFeedId(feedId);
        if (feedViewCount == null) {
            feedViewCount = new FeedViewCount(feedId, 1);
        } else {
            feedViewCount.setViewCount(feedViewCount.getViewCount() + 1);
        }
        repository.save(feedViewCount);
        return feedViewCount.getViewCount();
    }

    public int getViewCount(Long feedId) {
        FeedViewCount feedViewCount = repository.findByFeedId(feedId);
        return (feedViewCount != null) ? feedViewCount.getViewCount() : 0;
    }
}
