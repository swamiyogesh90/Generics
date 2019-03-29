package com.main;

class MyGenericClass<T> {

	private T myEntity;

	public T getMyEntity() {
		return myEntity;
	}

	public void setMyEntity(T myEntity) {
		this.myEntity = myEntity;
	}
}

public class SimpleGeneric {

	public static void main(String[] args) {

		MyGenericClass<Integer> genericClass = new MyGenericClass<>();
		genericClass.setMyEntity(10);
		System.out.println(genericClass.getMyEntity().getClass().getName());
		
		MyGenericClass<String> genericClass1 = new MyGenericClass<>();
		genericClass1.setMyEntity("10");
		System.out.println(genericClass1.getMyEntity().getClass().getName());

	}

}
