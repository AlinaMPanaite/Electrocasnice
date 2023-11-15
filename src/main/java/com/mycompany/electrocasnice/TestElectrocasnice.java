package com.mycompany.electrocasnice;

//import java.lang.String;
import java.util.Scanner;
//alinuca
public class TestElectrocasnice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("  -------------------------------------------------Buna ziua! Ce produs ati dori sa achizitionati?-----------------------------------------------------------------");

        //instantele
        Aragaz a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Cuptor c0, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
        MasinaDeSpalatRufe r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10;
        //MasinaDeSpalatVase v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10;

        //lista cu produsele disponibile
        String[] vectorElectrocasnice = {"  1-Aragaz\n", "  2-Cuptor\n", "  3-Masina de spalat rufe\n", "  4-Masina de spalat vase\n", "  5-Frigider\n", "  6-Congelator\n"};
        System.out.println("");

        //afisarea produselor de mai sus
        for (String electrocasnice : vectorElectrocasnice) {
            System.out.print(electrocasnice + "");
        } // v[i]
        System.out.println("");

        //folosim constructorul cu parametri pentru a atribui valori instantelor (a1, a2.., c1, c2.. etc)
        a1 = new Aragaz("Aragaz", "GORENJE ", "GG5A11SJ", 4, "gaz", "gaz", "gaz", "fara autocuratare", false, false, "Ghidaje ambutisate, Usa Ultra Rece", 70, "A", 1.080f, 0.0f, 1249f, 36.2f, "50 x 59.4 x 85", "gri", 4.74f, 19, 12, 24);
        a2 = new Aragaz("Aragaz", "BEKO", "FSM62530DXMS", 4, "mixta (Gaz + Electric)", "gaz", "electric", "catalitica", false, true, "High efficiency gas burner, Gratar din fonta, 3D Cooking, Gatire asistata cu ventilatie", 72, "A", 2.400f, 220f, 1.599f, 56.4f, "60 x 60 x 85", "negru-inox", 4.59f, 66, 12, 24);
        a3 = new Aragaz("Aragaz", "ELECTROLUX", "LKR564201K", 4, "electric", "vitroceramica", "electric", "catalitica", false, true, "SteamBake, AirFry", 58, "A", 8605.5f, 230, 1.399f, 44f, "50 x 60 x 85.8", "negru", 4.25f, 4, 12, 24);
        a4 = new Aragaz("Aragaz", "ZANUSSI", "ZCK57201BA", 4, "mixta (Gaz + Electric)", "gaz", "electric", "fara autocuratare", false, true, "Variatie temperatura: 50°C - 250°C", 54, "A", 2045.6f, 230f, 1.599f, 41f, "50 x 60 x 85.5", "negru", 5, 5, 12, 24);
        a5 = new Aragaz("Aragaz", "ZANUSSI", "ZCG612K1BA", 4, "gaz", "gaz", "gaz", "catalitica", true, true, "Temperatura variabila: 50 - 250°C", 59, "A", 0.0f, 230f, 1.699f, 41f, "60 x 60 x 85.7", "negru", 5f, 7, 12, 24);
        a6 = new Aragaz("Aragaz", "VORTEX", "VAG9060SS01V", 5, "mixta (Gaz + Electric)", "gaz", "electric", "fara autocuratare", false, true, "Plita: Aprindere electrica; Cuptor: Usa detasabila, Temporizator mecanic, Iluminare cuptor; Alte functii: Picioare ajustabile", 105, "A", 0.0f, 220f, 2.499f, 67, "90 x 60 x 85", "inox", 5, 2, 12, 24);
        a7 = new Aragaz("Aragaz", "HANSA", "FCIWS59363", 4, "electric", "inductie", "electric", "abur", false, true, "Indicator caldura reziduala, Child lock, Fierbere automata, Mentinere caldura, Detectare obiecte mici, Detectare supraincalzire, Detectare scurgere, Limitare temperatura, Sertar pe ghidaje cu role", 65, "A", 10.500f, 315f, 2.389f, 39f, "50 x 60 x 85", "alb", 4.5f, 2, 12, 24);
        a8 = new Aragaz("Aragaz", "ELECTROLUX", "LKM520000X", 4, "mixta (Gaz + Electric)", "gaz", "electric", "fara autocuratare", false, true, "Temperatura reglabila 50 - 250°C", 54, "A", 3345.6f, 230f, 1.899f, 41.2f, "50 x 60 x 87.7", "inox", 4.36f, 28, 12, 24);
        a9 = new Aragaz("Aragaz", "ELECTROLUX", "LKG604003X", 4, "gaz", "gaz", "gaz", "catalitica", true, true, "Temperatura variabila: 50°C - 250°C", 59, "A", 0.0f, 230, 2.049f, 43f, "60 x 60 x 85.7", "inox", 5, 4, 12, 24);
        a10 = new Aragaz("Aragaz", "GORENJE", "GEC6C61BMB", 4, "electric", "vitroceramica", "electric", "AquaClean", false, true, "ExtraSteam, Afisaj IconLed", 71, "A", 10200f, 220f, 2.799f, 49.5f, "60 x 60 x 85", "negru", 4.88f, 4, 12, 24);

        c1 = new Cuptor("Cuptor incorporabil electric", "GORENJE", "BPS6737E14X", "pirolitica", 73, "A+", "amortizata", 13, "Forma HomeMade; Racire DC+; SuperSize; PizzaFunction; StepBake; GentleBake; FastPreheat; AirFry; FrozenBake; Gratin; SteamAssist", "IconLed", true, 3500f, 220f, 50f, 1.172f, 39.5f, "59.5 x 56.4 x 59.5", "alb", 5f, 3, 24, 24);
        c2 = new Cuptor("Cuptor incorporabil electric ", "BEKO ", "BBIS13300XMSE", "catalitica", 72, "A+", "amortizata", 9, "Iluminare interioara; Inchidere SoftClose; AEROperfect; Autocurataree SteamShine; Functii gatire: 3D Cooking; Pastrare la cald; Gatire conventionala; Grill; Dezghetare; Incalzire inferioara; Incalzire ventilata Eco; Incalzire ventilata", "LED Touch Control + Butoane", true, 0.0f, 220f, 50f, 1.098f, 31.3f, "59.4 x 56.7 x 59.5", "negru", 4.74f, 19, 12, 24);
        c3 = new Cuptor("Cuptor incorporabil cu gaz", "ELECTROLUX", "EOG2102AOX", "catalitica", 68, "A+", "standard", 7, "Inox antiamprente; curataree catalitica; Semnal sonor; Avertizare sfarsit de program; Cuptor cu rotisor; Incalzire jos; Dezghetare; Gril; Gril cu rotisor; Gatire usoara (light)", "mecanic", false, 1770f, 220f, 50f, 1.699f, 30.9f, "59.4 x 56.9 x 59.4", "inox", 4.68f, 72, 12, 24);
        c4 = new Cuptor("Cuptor incorporabil electric", "WHIRLPOOL", " AKZM 8480 S", "pirolitica", 73, "A+", "amortizata", 0, "Tehnologia Al 6-lea Simt; curataree Piroliza; Inchidere amortizata a usii; Ready2Cook; Gatire pe 3 niveluri; Rafturi glisante; Ventilator turbo; Turbo Grill; Coacere Maxi; Iluminare interioara", "LED / Mecanic + Electronic", false, 3650f, 220f, 55f, 1.999f, 39.5f, "59.5 x 56.4 x 59.5", "argintiu", 4.65f, 82, 24, 24);
        c5 = new Cuptor("Cuptor incorporabil electric", "BEKO", "BBIM13300ZGCSE", "autocuratare SteamShine", 72, "A+", "amortizata", 9, "Inchidere SoftClose; Iluminare interioara cu halogen; AEROperfect; Autocurataree Steamshine; Functii gatire: Gatire 3D; Gatire conventionala; Gatire cu ventilare; Grill; Low grill cu ventilare; Dezghetare; Incalzire inferioara; Incalzire ventilata", "LED Touch Control + Mecanic", true, 0.0f, 220f, 50f, 1.499f, 34.9f, "59.4 x 56.7 x 59.5", "gri inchis", 5, 16, 12, 24);
        c6 = new Cuptor("Cuptor incorporabil electric", "ELECTROLUX", "EOA9S31CX", "fara autocuratare", 70, "A++", "standard", 0, "	Indicator caldura reziduala; Cuptor cu afisaj in mai multe limbi; Lumina halogen cuptor; Au gratin; Incalzire jos; Coacere paine; Gatire conventionala / traditionala; Dezghetare; Dospire; Uscare; Alimente congelate; Complet abur; Grill; Umiditate ridicata; Umiditate scazuta; Umiditate medie; Mentinere la cald; Coacere umeda cu ventilatie; Setare pizza; Incalzire platou; Conservare alimente; Gatire inceata; Gatire sous vide; Regenerare cu abur; Steamify; Gatire cu ventilatie; Grill turbo; Functie iaurt; Functie pentru siguranta copii; Functie de prelungire a timpului", "Touch control", true, 3500f, 230f, 55f, 7.299f, 40.5f, "59.5 x 56.7 x 59.4", "negru", 5, 19, 12, 24);
        c7 = new Cuptor("Cuptor incorporabil cu gaz ", "BEKO", "BIG12100X", "fara autocuratare", 66, "A", "standard", 5, "Siguranta flacara la cuptor, Aprindere integrata, Grill, Recycled Net", "Mecanic", true, 0.0f, 0.0f, 0.0f, 1.599f, 31.9f, "59.4 x 56.7 x 59.5", "inox", 4.65f, 3, 24, 24);
        c8 = new Cuptor("Cuptor incorporabil cu gaz", "ELECTROLUX", "EOG2102AOK", "catalitica", 68, "A+", "standard", 4, "Incalzire jos, Dezghetare, Grill, Grill cu rotisor, Semnal sonor, Avertizare sfarsit de program, Iluminare, Aprindere electrica, Termocuplu pentru siguranta cuptor", "Mecanic", true, 1770f, 230f, 55f, 2.231f, 31.1f, "59.4 x 56.9 x 59.4", "negru", 5, 2, 24, 2);
        c9 = new Cuptor("Cuptor incorporabil electric", "ELECTROLUX", "AKZ9 6230 NB", "catalitica", 73, "A+", "amortizata", 16, "Al 6-lea simt cu retete pre-setate; Ventilator Turbo; Iluminare; Preincalzire rapida; Coacere conventionala; Decongelare; Pre-incalzire rapida; Pizza/Paine; Maxi cooking; Ready2Cook; Cook3; Grill; Turbo grill; Aer fortat; Functie Turbo Grill; Coacere Maxi; Functie Produse de patiserie; Retete preferate", "Digital", true, 3650f, 230f, 55f, 1.826f, 33f, "60 x 54 x 60", "negru", 4.67f, 48, 24, 24);
        c10 = new Cuptor("Cuptor incorporabil electric", "GORENJE", "BO6737E02XK", "hidrolitica", 77, "A", "standard", 13, "Forma HomeMade; Racire DC+; SuperSize; PizzaFunction; StepBake; GentleBake; FastPreheat; AirFry; FrozenBake; Gratin", "IconLed", true, 3500f, 230f, 55f, 1.599f, 31f, "62 x 67.5 x 66", "inox", 4.9f, 21, 12, 24);

        
        r1 = new MasinaDeSpalatRufe("Masina de spalat rufe frontala", "BOSCH", "WAN24167BY", "Child lock, Functie reincarcare, Night Wash, Reminder curatare tambur, Pornire intarziata, Control balans", 8, 1200, "C", 1793.92f, 67.6f, "59.8 x 55 x 84.8", "Alb", "LCD / Touch", 'A', 'B', 15, 15, "Bumbac, Sintetice, Delicate, Super 15'/30', Lana/Spalare manuala, Camasi/Bluze, Sport, Rapid/Mix, Dark wash, Hygiene Plus, Curatare tambur, Night Wash, Centrifugare+Evacuare", "Da", 62, 47, "3:26", 'A', 2300, 4.94f, 16, 12, 24);
        r2 = new MasinaDeSpalatRufe("Masina de spalat rufe frontala", "LG", "F4WV509S2TE", "Pornire intarziata (3-19 h), Child Lock, Doar centrifugare, Start/ Pauza, Alarma eroare, Auto Restart, Semnal sonor pornire/oprire", 9, 1400, "B", 2519.91f, 70, "60 x 56.5 x 85", "Argintiu", "LED/Touch control", 'A', 'B', 14, 59, "Bumbac, Eco 40-60, Mix (Mixed Fabric), Easy Care, Duvet, Tub Clean, Allergy Care, Baby Steam Care, Turbo Wash 59, Sports Wear, Rapid 14', Delicate, Hand / Wool", "Da", 58, 50, "3:48", 'A', 1850, 5, 2, 12, 24);   
        r3 = new MasinaDeSpalatRufe ("Masina de spalat rufe verticala", "INDESIT", "BTWB7220PEU/N", "Pornire intarziata, Reglare temperatura, Viteza centrifugare, Clatire Intensiva, Optiune energy saver, Calcare usoara", 7, 1200, "E", 1799.90f, 57, "40 x 60 x 90", "Alb", "Digital", 'A', 'C', 15, 15, "Turn & Go, Sintetice, Bumbac, Eco 40-60, Mix 45 min, Articole Sport, 20C, Lana 20, Delicate 30, Colorate 40, Bumbac 30, Sintetice 30, Centrifugare + Evacuare, Clatire + Centrifugare, Eco Bumbac", "Da", 78, 45, "03:25", 'C', 2100, 4.33f, 30, 12, 24);
        r4 = new MasinaDeSpalatRufe ("Masina de spalat rufe frontala", "GORENJE", "WNEI74AS", "Protectie la inundatii, Protectie acces copii, Senzor incarcare, Senzor spuma, Senzor nivel apa, Senzor temperatura", 7, 1400, "A", 1948.90f, 65.1f, "60 x 54.5 x 85", "Alb", "LED / Electronic", 'A', 'B', 16, 20, "Bumbac, Program de spalare manual/Lana, Mix/Sintetice, Pets, ExtraHygiene, Haine pentru bebelusi, Daily wash, Program Eco 40-60°C, Rapid 20', PowerWash 59', Program pentru lenjerie, Program pentru uscarea camasilor, SterilTub, Spin/drain, Clatire/Inmuiere", "Da", 45, 45,"3:01", 'B', 1900, 4.6f, 30, 12, 24);
        r5 = new MasinaDeSpalatRufe ("Masina de spalat rufe incorporabila", "WHIRLPOOL", "BI WMWG 81484E", "Siguranta copii, Pornire intarziata, Sistem protectie inundatii", 8, 1400, "C", 2349.90f, 66.5f, "59.5 x 54.5 x 81.5", "Alb", "Digital", 'C', 'B', 14, 14, "Mix, Rufe albe, Bumbac, Eco 40-60, Articole sport, Plapumi, 20 C, Centrifugare & evacuare, Clatire & Evacuare, Rapid 30 min, Colours 15, Lana, Delicate, Sintetice, Eco Bumbac", "Da", 63, 48, "03:30", 'A', 1850, 4.64f, 11, 24, 24);
        r6 = new MasinaDeSpalatRufe ("Masina de spalat rufe incorporabila", "BEKO", "WITV8712X0W", "DrumClean, Clatire suplimentara, Spalare rapida, Child lock, Sistem automat de reglare al consumului de apa, Sistem control exces apa, Sistem electronic de control al balansului, Afisare timp spalare ramas", 8, 1400, "C", 1462.92f, 71, "60 x 57 x 82", "Alb", "Display / Electronic", 'C', 'B', 15, 15, "Down Wear, Dark Care, Shirts, Sports, Hygiene 20°C, Woollens, Daily Xpress/Xpress Super Short, Mix 40°C, Spalare manuala, Bumbac, Bumbac Eco, Sintetice, Stoarcere si evacuare, Clatire, Lingerie", "Da", 62, 41, "3:38", 'B', 2200, 4, 16, 12, 24);
        r7 = new MasinaDeSpalatRufe ("Masina de spalat rufe verticala", "ELECTROLUX", "PerfectCare700 EW7TN3272", "Pete, Clatire suplimentara, Soft Plus, Steam Plus, Start/Pauza", 6, 1200, "B", 2091.31f, 59, "40 x 60 x 89", "Alb", "LCD", 'B', 'B', 14, 14, "Pornit/Oprit, Eco 40-60, Bumbac, Sintetice, Delicate, Abur, Abur pentru casmir, Centrifugare/Evacuare, Clatire, Articole bebelusi, Rapid 14 min, AntiAllergy, Jachete, Denim, Lana/Matase", "Da", 48, 43, "03:15", 'C', 2200, 4.73f, 11, 12, 24);
        r8 = new MasinaDeSpalatRufe ("Masina de spalat rufe frontala", "ARCTIC", "APL81223XLAB", "Rapid+, Clatire suplimentara, Antisifonare, Drum Clean cu Extra Steam, Child Lock, Add-In, Amanare pornire, Afisare timp ramas", 8, 1200, "C", 1969.90f, 68, "60 x 55 x 84", "Antracit", "LED", 'C', 'B', 14, 14, "Bumbac, Eco 40-60, Sintetice, Spalare rapida 14', Mixt, Lana, Materiale delicate, Camasi, Geci cu puf, Antialergic+, Anti-pete, Articole iarna, Jeans/ Culori inchise, Clatire, Stoarcere/ Evacuare", "Da", 62, 38, "3:38", 'B', 2200, 5, 5, 12, 24 );
        r9 = new MasinaDeSpalatRufe ("Masina de spalat rufe frontala", "Samsung", "WW80T4540AX/LE", "Child Lock, Pornire intarziata, Drum Clean, Tambur 2nd Diamond, Prespalare, Rinse+, Smart Check, Sertar StayClean, Steam", 8, 1400, "D", 1899.90f, 68, "60 x 55 x 85", "inox", "LED / Mecanic", 'C', 'B', 12, 15, "Sintetice, Clatire + Centrifugare, Mixte, Hygiene Steam, Drum Clean, Denim, Colorate, Bumbac, Lenjerii de pat, Rapid 15', Eco 40-60", "Da", 73, 48, "03:38", 'A', 1900, 5, 9, 12,24);
        r10 = new MasinaDeSpalatRufe ("Masina de spalat rufe incorporabila", "BEKO", "WITV8712X0W", "DrumClean, Clatire suplimentara, Spalare rapida, Child lock, Sistem automat de reglare al consumului de apa, Sistem control exces apa, Sistem electronic de control al balansului, Afisare timp spalare ramas", 8, 1400, "C", 1899.90f, 71, "60 x 57 x 82", "Alb", "Display / Electronic", 'C', 'B', 15, 20, "Down Wear, Dark Care, Shirts, Sports, Hygiene 20°C, Woollens, Daily Xpress/Xpress Super Short, Mix 40°C, Spalare manuala, Bumbac, Bumbac Eco, Sintetice, Stoarcere si evacuare, Clatire, Lingerie", "Da", 62, 41, "03:38", 'B', 2200, 4, 16, 12, 24);


        //folosim constructorul de copiere ca sa fie acolo, sa vada ca merge; comentarile le stergem cand prezentam proiectul nu? eu zic sa da
        a0 = new Aragaz(a1);
        c0 = new Cuptor(c3);
        r0 = new MasinaDeSpalatRufe(r5);

        //facem un vector "vectAragaze" in care o sa punem instantele
        // dupa facem un vector aragazeArray cu toate instantele ca sa pot face un for; altfel ar fi trebuit sa fac vectAragaze[0]=a1; vectAragaze[1]=a2;... de 10 ori!!!!!! 
        Aragaz[] vectAragaze = new Aragaz[10];
        Aragaz[] aragazeArray = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10};
        for (int i2 = 0; i2 < vectAragaze.length && i2 < aragazeArray.length; i2++) {
            vectAragaze[i2] = aragazeArray[i2];
        }
        
        Cuptor[] vectCuptoare = new Cuptor[10];
        Cuptor[] cuptoareArray = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};
        for (int i3 = 0; i3 < vectCuptoare.length && i3 < cuptoareArray.length; i3++) {
            vectCuptoare[i3] = cuptoareArray[i3];
        }
        
        MasinaDeSpalatRufe[] vectMasinaDeSpalatRufe = new MasinaDeSpalatRufe[10];
        MasinaDeSpalatRufe[] MasinaDeSpalatRufe2Array = {r1, r2, r3, r4, r5, r6, r7, r8, r9, r10};
        for (int i4 = 0; i4 < vectMasinaDeSpalatRufe.length && i4 < MasinaDeSpalatRufe2Array.length; i4++) {
            vectMasinaDeSpalatRufe[i4] = MasinaDeSpalatRufe2Array[i4];
        }
        
        //citesc index, pun nextInt care inseamna ca urmatoarea data citita o sa fie de tip int;
        //fac un while ca clientul sa se poata uita la mai multe produse, nu doar unul; si cand apasa 0 se inchide while-ul, iese din "magazin"
        //switch case e un fel de if else dar scri mai putin in switch case.. gen in loc de if(index==0), scrii case 0 samd
        //am pus un numar de aparitii ca sa apara 1. 2. 3. in fata produselor, sa le numeroteze
        //l am initializat pe index cu ceva care sa nu declanseze while-ul, de exemplu cu 9 ca altfel nu mergea while-ul (nu avea cu ce sa compare)
        
        System.out.print("  ");
        int index = 9;
        while (index != 0) {
            index = scanner.nextInt();
            switch (index) {
                case 0 ->
                    System.out.println("-------------------------------------------------------------Multumim ca ne-ati vizitat!-----------------------------------------------------------------------------");
                case 1 -> {
                    int numarAparitii = 1;
                    for (Aragaz vectAragaze1 : vectAragaze) {
                        System.out.println("\n\n" + numarAparitii + "." + vectAragaze1);
                        numarAparitii++;
                    }
                }
                case 2 -> {
                    int numarAparitii = 1;
                    for (Cuptor vectCuptoare1 : vectCuptoare) {
                        System.out.println("\n\n" + numarAparitii + "." + vectCuptoare1);
                        numarAparitii++;
                    }
                }
                
                case 3 -> {
                    int numarAparitii = 1;
                    for (MasinaDeSpalatRufe vectMasinaDeSpalatRufe1 : vectMasinaDeSpalatRufe) {
                        System.out.println("\n\n" + numarAparitii + "." + vectMasinaDeSpalatRufe1);
                        numarAparitii++;
                    }
                }
                default ->
                    System.out.println("  ----------------------------------------------------------Optiunea nu este valida!--------------------------------------------------------------------------------");
            }
            if (index != 0) {
                System.out.println("");
                System.out.println("  --------------------------------------------------Ce produs ati mai dori sa achizitionati?------------------------------------------------------------------------\n  1-Aragaz\n  2-Cuptor\n  3-Masina de spalat rufe\n  4-Masina de spalat vase\n  5-Frigider\n  6-Congelator\n  0-Iesire\n ");
                System.out.print("  ");
            }

        }
    }
}
