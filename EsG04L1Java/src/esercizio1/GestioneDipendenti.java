package esercizio1;

public class GestioneDipendenti {

	public static void main(String[] args) {
		 Dipendente dipendente1 = new Dipendente("001", Dipendente.Dipartimento.PRODUZIONE);
	        Dipendente dipendente2 = new Dipendente("002", Dipendente.Dipartimento.PRODUZIONE);
	        Dipendente dipendente3 = new Dipendente("003", Dipendente.Dipartimento.AMMINISTRAZIONE);
	        Dipendente dipendente4 = new Dipendente("004", Dipendente.Dipartimento.VENDITE, 1500, 25.0, Dipendente.Livello.DIRIGENTE);

	        dipendente1.promuovi();
	        dipendente2.promuovi();

	        System.out.println("Stato dei dipendenti:");
	        System.out.println("Dipendente 1: " + dipendente1.getLivello());
	        System.out.println("Dipendente 2: " + dipendente2.getLivello());
	        System.out.println("Dipendente 3: " + dipendente3.getLivello());
	        System.out.println("Dipendente 4: " + dipendente4.getLivello());

	        double importoDipendente1 = Dipendente.calcolaPaga(dipendente1, 5);
	        double importoDipendente2 = Dipendente.calcolaPaga(dipendente2, 5);
	        double importoDipendente3 = Dipendente.calcolaPaga(dipendente3, 5);
	        double importoDipendente4 = Dipendente.calcolaPaga(dipendente4, 5);

	        System.out.println("Importo dipendente 1: " + importoDipendente1);
	        System.out.println("Importo dipendente 2: " + importoDipendente2);
	        System.out.println("Importo dipendente 3: " + importoDipendente3);
	        System.out.println("Importo dipendente 4: " + importoDipendente4);

	}

}
