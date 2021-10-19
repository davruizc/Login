package curso.java.controller;

import curso.java.model.Usuario;
import curso.java.view.VistaFormulario;
import curso.java.view.VistaMenu;

public class Login {

	public static final String USER = "admin";
	public static final String PASS = "admin";
	
	public static void main(String[] args) {
		
		int opcion = VistaMenu.mostrar();
		
		switch (opcion) {
		//Loguin
		case 1:
			Usuario usuario = VistaFormulario.mostrar();
			boolean existe = existeUsuario(usuario.getUser());
			
			//El usuario existe en el repositorio
			if(existe) {
				//TODO: comprobar contraseña:
				//TODO: 1_ contraseña correcta -> vista OK
				//TODO: 2_ contraseña incorrecta (número de intentos) -> volver al formulario y mensaje apropiado
			}
			//El usuario no existe en el repositorio
			else {
				//TODO: vista no OK -> volver al formulario y mensaje apropiado
			}
			
			break;
		//Alta
		case 2:
			//TODO: implementar el alta
			
			break;
		default:
			break;
		}
	}
	
	public static boolean existeUsuario(String user) {
		boolean resultado = false;
		//TODO: comprobar que el usuaro existe (se valida contra los valores de las constantes):
		//TODO: 1_ el usuario existe -> resultado = true;
		//TODO: 2_ el usuario no existe -> resultado = false; (ya está con este valor por defecto)
		return resultado;
	}

}
