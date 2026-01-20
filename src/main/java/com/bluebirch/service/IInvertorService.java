package com.bluebirch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluebirch.model.Invertor;
import com.bluebirch.model.InvertorModel;
import com.bluebirch.repository.InvertorModelRepository;
import com.bluebirch.repository.InvertorRepository;

@Service
public class IInvertorService implements InvertorService {

	@Autowired
	InvertorRepository invertorRepository;
	
	@Autowired
	InvertorModelRepository invertorModelRepository;
	
	@Override
	public List<Invertor> getInvertorList() {
		// TODO Auto-generated method stub
		return invertorRepository.findAll();
	}

	@Override
	public List<InvertorModel> getInvertorModelList() {
		// TODO Auto-generated method stub
		return invertorModelRepository.findAll();
	}

	@Override
	public List<InvertorModel> getInvertorModelListByInvertorId(Integer invertorId) {
		// TODO Auto-generated method stub
		return invertorModelRepository.findAllByInvertorId(invertorId);
	}

}
