package com.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ShowConsole implements Observer {
    private final static ShowConsole sc=new ShowConsole();
    private ShowConsole(){ }
    public static ShowConsole getShowConsole(){
    	return sc;
    }
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
        System.out.println("######");
        int x[]=(int[])arg;
        for(int i=0;i<x.length;i++){
        	System.out.print(x[i]+"  ");
        	if ((i+1)%5==0) System.out.println();
        }
        System.out.println("######");
	}

}
