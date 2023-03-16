package com.oldfish.chapter01;

public class Bitwise {

    /**
     * @Description: 向左移位
     * @param num-等待移位的十进制数, m-向左移的位数
     * @return int-移位后的十进制数
     * Math.ceil(num / (Math.pow(2, m)))
     */
    public static int leftShift(int num, int m) {
        return num << m;
    }

    /**
     * @Description: 向右移位
     * @param num-等待移位的十进制数, m-向右移的位数
     * @return int-移位后的十进制数
     * 实际上，>> 也是右移操作。简单来说，之所以有这两种表达方式，根本原因是 Java 的二进制数值中最高一位是符号位
     * num * (2 ^ m)
     */
    public static int rightShift(int num, int m) {
        return num >>> m;
    }

    /**
     * @Description: 二进制按位“或”的操作
     * @param num1-第一个数字，num2-第二个数字
     * @return 二进制按位“或”的结果
     */
    public static int or(int num1, int num2) {
        return (num1 | num2);
    }

    /**
     * @Description: 二进制按位“与”的操作
     * @param num1-第一个数字，num2-第二个数字
     * @return 二进制按位“与”的结果
     */
    public static int and(int num1, int num2) {
        return (num1 & num2);
    }

    /**
     * @Description: 二进制按位“异或”的操作
     * @param num1-第一个数字，num2-第二个数字
     * @return 二进制按位“异或”的结果
     */
    public static int xor(int num1, int num2) {
        return (num1 ^ num2);
    }

    public static void main(String[] args) {
        int num = 53;
        int m = 1;
        // 测试向左移位
        System.out.println(String.format("数字 [%d] 的二进制向左移 [%d] 位是 [%d]", num, m, Bitwise.leftShift(num, m)));
        // 测试向右移位
        System.out.println(String.format("数字 [%d] 的二进制向右移 [%d] 位是 [%d]", num, m, Bitwise.rightShift(num, m)));

        m = 3;
        // 测试向左移位
        System.out.println(String.format("数字 [%d] 的二进制向左移 [%d] 位是 [%d]", num, m, Bitwise.leftShift(num, m)));
        // 测试向右移位
        System.out.println(String.format("数字 [%d] 的二进制向右移 [%d] 位是 [%d]", num, m, Bitwise.rightShift(num, m)));



        int a = 53;
        int b = 35;
        // 获取十进制数53和35的按位“或”
        System.out.println(
                String.format("数字 [%d(%s)] 和数字 [%d(%s)] 的按位‘或’结果是 [%d(%s)]",
                        a, Radix.decimalToBinary(a), b, Radix.decimalToBinary(b),
                        Bitwise.or(a, b), Radix.decimalToBinary(Bitwise.or(a, b)))
        );
        // 获取十进制数53和35的按位“与”
        System.out.println(
                String.format("数字 [%d(%s)] 和数字 [%d(%s)] 的按位‘与’结果是 [%d(%s)]",
                        a, Radix.decimalToBinary(a), b, Radix.decimalToBinary(b),
                        Bitwise.and(a, b), Radix.decimalToBinary(Bitwise.and(a, b))));
        // 获取十进制数53和35的按位“异或”
        System.out.println(
                String.format("数字 [%d(%s)] 和数字 [%d(%s)] 的按位‘异或’结果是 [%d(%s)]",
                        a, Radix.decimalToBinary(a), a, Radix.decimalToBinary(a),
                        Bitwise.xor(a, a), Radix.decimalToBinary(Bitwise.xor(a, a))));
    }

}
