package com.tour.be.region.model;

import com.tour.be.common.model.CommonVo;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Region extends CommonVo implements Serializable
{
	private long regionId;

	private String regionTp;

	private long lat;

	private long lng;

	private List<RegionTrans> RegionTransList = new ArrayList<>();
}
