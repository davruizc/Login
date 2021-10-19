package curso.java.view;

import curso.java.model.Usuario;

public class VistaFormulario {

	public static Usuario mostrar() {
		String user = ""; //TODO: scanner
		String pass = ""; //TODO: scanner
		
		Usuario u = new Usuario(user, pass);
		return u;
	}
}
