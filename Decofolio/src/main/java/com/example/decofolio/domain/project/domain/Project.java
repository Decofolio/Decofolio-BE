package com.example.decofolio.domain.project.domain;

import com.example.decofolio.domain.user.domain.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(length = 1500, nullable = false)
    private String text;

    @Column(length = 50, nullable = false)
    private String skill1;

    @Column(length = 50, nullable = true)
    private String skill2;

    @Column(length = 50, nullable = false)
    private String link1;

    @Column(length = 50, nullable = true)
    private String link2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Builder
    public Project(String title, String text, String skill1, String skill2, String link1, String link2, User user) {
        this.title = title;
        this.text = text;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.link1 = link1;
        this.link2 = link2;
        this.user = user;
    }

}
