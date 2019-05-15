package com.preguntas.kibernum;

public class Pregunta1 {

	public static void main(String[] args) {
		isNegative("(Prue(ba");

	}

	public static boolean isNegative(String field) {
		boolean bracketsFound = false;

		try {
			bracketsFound = searchBrackets(field);
		} catch (Exception e) {
			return false;
		}

		return bracketsFound;
	}

	private static boolean searchBrackets(String field) {
		boolean found = false;

		if (field != null && field != "") {
			for (int ii = 0; ii < field.length(); ii++) {
				if (field.charAt(ii) == '(') {
					found = true;
				}
			}
		}
		return found;
	}

}
