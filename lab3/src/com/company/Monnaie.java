package com.company;

public class Monnaie {
    private long monnaie;

    public Monnaie(){
    }

    public Monnaie(long monnaie){
        this.monnaie = monnaie;
    }

    public long getMonnaie() {
        return monnaie;
    }

    public static Monnaie additionnerMonnaie(Monnaie monnaie1, Monnaie monnaie2){
        long valeur = monnaie1.getMonnaie() + monnaie2.getMonnaie();
        return new Monnaie(valeur);
    }

    public long pourcentage(Monnaie monnaie, double pourcentage){
        return (long) (monnaie.getMonnaie() * (pourcentage / 100));
    }

    public Monnaie soustraireMontant(long montant, Monnaie monnaie){
        long valeur = montant - monnaie.getMonnaie();
        return new Monnaie(valeur);
    }

    @Override
    public String toString() {
        double argent = (double) monnaie / 100 ;
        return "" + argent;
    }
}
