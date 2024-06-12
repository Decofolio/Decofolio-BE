package com.example.decofolio.domain.project.controller.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateProjectRequest {
    private String title;

    private String text;

    private String skill1;

    private String skill2;

    private String link1;

    private String link2;
}
