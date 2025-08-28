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
    
public String getmateria() {
    return materia;
}
public void setmateria (String materia) {
    this.materia = materia;
}
public static void main(String[] args ){
    LocalDate fecha_naciemiento1 = LocalDate.of(1972,6,20);
    LocalDate fecha_naciemiento2 = LocalDate.of(1981,2,10);
    LocalDate fecha_naciemiento3 = LocalDate.of(1971,7,20);
    
    profesores profesor1= new profesores("Jorge moná", 2222, fecha_naciemiento1, "Ingles");
    profesores profesor2= new profesores("Adriana Marin", 2223, fecha_naciemiento2, "Sociales");
    profesores profesor3= new profesores("Yepez", 2233, fecha_naciemiento3, "Arte");
    
    String nombre1=profesor1.getnombre();
    System.out.println("El profesor se llama:"+nombre1);

    int codigo1=profesor1.getcodigo();
    System.out.println("El código de profesor es:"+codigo1);

    LocalDate fecha_de_nacimiento1=profesor1.getFechaDeNacimiento();
    System.out.println("La fecha de naciemiento es:"+fecha_de_nacimiento1);

    String materia1=profesor1.getmateria();
    System.out.println("La materia que enseña es:"+materia1);

     String nombre2=profesor2.getnombre();
    System.out.println("El profesor se llama:"+nombre2);

    int codigo2=profesor2.getcodigo();
    System.out.println("El código de profesor es:"+codigo2);

    LocalDate fecha_de_nacimiento2=profesor2.getFechaDeNacimiento();
    System.out.println("La fecha de naciemiento es:"+fecha_de_nacimiento2);

    String materia2=profesor2.getmateria();
    System.out.println("La materia que enseña es:"+materia2);

     String nombre3=profesor3.getnombre();
    System.out.println("El profesor se llama:"+nombre3);

    int codigo3=profesor3.getcodigo();
    System.out.println("El código de profesor es:"+codigo3);

    LocalDate fecha_de_nacimiento3=profesor3.getFechaDeNacimiento();
    System.out.println("La fecha de naciemiento es:"+fecha_de_nacimiento3);

    String materia3=profesor3.getmateria();
    System.out.println("La materia que enseña es:"+materia3);
}
}

   