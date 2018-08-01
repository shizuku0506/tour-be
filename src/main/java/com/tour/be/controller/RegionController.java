package com.tour.be.controller;

import com.tour.be.domain.Region;
import com.tour.be.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RegionController
{
	@Autowired
	private RegionRepository regionRepository;

	@PostMapping(value = "/add")
	public void add()
	{
		Region r = new Region();
		r.setRegionType("T");
		regionRepository.save(r);
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
