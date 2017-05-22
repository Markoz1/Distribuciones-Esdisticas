/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Douglas
 */
public class DistribucionPoison {

    private List distro;

    public DistribucionPoison() {
        distro = new ArrayList();
    }

    public int getPoisson(float lambda) {
        double L = Math.exp(-lambda);
        double p = 1.0;
        int k = 0;
        do {
            k++;
            p *= Math.random();
        } while (p > L);
        return k - 1;
    }

    public static void main(String[] args) {
        int n = 0;
        DistribucionPoison d = new DistribucionPoison();
        double pago, total = 0;
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Oct", "Nov", "Dic"};
        for (int i = 0; i <= 11; i++) {
            n = d.getPoisson(4);
            pago = n * 800;
            total = total + pago;
            System.out.println("Accidentes en " + meses[i] + ": " + n);
        }
        System.out.println("Gasto Probable: " + total);
    }
}
