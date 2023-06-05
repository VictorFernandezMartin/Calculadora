package Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	//Declaramos las variables
	int num1, num2;
	String signo;
	double Sqrt, elevado;
	CodigoCalculadora codigoCalculadora = new CodigoCalculadora();
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);  // Al ejecutarlo lo coloca en el centro de la pantalla
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Imagen logo
	@Override
	public Image getIconImage() {
		Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Logo/Logo Portfolio Negro.png"));
		return retValue;
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Calculadora - Victor Fdez");
		setIconImage(getIconImage());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelTitulo = new JLabel("Calculadora");
		labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setBounds(34, 10, 389, 37);
		contentPane.add(labelTitulo);
		
		JLabel labelOperacion = new JLabel("");
		labelOperacion.setFont(new Font("Tahoma", Font.BOLD, 20));
		labelOperacion.setForeground(new Color(192, 192, 192));
		labelOperacion.setBackground(Color.orange);
		labelOperacion.setHorizontalAlignment(SwingConstants.CENTER);
		labelOperacion.setBounds(34, 58, 389, 60);
		contentPane.add(labelOperacion);
		
		JLabel labelResultado = new JLabel("");
		labelResultado.setFont(new Font("Tahoma", Font.BOLD, 30));
		labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
		labelResultado.setBackground(Color.LIGHT_GRAY);
		labelResultado.setBounds(34, 140, 389, 60);
		contentPane.add(labelResultado);
		
		//BOTONES	
		JButton boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText(labelResultado.getText() + "1");
			}
		});
		boton1.setFont(new Font("Tahoma", Font.BOLD, 17));
		boton1.setBounds(34, 240, 66, 66);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText(labelResultado.getText() + "2");
			}
		});
		boton2.setFont(new Font("Tahoma", Font.BOLD, 17));
		boton2.setBounds(110, 240, 66, 66);
		contentPane.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText(labelResultado.getText() + "3");
			}
		});
		boton3.setFont(new Font("Tahoma", Font.BOLD, 17));
		boton3.setBounds(186, 240, 66, 66);
		contentPane.add(boton3);
		
		JButton boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText(labelResultado.getText() + "4");
			}
		});
		boton4.setFont(new Font("Tahoma", Font.BOLD, 17));
		boton4.setBounds(34, 316, 66, 66);
		contentPane.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText(labelResultado.getText() + "5");
			}
		});
		boton5.setFont(new Font("Tahoma", Font.BOLD, 17));
		boton5.setBounds(110, 316, 66, 66);
		contentPane.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText(labelResultado.getText() + "6");
			}
		});
		boton6.setFont(new Font("Tahoma", Font.BOLD, 17));
		boton6.setBounds(186, 316, 66, 66);
		contentPane.add(boton6);
		
		JButton boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText(labelResultado.getText() + "7");
			}
		});
		boton7.setFont(new Font("Tahoma", Font.BOLD, 17));
		boton7.setBounds(34, 392, 66, 66);
		contentPane.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText(labelResultado.getText() + "8");
			}
		});
		boton8.setFont(new Font("Tahoma", Font.BOLD, 17));
		boton8.setBounds(110, 392, 66, 66);
		contentPane.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText(labelResultado.getText() + "9");
			}
		});
		boton9.setFont(new Font("Tahoma", Font.BOLD, 17));
		boton9.setBounds(186, 392, 66, 66);
		contentPane.add(boton9);
		
		JButton boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText(labelResultado.getText() + "0");
			}
		});
		boton0.setFont(new Font("Tahoma", Font.BOLD, 17));
		boton0.setBounds(110, 468, 66, 66);
		contentPane.add(boton0);
		
		JButton botonComa = new JButton(".");
		botonComa.setFont(new Font("Tahoma", Font.BOLD, 17));
		botonComa.setBounds(34, 468, 66, 66);
		contentPane.add(botonComa);
		
		JButton botonIgual = new JButton("=");
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				codigoCalculadora.operador(num1, num2, labelOperacion, labelResultado, signo, Sqrt, elevado);
				
			}
		});
		botonIgual.setFont(new Font("Tahoma", Font.BOLD, 17));
		botonIgual.setBounds(186, 468, 66, 66);
		contentPane.add(botonIgual);
		
		JButton botonSuma = new JButton("+");
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(labelResultado.getText());
				signo="+";
				labelOperacion.setText(num1 + signo);
				labelResultado.setText("");
			}
		});
		botonSuma.setFont(new Font("Tahoma", Font.BOLD, 17));
		botonSuma.setBounds(281, 240, 66, 66);
		contentPane.add(botonSuma);
		botonSuma.setToolTipText("Sumar");
		
		JButton botonResta = new JButton("-");
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(labelResultado.getText());
				signo="-";
				labelOperacion.setText(num1 + signo);
				labelResultado.setText("");
			}
		});
		botonResta.setFont(new Font("Tahoma", Font.BOLD, 17));
		botonResta.setBounds(357, 240, 66, 66);
		contentPane.add(botonResta);
		botonResta.setToolTipText("Restar");
		
		JButton botonMultiplicacion = new JButton("*");
		botonMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(labelResultado.getText());
				signo="*";
				labelOperacion.setText(num1 + signo);
				labelResultado.setText("");
			}
		});
		botonMultiplicacion.setFont(new Font("Tahoma", Font.BOLD, 17));
		botonMultiplicacion.setBounds(281, 316, 66, 66);
		contentPane.add(botonMultiplicacion);
		botonMultiplicacion.setToolTipText("Multiplicar");
		
		JButton botonDivision = new JButton("/");
		botonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(labelResultado.getText());
				signo="/";
				labelOperacion.setText(num1 + signo);
				labelResultado.setText("");
			}
		});
		botonDivision.setFont(new Font("Tahoma", Font.BOLD, 17));
		botonDivision.setBounds(357, 316, 66, 66);
		contentPane.add(botonDivision);
		botonDivision.setToolTipText("Dividir");
		
		JButton botonSqrt = new JButton("Sqrt");
		botonSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(labelResultado.getText());
				signo="Sqrt";
				labelOperacion.setText(signo + " (" + num1 + ")");
				labelResultado.setText("");
			}
		});	
		botonSqrt.setFont(new Font("Tahoma", Font.BOLD, 17));
		botonSqrt.setBounds(281, 392, 142, 66);
		contentPane.add(botonSqrt);
		botonSqrt.setToolTipText("Raiz cuadrada");
		
		JButton botonElevado = new JButton("^");
		botonElevado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(labelResultado.getText());
				signo="^";
				labelOperacion.setText(num1 + signo);
				labelResultado.setText("");
			}
		});
		botonElevado.setFont(new Font("Tahoma", Font.BOLD, 17));
		botonElevado.setBounds(281, 468, 66, 66);
		contentPane.add(botonElevado);
		botonElevado.setToolTipText("Elevar");
		
		JButton botonC = new JButton("C");
		botonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelOperacion.setText("");
				labelResultado.setText("");
			}
		});
		botonC.setFont(new Font("Tahoma", Font.BOLD, 17));
		botonC.setBounds(357, 468, 66, 66);
		contentPane.add(botonC);
		botonC.setToolTipText("Limpiar calculadora");
	}
	
}
