package com.example.decofolio.domain.project.facade;

import com.example.decofolio.domain.feed.domain.Feed;
import com.example.decofolio.domain.feed.domain.repository.FeedRepository;
import com.example.decofolio.domain.feed.exception.FeedNotFoundException;
import com.example.decofolio.domain.project.domain.Project;
import com.example.decofolio.domain.project.domain.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class  ProjectFacade{

    private final ProjectRepository projectRepository;

    public Project getProjectById(Long id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> FeedNotFoundException.EXCEPTION);
    }
}
