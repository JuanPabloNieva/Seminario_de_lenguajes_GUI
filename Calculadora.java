import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frmCalculadora;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 450, 300);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		frmCalculadora.getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel numbersPanel = new JPanel();
		frmCalculadora.getContentPane().add(numbersPanel, BorderLayout.CENTER);
		numbersPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		numbersPanel.add(btn1);
		
		JButton btn2 = new JButton("2");
		numbersPanel.add(btn2);
		
		JButton btn3 = new JButton("3");
		numbersPanel.add(btn3);
		
		JButton btn4 = new JButton("4");
		numbersPanel.add(btn4);
		
		JButton btn5 = new JButton("5");
		numbersPanel.add(btn5);
		
		JButton btn6 = new JButton("6");
		numbersPanel.add(btn6);
		
		JButton btn7 = new JButton("7");
		numbersPanel.add(btn7);
		
		JButton btn8 = new JButton("8");
		numbersPanel.add(btn8);
		
		JButton btn9 = new JButton("9");
		numbersPanel.add(btn9);
		
		JButton btnPunto = new JButton(".");
		numbersPanel.add(btnPunto);
		
		JButton btn0 = new JButton("0");
		numbersPanel.add(btn0);
		
		JButton btnResultado = new JButton("=");
		numbersPanel.add(btnResultado);
		
		JPanel operatorsPanel = new JPanel();
		frmCalculadora.getContentPane().add(operatorsPanel, BorderLayout.EAST);
		operatorsPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnSuma = new JButton("+");
		operatorsPanel.add(btnSuma);
		
		JButton btnResta = new JButton("-");
		operatorsPanel.add(btnResta);
		
		JButton btnMultiplicacion = new JButton("x");
		operatorsPanel.add(btnMultiplicacion);
		
		JButton btnDivision = new JButton("/");
		operatorsPanel.add(btnDivision);
	}

}
