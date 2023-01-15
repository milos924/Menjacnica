package Konvertor;
import java.awt.Image;
import java.awt.Window;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class KonvertorMenjacnica extends JFrame {

	private JPanel contentPane;
	private JTextField textDinari;
	private JTextField textEvri;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KonvertorMenjacnica frame = new KonvertorMenjacnica();
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
	public KonvertorMenjacnica() {
		setTitle("Konvertor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iznos u dinarima:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(429, 261, 211, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Iznos u evrima:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(73, 261, 199, 35);
		contentPane.add(lblNewLabel_1);
		
		textDinari = new JTextField();
		textDinari.setBounds(429, 306, 200, 30);
		contentPane.add(textDinari);
		textDinari.setColumns(10);
		
		textEvri = new JTextField();
		textEvri.setBounds(72, 306, 200, 30);
		contentPane.add(textEvri);
		textEvri.setColumns(10);
		
		JButton btnNewButton = new JButton("Konvertuj dinare u evre");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Konvertor k=new Konvertor();
				double dinari = Double.parseDouble(textDinari.getText());
				double evri = k.konvertujDuE(dinari);
				textEvri.setText(""+evri);
			}
		});
		btnNewButton.setBounds(405, 372, 250, 90);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Konvertuj evre u dinare");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Konvertor k = new Konvertor();
				double evri = Double.parseDouble(textEvri.getText());
				double dinari = k.KonvertujEuD(evri);
				textDinari.setText(""+ dinari);
			}
		});
		btnNewButton_1.setBounds(46, 372, 250, 90);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/coins-icon.png"));
		label.setIcon(img);
		label.setBounds(486, 156, 90, 95);
		contentPane.add(label);
		
		JLabel label1 = new JLabel("");
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/euro-icon.png"));
		label1.setIcon(img1);
		label1.setBounds(106, 126, 152, 166);
		contentPane.add(label1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Money-icon.png"));
		lblNewLabel_2.setIcon(img2);
		lblNewLabel_2.setBounds(28, -12, 211, 145);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/Money-icon.png"));
		lblNewLabel_3.setIcon(img3);
		lblNewLabel_3.setBounds(563, -12, 211, 145);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Menjacnica");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_4.setBounds(201, 26, 316, 90);
		contentPane.add(lblNewLabel_4);
	}
}
