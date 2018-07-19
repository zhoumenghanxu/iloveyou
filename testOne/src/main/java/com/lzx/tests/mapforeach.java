package com.lzx.tests;

import java.util.Map;

public class mapforeach {
    public static void Foreach(Map map){
        map.forEach((k,v)-> System.out.println("k:"+k+"\t"+"v:"+v));
    }
}
