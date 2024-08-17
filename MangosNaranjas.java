public class MangosNaranjas {

    private int mangos;
    private int naranjas;
    
    public MangosNaranjas(int mangos, int naranjas) {
		this.mangos = mangos;
		this.naranjas = naranjas;
	}
	
	 private int calcularMCD(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
	 
	 public void imprimir() {
	        int mcd = calcularMCD(mangos, naranjas);
	        int cajas = mcd;
	        int mangosPorCaja = mangos / cajas;
	        int naranjasPorCaja = naranjas / cajas;

	        System.out.println("El número de cajas es: " + cajas);
	        System.out.println("El número de mangos en una caja es: " + mangosPorCaja);
	        System.out.println("El número de naranjas en una caja es: " + naranjasPorCaja);
	    }
    

}