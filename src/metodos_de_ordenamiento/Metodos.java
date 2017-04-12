package metodos_de_ordenamiento;
import java.util.*;

public class Metodos {
		
	public static void burbuja(int [] vector){			//Es estatico asì lo podemos llamar de manera estatica
		long time_start, time_end;
		int aux;
		time_start = System.currentTimeMillis();		//Marcamos tiempo de inicio
		
		for(int i = 0; i<vector.length-1; i++){			//Nos posicionamos en el primer elemento
			for(int j = 0;j<vector.length-1;j++){		//Comenzamos a recorrer el vector con ese primer elemento
				if (vector[j]>vector[j+1]){				//Si el elemento recorrido es mayor que ese primer elemento
					aux = vector[j];					//Lo guardamos en un auxiliar
					vector[j]=vector[j+1];				//Pasamos el que es menor a su lugar
					vector[j+1] = aux;					//Y mandamos ese que es mayor a el segundo lugar
				}
			}
		}
		
		time_end = System.currentTimeMillis();
		
		System.out.println("El metodo Burbuja en un array de tardo: "+ ( time_end - time_start ) +" milisegundos");
		Vector v = new Vector();
		for (int h = 0; h < vector.length; h++) {
		    v.add(vector[h]);
		}
		System.out.println(v.toString());
	}
	
	public static void insercion(int [] vector){
		
		
		long time_start = System.currentTimeMillis();
		
		int aux, cont1, cont2;	//Se declaran las variables
		
		for(cont1 = 1;cont1 < vector.length; cont1++){		
			aux = vector[cont1];
			
			for(cont2 = cont1 - 1; cont2 >= 0 && vector[cont2]> aux; cont2++){
				vector[cont2 + 1] = vector[cont2];
				vector[cont2] = aux;
			}
		}
		
		long time_end = System.currentTimeMillis();
		
		System.out.println("El metodo Insercion en un array de tardo: "+ ( time_end - time_start ) +" milisegundos");
		Vector v = new Vector();
		
		for (int h = 0; h < vector.length; h++) {
		    v.add(vector[h]);
		}
		
		System.out.println(v.toString());
	}
	
	public static void insercionWhile(int [] vector){
		
		
		long time_start = System.currentTimeMillis();
		
		int aux, cont1 = 0, cont2;	//Se declaran las variables
		
		for(cont1 = 0;cont1 < vector.length - 1; cont1++){		
			aux = vector[cont1];
			
			while (cont1 > 0 && vector[cont1 - 1] > aux){
				vector[cont1] = vector[cont1 - 1];
				cont1 = cont1 - 1;
			}
			vector[cont1] = aux;
		}
		
		long time_end = System.currentTimeMillis();
		
		System.out.println("El metodo Insercion por While en un array de tardo: "+ ( time_end - time_start ) +" milisegundos");
		Vector y = new Vector();
		
		for (int h = 0; h < vector.length; h++) {
		    y.add(vector[h]);
		}
		
		System.out.println(y.toString());
	}
	
	
	
	

}
