package fibonacci;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class Manager {

	
	private List<Integer> numerosPares;
    private List<Integer> numerosImpares;

    public void guardar_Archivo(String nombreArchivo, List<Integer> datos) {
    	 try (FileWriter writer = new FileWriter(nombreArchivo)) {
	            for (Integer number : datos) {
	                writer.write(number.toString() + "\n");
	            }
	        } catch (IOException e) {
	            System.err.println("Error al guardar el archivo: " + e.getMessage());
	        }
	    }
    
    public void ejecutar() {
        fibonacci fibonacci = new fibonacci();
        List<Integer> secuenciaFibonacci = fibonacci.generar_llenar_serie(); 

        Splitter splitter = new Splitter();
        numerosPares = splitter.fibonacciPares(secuenciaFibonacci);
        numerosImpares = splitter.fibonacciImpares(secuenciaFibonacci);

        guardar_Archivo("Numeros pares.txt", numerosPares);
        guardar_Archivo("Numeros impares.txt", numerosImpares);
    }
    
    public void imprimirArchivo(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
