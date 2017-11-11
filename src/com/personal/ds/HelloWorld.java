package com.personal.ds;


public class HelloWorld {
    public HelloWorld(){
    	System.out.println("Hello World!!");
        return;
    }
    public void HelloWorld(){ //confusing, but this is void method not constructor
    	System.out.println("Hello India!!");
    	return;
    }

    public static void main(String[]a){
        HelloWorld n = new HelloWorld();
        n.HelloWorld();
    }
}