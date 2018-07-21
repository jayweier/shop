package com.baidu.practice.overloadtest;
//观察类的多态现象：
//1. i1和i2都是Item类型
//2. 都调用effect方法
//3. 输出不同的结果
public class MagicPotion extends Item {
    public void effect(){
        System.out.println("蓝瓶使用后，可以回魔法");
    }
}
