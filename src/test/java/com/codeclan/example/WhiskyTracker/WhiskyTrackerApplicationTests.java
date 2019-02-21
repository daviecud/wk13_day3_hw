package com.codeclan.example.WhiskyTracker;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	DistilleryRepository distilleryRepository;
	
	@Autowired
	WhiskyRepository whiskyRepository;
	
	@Test
	public void contextLoads() {
	}
//	
//	@Test
//	public void canfindWhiskyOfParticularYear() {
//		List<Whisky> found = whiskyRepository.findWhiskyByYear(15);
//		assertEquals(15, found.get(0).getName());
//	}

}
