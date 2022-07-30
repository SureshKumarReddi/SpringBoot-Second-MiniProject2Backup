package com.suresh.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.models.StateEntity;

public interface StateMasterRepository extends JpaRepository<StateEntity, Integer> {

	public List<StateEntity> findByCountryId(Integer countryId);
}
