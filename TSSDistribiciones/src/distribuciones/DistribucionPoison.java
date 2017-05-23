/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuciones;

import generadorMixto.Mixto;
import java.util.List;

/**
 *
 * @author Douglas
 */
public class DistribucionPoison {

    private final List<Double> distro;
    private final Media media;
    private final int tamañoDistribucion;
    private double lambda;
    private final Mixto mixto;
    private int semilla;
    private int multiplicador;
    private int consAditiva;
    private int modulo;

    public DistribucionPoison() {
        mixto = new Mixto(semilla, multiplicador, consAditiva, modulo);
        distro = mixto.generar();
        media = new Media(distro);
        tamañoDistribucion = distro.size();
        lambda = media.calculoMedia();

    }

    public double getPoisson() {
        double e = Math.exp(-lambda);
        int factorial = xFactorial(tamañoDistribucion);
        double kElevado = Math.pow(lambda, tamañoDistribucion);
        return ((e * kElevado) / factorial);
    }

    public double getPoisson(int x, float nErroes, float probabilidad) {
        int factorial = xFactorial(x);
        lambda = (nErroes * (1 / probabilidad));
        double e = Math.exp(-lambda);
        double lambdaElevado = Math.pow(lambda, x);
        return ((e * lambdaElevado) / factorial);
    }

    private int xFactorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * xFactorial(numero - 1);
        }
    }
}
