package com.tour.be.controller;

import com.tour.be.domain.Region;
import com.tour.be.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegionController
{
	@Autowired
	private RegionRepository regionRepository;

	@PostMapping(value = "/add")
	public void add(){

	}

	@GetMapping(value = "/test")
	public List<Region> getAll()
	{
		List<Region> list = regionRepository.findAll();
		return list;
	}
}
