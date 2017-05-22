/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuciones;

import java.util.List;

/**
 *
 * @author Douglas
 */
public class Media {
    private final List<Float> datos;

    public Media(List<Float> datos) {
        this.datos = datos;
    }

    public float calculoMedia(){
        float sumatoria = 0f;
        sumatoria = datos.stream().map((dato) -> dato).reduce(sumatoria, (accumulator, _item) -> accumulator + _item);
        return sumatoria /datos.size();
    }
    
}
