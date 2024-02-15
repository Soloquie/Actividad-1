package co.edu.uniquindio.poo;

/*
 * Clase para planear una actividad
 */
public class ActividadPlaneada {
    private String actividad;
    private String duracion;

    public  ActividadPlaneada(String actividad, String duracion){
    this.actividad=actividad;
    this.duracion=duracion;
    }

    public String getActividad(){
        return actividad;
    }
    
    public String getDuracion(){
        return duracion;
    }
}
