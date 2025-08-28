import java.time.LocalDate;
public class profesores{
    String nombre;
    int codigo;
    LocalDate fecha_de_nacimiento;
    String materia;

    public profesores (String nombre,int codigo,LocalDate fecha_de_nacimiento, String materia) {
        this.nombre=nombre;
        this.codigo=codigo;
        this.fecha_de_nacimiento=fecha_de_nacimiento;
        this.materia=materia;
    }
        public void mostrarInfo() {
        System.out.println("El nombre del profesor es:"+nombre);
        System.out.println("El codigo del profesor"+codigo);
        System.out.println("la fecha de naciemiento es:"+fecha_de_nacimiento);
        System.out.println("la materia que enseña es:"+materia);
    }

public static void main(String[] args ){
    LocalDate fecha_naciemiento1 = LocalDate.of(1972,6,20);
    LocalDate fecha_naciemiento2 = LocalDate.of(1981,2,10);
    LocalDate fecha_naciemiento3 = LocalDate.of(1971,7,20);
    
    profesores profesor1= new profesores("Jorge moná", 2222, fecha_naciemiento1, "Ingles");
    profesores profesor2= new profesores("Adriana Marin", 2223, fecha_naciemiento2, "Sociales");
    profesores profesor3= new profesores("Yepez", 2233, fecha_naciemiento3, "Arte");
    profesor1.mostrarInfo();
    profesor2.mostrarInfo();
    profesor3.mostrarInfo();}
}
   