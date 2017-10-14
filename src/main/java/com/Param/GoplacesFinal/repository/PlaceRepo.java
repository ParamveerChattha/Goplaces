package com.Param.GoplacesFinal.repository;
import com.Param.GoplacesFinal.domain.Place;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepo extends CrudRepository<Place, Integer> {

}
