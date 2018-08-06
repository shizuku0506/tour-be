package com.tour.be.region.repository;

import com.tour.be.region.model.Region;
import com.tour.be.region.model.RegionTrans;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RegionTransRepository
{
	@Select("select * from student")
	public List<RegionTrans> findAll();
}
