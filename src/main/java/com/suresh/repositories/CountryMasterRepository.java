package com.suresh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.suresh.models.CountryEntity;

public interface CountryMasterRepository extends JpaRepository<CountryEntity, Integer> {

}
