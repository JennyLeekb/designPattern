package com.lkb.demo3;

public class AbstractFactoryPatternDemo {
	
	public static void main(String[] args) {
		AbstractFactory factory = FactoryProducer.getFactory("shape");
		Shape sh1 = factory.getShape("circle");
		sh1.draw();
		
		Shape sh2 = factory.getShape("Rectangle");
		sh2.draw();
		
		
		AbstractFactory factory1 = FactoryProducer.getFactory("color");
		Color co1 = factory1.getColor("RED");
		co1.fill();
		
		Color co2 = factory1.getColor("Blue");
		co2.fill();
	}
}
