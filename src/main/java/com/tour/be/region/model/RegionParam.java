package com.tour.be.region.model;

import com.tour.be.common.model.CommonVo;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class RegionParam implements Serializable
{
	private long seq;

	private String langTp;

	private long lat;

	private long lng;
}
