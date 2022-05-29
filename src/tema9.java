public class tema9 {
    public static void main(String[] args){
        Persona persona = new Persona(23, 234567, "Maria");

        System.out.println(("-----------------Cliente---------------"));
        Cliente cliente = new Cliente(45, 2345667, "Ion");
        //cliente.setNombre("Ion");
        System.out.println("Nombre: "+cliente.getNombre());
        //cliente.setEdad(43);
        System.out.println("Edad: "+cliente.getEdad());
        //cliente.setTelefon(1234567);
        System.out.println("Telefono: "+cliente.getTelefono());
        cliente.setCredito(23000);
        System.out.println("Credito: "+cliente.getCredito());

        Trabajador trabajador = new Trabajador(56, 67, 12455, "Ioana");
        System.out.println("-----------Trabajador---------------");
        System.out.println("Nombre: "+trabajador.getNombre());
        System.out.println("Edad: "+trabajador.getEdad());
        System.out.println("Telefono: "+trabajador.getTelefono());
        System.out.println("Salario: "+trabajador.getSalario());


    }
}
class Persona{
    private int edad, telefono;
    private String nombre;
    // constructor
    public Persona(int edad,int telefono,String nombre){
        this.edad = edad;
        this.telefono = telefono;
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setTelefon(int telefono){
        this.telefono = telefono;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public String getNombre(){
        return this.nombre;
    }
}
class Cliente extends Persona{
    private int credito;
    public Cliente(int edad, int telefono, String nombre){
        super(edad, telefono, nombre);
    }

    public void setCredito( int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }
}
class Trabajador extends Persona{
    int salario;

    public Trabajador(int salario, int edad, int telefono, String nombre){
        super(edad, telefono, nombre);
        this.salario = salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}
        /*
        Crea ahora un objeto de la clase Cliente que debe tener como
        propiedades la edad, el telefono, el nombre y el credito,
        tienes que darles valor y mostrarlas por pantalla.
        Una vez hecho esto, haz lo mismo con la clase Trabajador
        que herede de Persona, y con una variable salario que solo tenga
        la clase Trabajador.*/