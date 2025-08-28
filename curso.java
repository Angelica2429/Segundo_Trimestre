public class curso {
    String nombre;
    int codigo;
    String profesor;
    String estudiantes;

    public curso (String nombre, int codigo, String profesor, String estudiantes) {
        this.nombre=nombre;
        this.codigo=codigo;
        this.profesor=profesor;
        this.estudiantes=estudiantes;
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

public String getprofesor() {
    return profesor;
}
public void setprofesor(String profesor) {
    this.profesor=profesor;
}
public String getestudiantes() {
    return estudiantes;
}
public void setestudiantes(String estudiantes) {
    this.estudiantes=estudiantes;
}

public static void main(String[] args ){
    curso curso1 = new curso ("Ingles",001,"jorge moná","karen,Luis,Daniel,Andrea,Bella");
    curso curso2 = new curso ("sociales",003,"Adriana Marin","Natalia,María,Sara,Sofia,Lauren");
    curso curso3 = new curso ("Arte",002,"Yepez","Karen,Natalia,Manuel,Juan");
    String nombre1=curso1.getnombre();
    System.out.println("El curso se llama:"+nombre1); 
    int codigo1=curso1.getcodigo();
    System.out.println("El código de curso es:"+codigo1);
    String profesor1=curso1.getprofesor();
    System.out.println("El profesor del curso se llama:"+profesor1);
    String estudiantes1=curso1.getestudiantes();
    System.out.println("los estudiantes de curso son:" +estudiantes1); 
    String nombre2=curso2.getnombre();
    System.out.println("El curso se llama:"+nombre2); 
    int codigo2=curso2.getcodigo();
    System.out.println("El código de curso es:"+codigo2);
    String profesor2=curso2.getprofesor();
    System.out.println("El profesor del curso se llama:"+profesor2);
    String estudiantes2=curso2.getestudiantes();
    System.out.println("los estudiantes de curso son:" +estudiantes2); 
    String nombre3=curso3.getnombre();
    System.out.println("El curso se llama:"+nombre3); 
    int codigo3=curso3.getcodigo();
    System.out.println("El código de curso es:"+codigo3);
    String profesor3=curso3.getprofesor();
    System.out.println("El profesor del curso se llama:"+profesor3);
    String estudiantes3=curso3.getestudiantes();
    System.out.println("los estudiantes de curso son:" +estudiantes3); 
    }
}
