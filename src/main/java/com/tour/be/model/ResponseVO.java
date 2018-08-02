package com.tour.be.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Data
@Getter
@Setter
public class ResponseVO
{
	private HttpStatus resultCode;

	private String resultMsg;

	private Object resultData;
}
