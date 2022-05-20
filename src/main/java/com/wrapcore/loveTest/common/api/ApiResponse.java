/*
 * KT LocalDx version 1.0
 *
 *  Copyright ⓒ 2021 kt corp. All rights reserved.
 *
 *  This is a proprietary software of kt corp, and you may not use this file except in
 *  compliance with license agreement with kt corp. Any redistribution or use of this
 *  software, with or without modification shall be strictly prohibited without prior written
 *  approval of kt corp, and the copyright notice above does not evidence any actual or
 *  intended publication of such software.
 */
package com.wrapcore.loveTest.common.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {

	private String retCode;
	private String retMsg;
	private String retSysMsg;
	private String timestamp;
	@JsonInclude(value = Include.NON_NULL)
	private Object data;

	public ApiResponse(Object data) {
		super();
		this.retCode = ApiResponseCode.SUCCESS.getRetCode();
		this.retMsg = ApiResponseCode.SUCCESS.getRetMsg();
		this.retSysMsg = ApiResponseCode.SUCCESS.getRetSysMsg();
		this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		this.data = data;
	}

}
