package com.mycompany.electrocasnice;

public class Congelator extends Electrocasnice {

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
        // this.clasaCongelator = clasaCongelator;
        this.sistemDeRacire = sistemDeRacire;
        this.numarCompresoare = numarCompresoare;
        this.controlTemperatura = controlTemperatura;
        this.nrRafturi = nrRafturi;
        // this.dozatorApa = dozatorApa;
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

    @Override
    public String toString() {
        return super.toString() + " \n  Tip:" + tip + " \n  Sistem de Racire:" + sistemDeRacire + "\n  Numar compresoare: " + numarCompresoare + " \n  Control Temperatura: " + controlTemperatura + " \n  Numar de rafturi: " + nrRafturi + " \n  Cutie Fructe si Legume: " + cutieFructesiLegume + " \n \n  Caracteristici tehnice " + " \n  Clasa Eficienta energetica: " + clasaEficientaEnergetica + " \n  Nivel zgomot(dB): " + nivelZgomot + " \n \n  Garantii" + " \n  Garantie comerciala persoane juridice: " + garantiePersoaneJuridice + " luni" + " \n  Garantie de conformitate persoane fizice: " + garantiePersoaneFizice + " luni";
    }
}
