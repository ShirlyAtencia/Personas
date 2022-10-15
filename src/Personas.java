public class Personas {
  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setNombre("Santo Tomas");
    persona.setEdad(35);
    persona.setTelefono(123456789);

    String nombre = persona.getNombre();
    int edad = persona.getEdad();
    int telefono = persona.getTelefono();
    System.out.println(nombre);
    System.out.println(edad);
    System.out.println(telefono);
  }
}

class Persona {
  private int edad;
  private String nombre;
  private int telefono;

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

  public int getTelefono() {
    return this.telefono;
  }
}
