package com.ead.course.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ead.course.models.LessonModel;

public interface LessonService {

	public LessonModel save(LessonModel lessonModel);

	public Optional<LessonModel> findLessonIntoModule(UUID moduleId, UUID lessonId);

	public void delete(LessonModel lessonModel);

	public List<LessonModel> findAllLessonsIntoModule(UUID moduleId);

}
