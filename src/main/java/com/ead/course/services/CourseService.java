package com.ead.course.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ead.course.models.CourseModel;
import com.ead.course.specifications.SpecificationTemplate;

public interface CourseService {

	public void delete(CourseModel courseModel);

	public CourseModel save(CourseModel courseModel);

	public Optional<CourseModel> findById(UUID courseId);

	public Page<CourseModel> findAll(SpecificationTemplate.CourseSpec spec, Pageable pageable);
	
}
