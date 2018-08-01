package com.tour.be.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
}
