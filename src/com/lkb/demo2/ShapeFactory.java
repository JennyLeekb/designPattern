package com.lkb.demo2;

public class ShapeFactory {
	
	public Shape getShape(String str){
		str = str.toLowerCase();
		Shape shape = null;
		switch(str){
		case "rectangle":
			shape = new Rectangle();
			break;
		case "circle":
			shape = new Circle();
			break;
		case "square":
			shape = new Square();
			break;
		default:
				break;
		}
		
		return shape;
	}

}
