
package scool;

public class DNI {

	private String numero;
	private char Letra;

	public DNI(String dni) throws Exception {
		this.numero = DNI.checkNumber(dni);
		this.Letra = DNI.checkLetra(dni);

	}

	private static Character checkLetra(String dni) throws Exception {
		char letra = dni.charAt(dni.length() - 1);

		if (letra >= 'A' && letra <= 'Z') {

			return letra;
		} else {
			Exception E = new Exception("ERROR :letra no es valida");
			throw E;
		}

	}

	private static String checkNumber(String dni) throws Exception {

		String numero = dni.substring(0, dni.length() - 1);
		for (int pos = 0; pos < numero.length(); pos++) {
			int digito = numero.charAt(pos);
			if (digito >= 0 && digito <= 9 && numero.length() == 8) {

			} else {
				Exception E = new Exception(" ERROR : los numeros no son validos");
				throw E;
			}
		}
		return numero;
	}

}