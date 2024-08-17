public class MangosNarangasMain {
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el número de mangos: ");
        int mangos = entrada.nextInt();
        
        System.out.print("Introduce el número de naranjas: ");
        int naranjas = entrada.nextInt();
        
        MangosNaranjas caja = new MangosNaranjas(mangos, naranjas);
        
        caja.imprimir();
        
        entrada.close();
    }
       
    }