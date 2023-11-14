package com.mycompany.electrocasnice;

/**
 *
 * @author Alexia
 */
public class MasinaDeSpalatRufe extends Electrocasnice {

    int vitezaCentrifugare;
    String afisaj;
    char clasaEficientaSpalare;
    char clasaEficientaStoarcere;
    char clasaEmisieZgomot;
    int numarPrograme;
    int  programRapid;
    String programeSpalare;
    String functiiPrespalare;
    int consumEnergie;
    int consumApa;
    String durataProgramEco;
    int putere;
    
    MasinaDeSpalatRufe() {
        super();
        vitezaCentrifugare = 0;
        afisaj = " ";
        clasaEficientaSpalare = ' ';
        clasaEficientaStoarcere = ' ';
        clasaEmisieZgomot = ' ';
        numarPrograme = 0;
        programRapid = 0;
        programeSpalare = " ";
        functiiPrespalare = " " ;
        consumEnergie = 0;
        consumApa = 0;
        durataProgramEco= " ";
        putere = 0;

    }

    MasinaDeSpalatRufe(String tip, String brand, String numeModel, String functii, float capacitate, int vitezaCentrifugare, String clasaEficientaEnergetica, float pret, float greutate, String dimensiune, String culoare, String afisaj, char clasaEficientaSpalare, char clasaEficientaStoarcere, int numarPrograme, int programRapid, String programeSpalare, String functiiPrespalare, int consumEnergie, int consumApa, String durataProgramEco, char clasaEmisieZgomot, int putere, float recenzii, int recenziiTotal, int garantiePersoaneJuridice, int garantiePersoaneFizice) {
// super = apel către constructorul clasei părinte (constructorul superclasei)    
        super(tip, brand, numeModel, functii, capacitate, clasaEficientaEnergetica, pret, greutate, dimensiune, culoare, recenzii, recenziiTotal, garantiePersoaneJuridice, garantiePersoaneFizice);
        this.vitezaCentrifugare = vitezaCentrifugare;
        this.afisaj = afisaj;
        this.clasaEficientaSpalare = clasaEficientaSpalare;
        this.clasaEficientaStoarcere = clasaEficientaStoarcere;
        this.clasaEmisieZgomot = clasaEmisieZgomot;
        this.numarPrograme = numarPrograme;
        this.programRapid = programRapid;
        this.programeSpalare = programeSpalare;
        this.functiiPrespalare = functiiPrespalare;
        this.consumEnergie = consumEnergie;
        this.consumApa = consumApa;
        this.durataProgramEco = durataProgramEco;
        this.putere = putere;

    }

    public MasinaDeSpalatRufe(MasinaDeSpalatRufe copie) {
        // Constructorul de copiere
        super(copie);
        this.vitezaCentrifugare = copie.vitezaCentrifugare;
        this.afisaj = copie.afisaj;
        this.clasaEficientaSpalare = copie.clasaEficientaSpalare;
        this.clasaEficientaStoarcere = copie.clasaEficientaStoarcere;
        this.clasaEmisieZgomot = copie.clasaEmisieZgomot;
        this.numarPrograme = copie.numarPrograme;
        this.programRapid = copie.programRapid;
        this.programeSpalare = copie.programeSpalare;
        this.functiiPrespalare = copie.functiiPrespalare;
        this.consumEnergie = copie.consumEnergie;
        this.consumApa = copie.consumApa;
        this.durataProgramEco = copie.durataProgramEco;
        this.putere = copie.putere;

    }
        
    @Override
    public String toString() {
        return super.toString() + "\n  Tip: " + tip + "\n  Capacitate spalare(kg): " + capacitate + "\n  Viteza centrifugare(rpm): " + vitezaCentrifugare + "\n  Clasa eficienta energetica: " + clasaEficientaEnergetica + "\n  Afisaj/Panou comanda: " + afisaj + "\n  Clasa eficienta spalare: " + clasaEficientaSpalare + "\n  Clasa eficienta la stoarcere: " + clasaEficientaStoarcere + "\n  Numar programe spalare: " + numarPrograme + "\n  Program rapid(min): " + programRapid + "\n  Programe spalare: " + programeSpalare + "\n  Functii prespalare: " + functiiPrespalare + "\n  Functii: " + functii + "\n\n  Caracteristici tehnice\n  Putere(W): " + putere + "\n  Consum energie(kWh/100 cicluri): " + consumEnergie + "\n  Consum de apa(l/ciclu): " + consumApa + "\n  Durata program Eco 40-60 (h:min): " + durataProgramEco + "\n  Clasa emisie zgomot: " + clasaEmisieZgomot + "\n\n  Garantie\n  Garantie comerciala persoane juridice: " + garantiePersoaneJuridice + " luni\n  Garantie de conformitate persoane fizice: " + garantiePersoaneFizice + " luni";
    }
}
