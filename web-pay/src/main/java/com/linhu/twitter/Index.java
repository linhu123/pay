package com.linhu.twitter;

public class Index {
    protected static void fun(int[] a){
        //首先由前向后便利分别得到各自对
        int day = 0;
        int count = 0;
        int countAll = 0;
        for(int i = 0;i<a.length;i++){
            int tmp = a[i];
            int large = a[i];
            for (int j = i+1;j<a.length;j++){
                if(a[j]>large){
                    large = a[j];
                    day = j;
                    count = a[j]-tmp+count;
                }
            }
            countAll += count;
            System.out.println("第"+(i+1)+"天买入"+"第"+"==="+(day+1)+"天买入"+"收入："+count);
        }
        System.out.println("总消费为:"+countAll);
    }

    public static void main(String[] args) {
        int[] a = {7,1,5,1,6,4};
        fun(a);
    }
}
