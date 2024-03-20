import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonCaffè implements ActionListener {

	Finestra f1;
	
	public ButtonCaffè (Finestra finestra) {
		this.f1 = finestra;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		int pin = Integer.parseInt(f1.campo1.getText());
		Boolean trovato = false;
		
		for (int i = 0; i < f1.listaChiavette.size(); i++) {
			if (pin == f1.listaChiavette.get(i).pin) {
				f1.listaChiavette.get(i).saldo -= 2;
				trovato = true;
				break;
			} else {
				continue;
			}
		}
		
		if (trovato == true) {
			JOptionPane.showMessageDialog(null, "Caffè erogato, al costo di due euro");
		} else {
			JOptionPane.showMessageDialog(null, "Il pin inserito non corrisponde a nessuna chiavetta");
		}

	}
}