package day16_polymorphism.y;

import day16_polymorphism.x.CurrentClass;

public class DifferentPackageSub extends CurrentClass{
	public void test() {
		super.c = 10;
		super.d = 10;
	}
}
