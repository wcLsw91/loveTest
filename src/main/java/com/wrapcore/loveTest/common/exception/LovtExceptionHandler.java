package com.wrapcore.loveTest.common.exception;/*
 * author		: sp91l
 * date			: 2022-05-20_오전 10:25
 * description	:
 * ========================================================================
 * DATE				        AUTHOR				NOTE
 * ------------------------------------------------------------------------
 * 2022-05-20_오전 10:25	    sp91l				최초생성
 * */

import com.wrapcore.loveTest.common.api.ApiErrorResponse;
import com.wrapcore.loveTest.common.api.ApiResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
@Slf4j
public class LovtExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiErrorResponse> handelException(Exception e) {
        log.error("Exception: {}", e);
        return ResponseEntity.ok(new ApiErrorResponse(ApiResponseCode.FAIL));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiErrorResponse> handelException(MethodArgumentNotValidException e) {
        List<String> errors = new ArrayList<>();
        for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
            errors.add(fieldError.getField());
        }

        return ResponseEntity.ok(new ApiErrorResponse(ApiResponseCode.MANDATORY_PARAMETER_NULL, errors));
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<ApiErrorResponse> handelException(BindException e) {
        List<String> errors = new ArrayList<>();
        for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
            errors.add(fieldError.getField());
        }

        return ResponseEntity.ok(new ApiErrorResponse(ApiResponseCode.MANDATORY_PARAMETER_FAIL, errors));
    }

    @ExceptionHandler(LovtException.class)
    public ResponseEntity<ApiErrorResponse> handelException(LovtException e) {
        return ResponseEntity.ok(new ApiErrorResponse(e.getRetCode(), e.getRetMsg(), e.getRetSysMsg(), e.getData()));
    }
}
