package com.tour.be.region.model;

import com.tour.be.common.model.CommonVo;
import lombok.Data;

import java.io.Serializable;

@Data
public class RegionTrans extends CommonVo implements Serializable
{
	private long regionTransId;

	private long regionId;

	private String langTp;

	private String title;

	private String content;
}
