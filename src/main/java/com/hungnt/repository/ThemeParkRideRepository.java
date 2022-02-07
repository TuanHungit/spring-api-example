package com.hungnt.repository;

import com.hungnt.entity.ThemeParkRide;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide, Long> {
    List<ThemeParkRide> findByName(String name);
    
    Optional<ThemeParkRide> findById(Long id);
}