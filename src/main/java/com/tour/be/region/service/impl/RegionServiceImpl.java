package com.tour.be.region.service.impl;

import com.tour.be.region.model.Region;
import com.tour.be.region.model.RegionParam;
import com.tour.be.region.model.RegionTrans;
import com.tour.be.region.repository.RegionRepository;
import com.tour.be.region.repository.RegionTransRepository;
import com.tour.be.region.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RegionServiceImpl implements RegionService
{

	@Autowired
	private RegionRepository regionRepository;

	@Autowired
	private RegionTransRepository regionTransRepository;

	@Override
	public List<Region> findAll(RegionParam param)
	{
		regionRepository.findAll();
		return null;
	}

	@Override
	public Region findOneRegion(long id)
	{
		return null;
	}

	@Override
	public RegionTrans findOneRegionTrans(long id, long regionId)
	{
		return null;
	}

	@Override
	public int saveRegion(Region region)
	{
		return 0;
	}

	@Override
	public int removeRegion(long regionId)
	{
		return 0;
	}


	@Override
	public int updateRegion(Region region)
	{
		return 0;
	}

}
