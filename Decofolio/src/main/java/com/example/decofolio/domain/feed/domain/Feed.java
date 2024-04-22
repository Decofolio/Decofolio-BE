package com.example.decofolio.domain.feed.domain;

import javax.persistence.*;

import com.example.decofolio.domain.user.domain.User;
import lombok.*;
import org.hibernate.validator.constraints.URL;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Builder
    public Feed(String title, String subtitle, String name, String phoneNumber, String birthday, String country, String link1, String link2, String link3, String link4, String email, String eductionTitle1, String eductionTitle2,  String eductionContent1, String eductionContent2, String experienceTitle1, String experienceContent1, String experienceTitle2, String experienceContent2,String experienceTitle3, String experienceContent3,String experienceTitle4, String experienceContent4,String experienceTitle5, String experienceContent5, String certificateDay1, String certificateTitle1, String certificateDay2, String certificateTitle2, String certificateDay3, String certificateTitle3, String certificateDay4, String certificateTitle4, String certificateDay5, String certificateTitle5, String awardTitle1, String awardDay1, String awardTitle2, String awardDay2, String awardTitle3, String awardDay3, String awardTitle4, String awardDay4, String awardTitle5, String awardDay5, User user) {
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
    }
}

