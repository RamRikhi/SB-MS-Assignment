package com.rm.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.rm.entity.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Serializable> {

}
