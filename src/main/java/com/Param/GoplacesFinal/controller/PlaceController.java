package com.Param.GoplacesFinal.controller;

import com.Param.GoplacesFinal.domain.Place;

import com.Param.GoplacesFinal.service.PlaceServicesImpl;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v.0.1/home")
public class PlaceController 
{
	
@Autowired
	PlaceServicesImpl placeServicesImpl;

@RequestMapping(method =RequestMethod.GET)
	public ResponseEntity<List<Place>> callAllPlace()
	{
	
	List<Place> placesResult = placeServicesImpl.allPlaces();
	return ResponseEntity.ok(placesResult);
	}

@RequestMapping(method =RequestMethod.POST)
	public ResponseEntity<String> save(@RequestBody Place place)
	{
	String placesResult = placeServicesImpl.save(place);
	return ResponseEntity.ok(placesResult);
	}
}
