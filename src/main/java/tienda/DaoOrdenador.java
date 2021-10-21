package tienda;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DaoOrdenador {

	public static void crearFicheroOrdenador(Ordenador o) {
		
		try (FileOutputStream file = new FileOutputStream("ordenador.txt");
				ObjectOutputStream escritor = new ObjectOutputStream(file)) {

			escritor.writeObject(o.toString());
			
			File file2 = new File("prueba.txt");
			file2.setWritable(true);
			
			System.out.println("El fichero se creó con éxito");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("No se pudo crear el fichero");
			System.out.println(e.getMessage());
			return;
		}

		{

		}

	}
}
