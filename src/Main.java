import com.ruth.clases.Estudiante;
import com.ruth.clases.Materia;
import com.ruth.clases.NotaMateria;

import java.util.ArrayList;

public class Main {

    /*
    Crea una clase Estudiante con atributos nombre, edad, materiasAprobadas
    (materia es otra clase con nombre, cargaHoraria y profesor. Este último como
    un String) y promedio. La clase debe permitir que se le agreguen nuevas
    materias aprobadas y debe tener un método para calcular el promedio actual
    del estudiante.
    */

    public static void main(String[] args) {
        ArrayList<NotaMateria> notas1 = new ArrayList<NotaMateria>();

        Materia m1 = new Materia("Matemática", 120, "Juan Alonzo");
        Materia m2 = new Materia("Inglés", 130, "Manuela Perez");
        Materia m3 = new Materia("Programacion", 200, "Carmela Muñoz");

        NotaMateria n1 = new NotaMateria(m1, 8);
        NotaMateria n2 = new NotaMateria(m2, 9);
        NotaMateria n3 = new NotaMateria(m3, 7);

        notas1.add(n1);
        notas1.add(n2);
        notas1.add(n3);

        Estudiante estudiante1 = new Estudiante("Carlos Gomez", 32, notas1, 0);
        estudiante1.setPromedio(estudiante1.promedio());

        System.out.println(estudiante1.toString());
    }

}