package Calculadora;

import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class CodigoCalculadora {
	
	public void operador(int num1, int num2, JLabel labelOperacion, JLabel labelResultado, String signo, double Sqrt, double elevado) {
		num2 = Integer.parseInt(labelResultado.getText());
		labelOperacion.setText(labelOperacion.getText() + num2);
		labelResultado.setText("");
		int operacion;
		String resultado;
		
		switch(signo) {
		case "+":
			operacion=num1+num2;
			resultado=operacion + "";
			labelResultado.setText(resultado);
			break;
		case "-":
			operacion=num1-num2;
			resultado=operacion + "";
			labelResultado.setText(resultado);
			break;
		case "*":
			operacion=num1*num2;
			resultado=operacion + "";
			labelResultado.setText(resultado);
			break;
		case "/":
			operacion=num1/num2;
			resultado=operacion + "";
			labelResultado.setText(resultado);
			break;
		case "Sqrt":
			Sqrt = Math.sqrt(num1);
			//resultado = Double.toString(Sqrt);
			resultado = String.valueOf(Sqrt);
			labelResultado.setText(resultado);
			break;
		case "^":
			elevado=Math.pow(num1, num2);
			resultado=elevado + "";
			labelResultado.setText(resultado);
			break;
	}
	}

}
