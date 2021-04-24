package com.truespring.restapi.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class MapResult<T, K> extends CommonResult {

    private Map<T, K> data;
}
