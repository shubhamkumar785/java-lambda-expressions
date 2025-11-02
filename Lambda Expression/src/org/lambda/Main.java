package org.lambda;

public class Main {
    public static void main(String[] args) {

//        MyInter myInter = new MyInterImplement();
//        myInter.sayHello();
        
        
    	
        
//        MyInter i = new MyInter() {
//			
//			@Override
//			public void sayHello() {
//				// TODO Auto-generated method stub
//				System.out.println("This is first anonymous class");
//			}
//		};
//		i.sayHello();
        
        
    	
    	
//        MyInter i = () -> {
//        	System.out.println("This is my first time using lambda");
//        };
//        i.sayHello();
    	
    	
    	
    	sumInter suminter = (a, b) -> a + b;
    	System.out.println(suminter.sum(2, 4));
    	System.out.println(suminter.sum(8,  12));
    }
}
