
package test;

public class Auto {
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	
	int cantidadAsientos() {
		
		int numeroAsientos = 0 ;
		
		for(int i = 0; i < this.asientos.length; i++) {
			
			if( asientos[i] != null) {
				numeroAsientos ++;
			}
				
			
		}
		
		return numeroAsientos;
	}
	
	
	String verificarIntegridad() {
		
		
		if(this.registro != motor.registro) {
			
			return "Las piezas no son originales";
		}
		
		for(Asiento asiento : this.asientos) {
		       if(asiento != null) {
		    	   if(asiento.registro != this.registro || asiento.registro != motor.registro) {
		    		   
		    		   return "Las piezas no son originales";
		    	   }
		       }
		    }
		
		
		
		
		return "Auto original";
		
		
	}
	
	
	
	

}
