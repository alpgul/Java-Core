package com.String.create_Immutable_class;

/*
 * 1.Sýnýf final olduðu için alt sýnýflar oluþmaz.
 * 2.Nesne oluþturulduktan sonra birdaha deðiþtirilemez veriyi final yaptýk
 * 3.Veriyi deðiþtirebilecek bir yöntem yoktur
 * */
/*
 * Tum wrapper sýnýflar immutabledýr
 * String, Boolean, Byte, Short, Integer, Long, Float, Double etc
 * */
public final class App {

	final String pancardNumber;

	public App(String pancardNumber) {

		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {

		return pancardNumber;
	}
}
