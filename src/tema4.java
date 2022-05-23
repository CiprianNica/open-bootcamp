public class tema4 {
    public static void main(String[] args) {
        int numeroWhile = 0;
        System.out.println("----------WHILE--------");

        while(numeroWhile < 3) {
            System.out.println("numero WHILE: " + numeroWhile);
            ++numeroWhile;
        }

        System.out.println();
        System.out.println("----------DO-WHILE--------");

        do {
            System.out.println("numero DO-WHILE: " + numeroWhile);
            ++numeroWhile;
        } while(numeroWhile < 3);

        System.out.println();
        System.out.println("----------FOR--------");

        for(int numeroFor = 0; numeroFor <= 3; ++numeroFor) {
            System.out.println("numero FOR: " + numeroFor);
        }

        System.out.println();
        System.out.println("----------SWITCH--------");
        String estacion = "verano";
        switch(estacion){
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("No hay estacion.");
        }}}
