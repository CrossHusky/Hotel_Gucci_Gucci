
package clases;

import java.util.Date;

public class Huesped {
    private String Nombre;
    private char TipoHabitacion;
    private int NumeroHabitacion;
    private String CiudadOrigen;
    private int TotalPersonas;
    private int DiasAlojo;
    private Date FechaIngreso;
    private boolean InHotel;

    public Huesped() {
    }

    public Huesped(String Nombre, char TipoHabitacion, int NumeroHabitacion, String CiudadOrigen, int TotalPersonas, int DiasAlojo, Date FechaIngreso, boolean InHotel) {
        this.Nombre = Nombre;
        this.TipoHabitacion = TipoHabitacion;
        this.NumeroHabitacion = NumeroHabitacion;
        this.CiudadOrigen = CiudadOrigen;
        this.TotalPersonas = TotalPersonas;
        this.DiasAlojo = DiasAlojo;
        this.FechaIngreso = FechaIngreso;
        this.InHotel = InHotel;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public char getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(char TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    public int getNumeroHabitacion() {
        return NumeroHabitacion;
    }

    public void setNumeroHabitacion(int NumeroHabitacion) {
        this.NumeroHabitacion = NumeroHabitacion;
    }

    public String getCiudadOrigen() {
        return CiudadOrigen;
    }

    public void setCiudadOrigen(String CiudadOrigen) {
        this.CiudadOrigen = CiudadOrigen;
    }

    public int getTotalPersonas() {
        return TotalPersonas;
    }

    public void setTotalPersonas(int TotalPersonas) {
        this.TotalPersonas = TotalPersonas;
    }

    public int getDiasAlojo() {
        return DiasAlojo;
    }

    public void setDiasAlojo(int DiasAlojo) {
        this.DiasAlojo = DiasAlojo;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public boolean isInHotel() {
        return InHotel;
    }

    public void setInHotel(boolean InHotel) {
        this.InHotel = InHotel;
    }

    @Override
    public String toString() {
        return "Huesped{" + "Nombre=" + Nombre + ", TipoHabitacion=" + TipoHabitacion + ", NumeroHabitacion=" + NumeroHabitacion + ", CiudadOrigen=" + CiudadOrigen + ", TotalPersonas=" + TotalPersonas + ", DiasAlojo=" + DiasAlojo + ", FechaIngreso=" + FechaIngreso + ", InHotel=" + InHotel + '}';
    }
    
    
    
}
