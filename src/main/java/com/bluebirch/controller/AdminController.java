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
import com.bluebirch.model.PDV;
import com.bluebirch.model.Panel;
import com.bluebirch.model.PanelModel;
import com.bluebirch.model.Roof;
import com.bluebirch.service.InvertorService;
import com.bluebirch.service.PDVService;
import com.bluebirch.service.PanelService;
import com.bluebirch.service.RoofService;



@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	InvertorService invertorService;
	
	@Autowired
	PanelService panelService;

	@Autowired
	PDVService pdvService;

	@Autowired
	RoofService roofService;

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

	@GetMapping("/panels")
	public ResponseEntity<List<Panel>> getListOfPanels()
	{
		List<Panel> response = panelService.getAllPanels();		
		return new ResponseEntity<List<Panel>>(response, HttpStatus.OK);	
	}
	
	@GetMapping("/panel/models")
	public ResponseEntity<List<PanelModel>> getListOfPanelModels()
	{
		List<PanelModel> response = panelService.getAllPanelModels();		
		return new ResponseEntity<List<PanelModel>>(response, HttpStatus.OK);		
	}

	@GetMapping("/panel/{id}/models")
	public ResponseEntity<List<PanelModel>> getListOfPanelModelsByPanelId(@PathVariable Integer id)
	{
		List<PanelModel> response = panelService.getPanelModelsByPanelId(id);		
		return new ResponseEntity<List<PanelModel>>(response, HttpStatus.OK);			
	}

	@GetMapping("/pdv")
	public ResponseEntity<List<PDV>> getPDVs() {
		List<PDV> response = pdvService.getAllPDVs();
		return new ResponseEntity<List<PDV>>(response, HttpStatus.OK);
	}
	
	@GetMapping("/roofs")
	public ResponseEntity<List<Roof>> getRoofs() {
		List<Roof> response = roofService.getAllRoofs();
		return new ResponseEntity<List<Roof>>(response, HttpStatus.OK);
	}
}
