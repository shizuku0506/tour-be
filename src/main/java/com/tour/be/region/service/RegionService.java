package com.tour.be.region.service;

import com.tour.be.region.model.Region;
import com.tour.be.region.model.RegionParam;
import com.tour.be.region.model.RegionTrans;

import java.util.List;

public interface RegionService
{
	// 전체 조회
	public List<Region> findAll(RegionParam param);

	// 지역 하나 조회
	public Region findOneRegion(long regionId);

	// 지역 디테일 조회
	public RegionTrans findOneRegionTrans(long regionId, long regionTransId);

	// 지역 저장
	public int saveRegion(Region region);

	// 지역 삭제
	public int removeRegion(long regionId);

	// 지역 수정
	public int updateRegion(Region region);
}
