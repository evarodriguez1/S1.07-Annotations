package n2ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {

	public String leer(String fichero) {

		String contenido = null;
		StringBuilder sb = null;

		File file = new File(fichero);

		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try {
			fileReader = new FileReader(file);

			// BufferedReader � Esta clase es usada para hacer clases Reader de bajo nivel
			// como FileReader pero de una manera mas eficiente y mas f�cil de usar.
			// Comparado con los FileReaders, los BufferedReaders leen relativamente grandes
			// cantidades de un archivo a la vez, y mantienen esta informaci�n en el buffer.
			// Cuando preguntamos por el siguiente caracter o la siguiente linea de
			// informaci�n, es recuperado del buffer, lo que minimiza el n�mero de veces que
			// se tiene que leer desde el archivo, lo cual es una operaci�n mas lenta. En
			// adici�n, la clase BufferedReader proveen m�todos mas convenientes como
			// readLine(), el cual nos permite leer la siguiente linea de caracteres de un
			// archivo.

			// Podremos leer l�nea a l�nea, por lo que la lectura ser� m�s eficiente y el
			// c�digo m�s claro.
			bufferedReader = new BufferedReader(fileReader);

			sb = new StringBuilder();
			String linea = bufferedReader.readLine();
			while (linea != null) {
				sb.append(linea);
				linea = bufferedReader.readLine();
			}

		} catch (IOException ex) {
			System.err.println(ex.getMessage());

		} finally {

			if (bufferedReader != null) {
				try {

					bufferedReader.close();
				} catch (IOException ex) {

					System.err.println(ex.getMessage());
				}
			}

			if (fileReader != null) {
				try {

					fileReader.close();
				} catch (IOException ex) {

					System.err.println(ex.getMessage());
				}
			}
		}

		if (sb != null) {
			contenido = sb.toString();
		}
		return contenido;
	}
}
