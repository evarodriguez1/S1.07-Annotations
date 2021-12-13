package n2ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyBufferedWriter {

	public void escribir(String fichero, String contenido, boolean agregarAlContenidoExistente) {
		File file = new File(fichero);
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		try {
			fileWriter = new FileWriter(file, agregarAlContenidoExistente);

			// BufferedWriter � Esta clase es usada para hacer clases de bajo nivel como
			// FileWriters de una manera mas eficiente y mas f�ciles de usar. Comparado con
			// las clases FileWriter, los BufferedWriters escribe relativamente grandes
			// cantidades de informaci�n a un archivo, lo cual minimiza el n�mero de veces
			// que las operaciones de escritura de archivos se llevan a cabo, las cuales son
			// operaciones mas lentas. La clase BufferedWriter tambien provee un m�todo
			// llamado newLine() el cual crea separadores de linea espec�ficos de la
			// plataforma de manera autom�tica.

			bufferedWriter = new BufferedWriter(fileWriter);

			if (contenido != null && contenido.length() > 0) {
				bufferedWriter.write(contenido);
				System.out.println("S'ha generat el fitxer: " + fichero);

			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		finally {

			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
			
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
			
		}
	}

}
