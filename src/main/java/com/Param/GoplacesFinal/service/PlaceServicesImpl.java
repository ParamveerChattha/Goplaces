package com.Param.GoplacesFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Param.GoplacesFinal.domain.Place;
import com.Param.GoplacesFinal.repository.PlaceRepo;

@Component
public class PlaceServicesImpl implements PlaceServicesInterface {
 @Autowired
 	PlaceRepo placerepository;

	public List<Place> allPlaces() {
		// TODO Auto-generated method stub
		List<Place> placeFinal = (List<Place>)placerepository.findAll();
		return placeFinal;
	}
	@Override
	public String save(Place placeDomain) {

		placerepository.save(placeDomain);
		return "Successfully Saved";
	}

	@Override
	public String update(Place placedomain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Place placedomain) {
		// TODO Auto-generated method stub
		return null;
	}

}
