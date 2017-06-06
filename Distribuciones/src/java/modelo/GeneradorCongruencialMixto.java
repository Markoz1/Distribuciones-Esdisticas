/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Douglas
 */
@XmlRootElement
public class GeneradorCongruencialMixto {

    private int semilla;

    private int multiplicador;

    private int consAditiva;

    private int modulo;

    public GeneradorCongruencialMixto() {
    }
    
    public GeneradorCongruencialMixto(int semilla, int multiplicador, int consAditiva, int modulo) {
        this.semilla = semilla;
        this.multiplicador = multiplicador;
        this.consAditiva = consAditiva;
        this.modulo = modulo;
    }

    /**
     * Get the value of modulo
     *
     * @return the value of modulo
     */
    public int getModulo() {
        return modulo;
    }

    /**
     * Set the value of modulo
     *
     * @param modulo new value of modulo
     */
    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    /**
     * Get the value of consAditiva
     *
     * @return the value of consAditiva
     */
    public int getConsAditiva() {
        return consAditiva;
    }

    /**
     * Set the value of consAditiva
     *
     * @param consAditiva new value of consAditiva
     */
    public void setConsAditiva(int consAditiva) {
        this.consAditiva = consAditiva;
    }

    /**
     * Get the value of multiplicador
     *
     * @return the value of multiplicador
     */
    public int getMultiplicador() {
        return multiplicador;
    }

    /**
     * Set the value of multiplicador
     *
     * @param multiplicador new value of multiplicador
     */
    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    /**
     * Get the value of semilla
     *
     * @return the value of semilla
     */
    public int getSemilla() {
        return semilla;
    }

    /**
     * Set the value of semilla
     *
     * @param semilla new value of semilla
     */
    public void setSemilla(int semilla) {
        this.semilla = semilla;
    }

}
