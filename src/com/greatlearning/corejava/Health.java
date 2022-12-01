package com.greatlearning.corejava;

class Health {
	 protected int age = 10; 
	 protected float weight = 13; 
	 protected int bmi = 12;
	 }


class HealthDriver{
	public static void main(String[] args) {
	Health h1=new Health();
	System.out.println(h1.age);
	System.out.println(h1.weight);
	System.out.println(h1.bmi);
}
	}
