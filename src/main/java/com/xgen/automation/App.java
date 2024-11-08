package com.xgen.automation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 */
public class App {
	public static Logger log;
	
    public static void main(String[] args) {
    	arrayOrder();
    	
		/*
		 * log= LogManager.getLogger(App.class);
		 * log.info("Logged into Xgen Data Solution");
		 * System.out.println("Hello World!"); for(int i=1; i<1000;i++) {
		 * log.info("Logged for logs ---to create the back rotation");
		 * 
		 * }
		 */
    }
    
    
    
    
    public static void arrayOrder() {
    	int arr[] = {1,2,5,34,45,23,11};
    	int size= arr.length;
    	int temp = 0;
    	for(int i=0;i<size;i++) {
    		System.out.println("I am inside I loop::"+i);
    		for(int j=i+1;j<size;j++) {
    			System.out.println("I am inside j#"+j);
    			if(arr[j] < arr[i]) {
    				temp = arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    				
    			}
    			
    			
    		}
    		
    	}
    	int k;
    	for(k=0;k<size;k++) {
    		System.out.println(arr[k]);
    	}
    	
    	System.out.println("the fifth highest is ::"+arr[4]);
    }
    
    
    
}
