package com.preguntas.kibernum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pregunta2 {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("y00 i(");
		boolean b = m.find();

		if (b)
			System.out.println("Tiene caracteres especiales");

	}

}
