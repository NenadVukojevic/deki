package com.bluebirch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluebirch.model.Invertor;

@Repository
public interface InvertorRepository extends JpaRepository<Invertor, Integer> {

	List<Invertor> findAll();
}
