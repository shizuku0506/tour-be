package com.tour.be.region.controller;

import com.tour.be.region.model.Student;
import com.tour.be.region.repository.RegionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionController
{
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	RegionRepository regionRepository;

	@GetMapping(value = { "", "/" })
	public ResponseEntity<?> findAll()
	{
		logger.debug("test");
		//		List<Student> list = regionRepository.findAll();
		//		regionRepository.save(region);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@GetMapping(value =  "/{}" )
	public ResponseEntity<?> findOne(@PathVariable long seq)
	{
		logger.debug("test");
		//		List<Student> list = regionRepository.findAll();
		//		regionRepository.save(region);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	//	@PostMapping(value = { "", "/" })
	//	public ResponseEntity<?> add(
	//					)
	//	{
	//		logger.debug("test");
	//		System.out.println("test111");
	//		List<Student> list = regionRepository.findAll();
	////		regionRepository.save(region);
	//		return new ResponseEntity<String>(HttpStatus.CREATED);
	//	}
	//
	//	@PostMapping(value = "/add2")
	//	public void add2()
	//	{
	//		RegionTrans r = new RegionTrans();
	//		//		regionRepository.save(r);
	//	}
	//
	//	@GetMapping(value = "/test")
	//	public List<Region> getAll()
	//	{
	//		Iterable<Region> list = regionRepository.findAll();
	//		List<Region> target = new ArrayList<>();
	//		list.forEach(target::add);
	//		return target;
	//	}
}
