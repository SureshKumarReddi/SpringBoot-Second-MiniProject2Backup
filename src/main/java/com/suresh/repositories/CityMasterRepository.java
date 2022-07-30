package com.suresh.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.models.CityEntity;

public interface CityMasterRepository extends JpaRepository<CityEntity, Integer> {

	public List<CityEntity> findByStateId(Integer stateId);
}
