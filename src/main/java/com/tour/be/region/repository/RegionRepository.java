package com.tour.be.region.repository;

import com.tour.be.region.model.Region;
import com.tour.be.region.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RegionRepository
{
	@Select("select * from tb_region")
	public List<Region> findAll();

}
