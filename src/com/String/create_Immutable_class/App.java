package com.String.create_Immutable_class;

/*
 * 1.S�n�f final oldu�u i�in alt s�n�flar olu�maz.
 * 2.Nesne olu�turulduktan sonra birdaha de�i�tirilemez veriyi final yapt�k
 * 3.Veriyi de�i�tirebilecek bir y�ntem yoktur
 * */
/*
 * Tum wrapper s�n�flar immutabled�r
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
