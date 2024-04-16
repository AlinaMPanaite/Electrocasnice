package electrocasnice;

import java.io.Serializable;

/**
 *
 * @author Alexia
 */
public class MasinaDeSpalatVase extends Electrocasnice implements Serializable {

    int numarPrograme;
    String afisaj;
    int numarCosuri;
    String programator;
    String materialCuva;
    String programe;
    char clasaEficientaSpalare;
    char clasaEficientaUscare;
    String durataProgramEco; 
    int consumEnergetic;
    float consumApa;
    char clasaEmisieZgomot;
    int putere;

    MasinaDeSpalatVase() {
        super();
        numarPrograme = 0;
        afisaj = " ";
        numarCosuri = 0;
        programator = " ";
        materialCuva = " ";
        programe = " ";
        clasaEficientaSpalare = ' ';
        clasaEficientaUscare = ' ';
        durataProgramEco = " ";
        consumEnergetic = 0;
        consumApa = 0.0f;
        clasaEmisieZgomot = ' ';
        putere = 0;

    }

    MasinaDeSpalatVase(String tip, String brand, String numeModel, String functii, float capacitate, int numarPrograme, String clasaEficientaEnergetica, float pret, float greutate, String dimensiune, String culoare, String afisaj, int numarCosuri, String programator, String materialCuva, String programe, char clasaEficientaSpalare, char clasaEficientaUscare, String durataProgramEco, int consumEnergetic, float consumApa, char clasaEmisieZgomot, int putere, float recenzii, int recenziiTotal, int garantiePersoaneJuridice, int garantiePersoaneFizice) {
        super(tip, brand, numeModel, functii, capacitate, clasaEficientaEnergetica, pret, greutate, dimensiune, culoare, recenzii, recenziiTotal, garantiePersoaneJuridice, garantiePersoaneFizice);
        this.numarPrograme = numarPrograme;
        this.afisaj = afisaj;
        this.numarCosuri = numarCosuri;
        this.programator = programator;
        this.materialCuva = materialCuva;
        this.programe = programe;
        this.clasaEficientaSpalare = clasaEficientaSpalare;
        this.clasaEficientaUscare = clasaEficientaUscare;
        this.durataProgramEco = durataProgramEco;
        this.consumEnergetic = consumEnergetic;
        this.consumApa = consumApa;
        this.clasaEmisieZgomot = clasaEmisieZgomot;
        this.putere = putere;

    }

    public MasinaDeSpalatVase(MasinaDeSpalatVase copie) {
        super(copie);
        this.numarPrograme = copie.numarPrograme;
        this.afisaj = copie.afisaj;
        this.numarCosuri = copie.numarCosuri;
        this.programator = copie.programator;
        this.materialCuva = copie.materialCuva;
        this.programe = copie.programe;
        this.clasaEficientaSpalare = copie.clasaEficientaSpalare;
        this.clasaEficientaUscare = copie.clasaEficientaUscare;
        this.durataProgramEco = copie.durataProgramEco;
        this.consumEnergetic = copie.consumEnergetic;
        this.consumApa = copie.consumApa;
        this.clasaEmisieZgomot = copie.clasaEmisieZgomot;
        this.putere = copie.putere;
    }

    String afisareConditie1(float p, int ce, int numarAparitii) {
        if (this.pret <= p && this.consumEnergetic <= ce) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    String afisareConditie2(int nc, float r, int numarAparitii) {
        if (this.numarCosuri == nc && this.recenzii >= r) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    String afisareConditie3(String mc, String b, int numarAparitii) {
        if (this.materialCuva.equals(mc) && this.brand.equals(b)) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    public int getNumarPrograme() {
        return numarPrograme;
    }

    public void setNumarPrograme(int numarPrograme) {
        this.numarPrograme = numarPrograme;
    }

    public String getAfisaj() {
        return afisaj;
    }

    public void setAfisaj(String afisaj) {
        this.afisaj = afisaj;
    }

    public int getNumarCosuri() {
        return numarCosuri;
    }

    public void setNumarCosuri(int numarCosuri) {
        this.numarCosuri = numarCosuri;
    }

    public String getProgramator() {
        return programator;
    }

    public void setProgramator(String programator) {
        this.programator = programator;
    }

    public String getMaterialCuva() {
        return materialCuva;
    }

    public void setMaterialCuva(String materialCuva) {
        this.materialCuva = materialCuva;
    }

    public String getPrograme() {
        return programe;
    }

    public void setPrograme(String programe) {
        this.programe = programe;
    }

    public char getClasaEficientaSpalare() {
        return clasaEficientaSpalare;
    }

    public void setClasaEficientaSpalare(char clasaEficientaSpalare) {
        this.clasaEficientaSpalare = clasaEficientaSpalare;
    }

    public char getClasaEficientaUscare() {
        return clasaEficientaUscare;
    }

    public void setClasaEficientaUscare(char clasaEficientaUscare) {
        this.clasaEficientaUscare = clasaEficientaUscare;
    }

    public String getDurataProgramEco() {
        return durataProgramEco;
    }

    public void setDurataProgramEco(String durataProgramEco) {
        this.durataProgramEco = durataProgramEco;
    }

    public int getConsumEnergetic() {
        return consumEnergetic;
    }

    public void setConsumEnergetic(int consumEnergetic) {
        this.consumEnergetic = consumEnergetic;
    }

    public float getConsumApa() {
        return consumApa;
    }

    public void setConsumApa(float consumApa) {
        this.consumApa = consumApa;
    }

    public char getClasaEmisieZgomot() {
        return clasaEmisieZgomot;
    }

    public void setClasaEmisieZgomot(char clasaEmisieZgomot) {
        this.clasaEmisieZgomot = clasaEmisieZgomot;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    
    
    
    @Override
    public String toString() {
        return super.toString() + "\n  Tip: " + tip + "\n  Capacitate seturi vase: " + capacitate + "\n  Numar programe spalare: " + numarPrograme + "\n  Afisaj/Panou comanda: " + afisaj + "\n  Numar de cosuri: " + numarCosuri + "\n  Programator: " + programator + "\n  Material cuva: " + materialCuva + "\n  Programe: " + programe + "\n  Functii: " + functii + "\n\n  Caracteristici tehnice\n  Clasa eficienta energetica: " + clasaEficientaEnergetica + "\n  Clasa de eficienta la spalare: " + clasaEficientaSpalare + "\n  Clasa de eficienta la uscare: " + clasaEficientaUscare + "\n  Durata program Eco 40-60 (h:min): " + durataProgramEco + "\n  Consum energetic(kWh/100 cicluri): " + consumEnergetic + "\n  Consum de apa(l/ciclu): " + consumApa + "\n  Clasa emisie zgomot: " + clasaEmisieZgomot + "\n  Putere(W): " + putere + "\n\n  Garantie\n  Garantie comerciala persoane juridice: " + garantiePersoaneJuridice + " luni\n  Garantie de conformitate persoane fizice: " + garantiePersoaneFizice + " luni\n";
    }

}