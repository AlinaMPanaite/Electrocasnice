package electrocasnice;

import java.io.Serializable;

public class Electrocasnice implements Serializable{
   

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getClasaEficientaEnergetica() {
        return clasaEficientaEnergetica;
    }

    public void setClasaEficientaEnergetica(String clasaEficientaEnergetica) {
        this.clasaEficientaEnergetica = clasaEficientaEnergetica;
    }

    public String getNumeModel() {
        return numeModel;
    }

    public void setNumeModel(String numeModel) {
        this.numeModel = numeModel;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getFunctii() {
        return functii;
    }

    public void setFunctii(String functii) {
        this.functii = functii;
    }

    public float getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(float capacitate) {
        this.capacitate = capacitate;
    }

    public int getRecenziiTotal() {
        return recenziiTotal;
    }

    public void setRecenziiTotal(int recenziiTotal) {
        this.recenziiTotal = recenziiTotal;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public float getRecenzii() {
        return recenzii;
    }

    public void setRecenzii(float recenzii) {
        this.recenzii = recenzii;
    }

    public String getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(String dimensiune) {
        this.dimensiune = dimensiune;
    }

    public float getGreutate() {
        return greutate;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    public int getGarantiePersoaneJuridice() {
        return garantiePersoaneJuridice;
    }

    public void setGarantiePersoaneJuridice(int garantiePersoaneJuridice) {
        this.garantiePersoaneJuridice = garantiePersoaneJuridice;
    }

    public int getGarantiePersoaneFizice() {
        return garantiePersoaneFizice;
    }

    public void setGarantiePersoaneFizice(int garantiePersoaneFizice) {
        this.garantiePersoaneFizice = garantiePersoaneFizice;
    }
    
    @Override
    public String toString() {
        return tip + " " + brand + " " + numeModel + ", Clasa " + clasaEficientaEnergetica + ", " + culoare + " - " + pret + " lei \n  Recenzii: " + recenzii + " din 5 stele (" + recenziiTotal + " recenzii)\n\n  ---Specificatii--- \n  Caracteristici generale\n  Greutate: " + greutate + " kg\n  Culoare: " + culoare + "\n  Dimensiuni (L x A x I cm): " + dimensiune;

    }
    
}
