import java.time.LocalDate;
public class estudiantes {
    String nombre;
    int codigo;
    LocalDate fecha_de_nacimiento;

    public estudiantes (String nombre,int codigo,LocalDate fecha_de_nacimiento) {
        this.nombre=nombre;
        this.codigo=codigo;
        this.fecha_de_nacimiento=fecha_de_nacimiento;
    }
      public void mostrarInfo() {
        System.out.println("El nombre del estudiantes es:"+nombre);
        System.out.println("El codigo del estudiante"+codigo);
        System.out.println("la fecha de naciemiento es:"+fecha_de_nacimiento);
    }

public static void main(String[] args ){
    LocalDate fecha_naciemiento1 = LocalDate.of(2000,7,10);
    LocalDate fecha_naciemiento2 = LocalDate.of(2007,9,16);
    LocalDate fecha_naciemiento3 = LocalDate.of(2008,5,25);
    
    estudiantes estudiante1= new estudiantes("Daniel", 1114, fecha_naciemiento1);
    estudiantes estudiante2= new estudiantes("Karen", 1103, fecha_naciemiento2);
    estudiantes estudiante3 = new estudiantes("Natalia", 1102, fecha_naciemiento3);
    estudiante1.mostrarInfo();
    estudiante2.mostrarInfo();
    estudiante3.mostrarInfo();}
}