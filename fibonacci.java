package fibonacci;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class fibonacci {
    
        int n1 = 0;
        int n2 = 1;
        int aux;
        int limite = 1400000;
        List<Integer> Fibonacci = new ArrayList<Integer>();

        public List<Integer> generar_llenar_serie(){
        
        while (n2 + n1 <= limite) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;
            
            Fibonacci.add (n2);
            
        }
        	System.out.println(Fibonacci);
        
        return Fibonacci;
        
        
        
    }
        
}

