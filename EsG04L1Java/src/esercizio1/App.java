package esercizio1;

import esercizio1.Dipendente.Dipartimento;
import esercizio1.Dipendente.Livello;


public class App {

	
	public static void main(String[] args) {
		Dipendente dipendente = new Dipendente("123", Dipartimento.PRODUZIONE, 1000.0, 30.0, Livello.OPERAIO);
		Dipendente dipendente2 = new Dipendente("125", Dipartimento.PRODUZIONE, 1000.0, 30.0, Livello.IMPIEGATO);
		Dipendente dipendente3 = new Dipendente("127", Dipartimento.PRODUZIONE, 1000.0, 30.0, Livello.QUADRO);
		
		double stipendioMensile = Dipendente.calcolaPaga(dipendente);
		System.out.println("Stipendio mensile: " + stipendioMensile);

		double stipendioMensileConStraordinario = Dipendente.calcolaPaga(dipendente, 10);
		System.out.println("Stipendio mensile con straordinario: " + stipendioMensileConStraordinario);
		
		
		Dipendente.Livello nuovoLivello = dipendente.promuovi();
        System.out.println();
        
        double stipendioMensile2 = Dipendente.calcolaPaga(dipendente2);
		System.out.println("Stipendio mensile: " + stipendioMensile2);

		double stipendioMensileConStraordinario2 = Dipendente.calcolaPaga(dipendente2, 20);
		System.out.println("Stipendio mensile con straordinario: " + stipendioMensileConStraordinario2);
		
		
		Dipendente.Livello nuovoLivello2 = dipendente2.promuovi();
        System.out.println();

        
        double stipendioMensile3 = Dipendente.calcolaPaga(dipendente3);
		System.out.println("Stipendio mensile: " + stipendioMensile3);

		double stipendioMensileConStraordinario3 = Dipendente.calcolaPaga(dipendente3, 30);
		System.out.println("Stipendio mensile con straordinario: " + stipendioMensileConStraordinario3);
		
		
		Dipendente.Livello nuovoLivello3 = dipendente3.promuovi();
        System.out.println();
	}

}
