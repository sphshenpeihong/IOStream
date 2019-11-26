package com.sikiedu.chapter1;

import java.io.File;
import java.io.IOException;

/**
 * @author shenpeihong
 * @date 2019/10/26 10:04:42
 * @description
 */
public class Demo01_File {
    public static void main(String[] args) throws Exception {
        //File可以指向一个文件，也可以指向文件夹 （文件==平常说的文件+文件夹）

        //使用File类实例化对象来指向我们电脑的文件
        File p00 = new File("D:\\file\\folder1");//File对象可以指向一个文件夹

        File file01 = new File("D:\\file\\folder\\file02.txt");//File对象指向某个文件(常用)
        File file02 = new File("D:\\file\\folder","file01.txt");

        boolean isSuccess = file01.createNewFile(); //创建文件
        boolean mkdir = p00.mkdir(); //创建文件夹
        System.out.println(isSuccess);
        System.out.println(mkdir);
    }
}
