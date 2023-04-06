// "<=" Pertence a sequencia fibonacci
public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci();
		int sequencia = 21;
		for (int i = 0; i < sequencia; i++) {
            System.out.print("["+fibo.calcularFibo(i)+"] ");
            	if(fibo.calcularFibo(i) == sequencia) System.out.println("<=");            	
        }
		
	}
	public int calcularFibo(int x) {
		if(x <=1 ) {
			return 1;
		}
		return calcularFibo(x-1) + calcularFibo(x-2);
		}
}
