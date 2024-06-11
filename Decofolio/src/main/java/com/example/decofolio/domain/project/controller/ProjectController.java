package com.example.decofolio.domain.project.controller;

import com.example.decofolio.domain.feed.controller.dto.request.NoticeFeedRequest;
import com.example.decofolio.domain.feed.controller.dto.request.UpdateFeedRequest;
import com.example.decofolio.domain.feed.service.UpdateFeedService;
import com.example.decofolio.domain.project.controller.dto.request.NoticeProjectRequest;
import com.example.decofolio.domain.project.controller.dto.request.UpdateProjectRequest;
import com.example.decofolio.domain.project.service.DeleteProjectService;
import com.example.decofolio.domain.project.service.NoticeProjectService;
import com.example.decofolio.domain.project.service.UpdateProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/project")
@RestController
public class ProjectController {

    private final NoticeProjectService noticeProjectService;
    private final UpdateProjectService updateProjectService;
    private final DeleteProjectService deleteProjectService;

    //포트폴리오 작성
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void noticeFeed(@RequestBody @Valid NoticeProjectRequest noticeProjectRequest) {
        noticeProjectService.execute(noticeProjectRequest);
    }

    //포트폴리오 수정
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/{project-id}")
    public void updateProject(@PathVariable("project-id") Long projectId, @RequestBody @Valid UpdateProjectRequest updateProjectRequest) {
        updateProjectService.execute(projectId, updateProjectRequest);
    }

    //포트폴리오 삭제
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{project-id}")
    public void deleteProject(@PathVariable("project-id") Long projectId) {
        deleteProjectService.execute(projectId);
    }
}
