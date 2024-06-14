package com.example.decofolio.domain.feed.domain;

import javax.persistence.*;

import com.example.decofolio.domain.comment.domain.Comment;
import com.example.decofolio.domain.like.FeedLike;
import com.example.decofolio.domain.user.domain.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Feed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedId;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(length = 1500, nullable = false)
    private String subtitle;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String phoneNumber;

    @Column(length = 20, nullable = false)
    private String birthday;

    @Column(length = 50, nullable = false)
    private String country;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 100, nullable = true)
    private String link1;

    @Column(length = 100, nullable = true)
    private String link2;

    @Column(length = 100, nullable = true)
    private String link3;

    @Column(length = 100, nullable = true)
    private String link4;

    @Column(length = 100, nullable = true)
    private String eductionTitle1;

    @Column(length = 100, nullable = true)
    private String eductionContent1;

    @Column(length = 100, nullable = true)
    private String eductionTitle2;

    @Column(length = 100, nullable = true)
    private String eductionContent2;

    @Column(length = 100, nullable = true)
    private String experienceTitle1;

    @Column(length = 100, nullable = true)
    private String experienceContent1;

    @Column(length = 100, nullable = true)
    private String experienceTitle2;

    @Column(length = 100, nullable = true)
    private String experienceContent2;

    @Column(length = 100, nullable = true)
    private String experienceTitle3;

    @Column(length = 100, nullable = true)
    private String experienceContent3;

    @Column(length = 100, nullable = true)
    private String experienceTitle4;

    @Column(length = 100, nullable = true)
    private String experienceContent4;

    @Column(length = 100, nullable = true)
    private String experienceTitle5;

    @Column(length = 100, nullable = true)
    private String experienceContent5;

    @Column(length = 100, nullable = true)
    private String certificateTitle1;

    @Column(length = 100, nullable = true)
    private String certificateDay1;

    @Column(length = 100, nullable = true)
    private String certificateTitle2;

    @Column(length = 100, nullable = true)
    private String certificateDay2;

    @Column(length = 100, nullable = true)
    private String certificateTitle3;

    @Column(length = 100, nullable = true)
    private String certificateDay3;

    @Column(length = 100, nullable = true)
    private String certificateTitle4;

    @Column(length = 100, nullable = true)
    private String certificateDay4;

    @Column(length = 100, nullable = true)
    private String certificateTitle5;

    @Column(length = 100, nullable = true)
    private String certificateDay5;

    @Column(length = 100, nullable = true)
    private String awardTitle1;

    @Column(length = 100, nullable = true)
    private String awardDay1;

    @Column(length = 100, nullable = true)
    private String awardTitle2;

    @Column(length = 100, nullable = true)
    private String awardDay2;

    @Column(length = 100, nullable = true)
    private String awardTitle3;

    @Column(length = 100, nullable = true)
    private String awardDay3;

    @Column(length = 100, nullable = true)
    private String awardTitle4;

    @Column(length = 100, nullable = true)
    private String awardDay4;

    @Column(length = 100, nullable = true)
    private String awardTitle5;

    @Column(length = 100, nullable = true)
    private String awardDay5;

    @Column(length = 100, nullable = true)
    private String activityTitle1;

    @Column(length = 100, nullable = true)
    private String activityContent1;

    @Column(length = 100, nullable = true)
    private String activityTitle2;

    @Column(length = 100, nullable = true)
    private String activityContent2;

    @Column(length = 100, nullable = true)
    private String activityTitle3;

    @Column(length = 100, nullable = true)
    private String activityContent3;

    @Column(length = 100, nullable = true)
    private String activityTitle4;

    @Column(length = 100, nullable = true)
    private String activityContent4;

    @Column(length = 100, nullable = true)
    private String activityTitle5;

    @Column(length = 100, nullable = true)
    private String activityContent5;

    @Column(length = 100, nullable = true)
    private String skillName1;

    @Column(length = 100, nullable = true)
    private String skillPoint1;

    @Column(length = 100, nullable = true)
    private String skillName2;

    @Column(length = 100, nullable = true)
    private String skillPoint2;

    @Column(length = 100, nullable = true)
    private String skillName3;

    @Column(length = 100, nullable = true)
    private String skillPoint3;

    @Column(length = 100, nullable = true)
    private String skillName4;

    @Column(length = 100, nullable = true)
    private String skillPoint4;

    @Column(length = 100, nullable = true)
    private String skillName5;

    @Column(length = 100, nullable = true)
    private String skillPoint5;

    @Column(length = 100, nullable = true)
    private String skillName6;

    @Column(length = 100, nullable = true)
    private String skillPoint6;

    @Column(length = 100, nullable = true)
    private String skillName7;

    @Column(length = 100, nullable = true)
    private String skillPoint7;

    @Column(length = 100, nullable = true)
    private String skillName8;

    @Column(length = 100, nullable = true)
    private String skillPoint8;

    @Column(length = 100, nullable = true)
    private String skillName9;

    @Column(length = 100, nullable = true)
    private String skillPoint9;

    @Column(length = 100, nullable = true)
    private String skillName10;

    @Column(length = 100, nullable = true)
    private String skillPoint10;

    @Column(length = 100, nullable = true)
    private String skillName11;

    @Column(length = 100, nullable = true)
    private String skillPoint11;

    @Column(length = 100, nullable = true)
    private String skillName12;

    @Column(length = 100, nullable = true)
    private String skillPoint12;

    @Column(length = 100, nullable = true)
    private String tag1;

    @Column(length = 100, nullable = true)
    private String tag2;

    @Column(length = 100, nullable = true)
    private String tag3;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "feed", cascade = CascadeType.REMOVE)
    private List<FeedLike> feedLikes;

    @OneToMany(mappedBy = "feed", cascade = CascadeType.REMOVE)
    private List<Comment> comments;

    @Builder
    public Feed(String title, String subtitle, String name, String phoneNumber, String birthday, String country, String link1, String link2, String link3, String link4, String email, String eductionTitle1, String eductionTitle2,  String eductionContent1, String eductionContent2, String experienceTitle1, String experienceContent1, String experienceTitle2, String experienceContent2,String experienceTitle3, String experienceContent3,String experienceTitle4, String experienceContent4,String experienceTitle5, String experienceContent5, String certificateDay1, String certificateTitle1, String certificateDay2, String certificateTitle2, String certificateDay3, String certificateTitle3, String certificateDay4, String certificateTitle4, String certificateDay5, String certificateTitle5, String awardTitle1, String awardDay1, String awardTitle2, String awardDay2, String awardTitle3, String awardDay3, String awardTitle4, String awardDay4, String awardTitle5, String awardDay5, String activityTitle1, String activityContent1, String activityTitle2, String activityContent2, String activityTitle3, String activityContent3, String activityTitle4, String activityContent4, String activityTitle5, String activityContent5, String skillName1, String skillPoint1, String skillName2, String skillPoint2, String skillName3, String skillPoint3, String skillName4, String skillPoint4, String skillName5, String skillPoint5, String skillName6, String skillPoint6, String skillName7, String skillPoint7, String skillName8, String skillPoint8, String skillName9, String skillPoint9, String skillName10, String skillPoint10, String skillName11, String skillPoint11, String skillName12, String skillPoint12, String tag1, String tag2, String tag3, User user) {
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
        this.user = user;
        this.eductionContent1 = eductionContent1;
        this.eductionTitle1 = eductionTitle1;
        this.eductionTitle2 = eductionTitle2;
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
    public void updateFeed(String title, String subtitle, String name, String phoneNumber, String birthday, String country, String link1, String link2, String link3, String link4, String eductionTitle1, String eductionTitle2, String eductionContent1, String eductionContent2, String experienceTitle1, String experienceContent1, String experienceTitle2, String experienceContent2, String experienceTitle3, String experienceContent3, String experienceTitle4, String experienceContent4, String experienceTitle5, String experienceContent5, String certificateDay1, String certificateTitle1, String certificateDay2, String certificateTitle2, String certificateDay3, String certificateTitle3, String certificateDay4, String certificateTitle4, String certificateDay5, String certificateTitle5, String awardTitle1, String awardDay1, String awardTitle2, String awardDay2, String awardTitle3, String awardDay3, String awardTitle4, String awardDay4, String awardTitle5, String awardDay5, String activityTitle1, String activityContent1, String activityTitle2, String activityContent2, String activityTitle3, String activityContent3, String activityTitle4, String activityContent4, String activityTitle5, String activityContent5, String skillName1, String skillPoint1, String skillName2, String skillPoint2, String skillName3, String skillPoint3, String skillName4, String skillPoint4, String skillName5, String skillPoint5, String skillName6, String skillPoint6, String skillName7, String skillPoint7, String skillName8, String skillPoint8, String skillName9, String skillPoint9, String skillName10, String skillPoint10, String skillName11, String skillPoint11, String skillName12, String skillPoint12, String tag1, String tag2, String tag3) {
        this.title = title;
        this.subtitle = subtitle;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.country = country;
        this.link1 = link1;
        this.link2 = link2;
        this.link3 = link3;
        this.link4 = link4;
        this.eductionContent1 = eductionContent1;
        this.eductionTitle1 = eductionTitle1;
        this.eductionTitle2 = eductionTitle2;
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

    public void updateEmail(String email) {
        this.email = email;
    }
}

