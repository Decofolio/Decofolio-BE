package com.example.decofolio.domain.project.service;

import com.example.decofolio.domain.feed.controller.dto.request.UpdateFeedRequest;
import com.example.decofolio.domain.feed.domain.Feed;
import com.example.decofolio.domain.feed.exception.CannotBeModifiedException;
import com.example.decofolio.domain.feed.facade.FeedFacade;
import com.example.decofolio.domain.project.controller.dto.request.UpdateProjectRequest;
import com.example.decofolio.domain.project.domain.Project;
import com.example.decofolio.domain.project.facade.ProjectFacade;
import com.example.decofolio.domain.user.domain.User;
import com.example.decofolio.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Period;

@RequiredArgsConstructor
@Service
public class UpdateProjectService {

    private final UserFacade userFacade;
    private final ProjectFacade projectFacade;

    @Transactional
    public void execute(Long projectId, UpdateProjectRequest updateProjectRequest) {

        User user = userFacade.getCurrentUser();
        Project project = projectFacade.getFeedById(projectId);

        if (!user.equals(project.getUser())) {
            throw CannotBeModifiedException.EXCEPTION;
        }

        project.updateProject(
                updateProjectRequest.getTitle(),
                updateProjectRequest.getText(),
                updateProjectRequest.getSkill1(),
                updateProjectRequest.getSkill2(),
                updateProjectRequest.getLink1(),
                updateProjectRequest.getLink2()
        );

    }
}