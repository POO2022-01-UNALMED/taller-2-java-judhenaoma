package test;

public class Asiento {
	 
	String color;
	int precio;
	int registro;
	
	
	void cambiarColor(String color) {
		
		
		String[] colPermitidos = {"amarillo", "verde", "rojo", "negro", "blanco"};
		
		for(String col : colPermitidos) {
			
			if(col == color) {
				
				this.color = color;
			}
		}
		
		
	}

}
