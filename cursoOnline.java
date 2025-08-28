public class cursoOnline extends curso {
    String plataforma;

    public cursoOnline (String nombre, int codigo, String profesor, String estudiantes, String plataforma) {
        super(nombre, codigo, profesor, estudiantes);
        this.plataforma=plataforma;

    }
     public void mostrarInfo() {
        System.out.println("El curso online:"+nombre);
        System.out.println("El codigodel curso online:"+codigo);
        System.out.println("El profesor del curso online es:"+profesor);
        System.out.println("Los estudiantes del curso online son:"+estudiantes);
     }
    }
