package com.mycompany.electrocasnice;

public class Electrocasnice {
// Datele membre
    String brand;
    String tip;
    String clasaEficientaEnergetica;
    String numeModel;
    String culoare;
    String functii;
    float capacitate;
    int recenziiTotal;
    float pret;
    float recenzii;
    String dimensiune;
    float greutate;
    int garantiePersoaneJuridice, garantiePersoaneFizice;

public Electrocasnice() {
    // Constructorul fără argumente
    brand = " ";
    tip = " ";
    numeModel = " ";
    clasaEficientaEnergetica = " ";
    culoare = " ";
    capacitate = 0.0f;
    pret = 0.0f;
    functii = " ";
    recenzii = 0.0f;
    dimensiune = " ";
    recenziiTotal = 0;
    greutate = 0.0f;
    garantiePersoaneJuridice = 0;
    garantiePersoaneFizice = 0;
    }

public Electrocasnice(String tip, String brand, String numeModel, String functii, float capacitate, String clasaEficientaEnergetica, float pret, float greutate, String dimensiune, String culoare, float recenzii, int recenziiTotal, int garantiePersoaneJuridice, int garantiePersoaneFizice) {
    // Constructorul cu toate argumentele
    this.tip = tip;
    this.numeModel = numeModel;
    this.brand = brand;
    this.capacitate = capacitate;
    this.pret = pret;
    this.dimensiune = dimensiune;
    this.culoare = culoare;
    this.clasaEficientaEnergetica = clasaEficientaEnergetica;
    this.greutate = greutate;
    this.functii = functii;
    this.recenzii = recenzii;
    this.recenziiTotal = recenziiTotal;
    this.garantiePersoaneJuridice = garantiePersoaneJuridice;
    this.garantiePersoaneFizice = garantiePersoaneFizice;
    }

public Electrocasnice(Electrocasnice copie) {
    // Constructorul de copiere
    this.tip = copie.tip;
    this.numeModel = copie.numeModel;
    this.brand = copie.brand;
    this.capacitate = copie.capacitate;
    this.functii = copie.functii;
    this.clasaEficientaEnergetica = copie.clasaEficientaEnergetica;
    this.pret = copie.pret;
    this.dimensiune = copie.dimensiune;
    this.culoare = copie.culoare;
    this.greutate = copie.greutate;
    this.recenzii = copie.recenzii;
    this.recenziiTotal = copie.recenziiTotal;
    this.garantiePersoaneJuridice = copie.garantiePersoaneJuridice;
    this.garantiePersoaneFizice = copie.garantiePersoaneFizice;
    }

@Override
public String toString() {
    // rescrierea metodei toString pentru afișarea informațiilor 
    return tip + " " + brand + " " + numeModel + ", " + capacitate + " l, Clasa " + clasaEficientaEnergetica + ", " + culoare + " - " + pret + " lei \n  Recenzii: " + recenzii + " din 5 stele (" + recenziiTotal + " recenzii)\n\n  ---Specificatii--- \n  Caracteristici generale\n  Greutate: " + greutate + " kg\n  Culoare: " +culoare+ "\n  Dimensiuni (L x A x I cm): " + dimensiune;

    }
}
