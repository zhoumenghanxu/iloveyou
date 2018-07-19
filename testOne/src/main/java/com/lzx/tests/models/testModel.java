package com.lzx.tests.models;

/**
 * @author liangzexu
 * @date 2018/6/26 下午4:20
 */
public enum testModel {
    AA("1"),
    BB("2");

    private String value;

    private testModel(String value){
        this.value=value;
    }

    public  String getValue(){
        return this.value;
    }


}
