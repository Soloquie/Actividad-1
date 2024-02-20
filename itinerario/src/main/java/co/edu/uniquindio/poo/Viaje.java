package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

/*
 * Clase para planear el viaje del usuario
 * los sets son para que el usuario configure como quiera su viaje
 */
public class Viaje {
    private LocalDate fechaSalida;
    private String duracionViajeDias;
    private Collection<ActividadPlaneada> actividadesPlaneadas;
    private String dietasEspeciales;
    private String preferenciaTransporte;
    private String tipoAlojamiento;

/*
 * Atributos de la clase
 */
    public Viaje(LocalDate fechaSalida, String duracionViajeDias, String dietasEspeciales, String preferenciaTransporte,String tipoAlojamiento, Collection<ActividadPlaneada> actividadesPlaneadas){
        this.actividadesPlaneadas=new LinkedList<>();
        this.dietasEspeciales=dietasEspeciales;
        this.fechaSalida=fechaSalida;
        this.duracionViajeDias=duracionViajeDias;
        this.preferenciaTransporte=preferenciaTransporte;
        this.tipoAlojamiento=tipoAlojamiento;
    }

    /*
     * getters y setters de la clase
     */
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public String getDuracionViajeDias() {
        return duracionViajeDias;
    }

    public Collection<ActividadPlaneada> getActividadesPlaneadas() {
        return actividadesPlaneadas;
    }

    public String getDietasEspeciales() {
        return dietasEspeciales;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setDuracionViajeDias(String duracionViajeDias) {
        this.duracionViajeDias = duracionViajeDias;
    }

    public void setActividadesPlaneadas(Collection<ActividadPlaneada> actividadesPlaneadas) {
        this.actividadesPlaneadas = actividadesPlaneadas;
    }

    public void setDietasEspeciales(String dietasEspeciales) {
        this.dietasEspeciales = dietasEspeciales;
    }

    public String getPreferenciaTransporte() {
        return preferenciaTransporte;
    }

    public void setPreferenciaTransporte(String preferenciaTransporte) {
        this.preferenciaTransporte = preferenciaTransporte;
    }

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public void registrarActividadPlaneada(ActividadPlaneada actividadPlaneada){
        actividadesPlaneadas.add(actividadPlaneada);
    }


    public static ViajeBuilder builder(){
        return new ViajeBuilder();
    }

    /*
     * Clase dentro de otra clase
     * Clase Builder
     */
    public static class ViajeBuilder{
    private LocalDate fechaSalida;
    private String duracionViajeDias;
    private Collection<ActividadPlaneada> actividadesPlaneadas;
    private String dietasEspeciales;
    private String preferenciaTransporte;
    private String tipoAlojamiento;

    private ViajeBuilder(){}

    public ViajeBuilder fechaSalida(LocalDate fechaSalida){
        this.fechaSalida=fechaSalida;
        return this;
    }

    public ViajeBuilder duracionViajeDias(String duracionViajeDias){
        this.duracionViajeDias=duracionViajeDias;
        return this;
    }

    public ViajeBuilder actividadesPlaneadas(LinkedList<ActividadPlaneada> actividadesPlaneadas){
        this.actividadesPlaneadas=actividadesPlaneadas;
        return this;
    }
    
    public ViajeBuilder dietasEspeciales(String dietasEspeciales){
        this.dietasEspeciales=dietasEspeciales;
        return this;
    }

    public ViajeBuilder preferenciaTransporte(String preferenciaTransporte){
        this.preferenciaTransporte=preferenciaTransporte;
        return this;
    }

    public ViajeBuilder tipoAlojamiento(String tipoAlojamiento){
        this.tipoAlojamiento=tipoAlojamiento;
        return this;
    }

    public Viaje build(){
        return new Viaje(fechaSalida,duracionViajeDias, dietasEspeciales, preferenciaTransporte,tipoAlojamiento , actividadesPlaneadas);
    }
    }
}
