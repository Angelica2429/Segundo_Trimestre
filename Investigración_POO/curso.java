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
    public void mostrarInfo() {
        System.out.println("El curso :"+nombre);
        System.out.println("El codigo del curso :"+codigo);
        System.out.println("El profesor del curso es:"+profesor);
    }

public static void main(String[] args ){
    curso curso1 = new curso ("Ingles",001,"jorge moná","karen,Luis,Daniel,Andrea,Bella");
    curso curso2 = new curso ("sociales",003,"Adriana Marin","Natalia,María,Sara,Sofia,Lauren");
    curso curso3 = new curso ("Arte",002,"Yepez","Karen,Natalia,Manuel,Juan");
   curso1.mostrarInfo();
   curso2.mostrarInfo();
   curso3.mostrarInfo();}

    }
