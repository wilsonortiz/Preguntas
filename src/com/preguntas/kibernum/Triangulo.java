package com.preguntas.kibernum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangulo {

	public float baseT;
	public float altura;

	public Triangulo() {
	}

	public Triangulo(float baseT, float altura) {
		this.baseT = baseT;
		this.altura = altura;
	}

	public float area(Triangulo triangulo) {
		float resultado;
		resultado = (triangulo.getBaseT() * triangulo.getAltura()) / 2;

		return resultado;
	}

	// Escribir un metodo denominado achatar que reciba como argumento un objeto de
	// tipo triangulo y devuelva otro objeto de tipo triangulo con un 10% menos de
	// la altura que la origunal (h’=0.9h), pero ajustando la base que tengan la
	// misma area (b’=(b*h)/h’)

	public Triangulo achatar(Triangulo triangulo) {
		Triangulo tr = null;
		float porcentaje = 10;
		float calculoAltura = triangulo.getAltura() - (triangulo.getAltura() * porcentaje) / 100;

		float base = triangulo.getBaseT() * triangulo.getAltura() / calculoAltura;

		tr = new Triangulo(base, calculoAltura);

		return tr;
	}

	public float getBaseT() {
		return baseT;
	}

	public void setBaseT(float baseT) {
		this.baseT = baseT;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	/** MAIN **/

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ingrese la base del triangulo:");
		float baseTriangulo = Float.parseFloat(br.readLine());

		System.out.println("Ingrese la altura del triangulo:");
		float alturaTriangulo = Float.parseFloat(br.readLine());

		Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);

		System.out.println("El area original del triangulo es:" + triangulo.area(triangulo));

		Triangulo triangulo2 = new Triangulo(triangulo.achatar(triangulo).getBaseT(),
				triangulo.achatar(triangulo).getAltura());

		System.out.println("El area nueva es :" + triangulo.area(triangulo2));

	}

}
