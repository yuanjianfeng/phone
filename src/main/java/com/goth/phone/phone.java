package com.goth.phone;

import com.goth.common.windException;

import java.util.*;

/**
 * @Description 根据键盘输出结果
 * @Author yuan.jianfeng
 * @Date 2020/1/8  19:39 上午
 */
public class phone {

   static Map<String,String> numberStr = new HashMap<String, String>(){{
        put("0", "");
        put("1", "");
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    /**
     *
     * @param inputStr 输入2-9组合任意长度的字符串
     * @param concatStr 要拼接的字符串
     * @param index  输入的字符串从第几位开始取
     * @param outArr 输出新的数组
     */
     static void conver(String inputStr, String concatStr, int index,List<String> outArr){
        if(index>inputStr.length()){//递归的出口,循环到最后一个位置结束，并将上次传入的值（最终结果返回）
            outArr.add(concatStr);
            return;//直接返回
        }
        String one = inputStr.substring(index-1,index);//输入字符串中某一位
        String Abc =  numberStr.get(one);
        for (int i = 0; i <Abc.length() ; i++) {//循环 输入字符串对应手机中26个字符的单个值
            String  templeStr = concatStr+Abc.charAt(i);//中间要拼接的临时字符串
            conver(inputStr,templeStr,index+1,outArr);//递归入口,因为不知道输入数字的长度,不知道要for循环嵌套多少次
        }
    }


    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (ipt.length()>0&&ipt.indexOf("0")<0&&ipt.indexOf("1")<0) {
                return ipt;
            }
        }
        throw  new windException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        String str = scanner("输入2-9数字之内任意长度的数字");
        List<String> outArr = new ArrayList<>();
        conver(str,"",1,outArr);//第一个位置开始
        System.out.println(outArr);
    }



}
