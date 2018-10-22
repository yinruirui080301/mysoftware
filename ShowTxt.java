package com.pattern.observer;

import java.util.Observable;

import java.util.Observer;

public class ShowTxt implements Observer {
    private final static ShowTxt st=new ShowTxt();
    private ShowTxt(){}
    public static ShowTxt getShowTxt(){
    	return st;
    }
	@Override
	public void update(Observable o, Object arg) {
		
		try{
		// TODO Auto-generated method stub
          java.io.RandomAccessFile  ra=new java.io.RandomAccessFile("D:/shang2017/a.txt","rw");
          int x[]=(int[])arg;
          for(int i=0;i<x.length;i++) 
        	  ra.writeInt(x[i]);
         
		}catch(Exception e){
			System.out.println(e);
		}
        
	}

}
