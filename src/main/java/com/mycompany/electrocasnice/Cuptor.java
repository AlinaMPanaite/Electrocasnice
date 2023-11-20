package com.mycompany.electrocasnice;

/**
 *
 * @author Alina
 */
public class Cuptor extends Electrocasnice {

    String TipCuratare;
    String TipInchidereUsa;
    int NrFunctii;
    String AfisajPanouComanda;
    boolean timer;
    float putere;
    float tensiune;
    float frecventa;

    Cuptor() {
        super();
        TipCuratare = " ";
        TipInchidereUsa = " ";
        NrFunctii = 0;
        AfisajPanouComanda = " ";
        timer = true;
        putere = 0.0f;
        tensiune = 0.0f;
        frecventa = 0.0f;

    }

    Cuptor(String tip, String brand, String numeModel, String TipCuratare, float capacitate, String clasaEficientaEnergetica, String TipInchidereUsa, int Nrfunctii, String functii, String AfisajPanouComanda, boolean timer, float putere, float tensiune, float frecventa, float pret, float greutate, String dimensiune, String culoare, float recenzii, int recenziiTotal, int garantiePersoaneJuridice, int garantiePersoaneFizice) {
        super(tip, brand, numeModel, functii, capacitate, clasaEficientaEnergetica, pret, greutate, dimensiune, culoare, recenzii, recenziiTotal, garantiePersoaneJuridice, garantiePersoaneFizice);
        this.TipCuratare = TipCuratare;
        this.TipInchidereUsa = TipInchidereUsa;
        this.NrFunctii = NrFunctii;
        this.AfisajPanouComanda = AfisajPanouComanda;
        this.timer = timer;
        this.putere = putere;
        this.tensiune = tensiune;
        this.frecventa = frecventa;

    }

    public Cuptor(Cuptor copie) {
        super(copie);
        this.TipCuratare = copie.TipCuratare;
        this.TipInchidereUsa = copie.TipInchidereUsa;
        this.NrFunctii = copie.NrFunctii;
        this.AfisajPanouComanda = copie.AfisajPanouComanda;
        this.timer = copie.timer;
        this.putere = copie.putere;
        this.tensiune = copie.tensiune;
        this.frecventa = copie.frecventa;

    }

    @Override
    public String toString() {
        return super.toString() + "\n  Capacitate(l): " + capacitate + "\n  Tip curatare: " + TipCuratare + "\n  Timer: " + timer + "\n  Afisaj / Panou comanda: " + AfisajPanouComanda + "\n  Tip inchidere usa: " + TipInchidereUsa + "\n  Numar functii: " + NrFunctii + "\n  Functii: " + functii + "\n\n  Caracteristici tehnice\n  Putere: " + putere + " W\n  Tensiune: " + tensiune + " V\n  Frecventa: " + frecventa + " Hz\n\n  Garantie\n  Garantie comerciala persoane juridice: " + garantiePersoaneJuridice + " luni\n  Garantie de conformitate persoane fizice: " + garantiePersoaneFizice + " luni";
    }

}
