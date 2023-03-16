package com.oldfish.chapter01;

import java.math.BigInteger;

public class Radix {

    public static String decimalToBinary(int decimalSource) {
        // 转换成BigInteger类型，默认是十进制
        BigInteger bi = new BigInteger(String.valueOf(decimalSource));
        // 参数2指定的是转化成二进制
        return bi.toString(2);
    }

    public static int binaryToDecimal(String binarySource) {
        // 转换为BigInteger类型，参数2指定的是二进制
        BigInteger bi = new BigInteger(binarySource, 2);
        // 默认转换成十进制
        return Integer.parseInt(bi.toString());
    }

    public static void main(String[] args) {
        int a = 53;
        String b = "110101";

        // 获取十进制数53的二进制数
        System.out.println(String.format("数字 [%d] 的二进制是 [%s]", a, Radix.decimalToBinary(a)));
        // 获取二进制数110101的十进制数
        System.out.println(String.format("数字 [%s] 的十进制是 [%d]", b, Radix.binaryToDecimal(b)));
    }

}
