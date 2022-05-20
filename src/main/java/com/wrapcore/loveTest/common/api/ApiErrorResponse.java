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
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@JsonInclude(value = Include.NON_NULL)
@Getter
public class ApiErrorResponse {

	private String retCode;
	private String retMsg;
	private String retSysMsg;
	private String timestamp;
	private Object data;

	public ApiErrorResponse(ApiResponseCode code) {
		super();
		this.retCode = code.getRetCode();
		this.retMsg = code.getRetMsg();
		this.retSysMsg = code.getRetSysMsg();
		this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}

	public ApiErrorResponse(ApiResponseCode code, List<String> errors) {
		super();
		this.retCode = code.getRetCode();
		this.retMsg = code.getRetMsg();
		String errorField = errors.stream()
				.collect(Collectors.joining(", ", "(", ")"));
		this.retSysMsg = code.getRetSysMsg() + errorField;
		this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}

	public ApiErrorResponse(ApiResponseCode code, Object data) {
		super();
		this.retCode = code.getRetCode();
		this.retMsg = code.getRetMsg();
		this.retSysMsg = code.getRetSysMsg();
		this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		this.data = data;
	}

	public ApiErrorResponse(String retCode, String retMsg, String retSysMsg) {
		super();
		this.retCode = retCode;
		this.retMsg = retMsg;
		this.retSysMsg = retSysMsg;
		this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}

	public ApiErrorResponse(String retCode, String retMsg, String retSysMsg, Object data) {
		super();
		this.retCode = retCode;
		this.retMsg = retMsg;
		this.retSysMsg = retSysMsg;
		this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		this.data = data;
	}
}
