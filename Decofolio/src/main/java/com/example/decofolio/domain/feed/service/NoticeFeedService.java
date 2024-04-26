package com.example.decofolio.domain.feed.service;

import com.example.decofolio.domain.feed.controller.dto.request.NoticeFeedRequest;
import com.example.decofolio.domain.feed.domain.Feed;
import com.example.decofolio.domain.feed.domain.repository.FeedRepository;
import com.example.decofolio.domain.user.domain.User;
import com.example.decofolio.domain.user.facade.UserFacade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@RequiredArgsConstructor
@Service
public class NoticeFeedService {

    private final UserFacade userFacade;
    private final FeedRepository feedRepository;

    @Transactional
    public void execute(NoticeFeedRequest noticeFeedRequest) {
        User user = userFacade.getCurrentUser();

        Feed feed = Feed.builder()
                .title(noticeFeedRequest.getTitle())
                .subtitle(noticeFeedRequest.getSubtitle())
                .name(noticeFeedRequest.getName())
                .phoneNumber(noticeFeedRequest.getPhoneNumber())
                .birthday(noticeFeedRequest.getBirthday())
                .country(noticeFeedRequest.getCountry())
                .email(noticeFeedRequest.getEmail())
                .link1(noticeFeedRequest.getLink1())
                .link2(noticeFeedRequest.getLink2())
                .link3(noticeFeedRequest.getLink3())
                .link4(noticeFeedRequest.getLink4())
                .eductionTitle1(noticeFeedRequest.getEductionTitle1())
                .eductionTitle2(noticeFeedRequest.getEductionTitle2())
                .eductionContent1(noticeFeedRequest.getEductionContent1())
                .eductionContent2(noticeFeedRequest.getEductionContent2())
                .experienceTitle1(noticeFeedRequest.getExperienceTitle1())
                .experienceContent1(noticeFeedRequest.getExperienceContent1())
                .experienceTitle2(noticeFeedRequest.getExperienceTitle2())
                .experienceContent2(noticeFeedRequest.getExperienceContent2())
                .experienceTitle3(noticeFeedRequest.getExperienceTitle3())
                .experienceContent3(noticeFeedRequest.getExperienceContent3())
                .experienceTitle4(noticeFeedRequest.getExperienceTitle4())
                .experienceContent4(noticeFeedRequest.getExperienceContent4())
                .experienceTitle5(noticeFeedRequest.getExperienceTitle5())
                .experienceContent5(noticeFeedRequest.getExperienceContent5())
                .certificateTitle1(noticeFeedRequest.getCertificateTitle1())
                .certificateDay1(noticeFeedRequest.getCertificateDay1())
                .certificateTitle2(noticeFeedRequest.getCertificateTitle2())
                .certificateDay2(noticeFeedRequest.getCertificateDay2())
                .certificateTitle3(noticeFeedRequest.getCertificateTitle3())
                .certificateDay3(noticeFeedRequest.getCertificateDay3())
                .certificateTitle4(noticeFeedRequest.getCertificateTitle4())
                .certificateDay4(noticeFeedRequest.getCertificateDay4())
                .certificateTitle4(noticeFeedRequest.getCertificateTitle5())
                .certificateDay5(noticeFeedRequest.getCertificateDay5())
                .awardTitle1(noticeFeedRequest.getAwardTitle1())
                .awardDay1(noticeFeedRequest.getAwardDay1())
                .awardTitle2(noticeFeedRequest.getAwardTitle2())
                .awardDay2(noticeFeedRequest.getAwardDay2())
                .awardTitle3(noticeFeedRequest.getAwardTitle3())
                .awardDay3(noticeFeedRequest.getAwardDay3())
                .awardTitle4(noticeFeedRequest.getAwardTitle4())
                .awardDay4(noticeFeedRequest.getAwardDay4())
                .awardTitle5(noticeFeedRequest.getAwardTitle5())
                .awardDay5(noticeFeedRequest.getAwardDay5())
                .activityTitle1(noticeFeedRequest.getActivityTitle1())
                .activityContent1(noticeFeedRequest.getActivityContent1())
                .activityTitle2(noticeFeedRequest.getActivityTitle2())
                .activityContent2(noticeFeedRequest.getActivityContent2())
                .activityTitle3(noticeFeedRequest.getActivityTitle3())
                .activityContent3(noticeFeedRequest.getActivityContent3())
                .activityTitle4(noticeFeedRequest.getActivityTitle4())
                .activityContent4(noticeFeedRequest.getActivityContent4())
                .activityTitle5(noticeFeedRequest.getActivityTitle5())
                .activityContent5(noticeFeedRequest.getActivityContent5())
                .skillName1(noticeFeedRequest.getSkillName1())
                .skillPoint1(noticeFeedRequest.getSkillPoint1())
                .skillName2(noticeFeedRequest.getSkillName2())
                .skillPoint2(noticeFeedRequest.getSkillPoint2())
                .skillName3(noticeFeedRequest.getSkillName3())
                .skillPoint3(noticeFeedRequest.getSkillPoint3())
                .skillName4(noticeFeedRequest.getSkillName4())
                .skillPoint4(noticeFeedRequest.getSkillPoint4())
                .skillName5(noticeFeedRequest.getSkillName5())
                .skillPoint5(noticeFeedRequest.getSkillPoint5())
                .skillName6(noticeFeedRequest.getSkillName6())
                .skillPoint6(noticeFeedRequest.getSkillPoint6())
                .skillName7(noticeFeedRequest.getSkillName7())
                .skillPoint7(noticeFeedRequest.getSkillPoint7())
                .skillName8(noticeFeedRequest.getSkillName8())
                .skillPoint8(noticeFeedRequest.getSkillPoint8())
                .skillName9(noticeFeedRequest.getSkillName9())
                .skillPoint9(noticeFeedRequest.getSkillPoint9())
                .skillName10(noticeFeedRequest.getSkillName10())
                .skillPoint10(noticeFeedRequest.getSkillPoint10())
                .skillName11(noticeFeedRequest.getSkillName11())
                .skillPoint11(noticeFeedRequest.getSkillPoint11())
                .skillName12(noticeFeedRequest.getSkillName12())
                .skillPoint12(noticeFeedRequest.getSkillPoint12())
                .user(user)
                .build();
        feedRepository.save(feed);
    }
}
