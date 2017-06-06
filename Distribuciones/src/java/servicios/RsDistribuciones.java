/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import generadores.Mixto;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import java.util.List;
import java.util.ArrayList;
import javax.ws.rs.core.MediaType;
import modelo.GeneradorCongruencialMixto;

/**
 *
 * @author Douglas
 */
@Path("restDistribuciones")
public class RsDistribuciones {

    public static List<GeneradorCongruencialMixto> varialbles = new ArrayList<>();
    public Mixto mixto;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<GeneradorCongruencialMixto> consultar() {
        mixto.generar(varialbles.get(0));
        return null;
    }

    @GET
    @Path("{parametroconsulta}")
    @Produces({MediaType.APPLICATION_JSON})
    public GeneradorCongruencialMixto conultarIndividual(@PathParam("parametroconsulta") String param) {
        return null;
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void insertar(GeneradorCongruencialMixto gcm) {
    }

    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    public void modificar(GeneradorCongruencialMixto gcm) {
    }

    @DELETE
    @Path("{parmetroeliminar}")
    public void eliminar(@PathParam("parmetroeliminar") String eliminar) {

    }
}
