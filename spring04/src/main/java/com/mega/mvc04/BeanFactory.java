package com.mega.mvc04;

public class BeanFactory {
	public Object create(String name) {
		Object object = null; //지역변수는 값지정해야한다.
		if (name.equals("apple")) {
			object = new Apple();
		}else if (name.equals("banana")) {
			object = new Banana();
		}
		return object;
	}
}
