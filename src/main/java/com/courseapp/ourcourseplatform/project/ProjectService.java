package com.courseapp.ourcourseplatform.project;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectById(ObjectId id) {
        return projectRepository.findById(id).orElseThrow(() -> new RuntimeException("Project not found with id " + id));
    }

    public Project updateProject(ObjectId id, Project project) {
        Project existingProject = getProjectById(id);
        return projectRepository.save(existingProject);
    }

    public void deleteProject(ObjectId id) {
        projectRepository.deleteById(id);
    }
}
