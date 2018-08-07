package com.tour.be.common.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Data
@Getter
@Setter
public class ResponseVo
{
	private HttpStatus resultCode;

	private String resultMsg;

	private Object resultData;
}
