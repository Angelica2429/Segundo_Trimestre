public class cursopresencial extends curso{
    int salon;

    public cursopresencial(String nombre, int codigo, String profesor, String estudiantes, int salon) {
        super(nombre, codigo, profesor, estudiantes);
        this.salon=salon;
    }
     public void mostrarInfo() {
        System.out.println("El curso presencial:"+nombre);
        System.out.println("El codigo del curso presencial:"+codigo);
        System.out.println("El profesor del curso presencial es:"+profesor);
        System.out.println("Los estudiantes del curso presencial son:"+estudiantes);
        System.out.println("El salon del curso es:"+salon);
     }

     public static void main(String[] args) {
        cursopresencial curso4 = new cursopresencial("Matematicas", 1121, "Reinel", "Luisa,isabella,David,Juan", 12);{
       curso4.mostrarInfo();}
        }
        
     }

