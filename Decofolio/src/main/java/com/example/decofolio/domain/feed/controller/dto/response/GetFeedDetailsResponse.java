package com.example.decofolio.domain.feed.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Email;

@Getter
@Builder
@AllArgsConstructor
public class GetFeedDetailsResponse {

    private String title;

    //한줄 소개
    private String subtitle;

    //이름
    private String name;

    //전화번호
    private String phoneNumber;

    //셍일
    private String birthday;

    //국적
    private String country;

    //이메일
    @Email
    private String email;

    //링크(ex.GitHub, Notion)
    @URL
    private String link1;

    @URL
    private String link2;

    @URL
    private String link3;

    @URL
    private String link4;

    //학력(ex.title : 대덕소프트웨어마이스터고등학교 졸업, content : 2022.03  ~ 2024.12)
    private String eductionTitle1;

    private String eductionContent1;

    private String eductionTitle2;

    private String eductionContent2;

    //경험(ex.title : DSM 교내 해커톤, content : 대덕소프트웨어마이스터고등학교에서 개최된 해커톤입니다.)
    private String experienceTitle1;

    private String experienceContent1;

    private String experienceTitle2;

    private String experienceContent2;

    private String experienceTitle3;

    private String experienceContent3;

    private String experienceTitle4;

    private String experienceContent4;

    private String experienceTitle5;

    private String experienceContent5;

    //자격증(ex.title : 자격증명, day : 취득일)
    private String certificateTitle1;

    private String certificateDay1;

    private String certificateTitle2;

    private String certificateDay2;

    private String certificateTitle3;

    private String certificateDay3;

    private String certificateTitle4;

    private String certificateDay4;

    private String certificateTitle5;

    private String certificateDay5;

    //수상내역(ex.title : 수상명, day : 수상일)
    private String awardTitle1;

    private String awardDay1;

    private String awardTitle2;

    private String awardDay2;

    private String awardTitle3;

    private String awardDay3;

    private String awardTitle4;

    private String awardDay4;

    private String awardTitle5;

    private String awardDay5;

    //활동내역(ex.title : 활동명, content : 경험한 내용)
    private String activityTitle1;

    private String activityContent1;

    private String activityTitle2;

    private String activityContent2;

    private String activityTitle3;

    private String activityContent3;

    private String activityTitle4;

    private String activityContent4;

    private String activityTitle5;

    private String activityContent5;

    //스킬(ex.skillName : 스킬명,  skillPoint: 스킬 점수)
    private String skillName1;

    private String skillPoint1;

    private String skillName2;

    private String skillPoint2;

    private String skillName3;

    private String skillPoint3;

    private String skillName4;

    private String skillPoint4;

    private String skillName5;

    private String skillPoint5;

    private String skillName6;

    private String skillPoint6;

    private String skillName7;

    private String skillPoint7;

    private String skillName8;

    private String skillPoint8;

    private String skillName9;

    private String skillPoint9;

    private String skillName10;

    private String skillPoint10;

    private String skillName11;

    private String skillPoint11;

    private String skillName12;

    private String skillPoint12;

    //태그(ex.tag : 태그)
    private String tag1;

    private String tag2;

    private String tag3;
}
