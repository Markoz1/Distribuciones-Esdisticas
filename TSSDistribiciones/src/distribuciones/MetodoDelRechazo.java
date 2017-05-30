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
 * @author Dougl
 */
public class MetodoDelRechazo {

    private final List<Double> R1;
    private final List<Double> R2;
    private final Mixto mixto;
    private final double a;
    private final double b;
    private final double M;

    public MedotoDelRechazo(double a, double b) {
        this.a = a;
        this.b = b;
        mixto = new Mixto(0, 0, 0, 0);
        R1 = mixto.generar();
        R2 = mixto.generar();
        M = 0.0;
    }

    public double evaluarfuncion() {
        double x = 0;
        for (Double r1 : R1) {
            x = (a + (b - a) * r1);
        }
        return x;
    }

    private boolean determinarDesigualdad() {
        boolean rechazo = false;
        for (Double r2 : R2) {
            for (Double r1 : R1) {

                if (r2 <= ((a + (b - a) * r1) / M)) {
                    rechazo = true;
                } else {
                    evaluarfuncion();
                    rechazo = false;
                }
            }
        }
        return rechazo;
    }
}
