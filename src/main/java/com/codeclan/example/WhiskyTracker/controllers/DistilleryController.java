package com.codeclan.example.WhiskyTracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {

	 @Autowired
	    DistilleryRepository distilleryRepository;

	    @GetMapping
	    public List<Distillery> getAllDistilleries(){
	        return distilleryRepository.findAll();
	    }

	    @GetMapping(value = "{region}")
	    public List<Distillery> getAllDistilleriesByRegion(@PathVariable String region){
	        return distilleryRepository.findDistilleryByRegion(region);
	    }

	    @GetMapping(value = "/whisky/{age}")
	    public List<Distillery> findDistilleriesThatHaveWhiskyOfAge(@PathVariable int age){
	        return distilleryRepository.findDistilleryWithWhiskyOfCertainAge(age);
	    }


}
