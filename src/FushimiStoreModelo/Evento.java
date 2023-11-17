/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FushimiStoreModelo;

import java.util.Date;

/**
 *
 * @author Loreto
 */
public class Evento {
    
    private int id;
    private String nombre;
    private String lugar;
    private int cuota;
    private Date fecha;

    public Evento() {
    }

    public Evento(int id, String nombre, String lugar, int cuota, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.lugar = lugar;
        this.cuota = cuota;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Evento{" + "id=" + id + ", nombre=" + nombre + ", lugar=" + lugar + ", cuota=" + cuota + ", fecha=" + fecha + '}';
    }
    
    
    
}
