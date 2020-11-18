package com.mega.mvc05;

import org.springframework.stereotype.Component;

@Component
public class BSite {
	
	public void cart() {
		System.out.println("장바구니 담기");
	}
	
	public void buy() {
		System.out.println("주문하기");
	}
}
