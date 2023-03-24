package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Splitter{
	
	public List<Integer> fibonacciPares(List<Integer> numeros) {
        List<Integer> fpares = new ArrayList<>();
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                fpares.add(numero);
            }
        }
        return fpares;
    }

    public List<Integer> fibonacciImpares(List<Integer> numeros) {
        List<Integer> fImpares = new ArrayList<>();
        for (Integer numero : numeros) {
            if (numero % 2 != 0) {
                fImpares.add(numero);
            }
        }
        return fImpares;
    }

}
