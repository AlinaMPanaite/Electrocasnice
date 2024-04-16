package electrocasnice;

import java.io.Serializable;

/**
 *
 * @author Alina
 */
public class Cuptor extends Electrocasnice implements Serializable {

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

    Cuptor(String tip, String brand, String numeModel, String TipCuratare, float capacitate, String clasaEficientaEnergetica, String TipInchidereUsa, int NrFunctii, String functii, String AfisajPanouComanda, boolean timer, float putere, float tensiune, float frecventa, float pret, float greutate, String dimensiune, String culoare, float recenzii, int recenziiTotal, int garantiePersoaneJuridice, int garantiePersoaneFizice) {
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

    String afisareConditie(String c1, int d1, int numarAparitii) {
        if (this.brand.equals(c1) && this.capacitate >= d1) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    String afisare2Conditie(String c2, float d2, int numarAparitii) {
        if (this.culoare.equals(c2) && this.recenzii >= d2) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    String afisare3Conditie(String c3, int d3, int numarAparitii) {
        if (this.TipInchidereUsa.equals(c3) && this.NrFunctii >= d3) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    public String getTipCuratare() {
        return TipCuratare;
    }

    public void setTipCuratare(String TipCuratare) {
        this.TipCuratare = TipCuratare;
    }

    public String getTipInchidereUsa() {
        return TipInchidereUsa;
    }

    public void setTipInchidereUsa(String TipInchidereUsa) {
        this.TipInchidereUsa = TipInchidereUsa;
    }

    public int getNrFunctii() {
        return NrFunctii;
    }

    public void setNrFunctii(int NrFunctii) {
        this.NrFunctii = NrFunctii;
    }

    public String getAfisajPanouComanda() {
        return AfisajPanouComanda;
    }

    public void setAfisajPanouComanda(String AfisajPanouComanda) {
        this.AfisajPanouComanda = AfisajPanouComanda;
    }

    public boolean isTimer() {
        return timer;
    }

    public void setTimer(boolean timer) {
        this.timer = timer;
    }

    public float getPutere() {
        return putere;
    }

    public void setPutere(float putere) {
        this.putere = putere;
    }

    public float getTensiune() {
        return tensiune;
    }

    public void setTensiune(float tensiune) {
        this.tensiune = tensiune;
    }

    public float getFrecventa() {
        return frecventa;
    }

    public void setFrecventa(float frecventa) {
        this.frecventa = frecventa;
    }

    
    
    
    @Override
    public String toString() {
        return super.toString() + "\n  Capacitate(l): " + capacitate + "\n  Tip curatare: " + TipCuratare + "\n  Timer: " + timer + "\n  Afisaj / Panou comanda: " + AfisajPanouComanda + "\n  Tip inchidere usa: " + TipInchidereUsa + "\n  Numar functii: " + NrFunctii + "\n  Functii: " + functii + "\n\n  Caracteristici tehnice\n  Putere: " + putere + " W\n  Tensiune: " + tensiune + " V\n  Frecventa: " + frecventa + " Hz\n\n  Garantie\n  Garantie comerciala persoane juridice: " + garantiePersoaneJuridice + " luni\n  Garantie de conformitate persoane fizice: " + garantiePersoaneFizice + " luni\n";
    }

}