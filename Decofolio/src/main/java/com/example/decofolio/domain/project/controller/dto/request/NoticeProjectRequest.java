package com.example.decofolio.domain.project.controller.dto.request;

import com.example.decofolio.domain.user.domain.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NoticeProjectRequest {

    private String title;

    private String text;

    private String skill1;

    private String skill2;

    private String link1;

    private String link2;

    @Builder
    public NoticeProjectRequest(String title, String text, String skill1, String skill2, String link1, String link2) {
        this.title = title;
        this.text = text;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.link1 = link1;
        this.link2 = link2;
    }
}
