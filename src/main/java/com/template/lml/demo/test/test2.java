package com.template.lml.demo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName test2
 * @Description
 * @Author lml
 * @Date2019/9/18 11:28
 * @Version V1.0
 **/
public class test2 {
    static List<Integer> argList = new ArrayList<>();

    public static void main(String[] args) {

        argList.add(2);
        argList.add(12);
        argList.add(3);
        argList.add(6);
        argList.add(4);
        argList.add(3);
        argList.add(2);
        argList.add(55);
        argList.add(23);
        argList.add(4);

        for (int i : argList) {
            System.out.println(i);
        }

        selectSort(argList.size());

        System.out.println("********");
        for (int i : argList) {
            System.out.println(i);
        }
    }

    static void selectSort(int index) {
        if (index!=1) {
            int max=argList.get(0);
            int maxIndex=0;
            for (int i = 1; i < index; i++) {
                if(max<argList.get(i)) {
                    max = argList.get(i);
                    maxIndex = i;
                }
            }
            int temp = argList.get(index-1);
            argList.set(maxIndex,temp);
            argList.set(index-1, max);
            selectSort(index-1);
        }
    }
}
