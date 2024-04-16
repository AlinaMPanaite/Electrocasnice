package electrocasnice;

import java.io.Serializable;

/**
 *
 * @author Alexia
 */
public class MasinaDeSpalatRufe extends Electrocasnice implements Serializable {

    int vitezaCentrifugare;
    String afisaj;
    char clasaEficientaSpalare;
    char clasaEficientaStoarcere;
    char clasaEmisieZgomot;
    int numarPrograme;
    int programRapid;
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
        functiiPrespalare = " ";
        consumEnergie = 0;
        consumApa = 0;
        durataProgramEco = " ";
        putere = 0;

    }

    MasinaDeSpalatRufe(String tip, String brand, String numeModel, String functii, float capacitate, int vitezaCentrifugare, String clasaEficientaEnergetica, float pret, float greutate, String dimensiune, String culoare, String afisaj, char clasaEficientaSpalare, char clasaEficientaStoarcere, int numarPrograme, int programRapid, String programeSpalare, String functiiPrespalare, int consumEnergie, int consumApa, String durataProgramEco, char clasaEmisieZgomot, int putere, float recenzii, int recenziiTotal, int garantiePersoaneJuridice, int garantiePersoaneFizice) {
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

    String afisareConditie1(String b, int v, int numarAparitii) {
        if (this.brand.equals(b) && this.vitezaCentrifugare <= v) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    String afisareConditie2(float ca, int p, int numarAparitii) {
        if (this.capacitate >= ca && this.putere >= p) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    String afisareConditie3(String c, int np, int numarAparitii) {
        if (this.culoare.equals(c) && this.numarPrograme >= np) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    public int getVitezaCentrifugare() {
        return vitezaCentrifugare;
    }

    public void setVitezaCentrifugare(int vitezaCentrifugare) {
        this.vitezaCentrifugare = vitezaCentrifugare;
    }

    public String getAfisaj() {
        return afisaj;
    }

    public void setAfisaj(String afisaj) {
        this.afisaj = afisaj;
    }

    public char getClasaEficientaSpalare() {
        return clasaEficientaSpalare;
    }

    public void setClasaEficientaSpalare(char clasaEficientaSpalare) {
        this.clasaEficientaSpalare = clasaEficientaSpalare;
    }

    public char getClasaEficientaStoarcere() {
        return clasaEficientaStoarcere;
    }

    public void setClasaEficientaStoarcere(char clasaEficientaStoarcere) {
        this.clasaEficientaStoarcere = clasaEficientaStoarcere;
    }

    public char getClasaEmisieZgomot() {
        return clasaEmisieZgomot;
    }

    public void setClasaEmisieZgomot(char clasaEmisieZgomot) {
        this.clasaEmisieZgomot = clasaEmisieZgomot;
    }

    public int getNumarPrograme() {
        return numarPrograme;
    }

    public void setNumarPrograme(int numarPrograme) {
        this.numarPrograme = numarPrograme;
    }

    public int getProgramRapid() {
        return programRapid;
    }

    public void setProgramRapid(int programRapid) {
        this.programRapid = programRapid;
    }

    public String getProgrameSpalare() {
        return programeSpalare;
    }

    public void setProgrameSpalare(String programeSpalare) {
        this.programeSpalare = programeSpalare;
    }

    public String getFunctiiPrespalare() {
        return functiiPrespalare;
    }

    public void setFunctiiPrespalare(String functiiPrespalare) {
        this.functiiPrespalare = functiiPrespalare;
    }

    public int getConsumEnergie() {
        return consumEnergie;
    }

    public void setConsumEnergie(int consumEnergie) {
        this.consumEnergie = consumEnergie;
    }

    public int getConsumApa() {
        return consumApa;
    }

    public void setConsumApa(int consumApa) {
        this.consumApa = consumApa;
    }

    public String getDurataProgramEco() {
        return durataProgramEco;
    }

    public void setDurataProgramEco(String durataProgramEco) {
        this.durataProgramEco = durataProgramEco;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  Tip: " + tip + "\n  Capacitate spalare(kg): " + capacitate + "\n  Viteza centrifugare(rpm): " + vitezaCentrifugare + "\n  Clasa eficienta energetica: " + clasaEficientaEnergetica + "\n  Afisaj/Panou comanda: " + afisaj + "\n  Clasa eficienta spalare: " + clasaEficientaSpalare + "\n  Clasa eficienta la stoarcere: " + clasaEficientaStoarcere + "\n  Numar programe spalare: " + numarPrograme + "\n  Program rapid(min): " + programRapid + "\n  Programe spalare: " + programeSpalare + "\n  Functii prespalare: " + functiiPrespalare + "\n  Functii: " + functii + "\n\n  Caracteristici tehnice\n  Putere(W): " + putere + "\n  Consum energie(kWh/100 cicluri): " + consumEnergie + "\n  Consum de apa(l/ciclu): " + consumApa + "\n  Durata program Eco 40-60 (h:min): " + durataProgramEco + "\n  Clasa emisie zgomot: " + clasaEmisieZgomot + "\n\n  Garantie\n  Garantie comerciala persoane juridice: " + garantiePersoaneJuridice + " luni\n  Garantie de conformitate persoane fizice: " + garantiePersoaneFizice + " luni\n";
    }
}