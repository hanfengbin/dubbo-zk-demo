package com.xxx.dubbo.demo.service.impl;

import com.xxx.dubbo.demo.service.SingService;

import java.util.Date;

public class SingImpl implements SingService {
    public void sing(String name) {
        System.out.println(name+"正在"+"歌唱！"+"唱歌的时间是： "+new Date());
    }
}
