import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Button;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author David y Alejandro
 * @version final
 * */
public class Calculadora {

	//Declaracion de variables
	private JFrame frame;
	private JTextField textField;
	//variable para el primer operador
	private static double a;
	//Variable para el segundo operador
	private static double b;
	//variable para el tipo de operacion
	private static String op;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
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
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 244, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/**
		 * Todos los botones de la calculadora con sus distintas acciones
		 */
		
		//Boton para borrar
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				a=0;
				b=0;
			}
		});
		btnNewButton.setBounds(10, 72, 45, 38);
		frame.getContentPane().add(btnNewButton);
		
		
		//Botones para los numeros
		JButton button = new JButton("4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		button.setBounds(10, 170, 45, 38);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		button_1.setBounds(10, 219, 45, 38);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("0");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		button_2.setBounds(10, 268, 45, 38);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("8");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		button_3.setBounds(65, 121, 45, 38);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		button_4.setBounds(65, 170, 45, 38);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("2");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		button_5.setBounds(65, 219, 45, 38);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton(".");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		button_6.setBounds(65, 268, 45, 38);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		button_7.setBounds(120, 121, 45, 38);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("6");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		button_8.setBounds(120, 170, 45, 38);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("3");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		button_9.setBounds(120, 219, 45, 38);
		frame.getContentPane().add(button_9);
		

		//Botones de operaciones
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			
			}
		});
		button_11.setBounds(175, 268, 45, 38);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_12.setBounds(175, 219, 45, 38);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_13.setBounds(175, 170, 45, 38);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_14.setBounds(175, 121, 45, 38);
		frame.getContentPane().add(button_14);
		
		
		JLabel label = new JLabel("");
		label.setBounds(0, 11, 46, 14);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 210, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		btnNewButton_1.setBounds(10, 121, 45, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		//Boton para mostrar el resultado
		JButton button_10 = new JButton("=");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText();
				b=Double.parseDouble(textField.getText());
				if (op=="+"){
					textField.setText(""+(a+b));
				}else if(op=="-"){
					textField.setText(""+(a-b));
				}else if(op=="*"){
					textField.setText(""+(a*b));
				}else if(op=="/"){
					textField.setText(""+(a/b));
				}else{
					textField.setText("Error");
				}
				
			}
		});
		button_10.setBounds(120, 268, 45, 38);
		frame.getContentPane().add(button_10);
		
	}
	
	
}
