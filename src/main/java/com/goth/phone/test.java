package com.goth.phone;

import com.goth.phone.phone;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author yuan.jianfeng
 * @Date 2020/1/8  8:17 下午
 */
public class test {



    public static void main(String[] args) {
        List<String> outArr = new ArrayList<>();
        phone.conver("234","",1,outArr);//第一个位置开始
        System.out.println(outArr);
    }
}
