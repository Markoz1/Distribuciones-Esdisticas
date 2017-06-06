/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import java.util.List;

/**
 *
 * @author Douglas
 */
public class Media {

    private final List<Double> datos;

    /**
     *
     * @param datos
     */
    public Media(List<Double> datos) {
        this.datos = datos;
    }

    /**
     * calcula el valor de la media aritmetica
     * @return el valor de la media.
     */
    public double calculoMedia() {
        double sumatoria = 0;
        sumatoria = datos.stream().map((dato) -> dato).reduce(sumatoria, (accumulator, _item) -> accumulator + _item);
        return sumatoria / datos.size();
    }
}
