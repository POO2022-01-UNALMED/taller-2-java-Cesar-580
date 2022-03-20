package test;

class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	
	// Atributo de clase
	static int cantidadCreados;
	
	
	// Métodos.
	int cantidadAsientos() {
		int cont = 0;
		
		if (this.asientos != null) {
			for (Asiento asientoList: asientos) {
				if (asientoList != null) {
					cont += 1; 
				}
			}
		}
		
		return cont;
	}
	
	
	String verificarIntegridad() {
		if (this.registro == this.motor.registro && this.registro == this.asientos[0].registro){
			return "Auto original";
		} else {
			return "Las piezas no son originales";
		}
	}
	
}
