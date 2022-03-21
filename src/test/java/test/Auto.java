
package test;
import java.util.ArrayList;
import java.util.List;

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
		
		List<Asiento> filtered = new ArrayList<Asiento>();
		
		for(Asiento asiento : this.asientos) {
		       if(asiento != null) {
		    	   filtered.add(asiento);
		       }
		    }
		
		boolean isAllAsientosEqual = true;
		boolean motorAndAuto = true;
		
		for(int j = 0; j < filtered.size(); j++) {
			
			for (int k = 0; k < filtered.size(); k++) {
				
				if(filtered.get(j) != filtered.get(k)){
					
					isAllAsientosEqual = false;
				}	
			}
		}
		
		if(this.registro != this.motor.registro) {
			
			motorAndAuto= false;
									
		}
		
		if(isAllAsientosEqual && motorAndAuto) {
			
			return "Auto original";
		}else {
			return "Las piezas no son originales";
		}
		
		
		
	}
	
	
	
	

}
