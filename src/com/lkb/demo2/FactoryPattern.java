package com.lkb.demo2;

public class FactoryPattern {
	
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
	    
		Shape shape1 = factory.getShape("circle");//不再使用new的方式直接new对象
		shape1.draw();
		
		Shape shape2 = factory.getShape("Rectangle");//不再使用new的方式直接new对象
		shape2.draw();
		
		Shape shape3 = factory.getShape("Square");//不再使用new的方式直接new对象
		shape3.draw();
	}

}
