package com.tour.be.domain;

import javax.persistence.Embedded;
import java.io.Serializable;

public class RegionTransCompositeKey implements Serializable
{
	//	private long regionNo;
	@Embedded
	private Region region;

	private String langType;
}
