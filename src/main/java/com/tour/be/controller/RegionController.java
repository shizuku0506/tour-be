package com.tour.be.controller;

import com.tour.be.domain.Region;
import com.tour.be.domain.RegionTrans;
import com.tour.be.repository.RegionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionController
{
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private RegionRepository regionRepository;

	@PostMapping(value = { "", "/" })
	public ResponseEntity<?> add(
					@RequestBody
									Region region)
	{
		logger.debug("test");
		System.out.println("test111");
		regionRepository.save(region);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@PostMapping(value = "/add2")
	public void add2()
	{
		RegionTrans r = new RegionTrans();
		//		regionRepository.save(r);
	}

	@GetMapping(value = "/test")
	public List<Region> getAll()
	{
		Iterable<Region> list = regionRepository.findAll();
		List<Region> target = new ArrayList<>();
		list.forEach(target::add);
		return target;
	}
}
