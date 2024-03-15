package com.ead.course.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.course.models.LessonModel;
import com.ead.course.models.ModuleModel;
import com.ead.course.repositories.LessonRepository;
import com.ead.course.repositories.ModuleRepository;
import com.ead.course.services.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService{

	@Autowired
	ModuleRepository moduleRepository;
	
	@Autowired
	LessonRepository lessonRepository;

	/**
	 * Modo mais performático (maior desempenho) de deleção, sem delegar ao JPA nem ao Banco de dados.
	 */
	@Transactional
	@Override
	public void delete(ModuleModel moduleModel) {
		List<LessonModel> lessonModelList = this.lessonRepository.findAllLessonsIntoModule(moduleModel.getModuleId());
		if(!lessonModelList.isEmpty()) {
			this.lessonRepository.deleteAll(lessonModelList);	
		}
		this.moduleRepository.delete(moduleModel);
	}
	
}
