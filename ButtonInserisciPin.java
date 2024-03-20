import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonInserisciPin implements ActionListener {

	Finestra f1;

	public ButtonInserisciPin(Finestra finestra) {

		this.f1 = finestra;
	}

	public void actionPerformed(ActionEvent e) {
		
		int pin = Integer.parseInt(f1.campo1.getText());
		Boolean trovato = false;
		
		for (int i = 0; i < f1.listaChiavette.size(); i++) {
			if (pin == f1.listaChiavette.get(i).pin) {
				trovato=true;
				break;
			} else {
				continue;
			}
		}
		if (trovato == true) {
			JOptionPane.showMessageDialog(null, "Login Effettuato");
			f1.buttonCaffè.setVisible(true);
			f1.buttonThè.setVisible(true);
			f1.buttonAcqua.setVisible(true);
			f1.buttonMerendina.setVisible(true);
			f1.buttonSaldo.setVisible(true);
			f1.label2.setVisible(true);
			f1.campo2.setVisible(true);
			f1.buttonRicarica.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "Login Fallito");
		}
		

		
	}
}
