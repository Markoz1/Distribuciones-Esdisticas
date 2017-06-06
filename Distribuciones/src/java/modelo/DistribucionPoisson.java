/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Douglas
 */
public class DistribucionPoisson {
    
    private int x;

    private float nErroes;

    private float probabilidad;

    private double lamda;

    /**
     * Get the value of lamda
     *
     * @return the value of lamda
     */
    public double getLamda() {
        return lamda;
    }

    /**
     * Set the value of lamda
     *
     * @param lamda new value of lamda
     */
    public void setLamda(double lamda) {
        this.lamda = lamda;
    }

    public DistribucionPoisson() {
    }

    /**
     * Get the value of probabilidad
     *
     * @return the value of probabilidad
     */
    public float getProbabilidad() {
        return probabilidad;
    }

    /**
     * Set the value of probabilidad
     *
     * @param probabilidad new value of probabilidad
     */
    public void setProbabilidad(float probabilidad) {
        this.probabilidad = probabilidad;
    }

    /**
     * Get the value of nErroes
     *
     * @return the value of nErroes
     */
    public float getnErroes() {
        return nErroes;
    }

    /**
     * Set the value of nErroes
     *
     * @param nErroes new value of nErroes
     */
    public void setnErroes(float nErroes) {
        this.nErroes = nErroes;
    }

    /**
     * Get the value of x
     *
     * @return the value of x
     */
    public int getX() {
        return x;
    }

    /**
     * Set the value of x
     *
     * @param x new value of x
     */
    public void setX(int x) {
        this.x = x;
    }

}
