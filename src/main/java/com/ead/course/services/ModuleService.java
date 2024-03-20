package com.ead.course.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ead.course.models.ModuleModel;

public interface ModuleService {

	public void delete(ModuleModel moduleModel);

	public ModuleModel save(ModuleModel moduleModel);

	public Optional<ModuleModel> findById(UUID moduleId);

	public Optional<ModuleModel> findModuleIntoCourse(UUID courseId, UUID moduleId);

	public List<ModuleModel> findAll();

	public  List<ModuleModel> findAllModulesIntoCourse(UUID courseId);
	
}
