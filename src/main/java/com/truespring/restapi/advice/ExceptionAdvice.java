package com.truespring.restapi.advice;

import com.truespring.restapi.advice.exception.CUserNotFoundException;
import com.truespring.restapi.model.response.CommonResult;
import com.truespring.restapi.service.ResponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@RestControllerAdvice // 예외 발생시 json형태로 결과를 반환
public class ExceptionAdvice {

    private ResponseService responseService;

//    @ExceptionHandler(Exception.class) // 예외 발생시 해당 Handler로 처리한다는 명시
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 해당 예외가 발생하면 Response에 출력되는 HttpStatus Code가 500으로 내려가도록 설정
//    protected CommonResult defaultException(HttpServletRequest request, Exception e) {
//        return responseService.getFailResult(); // 예외 발생시 이미 만들어둔 CommonResult의 실패 결과를 json 형태로 출력하도록 설정
//    }

    @ExceptionHandler(CUserNotFoundException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    protected CommonResult userNotFoundException(HttpServletRequest request, CUserNotFoundException e) {
        return responseService.getFailResult();
    }
}
