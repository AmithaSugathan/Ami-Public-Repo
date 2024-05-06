package com.obsqura.training.samplepgms;

public class Child extends Parent{
	public void display()
	{
		System.out.println("Child Class");
		super.display();
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		
	}

}
