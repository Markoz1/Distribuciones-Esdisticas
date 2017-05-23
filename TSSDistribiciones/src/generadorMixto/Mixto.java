package generadorMixto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Mixto {

    private int semilla;
    private int multiplicador;
    private int consAditiva;
    private int modulo;

    public Mixto(int semilla, int multiplicador, int consAditiva, int modulo) {
        this.semilla = semilla;
        this.multiplicador = multiplicador;
        this.consAditiva = consAditiva;
        this.modulo = modulo;

    }

    /*
    Método para verificar si el periodo de números va a ser completo
     */
    private boolean verificar() {
        boolean res = false;
        if (primosEntreSi(consAditiva, modulo) == true) {
            if (primosDivisibles(modulo, multiplicador - 1) == true) {
                if ((modulo % 4 == 0) == false || ((multiplicador - 1) % 4 == 0)) {
                    return true;
                }
                if ((modulo % 4 != 0) || ((multiplicador - 1) % 4 == 0) == false) {
                    return true;
                }
                if ((modulo % 4 == 0) || ((multiplicador - 1) % 4 == 0)) {
                    return true;
                }
            }
        }
        return res;
    }

    /*
    Método para verificar que dos números son primos entre sí
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

    /*
    Método para obtener los números primos de un número
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

    /*
    Método para ver si 2 números comparten los mismos números primos
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

    /*
    Método que devuelve los números aleatorios en un ArrayList de enteros
    en caso de que cumpla con las propiedades de periodo completo, llena el Array
    ; Caso contrario devuelve un Array con un número '666'
     */
    public ArrayList<Double> generar() {
        int aux;
        int x = semilla;
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(semilla / 1.0);
        if (verificar() == true) {
//           for(int k=0;k<numeros){
            aux = (multiplicador * semilla + consAditiva) % modulo;
            //  numeros.add(aux);
            for (int i = 0; i < modulo - 1; i++) {
                aux = (multiplicador * x + consAditiva) % modulo;
                numeros.add(aux / 1.0);
                System.out.println("ooo---ooo" + semilla);
                System.out.println("ooo---ooo" + consAditiva);
                System.out.println("ooo---ooo" + multiplicador);
                System.out.println("ooo---ooo" + modulo);
                x = aux;
            }
//           }
        }

        return numeros;
    }

    public int getSemilla() {
        return semilla;
    }

    public void setSemilla(int semilla) {
        this.semilla = semilla;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getConsAditiva() {
        return consAditiva;
    }

    public void setConsAditiva(int consAditiva) {
        this.consAditiva = consAditiva;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

}
