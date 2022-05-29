public class tema8 {
    public static void main(String[] args){
        Personal persona = new Personal();

        persona.setNombre("Ion");
        System.out.println(persona.getNombre());

        persona.setEdad(42);
        System.out.println(persona.getEdad());

        persona.setTelefono(12345667);
        System.out.println(persona.getTelefono());
    }
}

/*
   Para practicar la encapsulación
   Crear clase Persona.
        Crear variables las privadas edad, nombre
        y telefono de la clase Persona.
        Crear gets y sets de cada propiedad.
        Crear un objeto persona en el main.
        Utiliza los gets y sets para darle valores a
        las propiedades edad, nombre y telefono, por último
        muéstralas por consola.
*/
class Personal{
    private int edad, telefono;
    private String nombre;
// setter
    public void  setEdad(int edadValor){
        this.edad = edadValor;
    }
    public void setNombre(String nombreValor){
        this.nombre = nombreValor;
    }
    public void setTelefono( int telefonoValor){
        this.telefono = telefonoValor;
    }
// getter
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
