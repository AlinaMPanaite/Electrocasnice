package electrocasnice;

import java.io.Serializable;

public class Congelator extends Electrocasnice implements Serializable {

    String sistemDeRacire;
    int numarCompresoare;
    String controlTemperatura;
    int nrRafturi;
    boolean cutieFructesiLegume;
    int nivelZgomot;

    public Congelator() {
        super();
        sistemDeRacire = " ";
        numarCompresoare = 0;
        controlTemperatura = " ";
        nrRafturi = 0;
        cutieFructesiLegume = false;
        nivelZgomot = 0;
    }

    Congelator(String sistemDeRacire, int numarCompresoare, String controlTemperatura, int nrRafturi, boolean cutieFructesiLegume, int nivelZgomot, String brand, String tip, String clasaEficientaEnergetica, String numeModel, String culoare, String functii, float capacitate, int recenziiTotal, float pret, float recenzii, String dimensiune, float greutate, int garantiePersoaneJuridice, int garantiePersoaneFizice) {
        super(tip, brand, numeModel, functii, capacitate, clasaEficientaEnergetica, pret, greutate, dimensiune, culoare, recenzii, recenziiTotal, garantiePersoaneJuridice, garantiePersoaneFizice);
        this.sistemDeRacire = sistemDeRacire;
        this.numarCompresoare = numarCompresoare;
        this.controlTemperatura = controlTemperatura;
        this.nrRafturi = nrRafturi;
        this.cutieFructesiLegume = cutieFructesiLegume;
        this.nivelZgomot = nivelZgomot;
    }

    public Congelator(Congelator copie) {
        super(copie);
        this.sistemDeRacire = copie.sistemDeRacire;
        this.numarCompresoare = copie.numarCompresoare;
        this.controlTemperatura = copie.controlTemperatura;
        this.nrRafturi = copie.nrRafturi;
        this.cutieFructesiLegume = copie.cutieFructesiLegume;
        this.nivelZgomot = copie.nivelZgomot;
    }

    String afisareConditie1(String sdr, boolean cfl, int numarAparitii) {
        if (this.sistemDeRacire.equals(sdr) && this.cutieFructesiLegume == cfl) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    String afisareConditie2(String ct1, int nc1, int numarAparitii) {
        if (this.controlTemperatura.equals(ct1) && this.numarCompresoare == nc1) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    String afisareConditie3(float nz, int nrraf, int numarAparitii) {
        if (this.nivelZgomot <= nz && this.nrRafturi == nrraf) {
            return (numarAparitii + "." + this.toString() + "\n");
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + " \n  Tip: " + tip + " \n  Sistem de Racire:" + sistemDeRacire + "\n  Numar compresoare: " + numarCompresoare + " \n  Control Temperatura: " + controlTemperatura + " \n  Numar de rafturi: " + nrRafturi + " \n  Cutie Fructe si Legume: " + cutieFructesiLegume + " \n \n  Caracteristici tehnice " + " \n  Clasa Eficienta energetica: " + clasaEficientaEnergetica + " \n  Nivel zgomot(dB): " + nivelZgomot + " \n \n  Garantii" + " \n  Garantie comerciala persoane juridice: " + garantiePersoaneJuridice + " luni" + " \n  Garantie de conformitate persoane fizice: " + garantiePersoaneFizice + " luni\n";
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