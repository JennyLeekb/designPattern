package com.lkb.demo3;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String factory){
		factory = factory.toLowerCase();
		if(factory.equals("shape"))
			return new ShapeFactory();
		else if(factory.equals("color"))
			return new ColorFactory();
		
		return null;
	}

}
