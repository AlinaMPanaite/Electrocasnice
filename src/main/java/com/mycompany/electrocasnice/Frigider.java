package electrocasnice;

import java.io.Serializable;

public class Frigider extends Electrocasnice implements Serializable {

    boolean hasFreezer;
    String sistemDeRacire;
    int numarCompresoare;
    String controlTemperatura;
    int nrRafturi;
    boolean dozatorApa;
    boolean cutieFructesiLegume;
    int nivelZgomot;

    public Frigider() {
        super();
        hasFreezer = false;
        sistemDeRacire = " ";
        numarCompresoare = 0;
        controlTemperatura = " ";
        nrRafturi = 0;
        dozatorApa = false;
        cutieFructesiLegume = false;
        nivelZgomot = 0;
    }

    Frigider(boolean hasFreezer, String sistemDeRacire, int numarCompresoare, String controlTemperatura, int nrRafturi, boolean dozatorApa, boolean cutieFructesiLegume, int nivelZgomot, String brand, String tip, String clasaEficientaEnergetica, String numeModel, String culoare, String functii, float capacitate, int recenziiTotal, float pret, float recenzii, String dimensiune, float greutate, int garantiePersoaneJuridice, int garantiePersoaneFizice) {
        super(tip, brand, numeModel, functii, capacitate, clasaEficientaEnergetica, pret, greutate, dimensiune, culoare, recenzii, recenziiTotal, garantiePersoaneJuridice, garantiePersoaneFizice);
        this.hasFreezer = hasFreezer;
        this.sistemDeRacire = sistemDeRacire;
        this.numarCompresoare = numarCompresoare;
        this.controlTemperatura = controlTemperatura;
        this.nrRafturi = nrRafturi;
        this.dozatorApa = dozatorApa;
        this.cutieFructesiLegume = cutieFructesiLegume;
        this.nivelZgomot = nivelZgomot;

    }

    public Frigider(Frigider copie) {
        super(copie);
        this.hasFreezer = copie.hasFreezer;
        this.sistemDeRacire = copie.sistemDeRacire;
        this.numarCompresoare = copie.numarCompresoare;
        this.controlTemperatura = copie.controlTemperatura;
        this.nrRafturi = copie.nrRafturi;
        this.dozatorApa = copie.dozatorApa;
        this.cutieFructesiLegume = copie.cutieFructesiLegume;
        this.nivelZgomot = copie.nivelZgomot;
    }

    String afisareConditie1(float p, boolean hF, int numarAparitii) {
        if (this.pret <= p && this.hasFreezer == hF) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    String afisareConditie2(String sdr1, int nc, int numarAparitii) {
        if (this.sistemDeRacire.equals(sdr1) && this.numarCompresoare == nc) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    String afisareConditie3(String ct, int nrraf, int numarAparitii) {
        if (this.controlTemperatura.equals(ct) && this.nrRafturi == nrraf) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + " \n  Tip: " + tip + " \n  Sistem de Racire:" + sistemDeRacire + " \n  Are congelator: " + hasFreezer + "\n  Numar compresoare: " + numarCompresoare + " \n  Control Temperatura: " + controlTemperatura + " \n  Numar de rafturi: " + nrRafturi + " \n  Dozator de apa: " + dozatorApa + " \n  Cutie Fructe si Legume: " + cutieFructesiLegume + " \n \n  Caracteristici tehnice " + " \n  Clasa Eficienta energetica: " + clasaEficientaEnergetica + " \n  Nivel zgomot(dB): " + nivelZgomot + " \n \n  Garantii" + " \n  Garantie comerciala persoane juridice: " + garantiePersoaneJuridice + " luni" + " \n  Garantie de conformitate persoane fizice: " + garantiePersoaneFizice + " luni\n";
    }

    public boolean isHasFreezer() {
        return hasFreezer;
    }

    public void setHasFreezer(boolean hasFreezer) {
        this.hasFreezer = hasFreezer;
    }

    public String getSistemDeRacire() {
        return sistemDeRacire;
    }

    public void setSistemDeRacire(String sistemDeRacire) {
        this.sistemDeRacire = sistemDeRacire;
    }

    public int getNumarCompresoare() {
        return numarCompresoare;
    }

    public void setNumarCompresoare(int numarCompresoare) {
        this.numarCompresoare = numarCompresoare;
    }

    public String getControlTemperatura() {
        return controlTemperatura;
    }

    public void setControlTemperatura(String controlTemperatura) {
        this.controlTemperatura = controlTemperatura;
    }

    public int getNrRafturi() {
        return nrRafturi;
    }

    public void setNrRafturi(int nrRafturi) {
        this.nrRafturi = nrRafturi;
    }

    public boolean isDozatorApa() {
        return dozatorApa;
    }

    public void setDozatorApa(boolean dozatorApa) {
        this.dozatorApa = dozatorApa;
    }

    public boolean isCutieFructesiLegume() {
        return cutieFructesiLegume;
    }

    public void setCutieFructesiLegume(boolean cutieFructesiLegume) {
        this.cutieFructesiLegume = cutieFructesiLegume;
    }

    public int getNivelZgomot() {
        return nivelZgomot;
    }

    public void setNivelZgomot(int nivelZgomot) {
        this.nivelZgomot = nivelZgomot;
    }
    
}
