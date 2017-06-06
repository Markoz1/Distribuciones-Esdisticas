/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import intercafes.Rechazo;
import generadores.Mixto;
import java.util.List;
import modelo.GeneradorCongruencialMixto;
import modelo.MetodoRechazo;

/**
 *
 * @author Douglas
 */
public class MetodoDelRechazo implements Rechazo<MetodoRechazo> {

    private final List<Double> R1;
    private final List<Double> R2;
    private final Mixto mixto;
    private GeneradorCongruencialMixto generador;

    public MetodoDelRechazo() {
        mixto = new Mixto();
        R1 = mixto.generar(generador);
        R2 = mixto.generar(generador);
    }

    /**
     *
     * @param rechazo
     * @return
     */
    @Override
    public double evaluarfuncion(MetodoRechazo rechazo) {
        double x = 0;
        for (Double r1 : R1) {
            determinarDesigualdad(rechazo);
            x = (rechazo.getA() + (rechazo.getB() - rechazo.getA()) * r1);
        }
        return x;
    }

    /**
     * 
     * @param rechazo
     * @return 
     */
    private boolean determinarDesigualdad(MetodoRechazo rechazo) {
        boolean r = false;
        for (Double r2 : R2) {
            for (Double r1 : R1) {

                if (r2 <= ((rechazo.getA() + (rechazo.getB() - rechazo.getA())
                        * r1) / rechazo.getM())) {
                    r = true;
                } else {
                    evaluarfuncion(rechazo);
                    r = false;
                }
            }
        }
        return r;
    }

}
