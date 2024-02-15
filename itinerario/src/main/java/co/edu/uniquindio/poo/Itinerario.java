package co.edu.uniquindio.poo;
import java.util.Collection;
import java.util.LinkedList;

/**
 *  Clase para crear un itinerario de viajes
 * @author Cesar Camilo Tulcan Erira
 * @since 2024 - 02
 * Licencia GNU/GPL V3.0
 */
public class Itinerario {
    private Collection<Viaje> viajes;

    public Itinerario() {
        this.viajes = new LinkedList<>();
    }

    public Collection<Viaje> getViajes() {
        return viajes;
    }
    

}
