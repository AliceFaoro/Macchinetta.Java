import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonCrea implements ActionListener {

	Finestra f1;
	
	public ButtonCrea(Finestra finestra) {
		this.f1 = finestra;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		int pin = Integer.parseInt(f1.campo1.getText());
		
		Chiavetta c = new Chiavetta(pin);
		f1.listaChiavette.add(c);
		

	}

}
