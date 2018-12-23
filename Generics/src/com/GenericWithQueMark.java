package com;

import java.util.ArrayList;

class MyGenericClassWithQueMark<T extends Number> {

	private T myEntity;

	public T getMyEntity() {
		return myEntity;
	}

	public void setMyEntity(T myEntity) {
		this.myEntity = myEntity;
	}
	
	//Here
	// ArrayList of unknown type which extends Number
	public void getList(ArrayList<? extends Number> list) {
		
	}
}

public class GenericWithQueMark {

	public static void main(String[] args) {
		
		MyGenericClassWithQueMark<Integer> classWithQueMark = new MyGenericClassWithQueMark<>();
		classWithQueMark.setMyEntity(20);
		System.out.println(classWithQueMark.getMyEntity().getClass().getName());
		
		ArrayList<Double> doubleList = new ArrayList<Double>();
		doubleList.add(20.20);
		classWithQueMark.getList(doubleList);
	}

}
