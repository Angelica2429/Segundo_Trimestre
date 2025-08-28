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
    
public String getnombre() {
    return nombre;
}
public void setnombre (String nombre) {
    this.nombre = nombre;
}
public int getcodigo() {
    return codigo;
}
public void setcodigo(int codigo) {
    this.codigo=codigo;
}
public LocalDate getFechaDeNacimiento() {
    return fecha_de_nacimiento;
}
public void setFechaDeNacimiento(LocalDate fecha_de_nacimiento) {
    this.fecha_de_nacimiento=fecha_de_nacimiento;
}

public static void main(String[] args ){
    LocalDate fecha_naciemiento1 = LocalDate.of(2000,7,10);
    LocalDate fecha_naciemiento2 = LocalDate.of(2007,9,16);
    LocalDate fecha_naciemiento3 = LocalDate.of(2008,5,25);
    
    estudiantes estudiante1= new estudiantes("Daniel", 1114, fecha_naciemiento1);
    estudiantes estudiante2= new estudiantes("Karen", 1103, fecha_naciemiento2);
    estudiantes estudiante3 = new estudiantes("Natalia", 1102, fecha_naciemiento3);
    String nombre1=estudiante1.getnombre();
    System.out.println("El estudiante se llama:"+nombre1);

    int codigo1=estudiante1.getcodigo();
    System.out.println("El código de estudiante es:"+codigo1);

    LocalDate fecha_de_nacimiento1=estudiante1.getFechaDeNacimiento();
    System.out.println("La fecha de naciemiento es:"+fecha_de_nacimiento1);
    
    String nombre2=estudiante2.getnombre();
    System.out.println("El estudiantes se llama:"+nombre2);

    int codigo2=estudiante2.getcodigo();
    System.out.println("El código de estudiante es:"+codigo2);

    LocalDate fecha_de_nacimiento2=estudiante2.getFechaDeNacimiento();
    System.out.println("La fecha de naciemiento es:"+fecha_de_nacimiento2);
    
    String nombre3=estudiante3.getnombre();
    System.out.println("El estudiantes se llama:"+nombre3);

    int codigo3=estudiante3.getcodigo();
    System.out.println("El código de estudiante es:"+codigo3);

    LocalDate fecha_de_nacimiento3=estudiante3.getFechaDeNacimiento();
    System.out.println("La fecha de naciemiento es:"+fecha_de_nacimiento3);}
}