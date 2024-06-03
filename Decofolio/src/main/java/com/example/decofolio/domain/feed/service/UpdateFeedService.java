package com.example.decofolio.domain.feed.service;

import com.example.decofolio.domain.feed.controller.dto.request.UpdateFeedRequest;
import com.example.decofolio.domain.feed.domain.Feed;
import com.example.decofolio.domain.feed.exception.CannotBeModifiedException;
import com.example.decofolio.domain.feed.facade.FeedFacade;
import com.example.decofolio.domain.user.domain.User;
import com.example.decofolio.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UpdateFeedService {

    private final UserFacade userFacade;
    private final FeedFacade feedFacade;

    @Transactional
    public void execute(Long feedId, UpdateFeedRequest updateFeedRequest) {

        User user = userFacade.getCurrentUser();
        Feed feed = feedFacade.getFeedById(feedId);

        if (!user.equals(feed.getUser())) {
            throw CannotBeModifiedException.EXCEPTION;
        }

        feed.updateFeed(
                updateFeedRequest.getTitle(),
                updateFeedRequest.getSubtitle(),
                updateFeedRequest.getName(),
                updateFeedRequest.getPhoneNumber(),
                updateFeedRequest.getBirthday(),
                updateFeedRequest.getCountry(),
                updateFeedRequest.getLink1(),
                updateFeedRequest.getLink2(),
                updateFeedRequest.getLink3(),
                updateFeedRequest.getLink4(),
                updateFeedRequest.getEductionTitle1(),
                updateFeedRequest.getEductionContent1(),
                updateFeedRequest.getEductionTitle2(),
                updateFeedRequest.getEductionContent2(),
                updateFeedRequest.getExperienceTitle1(),
                updateFeedRequest.getExperienceContent1(),
                updateFeedRequest.getExperienceTitle2(),
                updateFeedRequest.getExperienceContent2(),
                updateFeedRequest.getExperienceTitle3(),
                updateFeedRequest.getExperienceContent3(),
                updateFeedRequest.getExperienceTitle4(),
                updateFeedRequest.getExperienceContent4(),
                updateFeedRequest.getExperienceTitle5(),
                updateFeedRequest.getExperienceContent5(),
                updateFeedRequest.getCertificateTitle1(),
                updateFeedRequest.getCertificateDay1(),
                updateFeedRequest.getCertificateTitle2(),
                updateFeedRequest.getCertificateDay2(),
                updateFeedRequest.getCertificateTitle3(),
                updateFeedRequest.getCertificateDay3(),
                updateFeedRequest.getCertificateTitle4(),
                updateFeedRequest.getCertificateDay4(),
                updateFeedRequest.getCertificateTitle5(),
                updateFeedRequest.getCertificateDay5(),
                updateFeedRequest.getAwardDay1(),
                updateFeedRequest.getAwardTitle1(),
                updateFeedRequest.getAwardDay2(),
                updateFeedRequest.getAwardTitle2(),
                updateFeedRequest.getAwardDay3(),
                updateFeedRequest.getAwardTitle3(),
                updateFeedRequest.getAwardDay4(),
                updateFeedRequest.getAwardTitle4(),
                updateFeedRequest.getAwardDay5(),
                updateFeedRequest.getAwardTitle5(),
                updateFeedRequest.getActivityContent1(),
                updateFeedRequest.getActivityTitle1(),
                updateFeedRequest.getActivityContent2(),
                updateFeedRequest.getActivityTitle2(),
                updateFeedRequest.getActivityContent3(),
                updateFeedRequest.getActivityTitle3(),
                updateFeedRequest.getActivityContent4(),
                updateFeedRequest.getActivityTitle4(),
                updateFeedRequest.getActivityContent5(),
                updateFeedRequest.getActivityTitle5(),
                updateFeedRequest.getSkillName1(),
                updateFeedRequest.getSkillPoint1(),
                updateFeedRequest.getSkillName2(),
                updateFeedRequest.getSkillPoint2(),
                updateFeedRequest.getSkillName3(),
                updateFeedRequest.getSkillPoint3(),
                updateFeedRequest.getSkillName4(),
                updateFeedRequest.getSkillPoint4(),
                updateFeedRequest.getSkillName5(),
                updateFeedRequest.getSkillPoint5(),
                updateFeedRequest.getSkillName6(),
                updateFeedRequest.getSkillPoint6(),
                updateFeedRequest.getSkillName7(),
                updateFeedRequest.getSkillPoint7(),
                updateFeedRequest.getSkillName8(),
                updateFeedRequest.getSkillPoint8(),
                updateFeedRequest.getSkillName9(),
                updateFeedRequest.getSkillPoint9(),
                updateFeedRequest.getSkillName10(),
                updateFeedRequest.getSkillPoint10(),
                updateFeedRequest.getSkillName11(),
                updateFeedRequest.getSkillPoint11(),
                updateFeedRequest.getSkillName12(),
                updateFeedRequest.getSkillPoint12()
        );

        feed.updateEmail(updateFeedRequest.getEmail());
    }
}