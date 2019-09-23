package com.template.lml.demo.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class test1 {
    static List<Integer> argList = new ArrayList<>();

    public static void main(String[] args) {

        argList.add(88);
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

        insertSort(argList.size());


        System.out.println("*****");
        for (int i : argList) {
            System.out.println(i);
        }
    }

    static void insertSort(int index) {
        if (index!=1) {
            insertSort(index-1);
            for (int i = 0; i < index; i++) {
                if(argList.get(i)>argList.get(index-1)) {
                    argList.add(i, argList.get(index-1));
                    argList.remove(index);
                    break;
                }
            }

        }
    }
}