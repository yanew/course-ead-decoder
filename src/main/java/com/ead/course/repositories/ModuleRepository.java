package com.ead.course.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ead.course.models.ModuleModel;

public interface ModuleRepository extends JpaRepository<ModuleModel, UUID>{

	@EntityGraph(attributePaths = {"course"})
	ModuleModel findByTitle(String title);
	
	//Para update/deletes usar @Modifying além de @Query
	//https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
	@Query(value="select * from tb_modules where course_course_id = :courseId", nativeQuery = true)
	List<ModuleModel> findAllModulesIntoCourse(@Param("courseId") UUID courseId);

}