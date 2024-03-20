import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Finestra extends JFrame {
	
	JButton buttonInserisciPin;
	JLabel label1;
	JTextField campo1;
	ArrayList<Chiavetta> listaChiavette = new ArrayList<>();
	
	JButton buttonCrea;
	
	JButton buttonCaffè;
	JButton buttonThè;
	JButton buttonAcqua;
	JButton buttonMerendina;
	
	JButton buttonSaldo;
	
	JLabel label2;
	JTextField campo2;
	JButton buttonRicarica;
	
	public Finestra(String titolo) {
		
		super(titolo);
		
		this.setSize(430, 350);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Centra la finestra
		this.setLocationRelativeTo(null);
		
		Chiavetta c1 = new Chiavetta(123);
		Chiavetta c2 = new Chiavetta(456);
		Chiavetta c3 = new Chiavetta(789);
		listaChiavette.add(c1);
		listaChiavette.add(c2);
		listaChiavette.add(c3);
		
		label1 = new JLabel("Inserisci il pin");
		campo1 = new JTextField(10);
		buttonInserisciPin = new JButton("Accedi");
		buttonInserisciPin.addActionListener(new ButtonInserisciPin(this));
		
		buttonCrea = new JButton("Crea nuova chiavetta");
		buttonCrea.addActionListener(new ButtonCrea(this));
		
		buttonCaffè = new JButton("Eroga caffè");
		buttonCaffè.addActionListener(new ButtonCaffè(this));
		
		buttonThè = new JButton("Eroga thè");
		buttonThè.addActionListener(new ButtonThè(this));
		
		buttonAcqua = new JButton("Eroga acqua");
		buttonAcqua.addActionListener(new ButtonAcqua(this));
		
		buttonMerendina = new JButton("Eroga merendina");
		buttonMerendina.addActionListener(new ButtonMerendina(this));
		
		buttonSaldo = new JButton("Visualizza saldo");
		buttonSaldo.addActionListener(new ButtonSaldo(this));
		
		label2 = new JLabel("Inserisci l'importo per ricaricare");
		campo2 = new JTextField(4);
		
		buttonRicarica = new JButton("Ricarica");
		buttonRicarica.addActionListener(new ButtonRicarica(this));
		
		JPanel panel = new JPanel();
		
		panel.add(label1);
		panel.add(campo1);
		panel.add(buttonInserisciPin);
		panel.add(buttonCrea);
		panel.add(buttonCaffè);
		panel.add(buttonThè);
		panel.add(buttonAcqua);
		panel.add(buttonMerendina);
		panel.add(buttonSaldo);
		panel.add(label2);
		panel.add(campo2);
		panel.add(buttonRicarica);
		
		buttonCaffè.setVisible(false);
		buttonThè.setVisible(false);
		buttonAcqua.setVisible(false);
		buttonMerendina.setVisible(false);
		buttonSaldo.setVisible(false);
		label2.setVisible(false);
		campo2.setVisible(false);
		buttonRicarica.setVisible(false);
		
		this.add(panel);
		this.setVisible(true);
		
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Finestra f1 = new Finestra("Macchinetta");

	}

}
