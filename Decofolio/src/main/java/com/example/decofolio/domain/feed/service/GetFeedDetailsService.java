package com.example.decofolio.domain.feed.service;

import com.example.decofolio.domain.feed.controller.dto.response.GetFeedDetailsResponse;
import com.example.decofolio.domain.feed.domain.Feed;
import com.example.decofolio.domain.feed.domain.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetFeedDetailsService {

    private final FeedRepository feedRepository;

    public GetFeedDetailsResponse getDetails(Long feedId) {
        Feed feed = feedRepository.findByFeedId(feedId);
        return mapFeedToResponse(feed);
    }

    private GetFeedDetailsResponse mapFeedToResponse(Feed feed) {
        return GetFeedDetailsResponse.builder()
                .title(feed.getTitle())
                .subtitle(feed.getSubtitle())
                .name(feed.getName())
                .phoneNumber(feed.getPhoneNumber())
                .birthday(feed.getBirthday())
                .email(feed.getEmail())
                .link1(feed.getLink1())
                .link2(feed.getLink2())
                .link3(feed.getLink3())
                .link4(feed.getLink4())
                .eductionTitle1(feed.getEductionTitle1())
                .eductionContent1(feed.getEductionContent1())
                .eductionTitle2(feed.getEductionTitle2())
                .eductionContent2(feed.getEductionContent2())
                .experienceTitle1(feed.getExperienceTitle1())
                .experienceContent1(feed.getExperienceContent1())
                .experienceTitle2(feed.getExperienceTitle2())
                .experienceContent2(feed.getExperienceContent2())
                .experienceTitle3(feed.getExperienceTitle3())
                .experienceContent3(feed.getExperienceContent3())
                .experienceTitle4(feed.getExperienceTitle4())
                .experienceContent4(feed.getExperienceContent4())
                .experienceTitle5(feed.getExperienceTitle5())
                .experienceContent5(feed.getExperienceContent5())
                .certificateTitle1(feed.getCertificateTitle1())
                .certificateDay1(feed.getCertificateDay1())
                .certificateTitle2(feed.getCertificateTitle2())
                .certificateDay2(feed.getCertificateDay2())
                .certificateTitle3(feed.getCertificateTitle3())
                .certificateDay3(feed.getCertificateDay3())
                .certificateTitle4(feed.getCertificateTitle4())
                .certificateDay4(feed.getCertificateDay4())
                .certificateTitle5(feed.getCertificateTitle5())
                .certificateDay5(feed.getCertificateDay5())
                .awardTitle1(feed.getAwardTitle1())
                .awardDay1(feed.getAwardDay1())
                .awardTitle2(feed.getAwardTitle2())
                .awardDay2(feed.getAwardDay2())
                .awardTitle3(feed.getAwardTitle3())
                .awardDay3(feed.getAwardDay3())
                .awardTitle4(feed.getAwardTitle4())
                .awardDay4(feed.getAwardDay4())
                .awardTitle5(feed.getAwardTitle5())
                .awardDay5(feed.getAwardDay5())
                .activityTitle1(feed.getActivityTitle1())
                .activityContent1(feed.getActivityContent1())
                .activityTitle2(feed.getActivityTitle2())
                .activityContent2(feed.getActivityContent2())
                .activityTitle3(feed.getActivityTitle3())
                .activityContent3(feed.getActivityContent3())
                .activityTitle4(feed.getActivityTitle4())
                .activityContent4(feed.getActivityContent4())
                .activityTitle5(feed.getActivityTitle5())
                .activityContent5(feed.getActivityContent5())
                .skillName1(feed.getSkillName1())
                .skillPoint1(feed.getSkillPoint1())
                .skillName2(feed.getSkillName2())
                .skillPoint2(feed.getSkillPoint2())
                .skillName3(feed.getSkillName3())
                .skillPoint3(feed.getSkillPoint3())
                .skillName4(feed.getSkillName4())
                .skillPoint4(feed.getSkillPoint4())
                .skillName5(feed.getSkillName5())
                .skillPoint5(feed.getSkillPoint5())
                .skillName6(feed.getSkillName6())
                .skillPoint6(feed.getSkillPoint6())
                .skillName7(feed.getSkillName7())
                .skillPoint7(feed.getSkillPoint7())
                .skillName8(feed.getSkillName8())
                .skillPoint8(feed.getSkillPoint8())
                .skillName9(feed.getSkillName9())
                .skillPoint9(feed.getSkillPoint9())
                .skillName10(feed.getSkillName10())
                .skillPoint10(feed.getSkillPoint10())
                .skillName11(feed.getSkillName11())
                .skillPoint11(feed.getSkillPoint11())
                .skillName12(feed.getSkillName12())
                .skillPoint12(feed.getSkillPoint12())
                .tag1(feed.getTag1())
                .tag2(feed.getTag2())
                .tag3(feed.getTag3())
                .build();
    }
}
