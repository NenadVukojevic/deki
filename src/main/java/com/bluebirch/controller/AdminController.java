package com.bluebirch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluebirch.model.Invertor;
import com.bluebirch.model.InvertorModel;
import com.bluebirch.service.InvertorService;


@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	InvertorService invertorService;
	
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {
		String response = "Dejan";
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@GetMapping("/invertors")
	public ResponseEntity<List<Invertor>> getListOfInvertors()
	{
		List<Invertor> response = invertorService.getInvertorList();
		
		return new ResponseEntity<List<Invertor>>(response, HttpStatus.OK);
	}
	
	@GetMapping("/invertor/model")
	public ResponseEntity<List<InvertorModel>> getListOfInvertorModels()
	{
		List<InvertorModel> response = invertorService.getInvertorModelList();
		
		return new ResponseEntity<List<InvertorModel>>(response, HttpStatus.OK);
	}
	
	@GetMapping("/invertor/{id}/model")
	public ResponseEntity<List<InvertorModel>> getListOfInvertorModelsByInvertorId(@PathVariable Integer id)
	{
		List<InvertorModel> response = invertorService.getInvertorModelListByInvertorId(id);
		
		return new ResponseEntity<List<InvertorModel>>(response, HttpStatus.OK);
	}
	
}
