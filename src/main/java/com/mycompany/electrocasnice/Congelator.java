package electrocasnice;

public class Congelator extends Electrocasnice {
   private String clasaCongelator; // Parametrul specific clasei Frigider
    String sistemDeRacire;
    int numarCompresoare;
    String controlTemperatura;
    int nrRafturi;
    boolean dozatorApa;
    boolean cutieFructesiLegume;
    int nivelZgomot;
    
 public Congelator() {
        super(); // Apelează constructorul implicit din clasa de bază Electrocasnice
        clasaCongelator = " "; // Clasa frigiderului
        sistemDeRacire = " ";
        numarCompresoare = 0;
        controlTemperatura = " ";
        nrRafturi = 0;
        dozatorApa = false;
        cutieFructesiLegume = false;
        nivelZgomot = 0;
    }
    // Constructor pentru subclasa Frigider
    Congelator(String clasaCongelator, String sistemDeRacire, int numarCompresoare, String controlTemperatura, int nrRafturi, boolean dozatorApa, boolean cutieFructesiLegume, int nivelZgomot, String brand, String tip, String clasaEficientaEnergetic, String numeModel, String culoare, String functii, float capacitate, int recenziiTotal, float pret, float recenzii, String dimensiune, float greutate, int garantiePersoaneJuridice, int garantiePersoaneFizice) {
    super(tip, brand, numeModel, functii, capacitate, clasaEficientaEnergetic, pret, greutate, dimensiune, culoare, recenzii, recenziiTotal, garantiePersoaneJuridice, garantiePersoaneFizice);
        this.clasaCongelator = clasaCongelator;
        this.sistemDeRacire = sistemDeRacire;
        this.numarCompresoare = numarCompresoare;
        this.controlTemperatura = controlTemperatura;
        this.nrRafturi = nrRafturi;
        this.dozatorApa = dozatorApa;
        this.cutieFructesiLegume = cutieFructesiLegume;
        this.nivelZgomot = nivelZgomot;
    }
        
    public Congelator(Congelator copie) {
        super(copie); // Apelează constructorul de copiere din clasa de bază
        this.clasaCongelator = copie.clasaCongelator;
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
        return super.toString() + " Clasa Congelator: " + clasaCongelator + ", Sistem de racire: " + sistemDeRacire  + ", Numar compresoare: " + numarCompresoare + ", Control temperatura: " + controlTemperatura + ", Numar de rafturi: " + nrRafturi + ", Dozator de apa: " + dozatorApa + ", Cutie de Fructe si Legume: " + cutieFructesiLegume + ", Nivel Zgomot: " + nivelZgomot + "dB";
    }

}
