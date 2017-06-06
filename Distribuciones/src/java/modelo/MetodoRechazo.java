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
public class MetodoRechazo {

    private double a;

    private double b;

    private double M;

    public MetodoRechazo(double a, double b, double M) {
        this.a = a;
        this.b = b;
        this.M = M;
    }
    
    /**
     * Get the value of M
     *
     * @return the value of M
     */
    public double getM() {
        return M;
    }

    /**
     * Set the value of M
     *
     * @param M new value of M
     */
    public void setM(double M) {
        this.M = M;
    }

    /**
     * Get the value of b
     *
     * @return the value of b
     */
    public double getB() {
        return b;
    }

    /**
     * Set the value of b
     *
     * @param b new value of b
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Get the value of a
     *
     * @return the value of a
     */
    public double getA() {
        return a;
    }

    /**
     * Set the value of a
     *
     * @param a new value of a
     */
    public void setA(double a) {
        this.a = a;
    }

}
