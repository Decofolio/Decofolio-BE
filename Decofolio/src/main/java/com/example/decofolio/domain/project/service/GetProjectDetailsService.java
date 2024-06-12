package com.example.decofolio.domain.project.service;

import com.example.decofolio.domain.feed.controller.dto.response.GetFeedDetailsResponse;
import com.example.decofolio.domain.feed.domain.Feed;
import com.example.decofolio.domain.feed.domain.repository.FeedRepository;
import com.example.decofolio.domain.project.controller.dto.response.GetProjectDetailsResponse;
import com.example.decofolio.domain.project.domain.Project;
import com.example.decofolio.domain.project.domain.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetProjectDetailsService {

    private final ProjectRepository projectRepository;

    public GetProjectDetailsResponse getDetails(Long projectId) {
        Project project = projectRepository.findByProjectId(projectId);
        return mapFeedToResponse(project);
    }

    private GetProjectDetailsResponse mapFeedToResponse(Project project) {
        return GetProjectDetailsResponse.builder()
                .text(project.getText())
                .link1(project.getLink1())
                .link2(project.getLink2())
                .skill1(project.getSkill1())
                .skill2(project.getSkill2())
                .build();
    }
}