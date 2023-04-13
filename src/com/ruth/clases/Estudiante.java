package com.ruth.clases;

import java.util.ArrayList;

public class Estudiante {

    private String nombre;
    private int edad;
    private ArrayList<NotaMateria> materiasAprobadas = new ArrayList<NotaMateria>();
    private float promedio;

    ///region Constructor

    public Estudiante(String nombre, int edad, ArrayList<NotaMateria> materiasAprobadas, float promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.materiasAprobadas = materiasAprobadas;
        this.promedio = promedio;
    }

    ///endregion

    ///region Getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<NotaMateria> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(ArrayList<NotaMateria> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    ///endregion

    public float promedio () {
        float suma =0;

        for (NotaMateria nota: this.materiasAprobadas) {
            suma = suma + nota.getNota();
        }

        return suma/materiasAprobadas.size();
    }

    @Override
    public String toString() {
        return "Estudiante : " + nombre +
                ", edad:" + edad +
                "\nMaterias Aprobadas" + materiasAprobadas +
                "\nPromedio = " + promedio;
    }
}
