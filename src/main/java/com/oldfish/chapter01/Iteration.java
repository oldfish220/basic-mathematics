package com.oldfish.chapter01;

public class Iteration {

    public static long getNumOfWheat(int grid) {
        // 总数
        long sum = 0;
        // 当前格子中的麦粒数量
        long numOfWheat = 0;

        // 第一个格子里麦粒的数量
        numOfWheat = 1;
        sum += numOfWheat;

        for (int i = 2; i <= grid; i++) {
            numOfWheat *= 2;
            sum += numOfWheat;
        }

        return sum;
    }

    /**
     * @Description: 计算大于1的正整数之平方根
     * @param n-待求的数, deltaThreshold-误差的阈值, maxTry-二分查找的最大次数
     * @return double-平方根的解
     */
    public static double getSquareRoot(int n, double deltaThreshold, int maxTry) {
        if (n <= 1) {
            return -1;
        }

        double min = 1, max = n;
        for (int i = 0; i < maxTry; i++) {
            double middle = (min + max) / 2;
            double square = middle * middle;
            double delta = Math.abs((square / n) - 1);

            if (delta <= deltaThreshold) {
                return middle;
            } else {
                if (square > n) {
                    max = middle;
                } else {
                    min = middle;
                }
            }
        }

        return -2;
    }

    public static void main(String[] args) {

        System.out.println(String.format("舍罕王给了这么多粒: [%d]", Iteration.getNumOfWheat(63)));



        int number = 10;
        double squareRoot = Iteration.getSquareRoot(number, 0.000001, 10000);
        if (squareRoot == -1.0) {
            System.out.println("请输入大于1的整数");
        } else if (squareRoot == -2.0) {
            System.out.println("未能找到解");
        } else {
            System.out.println(String.format("[%d] 的平方根是 [%f]", number, squareRoot));
        }

    }

}
