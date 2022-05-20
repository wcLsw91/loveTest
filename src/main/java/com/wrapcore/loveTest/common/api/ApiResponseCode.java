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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum ApiResponseCode {

	/****************************************
	 CM0000 : 성공 (공통)
	 CM0001 : 파라미터 입력 오류 (공통)
	 GW0001 : Gateway MSA
	 US0001 : 사용자 MSA
	 BO0001 : BO MSA
	 PU0001 : PUSH MSA
	 ID0001 : 신원확인 MSA
	 PA0001 : 투표_정책참여 MSA
	 LP0001 : 지역화폐 MSA
	 EI0001 : EIF MSA
	 EM0001 : External MSG MSA
	****************************************/

	// Common
	SUCCESS("SUCCESS", "SUCCESS", "SUCCESS"),
	FAIL("FAIL", "예기치 못한 오류가 발생하였습니다. 재시도 해주시기 바랍니다.", "FAIL"),
	MANDATORY_PARAMETER_NULL("CM0001", "필수 파라미터 오류", "필수 파라미터 오류"),
	MANDATORY_PARAMETER_FAIL("CM0002", "필수 파라미터 오류", "필수 파라미터 오류"),
	;

	private String retCode;
	private String retMsg;
	private String retSysMsg;

}
