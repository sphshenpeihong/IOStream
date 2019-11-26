package com.sikiedu.chapter2;



import org.junit.Test;

import java.io.*;

/**
 * @author shenpeihong
 * @date 2019/10/26 11:21:13
 * @description
 */
public class Demo01_FileInputOutputStream {
    public static void main(String[] args) {
        FileInputStream input = null;
        Demo01_FileInputOutputStream d = null;
        try {
            d = new Demo01_FileInputOutputStream();
            d.FileOutputStream();
            File f1 = new File("d:\\file\\demo01.txt");
            input = new FileInputStream("d:\\file\\demo01.txt");//文件输入流 文件从硬盘输入到内存
            byte[] buf = new byte[1024];
            int read = input.read(buf); //返回的字节存放在缓冲区buf中  需要创建String类型变量去接收  然后read是其自字节数
            String s = new String(buf,0,read);
            System.out.println("总字节数："+read);
            System.out.println(s);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();//使用流进行传输时，无论是输入流还是输出流进行传输都会先建立一条管道，所以使用完一定要把管道close
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @Test
    public void FileOutputStream(){
        FileOutputStream output = null;
        try {

            output = new FileOutputStream("D:\\file\\output05.txt");//文件输出流
            byte[] buf = "我现在要输出了".getBytes();
            output.write(buf);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(output != null){
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
