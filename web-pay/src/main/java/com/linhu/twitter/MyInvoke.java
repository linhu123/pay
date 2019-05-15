package com.linhu.twitter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyInvoke {


    public void test(String[] args){
        for (String string:args){
            System.out.println(string);
        }
    }
    /**
     * 反射就是将类别的各个组成部分进行剖析，可以得到每个组成部分
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //读取字节码对象
        Class<MyInvoke> clazz = (Class<MyInvoke>) Class.forName("com.linhu.twitter.MyInvoke");
        //获取一个对象
        Constructor con = clazz.getConstructor();
        MyInvoke myInvoke = (MyInvoke) con.newInstance();

        String[] s = new String[]{"aaaa","a21e3rdass"};

        //获取method对象
        Method method = clazz.getMethod("test", String[].class);

        //调用invoke 来使用上面的Test方法
        method.invoke(myInvoke,(Object) s);
        //method.invoke(myInvoke, s);
    }
}
