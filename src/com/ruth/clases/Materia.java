package com.ruth.clases;

public class Materia {

    private String nombre;
    private int cargaHr;
    private String profesor;

    ///region Constructor
    public Materia (String nombre, int cargaHr, String profesor) {
        this.nombre = nombre;
        this.cargaHr = cargaHr;
        this.profesor = profesor;
    }
    ///endregion

    ///region Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCargaHr() {
        return cargaHr;
    }

    public void setCargaHr(int cargaHr) {
        this.cargaHr = cargaHr;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    ///endregion


    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", cargaHr=" + cargaHr +
                ", profesor='" + profesor + '\'' +
                '}';
    }
}
