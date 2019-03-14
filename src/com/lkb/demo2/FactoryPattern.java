package com.lkb.demo2;

public class FactoryPattern {
	
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
	    
		Shape shape1 = factory.getShape("circle");//����ʹ��new�ķ�ʽֱ��new����
		shape1.draw();
		
		Shape shape2 = factory.getShape("Rectangle");//����ʹ��new�ķ�ʽֱ��new����
		shape2.draw();
		
		Shape shape3 = factory.getShape("Square");//����ʹ��new�ķ�ʽֱ��new����
		shape3.draw();
	}

}
