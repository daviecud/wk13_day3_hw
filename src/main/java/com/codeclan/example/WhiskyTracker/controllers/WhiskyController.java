package com.codeclan.example.WhiskyTracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {
	
	 @Autowired
	    WhiskyRepository whiskyRepository;

	    @GetMapping
	    public List<Whisky> getAllWhiskies(){
	        return whiskyRepository.findAll();
	    }


	    @GetMapping(value = "{year}")
	    public List<Whisky> getAllWhiskiesInYear(@PathVariable int year){
	        return  whiskyRepository.findWhiskyByYear(year);
	    }

	    @GetMapping(value = "{age}/{id}")
	    public List<Whisky> getAllWhiskiesByDistilleryAndAge(@PathVariable int age, @PathVariable Long id){
	        return whiskyRepository.findWhiskyByParticularDistilleryAndOfAge(age, id);
	    }

	    @GetMapping(value = "distillery/{region}")
	    public List<Whisky> getAllWhiskiesByRegion(@PathVariable String region){
	        return whiskyRepository.findWhiskyByRegion(region);
	    }

}
