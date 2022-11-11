import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculos {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double n1;
		double n2 = 0;
		String operação;
		double resultado;
		double i = 0;

		while (i == 0) {
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número: "));
			
			operação = JOptionPane.showInputDialog("Escolha a operação: "
					+ "\n (+)"
					+ "\n (-)"
					+ "\n (*)"
					+ "\n (/)"
					+ "\n (%)"
					+ "\n (√)"
					+ "\n (^)"
					+ "\n (sen)"
					+ "\n (cos)"
					+ "\n (tan)");

		if (operação.equals("√")) {
			resultado = Math.sqrt(n1);
			JOptionPane.showMessageDialog(null, "A raíz quadrada é " + resultado);
			n1 = resultado;
		} 

		if (operação.equals("sen")) {
            resultado =  Math.sin(n1);
            JOptionPane.showMessageDialog(null, "O seno é " + resultado);
            n1 = resultado;
		}
			
		if (operação.equals("cos")) {
            resultado =  Math.cos(n1);
            JOptionPane.showMessageDialog(null, "O cosseno é " + resultado);
            n1 = resultado;
		}

		if (operação.equals("tan")) {
            resultado =  Math.tan(n1);
            JOptionPane.showMessageDialog(null, "A tangente é " + resultado);
            n1 = resultado;
		}
			
		if (operação.equals("+")) {
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: "));
            resultado =  n1 + n2;
            JOptionPane.showMessageDialog(null, "A soma é " + resultado);
            n1 = resultado;
		}

		if (operação.equals("-")) {
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: "));
            resultado =  n1 - n2;
            JOptionPane.showMessageDialog(null, "A subtração é " + resultado);
            n1 = resultado;
		}

		if (operação.equals("/")) {
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: "));
            resultado =  n1 / n2;
            JOptionPane.showMessageDialog(null, "A divisão é " + resultado);
            n1 = resultado;
		}

		if (operação.equals("*")) {
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: "));
            resultado =  n1 * n2;
            JOptionPane.showMessageDialog(null, "A multiplicação é " + resultado);
            n1 = resultado;
		}

		if (operação.equals("%")) {
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: "));
            resultado =  n1 % n2;
            JOptionPane.showMessageDialog(null, "O resto é " + resultado);
            n1 = resultado;
		}

		if (operação.equals("^")) {
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: "));
            resultado =  Math.pow(n1, n2);
            JOptionPane.showMessageDialog(null, "A potência é " + resultado);
            n1 = resultado;
			}
		
		JOptionPane sair = new JOptionPane();
		int Sair = JOptionPane.showConfirmDialog(null, "Você deseja fazer outra operação?", "Sair", JOptionPane.YES_NO_OPTION);
		if(Sair == JOptionPane.NO_OPTION) {
			System.exit(0);
		}
		}
	}

}
