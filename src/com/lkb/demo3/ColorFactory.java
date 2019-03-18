package com.lkb.demo3;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		color = color.toLowerCase();
		Color ch = null;
		switch(color){
		case "red":
			ch = new Red();
			break;
		case "green":
			ch = new Green();
			break;
		case "blue":
			ch = new Blue();
			break;
		default:
				break;
		}
		
		return ch;
	}

}
