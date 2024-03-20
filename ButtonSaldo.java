import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonSaldo implements ActionListener {

	Finestra f1;
	
	public ButtonSaldo (Finestra finestra) {
		this.f1 = finestra;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		int pin = Integer.parseInt(f1.campo1.getText());
		Boolean trovato = false;
		
		for (int i = 0; i < f1.listaChiavette.size(); i++) {
			if (pin == f1.listaChiavette.get(i).pin) {
				trovato = true;
				JOptionPane.showMessageDialog(null, "Il saldo rimanente è: " + f1.listaChiavette.get(i).saldo);
				break;
			} else {
				continue;
			}
		}
		
		if (trovato == false) {
			
			JOptionPane.showMessageDialog(null, "Il pin inserito non corrisponde a nessuna chiavetta");
		}


	}

}
