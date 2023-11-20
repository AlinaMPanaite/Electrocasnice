package electrocasnice;

public class Frigider extends Electrocasnice {
    private String clasaFrigider; // Parametrul specific clasei Frigider
    private boolean hasFreezer;
    String sistemDeRacire;
    int numarCompresoare;
    String controlTemperatura;
    int nrRafturi;
    boolean dozatorApa;
    boolean cutieFructesiLegume;
    int nivelZgomot;
            
    
     public Frigider() {
        super(); // Apelează constructorul implicit din clasa de bază Electrocasnice
        clasaFrigider = " "; // Clasa frigiderului
        hasFreezer = false; // Dacă are congelator sau nu
        sistemDeRacire = " ";
        numarCompresoare = 0;
        controlTemperatura = " ";
        nrRafturi = 0;
        dozatorApa = false;
        cutieFructesiLegume = false;
        nivelZgomot = 0;
    }

    Frigider(String clasaFrigider, boolean hasfreezer, String sistemDeRacire, int numarCompresoare, String controlTemperatura, int nrRafturi, boolean dozatorApa, boolean cutieFructesiLegume, int nivelZgomot, String brand, String tip, String clasaEficientaEnergetic, String numeModel, String culoare, String functii, float capacitate, int recenziiTotal, float pret, float recenzii, String dimensiune, float greutate, int garantiePersoaneJuridice, int garantiePersoaneFizice) {
    super(tip, brand, numeModel, functii, capacitate, clasaEficientaEnergetic, pret, greutate, dimensiune, culoare, recenzii, recenziiTotal, garantiePersoaneJuridice, garantiePersoaneFizice);
        this.clasaFrigider = clasaFrigider;
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
        super(copie); // Apelează constructorul de copiere din clasa de bază
        this.clasaFrigider = copie.clasaFrigider;
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
        return super.toString() + " Clasa Frigider: " + clasaFrigider + "\n Sistem de racire: " + sistemDeRacire + "\n Congelator: " + hasFreezer + "\n Numar compresoare: " + numarCompresoare + "\n Control temperatura: " + controlTemperatura + "\n Numar de rafturi: " + nrRafturi + "\n Dozator de apa: " + dozatorApa + "\n Cutie de Fructe si Legume: " + cutieFructesiLegume + "\n Nivel Zgomot: " + nivelZgomot + "dB";
    }
}
