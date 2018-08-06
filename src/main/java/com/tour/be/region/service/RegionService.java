package com.tour.be.region.service;

import com.tour.be.region.model.Region;
import com.tour.be.region.model.RegionTrans;

import java.util.List;

public interface RegionService
{
	// 전체 조회
	public List<Region> findAll();

	public Region findRegion(long seq);

	public RegionTrans findRegionTrans(long seq);

	public int saveRegion(Region region);
}
