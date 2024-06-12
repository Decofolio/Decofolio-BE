package com.example.decofolio.domain.project.domain.repository;

import com.example.decofolio.domain.feed.domain.Feed;
import com.example.decofolio.domain.project.domain.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
    Project findByProjectId(Long projectId);
}