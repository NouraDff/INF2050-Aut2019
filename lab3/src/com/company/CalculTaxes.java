package com.company;


public class CalculTaxes {
    private static final double TPS = 5;
    private static final double TVQ = 9.975;

    public static long calculerTaxeDeVentes(long montantHorsTaxe, boolean appliquerTps, boolean appliquerTvq) {
        if (montantHorsTaxe <= 0)
            throw new IllegalArgumentException("La valeur doir être supérieur à 0");

        long montantTps = 0;
        long montantTvq = 0;

        if (appliquerTps)
            montantTps = (long) (montantHorsTaxe * (TPS / 100));
        if (appliquerTvq)
            montantTvq = (long) (montantHorsTaxe * (TVQ / 100));

        return montantHorsTaxe + montantTps + montantTvq;
    }
}
