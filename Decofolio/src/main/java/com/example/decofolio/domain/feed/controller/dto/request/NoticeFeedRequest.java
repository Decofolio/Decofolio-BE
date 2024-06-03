package com.example.decofolio.domain.feed.controller.dto.request;

import lombok.*;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Email;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NoticeFeedRequest {

    //제목
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


    @Builder
    public NoticeFeedRequest(String title, String subtitle, String name, String phoneNumber, String birthday, String country, String email, String link1, String link2, String link3, String link4, String eductionTitle1, String eductionTitle2, String eductionContent1, String eductionContent2, String experienceContent1, String experienceContent2, String experienceContent3, String experienceContent4, String experienceContent5, String experienceTitle1, String experienceTitle2, String experienceTitle3, String experienceTitle4, String experienceTitle5, String certificateDay1, String certificateTitle1, String certificateDay2, String certificateTitle2, String certificateDay3, String certificateTitle3, String certificateDay4, String certificateTitle4, String certificateDay5, String certificateTitle5, String awardTitle1, String awardDay1, String awardTitle2, String awardDay2, String awardTitle3, String awardDay3, String awardTitle4, String awardDay4, String awardTitle5, String awardDay5, String activityTitle1, String activityContent1, String activityTitle2, String activityContent2, String activityTitle3, String activityContent3, String activityTitle4, String activityContent4, String activityTitle5, String activityContent5, String skillName1, String skillPoint1, String skillName2, String skillPoint2, String skillName3, String skillPoint3, String skillName4, String skillPoint4, String skillName5, String skillPoint5, String skillName6, String skillPoint6, String skillName7, String skillPoint7, String skillName8, String skillPoint8, String skillName9, String skillPoint9, String skillName10, String skillPoint10, String skillName11, String skillPoint11, String skillName12, String skillPoint12, String tag3, String tag1, String tag2) {
        this.title = title;
        this.subtitle = subtitle;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.country = country;
        this.email = email;
        this.link1 = link1;
        this.link2 = link2;
        this.link3 = link3;
        this.link4 = link4;
        this.eductionTitle1 = eductionTitle1;
        this.eductionTitle2 = eductionTitle2;
        this.eductionContent1 = eductionContent1;
        this.eductionContent2 = eductionContent2;
        this.experienceContent1 = experienceContent1;
        this.experienceTitle1 = experienceTitle1;
        this.experienceContent2 = experienceContent2;
        this.experienceTitle2 = experienceTitle2;
        this.experienceContent3 = experienceContent3;
        this.experienceTitle3 = experienceTitle3;
        this.experienceContent4 = experienceContent4;
        this.experienceTitle4 = experienceTitle4;
        this.experienceContent5 = experienceContent5;
        this.experienceTitle5 = experienceTitle5;
        this.certificateTitle1 = certificateTitle1;
        this.certificateDay1 = certificateDay1;
        this.certificateTitle2 = certificateTitle2;
        this.certificateDay2 = certificateDay2;
        this.certificateTitle3 = certificateTitle3;
        this.certificateDay3 = certificateDay3;
        this.certificateTitle4 = certificateTitle4;
        this.certificateDay4 = certificateDay4;
        this.certificateTitle5 = certificateTitle5;
        this.certificateDay5 = certificateDay5;
        this.awardTitle1 = awardTitle1;
        this.awardDay1 = awardDay1;
        this.awardTitle2 = awardTitle2;
        this.awardDay2 = awardDay2;
        this.awardTitle3 = awardTitle3;
        this.awardDay3 = awardDay3;
        this.awardTitle4 = awardTitle4;
        this.awardDay4 = awardDay4;
        this.awardTitle5 = awardTitle5;
        this.awardDay5 = awardDay5;
        this.activityTitle1 = activityTitle1;
        this.activityContent1 = activityContent1;
        this.activityTitle2 = activityTitle2;
        this.activityContent2 = activityContent2;
        this.activityTitle3 = activityTitle3;
        this.activityContent3 = activityContent3;
        this.activityTitle4 = activityTitle4;
        this.activityContent4 = activityContent4;
        this.activityTitle5 = activityTitle5;
        this.activityContent5 = activityContent5;
        this.skillName1 = skillName1;
        this.skillPoint1 = skillPoint1;
        this.skillName2 = skillName2;
        this.skillPoint2 = skillPoint2;
        this.skillName3 = skillName3;
        this.skillPoint3 = skillPoint3;
        this.skillName4 = skillName4;
        this.skillPoint4 = skillPoint4;
        this.skillName5 = skillName5;
        this.skillPoint5 = skillPoint5;
        this.skillName6 = skillName6;
        this.skillPoint6 = skillPoint6;
        this.skillName7 = skillName7;
        this.skillPoint7 = skillPoint7;
        this.skillName8 = skillName8;
        this.skillPoint8 = skillPoint8;
        this.skillName9 = skillName9;
        this.skillPoint9 = skillPoint9;
        this.skillName10 = skillName10;
        this.skillPoint10 = skillPoint10;
        this.skillName11 = skillName11;
        this.skillPoint11 = skillPoint11;
        this.skillName12 = skillName12;
        this.skillPoint12 = skillPoint12;
        this.tag1 = tag1;
        this.tag2 = tag2;
        this.tag3 = tag3;
    }
}

