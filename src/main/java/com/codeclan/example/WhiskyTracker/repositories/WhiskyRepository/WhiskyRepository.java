package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {
	List<Whisky> findWhiskyByYear(int year);

}
