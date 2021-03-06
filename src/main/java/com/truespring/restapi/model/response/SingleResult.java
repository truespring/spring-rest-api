package com.truespring.restapi.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SingleResult<T> extends CommonResult {
    // 결과가 단일건인 api를 담는 모델
    // Generic Interface에 <T>를 지정하여 어떤 형태의 값도 넣을 수 있도록 구현
    // CommonResult를 상속받으므로 api요청 결과도 같이 출력

    private T data;
}
