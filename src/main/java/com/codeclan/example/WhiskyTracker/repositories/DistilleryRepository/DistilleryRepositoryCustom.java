package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import java.util.List;

import com.codeclan.example.WhiskyTracker.models.Distillery;

public interface DistilleryRepositoryCustom {
	List<Distillery> findDistilleryWithWhiskyOfCertainAge(int age);
}
