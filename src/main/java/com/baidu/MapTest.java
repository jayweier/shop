package com.baidu;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 07.09 07:50
 */
public class MapTest {

    public static void main(String[] args) {

        // key--value，key不能重复，value可以重复
        HashMap<String, User> map = new HashMap<>();

        User a = new User("aaa", "0423", 0);
        User b = new User("bbb", "0423", 1);
        User c = new User("ccc", "0423", 2);

        map.put("aaa", a);
        map.put("bbb", b);
        map.put("ccc", c);

        System.out.println(map.get("bbb"));
        System.out.println(map.get("ddd"));

        // 遍历map
        for (Map.Entry<String, User> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }

        System.out.println("-------------------------------------------------");
        // 遍历key
        for (String str : map.keySet()) {
            System.out.println(str);
        }

        System.out.println("-------------------------------------------------");
        // 遍历value
        for (User user : map.values()) {
            System.out.println(user);
        }
    }
}
