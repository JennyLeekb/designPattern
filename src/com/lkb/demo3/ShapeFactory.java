package com.lkb.demo3;


public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		shape = shape.toLowerCase();
		Shape sh = null;
		switch(shape){
		case "rectangle":
			sh = new Rectangle();
			break;
		case "circle":
			sh = new Circle();
			break;
		case "square":
			sh = new Square();
			break;
		default:
				break;
		}
		
		return sh;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
