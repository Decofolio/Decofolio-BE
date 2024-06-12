package com.example.decofolio.domain.project.controller;

import com.example.decofolio.domain.feed.controller.dto.request.NoticeFeedRequest;
import com.example.decofolio.domain.feed.controller.dto.request.UpdateFeedRequest;
import com.example.decofolio.domain.feed.controller.dto.response.FeedListResponse;
import com.example.decofolio.domain.feed.controller.dto.response.GetFeedDetailsResponse;
import com.example.decofolio.domain.feed.service.GetFeedDetailsService;
import com.example.decofolio.domain.feed.service.UpdateFeedService;
import com.example.decofolio.domain.project.controller.dto.request.NoticeProjectRequest;
import com.example.decofolio.domain.project.controller.dto.request.UpdateProjectRequest;
import com.example.decofolio.domain.project.controller.dto.response.GetProjectDetailsResponse;
import com.example.decofolio.domain.project.controller.dto.response.ProjectListResponse;
import com.example.decofolio.domain.project.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/project")
@RestController
public class ProjectController {

    private final NoticeProjectService noticeProjectService;
    private final UpdateProjectService updateProjectService;
    private final DeleteProjectService deleteProjectService;
    private final GetProjectDetailsService getProjectDetailsService;
    private final ProjectListService projectListService;

    //프트젝트 작성
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void noticeProject(@RequestBody @Valid NoticeProjectRequest noticeProjectRequest) {
        noticeProjectService.execute(noticeProjectRequest);
    }

    //프트젝트 수정
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/{project-id}")
    public void updateProject(@PathVariable("project-id") Long projectId, @RequestBody @Valid UpdateProjectRequest updateProjectRequest) {
        updateProjectService.execute(projectId, updateProjectRequest);
    }

    //프트젝트 자세히 보기
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/details/{project-id}")
    public GetProjectDetailsResponse getDetails(@PathVariable("project-id") Long projectId) {
        return getProjectDetailsService.getDetails(projectId);
    }

    //프트젝트 목록
    @GetMapping
    public List<ProjectListResponse> getFeedList() {
        return projectListService.getProjectList();
    }

    //프트젝트 삭제
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{project-id}")
    public void deleteProject(@PathVariable("project-id") Long projectId) {
        deleteProjectService.execute(projectId);
    }
}
