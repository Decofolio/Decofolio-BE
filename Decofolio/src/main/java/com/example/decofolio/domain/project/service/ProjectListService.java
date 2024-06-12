package com.example.decofolio.domain.project.service;

import com.example.decofolio.domain.feed.controller.dto.response.FeedListResponse;
import com.example.decofolio.domain.feed.domain.Feed;
import com.example.decofolio.domain.feed.domain.repository.FeedRepository;
import com.example.decofolio.domain.project.controller.dto.response.ProjectListResponse;
import com.example.decofolio.domain.project.domain.Project;
import com.example.decofolio.domain.project.domain.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProjectListService {

    private final ProjectRepository projectRepository;

    public List<ProjectListResponse> getProjectList() {
        List<Project> projectList = (List<Project>) projectRepository.findAll();

        // 피드 목록을 담을 리스트
        List<ProjectListResponse> projectResponses = new ArrayList<>();

        for (Project project : projectList) {
            // 각 피드에 대한 정보를 추출하여 FeedResponse 객체로 변환
            ProjectListResponse projectResponse = buildProjectResponse(project);

            // 변환된 피드 정보를 리스트에 추가
            projectResponses.add(projectResponse);
        }

        return projectResponses;
    }

    private ProjectListResponse buildProjectResponse(Project project) {
        // 피드 정보를 FeedResponse 객체로 변환하여 반환
        return ProjectListResponse.builder()
                .projectId(project.getProjectId())
                .title(project.getTitle())
                .text(project.getText())
                .skill1(project.getSkill1())
                .skill2(project.getSkill2())
                .link1(project.getLink1())
                .link2(project.getLink2())
                .build();
    }
}