/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import generadores.Mixto;
import intercafes.Poisson;
import java.util.List;
import modelo.DistribucionPoisson;
import modelo.GeneradorCongruencialMixto;

/**
 *
 * @author Douglas
 */
public class CalculoDistribucionPoison implements Poisson<DistribucionPoisson>{

    private final List<Double> distro;
    private final int tamañoDistribucion;
    private final Mixto mixto;
    private GeneradorCongruencialMixto generador;

    public CalculoDistribucionPoison() {
        mixto = new Mixto();
        distro = mixto.generar(generador);
        tamañoDistribucion = distro.size();

    }

    /**
     *
     * @param p
     * @return
     */
    @Override
    public double calculoPoisson2(DistribucionPoisson p) {
        p.setLamda(distro.size());
        double e = Math.exp(-p.getLamda());
        int factorial = xFactorial(tamañoDistribucion);
        double kElevado = Math.pow(p.getLamda(), tamañoDistribucion);
        return ((e * kElevado) / factorial);
    }

    /**
     *
     * @param p
     * @return
     */
    @Override
    public double calculoPoisson(DistribucionPoisson p) {
        int factorial = xFactorial(p.getX());
        p.setLamda(p.getnErroes() * (1 / p.getProbabilidad()));
        double e = Math.exp(-p.getLamda());
        double lambdaElevado = Math.pow(p.getLamda(), p.getX());
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
