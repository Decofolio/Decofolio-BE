package com.example.decofolio.domain.project.controller.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class GetProjectDetailsResponse {
    private Long projectId;

    private String title;

    private String text;

    private String link1;

    private String link2;

    private String skill1;

    private String skill2;
}