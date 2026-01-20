package com.bluebirch.service;

import java.util.List;

import com.bluebirch.model.Invertor;
import com.bluebirch.model.InvertorModel;

public interface InvertorService {
	List<Invertor> getInvertorList();
	
	List<InvertorModel> getInvertorModelList();
	
	List<InvertorModel> getInvertorModelListByInvertorId(Integer invertorId);
}
