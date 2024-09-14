package com.example.decofolio.domain.viewcount.controller;

import com.example.decofolio.domain.viewcount.controller.dto.response.ViewCountResponse;
import com.example.decofolio.domain.viewcount.service.FeedViewCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feed")
public class FeedViewCountController {

    @Autowired
    private FeedViewCountService service;

    // 조회수를 증가시키는 엔드포인트
    @PostMapping("/{feedId}")
    public ResponseEntity<ViewCountResponse> incrementViewCount(@PathVariable Long feedId) {
        int newViewCount = service.incrementViewCount(feedId);
        ViewCountResponse response = new ViewCountResponse(feedId, newViewCount);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{feedId}/viewCount")
    public ResponseEntity<ViewCountResponse> getViewCount(@PathVariable Long feedId) {
        int viewCount = service.getViewCount(feedId);
        ViewCountResponse response = new ViewCountResponse(feedId, viewCount);
        return ResponseEntity.ok(response);
    }
}

