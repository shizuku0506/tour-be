package com.tour.be.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "TB_REGION")
@Data
@Getter
@Setter
public class Region
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "REGION_NO")
	private long regionNo;

	@Column(name = "REGION_TP")
	private String regionType;

	@OneToMany
	@JoinColumn(name = "REGION_NO")
	private Collection<RegionTrans> regionTrans;
}
