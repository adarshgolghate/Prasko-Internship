//package com.Timepass;

class MyThread implements Runnable {
	public void run() {
System.out.println("I'm a barrier that keeps different parts of a program separate, providing a layer of protection and encapsulation. I control what goes in and what comes out. What am I?");	}

	
}

class ClassA{
	public void method() {
		System.out.println("I am a set of high-level instructions that humans can understand, but I need a translator to convert me into machine code for a computer to execute. What am I?");
	}
}

public class Timepass {
public static void main(String[] args) {

	System.out.println("Riddle 1");
	System.out.println("Who is ceo of Lenskart ???");
	System.out.println();
	System.out.println("Riddle 2 (Arrangle the loop in proper seqence then it will form sentence)");
	int i=5,k;
	String j[]= {"???","Lenskart","of","ceo","is","Who"};
	
for( k=j.length-1;k>=0;k=i--) {
		System.out.print(j[k]);
	}

MyThread mt=new MyThread();
System.out.println();
System.out.println("Riddle 3 (You Can't direct call run method which is present inside MyThread class in order to get riddle you have apply another approach) ");
System.out.println();
mt.run();


System.out.println();
System.out.println("");
System.out.println("Riddle 4");
ClassA a=new ClassA();
a.method();
System.out.println("Riddle 5");
System.out.println("I am a design pattern that allows an object to represent itself as a stand-in for another object. I am often used to control access to the real object. What am I?");
}
}
