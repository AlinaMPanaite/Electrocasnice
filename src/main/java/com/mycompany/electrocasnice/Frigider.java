package com.mycompany.electrocasnice;

public class Frigider extends Electrocasnice {

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

    Frigider(boolean freezer ,String sistemDeRacire, int numarCompresoare, String controlTemperatura, int nrRafturi, boolean dozatorApa, boolean cutieFructesiLegume, int nivelZgomot, String brand, String tip, String clasaEficientaEnergetica, String numeModel, String culoare, String functii, float capacitate, int recenziiTotal, float pret, float recenzii, String dimensiune, float greutate, int garantiePersoaneJuridice, int garantiePersoaneFizice) {
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

    @Override
    public String toString() {
        return super.toString() + " \n  Tip:" + tip + " \n  Sistem de Racire:" + sistemDeRacire + "Are congelator " + hasFreezer + "\n  Numar compresoare: " + numarCompresoare + " \n  Control Temperatura: " + controlTemperatura + " \n  Numar de rafturi: " + nrRafturi + " \n  Dozator de apa: " + dozatorApa + " \n  Cutie Fructe si Legume: " + cutieFructesiLegume + " \n \n  Caracteristici tehnice " + " \n  Clasa Eficienta energetica: " + clasaEficientaEnergetica + " \n  Nivel zgomot(dB): " + nivelZgomot + " \n \n  Garantii" + " \n  Garantie comerciala persoane juridice: " + garantiePersoaneJuridice + " luni" + " \n  Garantie de conformitate persoane fizice: " + garantiePersoaneFizice + " luni";
    }
}
