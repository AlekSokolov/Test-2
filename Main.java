package com.company;
public class Main {
	public static void main(String[] args) {
	Person Contact = new Person();
	Contact.name = "Andrey";
	Contact.id = 2;
	Contact.age = 42;
	Contact.phone = "380977163299";
		System.out.println("Имя: " + Contact.name);
		System.out.println("Порядковый номер: " + Contact.id);
		System.out.println("Возраст:" + Contact.age);
		System.out.println("Телефон:" + Contact.phone);

		Person Contact1 = new Person();
		Contact1.name = "Alina";
		Contact1.id =  3;
		Contact1.age = 25 - Integer.parseInt(args[0]);
		Contact1.phone = "380663213122";
		System.out.println("Имя:" + Contact1.name);
		System.out.println("Порядковый номер:" + Contact1.id);
		System.out.println("Возраст:" + Contact1.age);
		System.out.println("Телефон:" + Contact1.phone);
	}
}
