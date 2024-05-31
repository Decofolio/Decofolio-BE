package com.example.decofolio.domain.project.service;

import com.example.decofolio.domain.feed.controller.dto.request.NoticeFeedRequest;
import com.example.decofolio.domain.feed.domain.Feed;
import com.example.decofolio.domain.feed.domain.repository.FeedRepository;
import com.example.decofolio.domain.project.controller.dto.request.NoticeProjectRequest;
import com.example.decofolio.domain.project.domain.Project;
import com.example.decofolio.domain.project.domain.repository.ProjectRepository;
import com.example.decofolio.domain.user.domain.User;
import com.example.decofolio.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class NoticeProjectService {

    private final UserFacade userFacade;
    private final ProjectRepository projectRepository;

    @Transactional
    public void execute(NoticeProjectRequest noticeProjectRequest) {
        User user = userFacade.getCurrentUser();

        Project project = Project.builder()
                .title(noticeProjectRequest.getTitle())
                .text(noticeProjectRequest.getText())
                .link1(noticeProjectRequest.getLink1())
                .link2(noticeProjectRequest.getLink2())
                .skill1(noticeProjectRequest.getSkill1())
                .skill2(noticeProjectRequest.getSkill2())
                .user(user)
                .build();
        projectRepository.save(project);
    }

}
