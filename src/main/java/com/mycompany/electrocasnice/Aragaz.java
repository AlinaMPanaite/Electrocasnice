package com.mycompany.electrocasnice;

/**
 *
 * @author Alina
 */
public class Aragaz extends Electrocasnice {

    int numar_arzatoare;
    String tipAlimentare;
    boolean rotisor, grill;
    String tipPlita;
    String tipCuptor;
    String Autocuratare;
    float putere;
    float tensiune;

    Aragaz() {
        super();
        numar_arzatoare = 0;
        tipAlimentare = " ";
        rotisor = false;
        grill = false;
        tipPlita = " ";
        tipCuptor = " ";
        Autocuratare = " ";
        putere = 0.0f;
        tensiune = 0.0f;

    }

    Aragaz(String tip, String brand, String numeModel, int numar_arzatoare, String tipAlimentare, String tipPlita, String tipCuptor, String Autocuratare, boolean rotisor, boolean grill, String functii, float capacitate, String clasaEficientaEnergetica, float putere, float tensiune, float pret, float greutate, String dimensiune, String culoare, float recenzii, int recenziiTotal, int garantiePersoaneJuridice, int garantiePersoaneFizice) {
        super(tip, brand, numeModel, functii, capacitate, clasaEficientaEnergetica, pret, greutate, dimensiune, culoare, recenzii, recenziiTotal, garantiePersoaneJuridice, garantiePersoaneFizice);
        this.numar_arzatoare = numar_arzatoare;
        this.tipAlimentare = tipAlimentare;
        this.rotisor = rotisor;
        this.grill = grill;
        this.tipPlita = tipPlita;
        this.tipCuptor = tipCuptor;
        this.Autocuratare = Autocuratare;
        this.putere = putere;
        this.tensiune = tensiune;

    }

    public Aragaz(Aragaz copie) {
        super(copie);
        this.numar_arzatoare = copie.numar_arzatoare;
        this.tipAlimentare = copie.tipAlimentare;
        this.rotisor = copie.rotisor;
        this.grill = copie.grill;
        this.tipPlita = copie.tipPlita;
        this.tipCuptor = copie.tipCuptor;
        this.Autocuratare = copie.Autocuratare;
        this.putere = copie.putere;
        this.tensiune = copie.tensiune;

    }

    @Override
    public String toString() {
        return super.toString() + "\n  Capacitate(l): " + capacitate + "\n  Tip alimentare: " + tipAlimentare + "\n  " + numar_arzatoare + " arzatoare" + " \n  Rotisor: " + rotisor + "\n  Grill: " + grill + "\n  Tip plita: " + tipPlita + "\n  Tip cuptor " + tipCuptor + "\n  Autocuratare: " + Autocuratare + "\n  Functii: " + functii + "\n\n  Caracteristici tehnice\n  Putere: " + putere + " W\n  Tensiune: " + tensiune + " V\n\n  Garantie\n  Garantie comerciala persoane juridice: " + garantiePersoaneJuridice + " luni\n  Garantie de conformitate persoane fizice: " + garantiePersoaneFizice + " luni";
    }
}
