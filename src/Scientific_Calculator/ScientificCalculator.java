package Scientific_Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ScientificCalculator {

	private JFrame frmStandardCalculator;
	private JTextField txtDisplay;
	private JTextField txtConvertisseur;
	private JTextField jlblConverts;
	
	
	double firstnum;
	double secondnum;
	double result;
	protected String operations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
					window.frmStandardCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScientificCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.setTitle("Standard Calculator");
		frmStandardCalculator.setBounds(100, 100, 853, 338);
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmStandardCalculator.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmCalculator = new JMenuItem("Standard");
		mntmCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				frmStandardCalculator.setTitle("Standard Calculator");
				frmStandardCalculator.setBounds(100, 100, 275, 367);
				txtDisplay.setBounds(10, 11, 243, 37);
			}
		});
		mnFile.add(mntmCalculator);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmStandardCalculator.setTitle("Scientific Calculator");
				frmStandardCalculator.setBounds(100, 100, 525, 367);
				txtDisplay.setBounds(10, 11, 494, 37);
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmUnitConverter = new JMenuItem("Unit converter");
		mntmUnitConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmStandardCalculator.setTitle("Unit conversion");
				frmStandardCalculator.setBounds(100, 100, 884, 367);
				txtDisplay.setBounds(10, 11, 243, 37);
			}
		});
		mnFile.add(mntmUnitConverter);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		frmStandardCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 275, 37);
		frmStandardCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace = null;
				
				if (txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnNewButton.setBounds(10, 55, 44, 37);
		frmStandardCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("CE");
		btnNewButton_2.setBounds(66, 55, 44, 37);
		frmStandardCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("C");
		btnNewButton_2_1.setBounds(122, 55, 44, 37);
		frmStandardCalculator.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("±");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_2_2.setBounds(185, 55, 44, 37);
		frmStandardCalculator.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("√");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sqrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_2_3.setBounds(241, 55, 44, 37);
		frmStandardCalculator.getContentPane().add(btnNewButton_2_3);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn7.setBounds(10, 100, 44, 37);
		frmStandardCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn8.setBounds(66, 100, 44, 37);
		frmStandardCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn9.setBounds(122, 100, 44, 37);
		frmStandardCalculator.getContentPane().add(btn9);
		
		JButton btnNewButton_2_6_1 = new JButton("/");
		btnNewButton_2_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnNewButton_2_6_1.setBounds(185, 100, 44, 37);
		frmStandardCalculator.getContentPane().add(btnNewButton_2_6_1);
		
		JButton btnNewButton_2_6_2 = new JButton("%");
		btnNewButton_2_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnNewButton_2_6_2.setBounds(241, 100, 44, 37);
		frmStandardCalculator.getContentPane().add(btnNewButton_2_6_2);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn4.setBounds(10, 157, 44, 37);
		frmStandardCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn5.setBounds(66, 157, 44, 37);
		frmStandardCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn6.setBounds(122, 157, 44, 37);
		frmStandardCalculator.getContentPane().add(btn6);
		
		JButton btnNewButton_2_6_6 = new JButton("*");
		btnNewButton_2_6_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnNewButton_2_6_6.setBounds(185, 157, 44, 37);
		frmStandardCalculator.getContentPane().add(btnNewButton_2_6_6);
		
		JButton btnNewButton_2_6_7 = new JButton("1/x");
		btnNewButton_2_6_7.setBounds(241, 157, 44, 37);
		frmStandardCalculator.getContentPane().add(btnNewButton_2_6_7);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn1.setBounds(10, 200, 44, 37);
		frmStandardCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn2.setBounds(66, 200, 44, 37);
		frmStandardCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn3.setBounds(122, 200, 44, 37);
		frmStandardCalculator.getContentPane().add(btn3);
		
		JButton btnNewButton_2_6_11 = new JButton("-");
		btnNewButton_2_6_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnNewButton_2_6_11.setBounds(185, 200, 44, 37);
		frmStandardCalculator.getContentPane().add(btnNewButton_2_6_11);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iNum = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn0.setBounds(10, 245, 100, 37);
		frmStandardCalculator.getContentPane().add(btn0);
		
		JButton btnNewButton_2_6_13 = new JButton(".");
		btnNewButton_2_6_13.setBounds(122, 245, 44, 37);
		frmStandardCalculator.getContentPane().add(btnNewButton_2_6_13);
		
		JButton btnNewButton_2_6_14 = new JButton("+");
		btnNewButton_2_6_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnNewButton_2_6_14.setBounds(185, 245, 44, 37);
		frmStandardCalculator.getContentPane().add(btnNewButton_2_6_14);
		
		JButton btnNewButton_2_6_15 = new JButton("=");
		btnNewButton_2_6_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
			}
			
		});
		btnNewButton_2_6_15.setBounds(241, 200, 44, 82);
		frmStandardCalculator.getContentPane().add(btnNewButton_2_6_15);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnLog.setBounds(297, 55, 44, 37);
		frmStandardCalculator.getContentPane().add(btnLog);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sin(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSin.setBounds(353, 55, 44, 37);
		frmStandardCalculator.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sinh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSinh.setBounds(409, 55, 44, 37);
		frmStandardCalculator.getContentPane().add(btnSinh);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					firstnum = Double.parseDouble(txtDisplay.getText());
					txtDisplay.setText("");
					operations = "Mod";
			}
			
		});
		btnMod.setBounds(470, 55, 44, 37);
		frmStandardCalculator.getContentPane().add(btnMod);
		
		JButton btnNewButton_6 = new JButton("Л");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops;
				ops = 3.1415926535897932384626433832795;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_6.setBounds(297, 100, 44, 37);
		frmStandardCalculator.getContentPane().add(btnNewButton_6);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setBounds(353, 100, 44, 37);
		frmStandardCalculator.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setBounds(409, 100, 44, 37);
		frmStandardCalculator.getContentPane().add(btnCosh);
		
		JButton btnLnx = new JButton("lnx");
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log10(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnLnx.setBounds(470, 100, 44, 37);
		frmStandardCalculator.getContentPane().add(btnLnx);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.pow(ops, ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnXy.setBounds(297, 157, 44, 37);
		frmStandardCalculator.getContentPane().add(btnXy);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setBounds(353, 157, 44, 37);
		frmStandardCalculator.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.setBounds(409, 157, 44, 37);
		frmStandardCalculator.getContentPane().add(btnTanh);
		
		JButton btnExp = new JButton("Exp");
		btnExp.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			firstnum = Double.parseDouble(txtDisplay.getText());
			txtDisplay.setText("");
			operations = "Exp";
			}
		});
		btnExp.setBounds(470, 157, 44, 37);
		frmStandardCalculator.getContentPane().add(btnExp);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops =(ops * ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnX.setBounds(297, 200, 44, 37);
		frmStandardCalculator.getContentPane().add(btnX);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cbrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCbr.setBounds(353, 200, 44, 37);
		frmStandardCalculator.getContentPane().add(btnCbr);
		
		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.round(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnRund.setBounds(409, 200, 44, 37);
		frmStandardCalculator.getContentPane().add(btnRund);
		
		JButton btnNewButton_17 = new JButton("2^Л");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops;
				ops = (3.1415926535897932384626433832795) * 2;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_17.setBounds(470, 200, 44, 37);
		frmStandardCalculator.getContentPane().add(btnNewButton_17);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.setBounds(297, 245, 44, 37);
		frmStandardCalculator.getContentPane().add(btnX_1);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,2));
			}
		});
		btnBin.setBounds(353, 245, 44, 37);
		frmStandardCalculator.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,16));
			}
		});
		btnHex.setBounds(409, 245, 44, 37);
		frmStandardCalculator.getContentPane().add(btnHex);
		
		JButton btnOctal = new JButton("Octal");
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,8));
			}
		});
		btnOctal.setBounds(470, 245, 44, 37);
		frmStandardCalculator.getContentPane().add(btnOctal);
		
		JPanel panel = new JPanel();
		panel.setBounds(549, 40, 268, 228);
		frmStandardCalculator.getContentPane().add(panel);
		
		txtConvertisseur = new JTextField();
		txtConvertisseur.setText("Convertisseur");
		panel.add(txtConvertisseur);
		txtConvertisseur.setColumns(10);
	}
}
