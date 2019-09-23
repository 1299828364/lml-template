package com.template.lml.demo.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName test
 * @Description
 * @Author lml
 * @Date2019/9/15 18:39
 * @Version V1.0
 **/
public class test {

//    public static void main(String[] args) throws IOException {
//        Writer file = new FileWriter("diagram.csv");
//        file.write("n,times\n");
//
//
//        for (int i = 200; i <= 5000; i += 50) {
//            int index=0;
//            int index1=0;
//            int flag=0;
//            List<Integer> zhiShu = getZhiShu(i);
//
//            for (int j = i; j > 2; j--) {
//
//                zhiShu = spiltZhiShu(zhiShu,j);
//                flag=0;
//                if (j%2==0){
//                    for (int k = 0; k < zhiShu.size(); k++) {
//                        for (int l = zhiShu.size()-1; l > 0; l--) {
//                            index1++;
//                            if (zhiShu.get(k)+zhiShu.get(l)==j){
//                                index++;
//                                flag=1;
//                                break;
//                            }
//                            else if(zhiShu.get(k)+zhiShu.get(l)<j){
//                                break;
//                            }
//                        }
//                        if (flag==1){
//                            break;
//                        }
//                    }
//                }
//            }
//
//            file.write(i+","+index1+"\n");
//            System.out.println(":"+i+" 计算完的偶数个数:"+index+"; 次数"+index1);
//        }
//
//        file.close();
//
//    }
//
//    static List<Integer> spiltZhiShu(List<Integer> zhiShu,int size){
//        while (zhiShu.get(zhiShu.size()-1)>size){
//            zhiShu.remove(zhiShu.size()-1);
//        }
//        return zhiShu;
//    }
//
//    static List<Integer> getZhiShu(int size){
//        int[] zhiShu = new int[size];
//        int  index = 0;
//        for (int i = 2; i < size; i++){
//         if(zhiShu[index]!=1){
//            int k = i*i;
//            while (k < size){
//                zhiShu[k]=1;
//                k+=i;
//            }
//         }
//        }
//
//        ArrayList tempZhiShu = new ArrayList();
//        for (int i = 1; i < size; i++) {
//            if (zhiShu[i]==0){
//                tempZhiShu.add(i);
//            }
//        }
//
//        return tempZhiShu;
//    }


    public static void main(String[] args) {
        Map<Integer,String> listed = new HashMap<Integer,String>();
        listed.put(1,"1");
        listed.put(2,"2");
        listed.put(2,"3");
        System.out.println(listed.get(2));
    }
}
