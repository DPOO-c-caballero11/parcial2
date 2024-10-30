package logica;

public class Parcial {
	
	public String encontrarRaices(int a, int b, int c) throws Exception {
		
		if(a==0) {
			throw new IllegalArgumentException("Si a es cero no seria ecuacion de segundo orden.");
		}
		
		String respuesta;
		
		int discriminante = b*b - (4*a*c);
		
		if(discriminante > 0) {
			
			double r1 =  (-b + Math.sqrt(discriminante))/2*a;
			
			double r2 = (-b - Math.sqrt(discriminante))/2*a;
			
			if(r1 == r2) {
				
				respuesta = String.valueOf(r1);
				
			} else { 
				
				respuesta = r1 + "," + r2;
			}
		
			
			return respuesta; 
			
		 } else {
			   throw new Exception("No se puede tener raices negativas.");
		    }
		
	}

}
