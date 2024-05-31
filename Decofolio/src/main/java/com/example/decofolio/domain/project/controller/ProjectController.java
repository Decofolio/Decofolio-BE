package com.example.decofolio.domain.project.controller;

import com.example.decofolio.domain.feed.controller.dto.request.NoticeFeedRequest;
import com.example.decofolio.domain.project.controller.dto.request.NoticeProjectRequest;
import com.example.decofolio.domain.project.service.NoticeProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/project")
@RestController
public class ProjectController {

    private final NoticeProjectService noticeProjectService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void noticeFeed(@RequestBody @Valid NoticeProjectRequest noticeProjectRequest) {
        noticeProjectService.execute(noticeProjectRequest);
    }
}
