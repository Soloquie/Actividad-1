package co.edu.uniquindio.poo;

import java.time.LocalDate;

/*
 * Ejemplo del funcionamiento del builder
 */
public class EjemploViaje {
    public static void main(String[] args) {
        /*  Reserva 1 personalizada con preferencia de transporte, dietas especiales, duracion del viaje */
        Viaje reserva1 = Viaje.builder().preferenciaTransporte("Bus").dietasEspeciales("Solo Verduras").duracionViajeDias("8").build();
        /* Reserva 2 personalizada con duracion del viaje y fecha de salida */
        Viaje reserva2 = Viaje.builder().duracionViajeDias("3").fechaSalida(LocalDate.of(2024, 3, 24)).build();
        /* Imprime las 2 reservas con sus propios datos personalizados */
        System.out.println("Reserva 1: "+"Preferencia de transporte: "+reserva1.getPreferenciaTransporte()+", Dietas especiales: "+reserva1.getDietasEspeciales() + ", Duracion: "+ reserva1.getDuracionViajeDias());
        System.out.println("Reserva 2: "+ "Duracion: "+ reserva2.getDuracionViajeDias()+ ", Fecha de salida: " + reserva2.getFechaSalida());
    }
}
