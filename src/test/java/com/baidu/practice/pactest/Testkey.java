package com.baidu.practice.pactest;

public class Testkey {
    public static void main(String[] args) {

        int[] a = new int[3];
        String pwd = "";
        String trypwd;
        for (int i : a) {
            do {
                a[i] = (int) (Math.random() * 76 + 48);
            } while (((58 <= a[i]) && (a[i] <= 64)) || ((91 <= a[i]) && (a[i] <= 96)));
            pwd += (char) a[i];
        }
        System.out.print(pwd);
        for (int i = 48; i <= 122; i++)
            for (int j = 48; j <= 122; j++)
                for (int k = 48; k <= 122; k++) {
                    if ((getChar(i) == ' ') | (getChar(j) == ' ') | (getChar(k) == ' '))
                        ;
                    else {
                        trypwd = "";
                        trypwd += getChar(i);
                        trypwd += getChar(j);
                        trypwd += getChar(k);
                        System.out.printf("Destiny:%s Trying:%s%n", pwd, trypwd);
                        if (trypwd.equals(pwd)) {
                            System.out.println("Done!");
                            System.out.println(trypwd);
                            System.exit(0);
                        }
                    }
                }

    }

    public static char getChar(int num) {
        if (((58 <= num) && (num <= 64)) || ((91 <= num) && (num <= 96))) {
            return ' ';
        }
        return (char) num;
    }
}
