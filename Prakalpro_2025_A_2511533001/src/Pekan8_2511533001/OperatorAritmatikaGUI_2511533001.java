package Pekan8_2511533001;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511533001 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511533001 frame = new OperatorAritmatikaGUI_2511533001();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperatorAritmatikaGUI_2511533001() {
		setTitle("OperatorAritmatika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(109, 11, 176, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(10, 43, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setBounds(10, 73, 75, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operator");
		lblNewLabel_1_2.setBounds(10, 109, 75, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hasil");
		lblNewLabel_1_3.setBounds(10, 160, 75, 14);
		contentPane.add(lblNewLabel_1_3);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(95, 40, 86, 20);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setColumns(10);
		txtBil2.setBounds(95, 70, 86, 20);
		contentPane.add(txtBil2);
		
		txtHasil = new JTextField();
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setEditable(false);
		txtHasil.setBounds(95, 157, 86, 20);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(95, 105, 86, 22);
		contentPane.add(cbOperator);
		
		JButton Hitung = new JButton("Hitung");
		Hitung.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				int a= Integer.valueOf(txtBil1.getText());
				int b= Integer.valueOf(txtBil2.getText());
				int c= cbOperator.getSelectedIndex();
				if (c==0) {
					hasil=a+b;
				}
				if (c==1) {
					hasil=a-b;
				}
				if (c==2) {
					hasil=a*b;
				}
				if (c==3) {
					hasil=a/b;
				}
				if (c==4) {
					hasil=a%b;
				}
				txtHasil.setText(String.valueOf(hasil));
				}
		});
		Hitung.setBounds(196, 105, 89, 23);
		contentPane.add(Hitung);

	}
}
