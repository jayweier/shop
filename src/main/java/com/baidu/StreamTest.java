package com.baidu;

import java.io.*;

public class StreamTest {

    public static void main(String[] args) {

        File file = new File("D:\\Project\\shop\\src\\main\\resource\\my.txt");
        if (!file.exists()) {
            throw new RuntimeException("要读取的文件不存在");
        }

        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);

            // 带缓存的读取
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            //调用读取流对象的读取方法
            //1.read()返回的是读取到的字节
            //2.read(byte[] b)返回的是读取到的字节个数

            //创建一个字节数组，定义len记录长度
            int len = 0;
            byte[] buf = new byte[1024];
            while ((len = bufferedInputStream.read(buf)) != -1) {
                System.out.println(new String(buf, 0, len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
