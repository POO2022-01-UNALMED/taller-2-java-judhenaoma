package test;

public class Motor {
	
	int numeroCilindros;
	String tipo;
	int registro;
	
	
	void cambiarRegistro(int registro) {
		
		
		this.registro = registro;
		
		
	}
	
	
	void asignartipo(String tipo) {
		
		String[] tipoVeh = {"gasolina", "electrico"};
		
		for(String t : tipoVeh) {
			
			if(tipo == t) {
				this.tipo = tipo;
			}
		}
		
		
	}

}
