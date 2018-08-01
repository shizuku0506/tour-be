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
public class RegionTrans
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TRANS_NO")
	private long transNo;

	@Column(name = "REGION_NO")
	private long regionNo;

	@Column(name = "LANG_TP")
	private String langType;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "CONTENT")
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME")
	private Date createTime;
}
