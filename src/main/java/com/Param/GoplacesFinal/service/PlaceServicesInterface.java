package com.Param.GoplacesFinal.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.Param.GoplacesFinal.domain.Place;
@Service
public interface PlaceServicesInterface {
	
	public List<Place> allPlaces();
	public String save(Place placeDomain);
	public String update(Place placeDomain);
	public String delete(Place placeDomain);

}
