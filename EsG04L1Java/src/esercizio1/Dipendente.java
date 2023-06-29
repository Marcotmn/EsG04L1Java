package esercizio1;

public class Dipendente {
    private static double stipendioBase = 1000.0;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    public static enum Livello { OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE }
    public static enum Dipartimento { PRODUZIONE, AMMINISTRAZIONE, VENDITE }

    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30.0;
        this.livello = Livello.OPERAIO;
    }

    public Dipendente(String matricola, Dipartimento dipartimento, double stipendio, double importoOrarioStraordinario, Livello livello) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
    
    public Livello promuovi() {
        if (livello == Livello.OPERAIO) {
            livello = Livello.IMPIEGATO;
            stipendio = stipendioBase * 1.2;
        } else if (livello == Livello.IMPIEGATO) {
            livello = Livello.QUADRO;
            stipendio = stipendioBase * 1.5;
        } else if (livello == Livello.QUADRO) {
            livello = Livello.DIRIGENTE;
            stipendio = stipendioBase * 2;
        } else {
            System.out.println("Errore: Il dipendente è già un dirigente.");
            return livello; 
        }
        
       

        System.out.println("Nuovo livello: " + livello);
        System.out.println("Nuovo stipendio: " + stipendio);
        return livello; 
    }
    
    public static double calcolaPaga(Dipendente dipendente) {
        return dipendente.getStipendio();
    }

   
    public static double calcolaPaga(Dipendente dipendente, int oreStraordinario) {
        double stipendioBase = dipendente.getStipendio();
        double importoOrarioStraordinario = dipendente.getImportoOrarioStraordinario();
        double stipendioComplessivo = stipendioBase + (importoOrarioStraordinario * oreStraordinario);
        return stipendioComplessivo;
    }
}
