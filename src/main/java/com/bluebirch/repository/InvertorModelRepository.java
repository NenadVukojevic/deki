package com.bluebirch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluebirch.model.InvertorModel;

@Repository
public interface InvertorModelRepository extends JpaRepository<InvertorModel, Integer> {
	public List<InvertorModel> findAll();
	public List<InvertorModel> findAllByInvertorId(Integer invertorId);
}
