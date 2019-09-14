package cn.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {

        //Collection是一个接口，而Collectios是一个工具类
        List<String> s = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            s.add("小红："+i);
        }
        System.out.println(s);
        //随机排列元素
        Collections.shuffle(s);
        System.out.println(s);
        //逆序
        Collections.reverse(s);
        System.out.println(s);
        //排序
        Collections.sort(s);
        System.out.println(s);
        System.out.println(Collections.binarySearch(s,"小红：4"));
        //用特定的对象重写整个容器
        Collections.fill(s," i love you");
        System.out.println(s);
    }
}
