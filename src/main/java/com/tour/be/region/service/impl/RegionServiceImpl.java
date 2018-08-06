package com.tour.be.region.service.impl;

import com.tour.be.region.model.Region;
import com.tour.be.region.model.RegionTrans;
import com.tour.be.region.repository.RegionRepository;
import com.tour.be.region.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RegionServiceImpl implements RegionService
{

	@Autowired
	private RegionRepository regionRepository;
	@Autowired
	private RegionTransRepository regionTransRepository;

}
