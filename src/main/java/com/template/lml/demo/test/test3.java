package com.template.lml.demo.test;

/**
 * @ClassName test3
 * @Description
 * @Author lml
 * @Date2019/9/18 11:41
 * @Version V1.0
 **/
public class test3 {
    public static void main(String[] args) {
        int nums[]={4, 1, 2, 3};

        parm(nums, 0 , nums.length);


    }


    static void parm(int v[], int left, int right){
        if (left == right){
            for (int i : v){
                System.out.print(i+" ");
            }
            System.out.println();
        }else {
            for (int i = left; i<right; i++){
                swap(v, left, i);
                parm(v, left+1, right);
                swap(v, left, i);
            }
        }
    }

    static void swap(int v[], int index1, int index2){
        int temp = v[index1];
        v[index1] = v[index2];
        v[index2] = temp;
    }
}
