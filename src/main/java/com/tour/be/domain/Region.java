package com.tour.be.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Entity
@Table(name = "TB_REGION")
@Data
@Getter
@Setter
public class Region
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "REGION_NO")
	private long regionNo;

	@Column(name = "REGION_TP")
	@NotNull
	private String regionType;

	@Column(name = "LAT")
	@NotNull
	private long lat;

	@Column(name = "LNG")
	@NotNull
	private long lng;

	@OneToMany(mappedBy = "region",
					cascade = CascadeType.ALL,
					targetEntity = RegionTrans.class
					//					fetch = FetchType.EAGER
	)
	private Collection<RegionTrans> regionTrans;
}
