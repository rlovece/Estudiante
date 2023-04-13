package com.ruth.clases;

public class NotaMateria {

    private Materia materia;
    private float nota;

    ///region Constructores
    public NotaMateria (Materia materia, float nota) {
        this.materia = materia;
        this.nota = nota;
    }
    ///endregion

    ///region Getter and Setter

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    ///endregion


    @Override
    public String toString() {
        return "\n" + materia.getNombre() +
                ", Nota: " + nota;
    }
}
