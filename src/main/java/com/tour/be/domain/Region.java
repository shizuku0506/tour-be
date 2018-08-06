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
@SequenceGenerator(
				name = "SEQ_REGION_GENERATOR",
				sequenceName = "SEQ_REGION", //매핑할데이터베이스 시퀀스 이름
				initialValue = 1, allocationSize = 1)
public class Region
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "SEQ_REGION_GENERATOR")
//		@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@OneToMany(
					mappedBy = "region",
					cascade = CascadeType.ALL,
					targetEntity = RegionTrans.class
					//					fetch = FetchType.EAGER
	)
	private Collection<RegionTrans> regionTrans;
}
