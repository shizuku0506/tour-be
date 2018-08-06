package com.tour.be.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TB_REGION_TRANS")
@Data
@Getter
@Setter
//@IdClass(RegionTransCompositeKey.class)
public class RegionTrans
{
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRANS_NO")
	private long transNo;

	@ManyToOne(fetch = FetchType.LAZY,
					cascade = CascadeType.ALL,
					targetEntity = Region.class)
	@JoinColumn(name = "REGION_NO")
//	@Id
	private Region region;

	@Column(name = "LANG_TP")
//	@Id
	private String langType;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "CONTENT")
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME")
	private Date createTime;
}
