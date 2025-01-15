package com.niloy.service;

import com.niloy.modal.Chat;
import com.niloy.modal.Project;
import com.niloy.modal.User;

import java.util.List;

public interface ProjectService {
    Project createProject(Project project, User user)throws Exception;

    List<Project> getProjectByTeam(User user, String category, String tag)throws Exception;

    Project getProjectById(long projectId)throws Exception;

    void deleteProject(long projectId, long userId)throws Exception;

    Project updateProject(Project updatedProject, long id)throws Exception;

    void addUserToProject(long projectId, long userId)throws Exception;

    void removeUserFromProject(long projectId, long userId)throws Exception;

    Chat getChatByProjectId(long projectId)throws Exception;

    List<Project> searchProject(String keyword, User user)throws Exception;
}
