package com.wrapcore.loveTest.common.exception;/*
 * author		: sp91l
 * date			: 2022-05-20_오전 9:46
 * description	:
 * ========================================================================
 * DATE				        AUTHOR				NOTE
 * ------------------------------------------------------------------------
 * 2022-05-20_오전 9:46	    sp91l				최초생성
 * */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.wrapcore.loveTest.common.api.ApiResponseCode;
import lombok.Getter;

@Getter
public class LovtException extends RuntimeException{

    private String retCode;
    private String retMsg;
    private String retSysMsg;
    @JsonInclude(value = Include.NON_NULL)
    private Object data;

    public LovtException(ApiResponseCode code) {
        super();
        this.retCode = code.getRetCode();
        this.retMsg = code.getRetMsg();
        this.retSysMsg = code.getRetSysMsg();
        this.data = null;
    }

    public LovtException(ApiResponseCode code, Object data) {
        super();
        this.retCode = code.getRetCode();
        this.retMsg = code.getRetMsg();
        this.retSysMsg = code.getRetSysMsg();
        this.data = data;
    }

    public LovtException(String retCode, String retMsg, String retSysMsg) {
        super();
        this.retCode = retCode;
        this.retMsg = retMsg;
        this.retSysMsg = retSysMsg;
        this.data = null;
    }

    public LovtException(String retCode, String retMsg, String retSysMsg, Object data) {
        super();
        this.retCode = retCode;
        this.retMsg = retMsg;
        this.retSysMsg = retSysMsg;
        this.data = data;
    }
}
