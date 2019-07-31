package com.qianfeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultBean<T> {

    private String responseCod;
    private T data;
}
