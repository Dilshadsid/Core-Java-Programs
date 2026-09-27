package com.basic;

import com.collection.Demo_xyz;

class raaj {
	void demo() {
		System.out.println("asalamualikum");
	}
}

public class overriding_demo extends raaj {
	void demo() {
		System.out.println("walaikum-asalam");
	}

	public static void main(String[] args) {
		raaj raaj = new raaj();
		raaj.demo();
		raaj xyz = new overriding_demo();
		xyz.demo();

	}

}
