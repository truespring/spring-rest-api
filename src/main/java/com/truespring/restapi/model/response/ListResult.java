package com.truespring.restapi.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListResult<T> extends CommonResult {
    // 결과가 여러건인 api를 담는 모델
    // 결과 필드를 List형태로 선언하고 Generic Interface에 <T>를 지정하여 어떤 형태의 List값도 넣을 수 있도록 구현
    // CommonResult를 상속받으므로 api요청 결과도 같이 출력

    private List<T> list;
}
