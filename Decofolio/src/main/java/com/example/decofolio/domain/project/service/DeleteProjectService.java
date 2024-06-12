package com.example.decofolio.domain.project.service;


import com.example.decofolio.domain.feed.exception.CannotBeDeletedException;
import com.example.decofolio.domain.project.domain.Project;
import com.example.decofolio.domain.project.domain.repository.ProjectRepository;
import com.example.decofolio.domain.project.facade.ProjectFacade;
import com.example.decofolio.domain.user.domain.User;
import com.example.decofolio.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class DeleteProjectService {

    private final UserFacade userFacade;
    private final ProjectFacade projectFacade;
    private final ProjectRepository projectRepository;

    @Transactional
    public void execute(Long projectId) {
        User user = userFacade.getCurrentUser();
        Project project = projectFacade.getProjectById(projectId);

        if (!user.equals(project.getUser())) {
            throw CannotBeDeletedException.EXCEPTION;
        }

        projectRepository.delete(project);
    }
}
