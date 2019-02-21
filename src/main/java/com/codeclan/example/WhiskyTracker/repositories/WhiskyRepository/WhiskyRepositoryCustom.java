package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import java.util.List;

import com.codeclan.example.WhiskyTracker.models.Whisky;

public interface WhiskyRepositoryCustom {
	
	List<Whisky> findWhiskyByParticularDistilleryAndOfAge(int age, Long id);

    List<Whisky> findWhiskyByRegion(String region);
}
