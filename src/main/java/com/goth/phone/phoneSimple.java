package com.goth.phone;

import com.goth.common.windException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author yuan.jianfeng
 * 初始解体思路,解法看phone
 */
public class phoneSimple {
    static String[] II = {"a","b","c"};
    static String[] III = {"d","e","f"};
    static String[] IV = {"g","h","i"};
    static String[] V = {"j","k","l"};
    static String[] VI = {"m","n","o"};
    static String[] VII = {"p","q","r","s"};
    static String[] VIII = {"t","u","v"};
    static String[] IX = {"w","x","y","z"};


    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (ipt.length()>0) {
                return ipt;
            }
        }
        throw new windException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        String input1 =  scanner("第一个数字");
        String[] firstArr = getArrByInput(input1);
        String input2 =  scanner("第二个数字");
        String[] secondtArr = getArrByInput(input2);
        List<String> mergeArr = new ArrayList<>();
        for (int i = 0; i <firstArr.length ; i++) {//两层嵌套实现输出结果,但，输入数字不限定，因此不确定循环的次数，采用递归方法实现
            for (int j = 0; j <secondtArr.length ; j++) {
                mergeArr.add(firstArr[i]+secondtArr[j]);
            }
        }
        System.out.println(mergeArr);
    }

    public  static String[] getArrByInput(String str){
        switch (str){
            case "1":return null;
            case "2": return II;
            case "3":return III;
            case "4":return IV;
            case "5":return V;
            case "6":return VI;
            case "7":return VII;
            case "8":return VIII;
            case "9":return IV;
            case "0":return null;
            default:return null;
        }

    }
}
