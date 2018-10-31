package com.pattern.observer;

import java.util.Observable;
// 这是被观察者类
public class EventObservable extends Observable {
	private int obj[];
	 private void notifyEvent(){
		 this.addObserver(ShowTxt.getShowTxt());
		 this.addObserver(ShowConsole.getShowConsole());
		 this.setChanged();
		 this.notifyObservers(obj);
	 }
     public void show(int begin,int sum){
    	  obj=new int[sum];
    	  for(int i=0;i<sum;i++){
    		  obj[i]=Data.datas[begin+i];
    	  }
    	  notifyEvent();
     }
}
