package generadores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import modelo.GeneradorCongruencialMixto;
import intercafes.Generador;

public class Mixto implements Generador<GeneradorCongruencialMixto>{

    /**
     * Método que devuelve los números aleatorios en un ArrayList de enteros en
     * caso de que cumpla con las propiedades de periodo completo, llena el
     * Array Caso contrario devuelve un Array con un número '666'
     * @param generador
     * @return 
     */
    @Override
    public List<Double> generar(GeneradorCongruencialMixto generador) {
        int aux;
        int x = generador.getSemilla();
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(generador.getSemilla() / 1.0);
        if (verificar(generador) == true) {
//           for(int k=0;k<numeros){
            aux = (generador.getMultiplicador() * generador.getSemilla() + generador.getConsAditiva()) % generador.getModulo();
            //  numeros.add(aux);
            for (int i = 0; i < generador.getModulo() - 1; i++) {
                aux = (generador.getMultiplicador() * x + generador.getConsAditiva()) % generador.getModulo();
                numeros.add(aux / 1.0);
                x = aux;
            }
//           }
        }

        return numeros;
    }

    /**
     * Método para verificar si el periodo de números va a ser completo
     */
    private boolean verificar(GeneradorCongruencialMixto generador) {
        boolean res = false;
        if (primosEntreSi(generador.getConsAditiva(), generador.getModulo()) == true) {
            if (primosDivisibles(generador.getModulo(), generador.getMultiplicador() - 1) == true) {
                if ((generador.getModulo() % 4 == 0) == false
                        || ((generador.getMultiplicador() - 1) % 4 == 0)) {
                    return true;
                }
                if ((generador.getModulo() % 4 != 0)
                        || ((generador.getMultiplicador() - 1) % 4 == 0) == false) {
                    return true;
                }
                if ((generador.getModulo() % 4 == 0)
                        || ((generador.getMultiplicador() - 1) % 4 == 0)) {
                    return true;
                }
            }
        }
        return res;
    }

    /**
     * Método para verificar que dos números son primos entre sí
     */
    private boolean primosEntreSi(int a, int b) {
        boolean res = true;
        ArrayList<Integer> primosA = getPrimos(a);
        ArrayList<Integer> primosB = getPrimos(b);
        for (int i = 0; i < primosA.size(); i++) {
            for (int j = 0; j < primosB.size(); j++) {
                if (primosA.get(i) == primosB.get(j)) {
                    res = false;
                }
            }
        }

        return res;
    }

    /**
     * Método para obtener los números primos de un número
     */
    private ArrayList<Integer> getPrimos(int numero) {
        ArrayList<Integer> primos = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();
        //    int aux=2;
        int divisor = 2;
        if (Integer.class.isInstance(numero)) {
            if (numero > 1) {
                for (int i = 0; i <= numero; i++) {
                    if (numero % divisor == 0) {
                        //System.out.print(divisor+" ");
                        primos.add(divisor);
                        numero = numero / divisor;
                    } else {
                        divisor++;
                    }
                }//CIERRE FOR 
            }//CIERRE numero > 0 
        }

        //Método para eliminar los primos repetidos que se han encontrado
        hs.addAll(primos);
        primos.clear();
        primos.addAll(hs);

        return primos;
    }

    /**
     * Método para ver si 2 números comparten los mismos números primos
     */
    private boolean primosDivisibles(int a, int b) {
        boolean res = false;
        Set<Integer> hs = new HashSet<>();
        ArrayList<Integer> primosA = getPrimos(a);
        ArrayList<Integer> primosB = getPrimos(b);
        if (primosA.size() == primosB.size()) {
            for (int i = 0; i < primosA.size(); i++) {
                if (primosA.get(i) == primosB.get(i)) {
                    hs.add(1);
                } else {
                    hs.add(0);
                }
            }
        }

        if (hs.size() == 1) {
            res = true;
        }
        return res;
    }

}
