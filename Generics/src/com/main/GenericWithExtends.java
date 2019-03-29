package com.main;

class MyGenericClassWithExtends<T extends Number> {

	private T myEntity;

	public T getMyEntity() {
		return myEntity;
	}

	public void setMyEntity(T myEntity) {
		this.myEntity = myEntity;
	}
}


public class GenericWithExtends {

	public static void main(String[] args) {
		
		MyGenericClassWithExtends<Integer> genericClass = new MyGenericClassWithExtends<>();
		genericClass.setMyEntity(10);
		System.out.println(genericClass.getMyEntity().getClass().getName());
		
		//Compilation error b'coz String class not extends Number
		/*MyGenericClassWithExtends<String> genericClass1 = new MyGenericClassWithExtends<>();
		genericClass1.setMyEntity("10");
		System.out.println(genericClass1.getMyEntity().getClass().getName());*/

	}

}
