package com.mcally.cn;

/**
 * 稀疏数组算法：主要去除二维数组无用的零值占用空间，达到节约空间优化性能
 * Mcally  2019年10月23日19:43:36
 */
public class SparseArray {
    public static void main(String[] args) {
        int[][] data = new int[5][5];
        data[1][1] = 2;
        data[2][2] = 3;

        System.out.println("==================================原始二维数组=====================================");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%d\t", data[i][j]);
            }
            System.out.println();
        }
        int[][] sArr = new int[3][3];
        sArr[0][0] = 5;//二维数组几行
        sArr[0][1] = 5;//二维数组几列
        sArr[0][2] = 2;//二维数组多少个不为零的数值
        //第一个值(row,col,val)
        sArr[1][0] = 1;
        sArr[1][1] = 1;
        sArr[1][2] = 2;
        //第二个值(row,col,val)
        sArr[2][0] = 2;
        sArr[2][1] = 2;
        sArr[2][2] = 3;
        /**
         *
         *
         * row  col  val
         * 5	5	2
         * 1	1	2
         * 2	2	3
         *
         *
         */
        System.out.println("==================================稀疏二维数组=====================================");

        for (int i = 0; i < sArr.length; i++) {
            for (int j = 0; j < sArr[i].length; j++) {
                System.out.printf("%d\t", sArr[i][j]);
            }
            System.out.println();
        }
        System.out.println("==================================稀疏二维数组还原二位数组=====================================");
        int[][] rdctdata = new int[sArr[0][0]][sArr[0][1]];
        for (int i = 1; i < sArr.length; i++) {
            rdctdata[sArr[i][0]][sArr[i][1]] = sArr[i][2];
        }
        System.out.println("==================================打印还原二位数组=====================================");

        for (int i = 0; i < rdctdata.length; i++) {
            for (int j = 0; j < rdctdata[i].length; j++) {
                System.out.printf("%d\t", rdctdata[i][j]);
            }
            System.out.println();
        }
    }


}
