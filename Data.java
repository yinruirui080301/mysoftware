package com.pattern.observer;

public class Data {
    public static int[] datas=new int[100];
    static{
    	for(int i=0;i<datas.length;i++){
    		datas[i]=(i+1)*2;
    	}
    }
}
