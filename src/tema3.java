public class tema3 {
    public static void main (String[] args){
        int resultado = 0;
        resultado = suma(4, 5, 7);
        System.out.println("Suma:" + resultado);

        Coche mycoche = new Coche();
        System.out.println("Numero inicial de puertas: "+mycoche.puertas);
        mycoche.setPuertas();
        System.out.println("Numero actual de puertas: "+mycoche.puertas);
    }
    public static int suma(int a, int b, int c ){
        return a+b+c;
    }
}
class Coche{
    public int puertas = 4;
    public void setPuertas() {
        this.puertas = this.puertas + 1;
    }
}