import javax.swing.JOptionPane;

public class Lista1_Ativ3 {

	public static void main(String[] args) {
		int n;
		do{
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro menor que 12: "));
		if(n > 12) {
			JOptionPane.showMessageDialog(null, "Digite um número até 12");
		}
		}while(n > 12 || n < 0);
		
		int a = rec(n);
		JOptionPane.showMessageDialog(null, "O fatorial é: " + a);
	}
	
	public static int rec(int n) {
		// Caso o valor seja 0 irá retornar 1, isso preve p fatorial de zero que é 1, e do próprio 1
		if (n == 0) {
			return 1;
		/* Pego o valor digitado e multiplico pelo seu anterior, porém por ser uma recursiva ele volta 
		 * já montando o fatorial */
		} else {
			return n * rec(n - 1);
		}
	}
	
}