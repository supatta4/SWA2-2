package com.swa.oop3;

public class Square extends Shape {

	private double height;  // To hold height.
	   private double base;  //To hold width or base

	   // Set height and width
	   public void setValues(double height, double base)
	   {
	      this.height = height;
	      this.base = base;
	   }

	   //Get height
	   public double getHeight() 
	   {
	       return height;
	   }
	     
	   //Get width
	   public double getBase() 
	   {
	       return base;
	   } 
	public double getArea() {
		this.area =getHeight() * getBase();
        return this.area;
	}

}
