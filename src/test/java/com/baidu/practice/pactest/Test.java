package com.baidu.practice.pactest;

public class Test {
    //1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码

    // 2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码

    // 要求： 分别使用多层for循环 和 递归解决上述问题

    public static void main(String[] args) {
        char[] c = new char[62];// 0-9加上a-z再加上A-Z一共有62个字符，用这个char数组装下这些字符
        int num = 0;// 设置初始角标为0
        for (int i = '0'; i <= '9'; i++) {// int 类型
            // 可以用单个字符表示，对应相应的ASCII码，由于'0'到'9'是连续的是个数，所以c[]的前十位就是字符0-9
            num = i - '0'; // 第一次循环对应字符‘0’的ASCII刚好和i相等，所以相减就是为0，第2次i自增了，所以再减去‘0’的ASCII就等于1了，以此类推。。。
            c[num] = (char) i;// int比char大，所以可以把int类型强转成char类型，这样就得到相应字符了,比如int类型的‘0’本来是48,这里强转成'0'了。
        }
        for (int i = 'a'; i < 'z'; i++) {// 和上面同理
            num++; // 由于这里循环次数是固定的，c的角标num自增就行了，这里num初始是10.
            c[num] = (char) i; // 和上面同理
        }
        for (int i = 'A'; i <= 'Z'; i++) {// 和上面同理
            num++;// 同上，这里的num初始是 10+26 = 36
            c[num] = (char) i; // 同上
        }
        for (char d : c) { // 用增强for循环遍历这个数组c
            System.out.print(d + " ");
        }
        char[] c1 = new char[3];// 设置一个大小为3的char类型的数组c1，用来装随机得到的密码
        for (int i = 0; i < c1.length; i++) {// 为这个c1数组赋值
            int num1 = (int) (Math.random() * 62);// 得到一个0-62的随机数用来做我们最开始储存所有字符的数组c的角标
            c1[i] = c[num1]; // 通过c[随机数]的方法来实现随机字符，然后赋予新的数组c1的每一项，这样我们就得到由随机字符组成的密码了
        }
        System.out.println();
        System.out.println("得到密码：" + new String(c1));// 看看这个密码吧

        String s = new String(c1);// 把密码存在一个字符串里

        String ss;// 创建一个新的字符串，用来装我们接下来要拼凑的字符串，看看是否和上面的密码相同。
        char[] cc = new char[3];// 创建一个新的char数组，用来拼凑字符
        a: for (int i = 0; i < c.length; i++) {// 第一层循环
            // 表示从0-9，a-z，A-Z这62个字符中的每一个字符都拿来当这个密码的第一位
            cc[0] = c[i];
            for (int j = 0; j < c.length; j++) {// 第二层循环
                // 表示从0-9，a-z，A-Z这62个字符中的每一个字符都拿来当这个密码的第二位
                cc[1] = c[j];
                for (int j2 = 0; j2 < c.length; j2++) {
                    {// 第三层循环 表示从0-9，a-z，A-Z这62个字符中的每一个字符都拿来当这个密码的第三位
                        cc[2] = c[j2];
                        ss = String.valueOf(cc); // 把每次得到的三个字符都转化为String类型，并付给ss
                        // System.out.println(ss);
                        if (ss.equals(s)) {// 把ss和s比较下看看是不是一样的
                            System.out.println("破解成功，密码是：" + ss);// 是的话就破解成功了
                            break a;// 跳出这个大循环 a，这样节约性能，找到就退出了
                        }

                    }
                }
            }
        }
    }
}
