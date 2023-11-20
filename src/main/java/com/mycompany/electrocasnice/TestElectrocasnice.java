package com.mycompany.electrocasnice;

import java.util.Scanner;
public class TestElectrocasnice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("  -------------------------------------------------Buna ziua! Ce produs ati dori sa achizitionati?-----------------------------------------------------------------");

        //instantele
        Aragaz a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
        Cuptor c0, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15;
        MasinaDeSpalatRufe r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15;
        MasinaDeSpalatVase v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15;
        Congelator cg0, cg1, cg2, cg3, cg4, cg5, cg6, cg7, cg8, cg9, cg10, cg11, cg12, cg13, cg14, cg15;
        Frigider f0, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15;

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
        a11 = new Aragaz("Aragaz", "BEKO  ", "FSGT52110DXO", 4, "gaz", "gaz", "gaz", "Fara autocuratare", true, false, "High-Efficiency Gas Burner, Siguranta flacara la cuptor, Iluminare cuptor", 55, "A", 0.0f, 230f, 1.299f, 45f, "50 x 60 x 85", "inox", 4.35f, 26, 12, 24);
        a12 = new Aragaz("Aragaz", "ZANUSSI", "ZCG510F1WA", 4, "gaz", "gaz", "gaz", "Fara autocuratare", false, false, "Orificiu evacuare vapori din cuptor; Temperatura variabila: 50°C - 250°C", 59, "A", 0.0f, 230f, 1.252f, 41f, "50 x 60 x 85", "alb", 4.59f, 17, 12, 24);
        a13 = new Aragaz("Aragaz", "GORENJE", "GEC5A12WG-B", 4, "electric", "vitroceramica", "electric", "AquaClean", false, false, "	Interior SilverMatte, Forma HomeMade, Spatiu depozitare", 68, "A", 8000f, 220f, 1.638f, 35.6f, "50 x 59.4 x 85", "alb", 4.88f, 5, 12, 24);
        a14 = new Aragaz("Aragaz", "BEKO", "FSMT52320DXO", 4, "mixta (Gaz + Electric)", "gaz", "electric", "Fara autocuratare", true, true, "	8 functii de gatire", 55, "A", 2100f, 220f, 1.629f, 48.9f, "50 x 60 x 85", "inox", 4.74f, 50, 12, 24);
        a15 = new Aragaz("Aragaz", "BEKO", "FSM52330DAO", 4, "mixta (Gaz + Electric)", "gaz", "electric", "Fara autocuratare", false, true, "High efficiency gas burner, 3D Cooking, Cuptor multifunctional, Siguranta flacara la plita aragaz, Timer", 60, "A", 2100f, 220f, 1650f, 48f, "50 x 60 x 85", "antracit", 4.67f, 24, 12, 24);
        
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
        c11 = new Cuptor("Cuptor incorporabil electric", "ELECTROLUX", "EOE7P31X", "pirolitica", 72, "A+", "amortizata", 9, "Retete integrate; Lumina halogen cuptor; Indicator caldura reziduala; Incalzire jos; Gatire conventionala / traditionala; Dezghetare; Gril rapid; Grill; Mentinere la cald; Coacere umeda cu ventilatie; Setare pizza; Gatire inceata; Gatire cu ventilatie; Grill turbo", "LCD / Touch control", true, 3480f, 230f, 55f, 3.033f, 32.3f, "59.6 x 56.9 x 59.4", "negru", 4.87f, 153, 12, 24);
        c12 = new Cuptor("Cuptor incorporabil electric", "WHIRLPOOL", "AKZM 8660 IX", "pirolitica", 73, "A+", "amortizata", 16, "Tehnologia Al 6-lea Simt; Sistem de curataree piroliza; Coacere conventionala; Decongelare; Pre-incalzire rapida; Pizza/Paine; Maxi cooking; Ready2Cook; Grill; Turbo grill; Aer fortat; Ventilator Turbo; Iluminare; Timer programabil", "Digital", true, 3650f, 230f, 55f, 1.649f, 35.5f, "59.5 x 56.4 x 59.5", "inox", 4.83f, 78, 24, 24);
        c13 = new Cuptor("Cuptor incorporabil electric", "CANDY ", "FCS100N/E", "Fara autocuratare", 70, "A", "Standard", 4, "Grill, Dezghetare rapida", "Mecanic", true, 1700f, 230f, 55f, 600f, 23f, "59.5 x 56.8 x 59.5", "negru", 4.58f, 19, 12, 24);
        c14 = new Cuptor("Cuptor incorporabil electric", "GORENJE", "BOS6737E13XE", "Hidrolitica", 77, "A+", "Amortizata", 13, "Forma HomeMade; Racire DC+; SuperSize; PizzaFunction; StepBake; GentleBake; FastPreheat; AirFry; FrozenBake; Gratin; SteamAssist", "IconLed", true, 3500f, 230f, 55f, 1.639f, 30f, "62 x 67.5 x 66", "inox", 5, 15, 12, 24);
        c15 = new Cuptor("Cuptor incorporabil electric", "BOSCH", "HBA5570B0", "EcoClean", 71, "A", "Standard", 7, "EcoClean Direct; CoolDoor; Sistem de protectie impotriva accesului copiilor; Indicator de caldura reziduala; Iluminare interioara cu halogen; Usa cu deschidere rabatabila; Suport telescopic cu amplasare independenta pe nivelul dorit; AutoPilot - 10 programe automate de gatire; Convectie aer 3D Plus; Incalzire superioara / inferioara; Grill cu convectie aer; Grill - suprafata mare; Pizza; Incalzire inferioara; Convectie - nivel delicat; Functie Stop", "LCD / Electronic", true, 3400f, 230f, 55f, 2.799f, 34.1f, "59.4 x 54.8 x 59.5", "negru", 4.64f, 14, 12, 24);
        
        r1 = new MasinaDeSpalatRufe("Masina de spalat rufe frontala", "BOSCH", "WAN24167BY", "Child lock, Functie reincarcare, Night Wash, Reminder curatare tambur, Pornire intarziata, Control balans", 8, 1200, "C", 1793.92f, 67.6f, "59.8 x 55 x 84.8", "Alb", "LCD / Touch", 'A', 'B', 15, 15, "Bumbac, Sintetice, Delicate, Super 15'/30', Lana/Spalare manuala, Camasi/Bluze, Sport, Rapid/Mix, Dark wash, Hygiene Plus, Curatare tambur, Night Wash, Centrifugare+Evacuare", "Da", 62, 47, "3:26", 'A', 2300, 4.94f, 16, 12, 24);
        r2 = new MasinaDeSpalatRufe("Masina de spalat rufe frontala", "LG", "F4WV509S2TE", "Pornire intarziata (3-19 h), Child Lock, Doar centrifugare, Start/ Pauza, Alarma eroare, Auto Restart, Semnal sonor pornire/oprire", 9, 1400, "B", 2519.91f, 70, "60 x 56.5 x 85", "Argintiu", "LED/Touch control", 'A', 'B', 14, 59, "Bumbac, Eco 40-60, Mix (Mixed Fabric), Easy Care, Duvet, Tub Clean, Allergy Care, Baby Steam Care, Turbo Wash 59, Sports Wear, Rapid 14', Delicate, Hand / Wool", "Da", 58, 50, "3:48", 'A', 1850, 5, 2, 12, 24);
        r3 = new MasinaDeSpalatRufe("Masina de spalat rufe verticala", "INDESIT", "BTWB7220PEU/N", "Pornire intarziata, Reglare temperatura, Viteza centrifugare, Clatire Intensiva, Optiune energy saver, Calcare usoara", 7, 1200, "E", 1799.90f, 57, "40 x 60 x 90", "Alb", "Digital", 'A', 'C', 15, 15, "Turn & Go, Sintetice, Bumbac, Eco 40-60, Mix 45 min, Articole Sport, 20C, Lana 20, Delicate 30, Colorate 40, Bumbac 30, Sintetice 30, Centrifugare + Evacuare, Clatire + Centrifugare, Eco Bumbac", "Da", 78, 45, "03:25", 'C', 2100, 4.33f, 30, 12, 24);
        r4 = new MasinaDeSpalatRufe("Masina de spalat rufe frontala", "GORENJE", "WNEI74AS", "Protectie la inundatii, Protectie acces copii, Senzor incarcare, Senzor spuma, Senzor nivel apa, Senzor temperatura", 7, 1400, "A", 1948.90f, 65.1f, "60 x 54.5 x 85", "Alb", "LED / Electronic", 'A', 'B', 16, 20, "Bumbac, Program de spalare manual/Lana, Mix/Sintetice, Pets, ExtraHygiene, Haine pentru bebelusi, Daily wash, Program Eco 40-60°C, Rapid 20', PowerWash 59', Program pentru lenjerie, Program pentru uscarea camasilor, SterilTub, Spin/drain, Clatire/Inmuiere", "Da", 45, 45, "3:01", 'B', 1900, 4.6f, 30, 12, 24);
        r5 = new MasinaDeSpalatRufe("Masina de spalat rufe incorporabila", "WHIRLPOOL", "BI WMWG 81484E", "Siguranta copii, Pornire intarziata, Sistem protectie inundatii", 8, 1400, "C", 2349.90f, 66.5f, "59.5 x 54.5 x 81.5", "Alb", "Digital", 'C', 'B', 14, 14, "Mix, Rufe albe, Bumbac, Eco 40-60, Articole sport, Plapumi, 20 C, Centrifugare & evacuare, Clatire & Evacuare, Rapid 30 min, Colours 15, Lana, Delicate, Sintetice, Eco Bumbac", "Da", 63, 48, "03:30", 'A', 1850, 4.64f, 11, 24, 24);
        r6 = new MasinaDeSpalatRufe("Masina de spalat rufe incorporabila", "BEKO", "WITV8712X0W", "DrumClean, Clatire suplimentara, Spalare rapida, Child lock, Sistem automat de reglare al consumului de apa, Sistem control exces apa, Sistem electronic de control al balansului, Afisare timp spalare ramas", 8, 1400, "C", 1462.92f, 71, "60 x 57 x 82", "Alb", "Display / Electronic", 'C', 'B', 15, 15, "Down Wear, Dark Care, Shirts, Sports, Hygiene 20°C, Woollens, Daily Xpress/Xpress Super Short, Mix 40°C, Spalare manuala, Bumbac, Bumbac Eco, Sintetice, Stoarcere si evacuare, Clatire, Lingerie", "Da", 62, 41, "3:38", 'B', 2200, 4, 16, 12, 24);
        r7 = new MasinaDeSpalatRufe("Masina de spalat rufe verticala", "ELECTROLUX", "PerfectCare700 EW7TN3272", "Pete, Clatire suplimentara, Soft Plus, Steam Plus, Start/Pauza", 6, 1200, "B", 2091.31f, 59, "40 x 60 x 89", "Alb", "LCD", 'B', 'B', 14, 14, "Pornit/Oprit, Eco 40-60, Bumbac, Sintetice, Delicate, Abur, Abur pentru casmir, Centrifugare/Evacuare, Clatire, Articole bebelusi, Rapid 14 min, AntiAllergy, Jachete, Denim, Lana/Matase", "Da", 48, 43, "03:15", 'C', 2200, 4.73f, 11, 12, 24);
        r8 = new MasinaDeSpalatRufe("Masina de spalat rufe frontala", "ARCTIC", "APL81223XLAB", "Rapid+, Clatire suplimentara, Antisifonare, Drum Clean cu Extra Steam, Child Lock, Add-In, Amanare pornire, Afisare timp ramas", 8, 1200, "C", 1969.90f, 68, "60 x 55 x 84", "Antracit", "LED", 'C', 'B', 14, 14, "Bumbac, Eco 40-60, Sintetice, Spalare rapida 14', Mixt, Lana, Materiale delicate, Camasi, Geci cu puf, Antialergic+, Anti-pete, Articole iarna, Jeans/ Culori inchise, Clatire, Stoarcere/ Evacuare", "Da", 62, 38, "3:38", 'B', 2200, 5, 5, 12, 24);
        r9 = new MasinaDeSpalatRufe("Masina de spalat rufe frontala", "Samsung", "WW80T4540AX/LE", "Child Lock, Pornire intarziata, Drum Clean, Tambur 2nd Diamond, Prespalare, Rinse+, Smart Check, Sertar StayClean, Steam", 8, 1400, "D", 1899.90f, 68, "60 x 55 x 85", "Inox", "LED / Mecanic", 'C', 'B', 12, 15, "Sintetice, Clatire + Centrifugare, Mixte, Hygiene Steam, Drum Clean, Denim, Colorate, Bumbac, Lenjerii de pat, Rapid 15', Eco 40-60", "Da", 73, 48, "03:38", 'A', 1900, 5, 9, 12, 24);
        r10 = new MasinaDeSpalatRufe("Masina de spalat rufe incorporabila", "BEKO", "WITV8712X0W", "DrumClean, Clatire suplimentara, Spalare rapida, Child lock, Sistem automat de reglare al consumului de apa, Sistem control exces apa, Sistem electronic de control al balansului, Afisare timp spalare ramas", 8, 1400, "C", 1899.90f, 71, "60 x 57 x 82", "Alb", "Display / Electronic", 'C', 'B', 15, 20, "Down Wear, Dark Care, Shirts, Sports, Hygiene 20°C, Woollens, Daily Xpress/Xpress Super Short, Mix 40°C, Spalare manuala, Bumbac, Bumbac Eco, Sintetice, Stoarcere si evacuare, Clatire, Lingerie", "Da", 62, 41, "03:38", 'B', 2200, 4, 16, 12, 24);
        r11 = new MasinaDeSpalatRufe("Masina de spalat rufe verticala", "WHIRLPOOL", "TDLR7220SSEU/N", "Pornire intarziata, Reglare temperatura, Viteza centrifugare, Clatire Intensiva, Soft Opening", 7, 1200, "E", 1999.90f, 57, "40 x 60 x 90", "Alb", "Digital", 'A', 'C', 13, 15, "Mix, Eco 40-60, 20 grade, Rufe colorate, Lana, Centrifugare, Clatire+Centrifugare, Delicate, Igiena, Sintetice, Rapid 30, Bumbac, Eco Bumbac", "Da", 78, 45, "03:25", 'C', 2100, 3.95f, 21, 24, 24);
        r12 = new MasinaDeSpalatRufe("Masina de spalat rufe verticala", "GORENJE", "WNT62112", "Sistem de control al stabilitatii", 6, 1200, "D", 614.35f, 58, "40 x 60 x 90", "Alb", "LED / Mecanic", 'A', 'B', 18, 20, "Bumbac, Sintetice, Rufe delicate si de matase, Lana, Spalare rapida, Spalare Manuala", "Da", 64, 43, "03:15", 'B', 2100, 4.44f, 19, 12, 24);
        r13 = new MasinaDeSpalatRufe("Masina de spalat rufe frontala", "MIELE", "WWV 980 WPS", "SingleWash, Scurt, Inmuiere, Prespalare, Apa Plus, Ciclu de clatire suplimentara, Foarte silentios, Netezire cu abur, Precalcare, Semnal Acustic, AllergoWash, Miele home, MobileControl, ShopConn@ct, WiFiConnect, Asistent rufe, AddLoad", 9, 1600, "A", 13899.99f, 98, "59.6 x 64.3 x 85", "Alb", "MTouch", 'A', 'A', 25, 15, "QuickPowerWash, Automat Plus, Bumbac, Calcare minima, Delicate, Camasi, Matase (spalare manuala), Rufe din lana (spalare manuala), Express 20, Rufe inchise la culoare, Denim, Aer liber, Impermeabilizare, Imbracaminte sport, Pantofi sport, Pilote de puf, P", "Da", 49, 48, "03:19", 'A', 2400, 5, 1, 12, 24);
        r14 = new MasinaDeSpalatRufe("Masina de spalat rufe frontala", "LG", "F4WV910P2SE", "Aburi, Smart Diagnosis 3.0, Conectivitate Wi-Fi, Adaugare articole, Repornire automata, Pulverizare apa cu detergent prin miscare circulara, Pulverizare multipla 3D, Amanare pornire (3-19 h), Indicator configuratie, Indicator de blocare usa, Indicator si alarma mesaj de eroare, Blocare pentru copii, Semnal sonor pornire/oprire, Anti-incretire, Doar centrifugare, Spalare intensiva, Clatire suplimentara, Posibilitatea descarcarii de programe aditionale (Haine bebelusi, Costume de baie, Echipament sala de sport, Paturi, Articole individuale, Spalare silentioasa, Haine copii, Anotimp ploios, Jeans, Pete de transpiratie, Rufe colorate, Clatire + centrifugare)", 10.5f, 1400, "A", 3999.90f, 70, "60 x 56.5 x 85", "Negru", "Digital", 'A', 'A', 14, 15, "Eco 40-60, Spalare usoara, Curatare cuva, Turbo 39', Spalare silentioasa, Program descarcat (Standard: Clatire + centrifugare), Manual/Lana, Bumbac, Mixte, Plapumi, Antialergic, Articole sportive, Rapid 14', Delicate", "Da", 53, 53, "04:00", 'A', 2200, 4.2f, 5, 12, 24);
        r15 = new MasinaDeSpalatRufe("Masina de spalat rufe frontala", "AEG", "LFR71844BE", "Dispozitiv antiscurgere cu senzor Aqua Control, Tratare pete, Blocare acces copii, Clatire suplimentara, Plus steam, Start/Pauza, Doar clatire, Centrifugare/Evacuare", 8, 1400, "A", 3649.90f, 74.5f, "60 x 60 x 85", "Alb", "LED / Electronic", 'A', 'B', 10, 20, "MixLoad 69min, Eco 40-60, Bumbac, Sintetice, Delicate, Lana, 20 min 3kg, Abur, Jachete, Hygiene", "Da", 42, 42, "03:35", 'B', 2100, 3.86f, 7, 12, 24);

        v1 = new MasinaDeSpalatVase("Masina de spalat vase independenta", "GORENJE", "GS520E15S", "Semnal optic si acustic la sfarsitul programului, Sistem de diagnosticare a defectiunilor", 9, 5, "E", 1754.90f, 36.5f, "44.8 x 60 x 84.5", "Inox", "LED / Electronic", 2, "Electronic", "Inox", "Program rapid, Pre-clatire/Inmuiere, Intensiv, Program ECO, Program 1h", 'A', 'A', "3:55", 70, 9, 'C', 1760, 4.33f, 3, 12, 24);
        v2 = new MasinaDeSpalatVase("Masina de spalat vase semi-incorporabila", "ELECTROLUX", "EEM43300IX", "Brat pulverizator FlexiSpray Satellite, Extra igienizare, GlassCare, XtraPower, sistem de uscare AirDry", 10, 8, "D", 2499.90f, 34.8f, "45 x 55 x 81.8", "Inox", "LED / Butoane", 2, "Electronic", "Inox", "160 min, 60 min, 90 min, AUTO Sense, Eco, Machine Care, Quick 30 min, Clatire & Pauza", 'D', 'A', "4:00", 67, 9.9f, 'B', 1950, 4.5f, 2, 12, 24);
        v3 = new MasinaDeSpalatVase("Masina de spalat vase independenta", "BEKO", "DVN06430X", "Flexible HalfLoad™, All in 1, Deschidere automata usa, Sistem control exces apa, Senzor murdarire, Indicator sare, Indicator clatire suplimentara", 14, 6, "D", 1839.90f, 43.2f, "59.8 x 60 x 85", "Inox", "LED / Mecanic", 3, "Mecanic", "Otel inoxidabil", "Quick&Shine™, Eco 50°C, Auto Program, Intensive 70°C, Mini 30', Delicate 40'", 'D', 'A', "3:20", 85, 11.5f, 'C', 1900, 4.89f, 35, 12, 24);
        v4 = new MasinaDeSpalatVase("Masina de spalat vase independenta", "BOSCH", "SKS51E32EU", "ExtraDry, EcoSilence Drive, Detergent Automation, Senzor de incarcare, Sistem de protectie a paharelor, 5 nivele de temperatura, Circuit electronic de regenerare a sarii de dedurizare, Pompa de incalzire", 6, 5, "F", 1549.90f, 20.95f, "55.1 x 50 x 45", "Alb", "LED / Mecanic", 1, "Mecanic", "Inox", "Intensiv 70, Normal 65, Eco 50, Glass 40, Spalare rapida 45", 'F', 'B', "03:55", 61, 8, 'C', 2400, 4.38f, 8, 12, 24);
        v5 = new MasinaDeSpalatVase("Masina de spalat vase independenta", "INDESIT", "DSFE1B10", "Incarcare la jumatate", 10, 6, "F", 1599.90f, 34.9f, "45 x 59 x 85", "Alb", "Buton central", 2, "Electronic", "Otel inoxidabil", "Eco, Intensiv, Normal, Rapid 40 min, Incarcare pe jumatate, Inmuiere", 'F', 'A', "04:00", 84, 11.5f, 'D', 1900, 5, 3, 12, 24);
        v6 = new MasinaDeSpalatVase("Masina de spalat vase incorporabila", "ELECTROLUX", "EEM48221L", "Time Beam, Brat pulverizator FlexiSpray Satellite, Extra igienizare, GlassCare, XtraPower, sistem de uscare AirDry", 14, 8, "E", 2750.90f, 38.4f, "59.6 x 55 x 81.8", "Alb", "LED / Butoane", 2, "Electronic", "Inox", "160 min, 60 min, 90 min, AUTO Sense, Eco, Machine Care, Quick 30 min, Clatire & Pauza", 'E', 'A', "04:00", 95, 10.5f, 'B', 1950, 5, 3, 24, 24);
        v7 = new MasinaDeSpalatVase("Masina de spalat vase incorporabila", "WHIRLPOOL", "WSBO3O34PFX", "Tehnologia al-6-lea Simt, PowerClean, Pornire Programata, Sistem Natural Dry", 10, 8, "D", 2049.90f, 29.6f, "44.8 x 55.5 x 82", "Inox", "Digital", 3, "Electronic", "Otel inoxidabil", "Eco, 6th Sense, Intensiv, Zilnic, Cristal, Rapid 30 min, Prespalare, Autocuratare", 'D', 'A', "03:40", 67, 9, 'B', 1900, 4.86f, 7, 12, 24);
        v8 = new MasinaDeSpalatVase("Masina de spalat vase independenta", "GORENJE", "GS541D10X", "TotalDry, Motor Inverder PowerDrive", 9, 5, "D", 1079.51f, 38.2f, "44.8 x 60 x 84.5", "Argintiu", "LED / Electronic", 3, "Electronic", "Otel inoxidabil", "Program automat, Intensiv, Program Eco, Program pentru sticle", 'B', 'A', "03:25", 72, 9.5f, 'C', 1760, 4.92f, 13, 12, 24);
        v9 = new MasinaDeSpalatVase("Masina de spalat vase incorporabila", "BOSCH", "SPV4EMX60E", "Conectivitate Wi-Fi / aplicatie Home Connect, DosageAssist, Sistem AquaStop, Semnal sonor la terminarea programului, Afisare timp ramas, InfoLight", 10, 6, "F", 2999.90f, 29.9f, "44.8 x 55 x 81.5", "Inox", "LED / Taste", 3, "Electronic", "Inox", "Eco 50°C, Auto 45-65°C, Intensive 70°C, Program 1h 65°C, Silence 50°C, Program favorit", 'A', 'A', "04:16", 67, 6.7f, 'C', 2400, 4.69f, 16, 12, 24);
        v10 = new MasinaDeSpalatVase("Masina de spalat vase independenta", "GORENJE", "GS62040S", "Total AquaStop", 12, 5, "E", 1610.90f, 43, "60 x 60 x 84.5", "Argintiu", "LED / Mecanic", 2, "Mecanic", "Otel inoxidabil", "Program rapid, Intensiv, Program Eco, Inmuiere, Spalare zilnica", 'C', 'A', "03:57", 93, 11, 'C', 1850, 3, 4, 12, 24);
        v11 = new MasinaDeSpalatVase("Masina de spalat vase independenta", "HOTPOINT", "HSFO 3T235 WC X", "3D Zone Wash, ActivEco, FlexiLoad, Programe automate, Clatire igienizanta, Pornire programata", 10, 9, "D", 2369.90f, 39.5f, "45 x 59 x 85", "Inox", "Digital", 2, "Electronic", "Otel inoxidabil", "Eco, Auto intensiv, Auto normal, Zilnic, Expres 30, Good night, Igienizare, Inmuiere, Autocuratare", 'D', 'A', "03:40", 67, 9, 'C', 1900, 5, 5, 12, 24);
        v12 = new MasinaDeSpalatVase("Masina de spalat vase independenta", "CANDY", "CDCP 8", "Indicator sonor finalizare ciclu, Indicator sare si agent clatire", 8, 6, "F", 1259.91f, 27, "55 x 50 x 60", "Alb", "Digital", 2, "Mecanic", "Inox", "Eco, Intensiv 65 C, Rapid 35', Zlnic, Sticla", 'F', 'A', "03:40", 72, 8, 'D', 1900, 4.2f, 5, 12, 24);
        v13 = new MasinaDeSpalatVase("Masina de spalat vase independenta", "SHARP", "QW-NA1CF47ES-EU", "Sistem de uscare activ, EcoWash", 13, 4, "E", 1255.92f, 46, "59.8 x 59.8 x 85", "Argintiu", "Afisaj grafic", 2, "Electronic", "Inox", "Eco 50 C, Intensive 65 C, Express 50', Quick 30'", 'E', 'A', "03:25", 94, 12, 'C', 1850, 4.67f, 3, 12, 24);
        v14 = new MasinaDeSpalatVase("Masina de spalat vase incorporabila", "BOSCH", "SMV46KX55E", "ExtraDry, Silence, Setare VarioFlex, EcoSilence Drive, DosageAssist, Aqua Sensor, Load Sensor, Sistem de protectie a paharelor, Circuit electronic de regenerare a sarii de dedurizare, Sistem de spalare cu schimbator de caldura (Heat exchanger), Pompa de incalzire, Tehnica de spalare cu alternare", 13, 6, "E", 2499.90f, 36.8f, "59.8 x 55 x 81.5", "Inox", "LED / Electronic", 2, "Electronic", "Inox/Polinox", "Intensiv 70 °C, Auto 45-65 °C, Eco 50 °C, Silence 50 °C, Pahare 40 °C, Program 1h 65 °C", 'E', 'A', "03:30", 94, 9.5f, 'B', 2400, 4.55f, 11, 12, 24);
        v15 = new MasinaDeSpalatVase("Masina de spalat vase independenta", "ARCTIC", "DBI542", "Aqua protect, Sistem dedurizare apa, Pornire intarziata, Sistem de uscare static, Indicator LED status program, Indicator nivel sare si substanta clatire, Incarcare la jumatate, Optimizare ciclu de spalare pentru tableta de detergent", 14, 5, "E", 1648.99f, 34.4f, "59.8 x 55 x 81.8", "Alb", "LED Touch Control", 3, "Electronic", "Otel inoxidabil", "Eco 50, Express 30', Intensiv 70 C, Extra 58', Curatare / Uscare", 'E', 'A', "03:25", 95, 12.9f, 'C', 1850, 4.62f, 13, 12, 24);

        cg1 = new Congelator("Static", 1, "Analog", 5, true, 40, "Samsung", "Congelator cu o singura usa verticala", "A++", "FrostMaster FX-2000", "Alb", "Sistem dezghetare - Manual; Preparare automata cuburi de gheata - Nu; Iluminare interior - Nu; Maner - Nu", 200.0f, 50, 1500.0f, 4.5f, "60x80x150", 80.0f, 24, 12);
        cg2 = new Congelator("Static", 2, "Analog", 4, true, 45, "Bosch", "Congelator cu doua usi laterale", "A+", "IceTech FreezePro X7", "Negru", "Sistem dezghetare - Automat; Preparare automata cuburi de gheata - Da; Iluminare interior - Da; Maner - Da", 250.0f, 30, 1200.0f, 4.0f, "70x90x160", 90.0f, 18, 10);
        cg3 = new Congelator("NoFrost", 3, "Analog", 3, true, 50, "Wirlpool", "Congelator cu usa superioara", "A", "CoolChill Elite 3000", "Argintiu", "Sistem dezghetare - Manual; Preparare automata cuburi de gheata - Nu; Iluminare interior - Nu; Maner - Nu", 180.0f, 40, 1300.0f, 4.2f, "50x70x130", 70.0f, 12, 6);
        cg4 = new Congelator("Static", 2, "Analog", 4, false, 42, "Electrolux", "Congelator cu doua usi superioare", "A++", "ArcticFrost UltraCool 500", "Alb", "Sistem dezghetare - Automat; Preparare automata cuburi de gheata - Nu; Iluminare interior - Da; Maner - Da", 220.0f, 60, 1700.0f, 4.8f, "65x85x140", 85.0f, 36, 24);
        cg5 = new Congelator("NoFrost", 2, "Digital", 5, true, 48, "Haier", "Congelator cu usa inferioara", "A+", "FreezeMax PowerIce 700", "Alb", "Sistem dezghetare - Manual; Preparare automata cuburi de gheata - Da; Iluminare interior - Nu; Maner - Nu", 240.0f, 45, 1400.0f, 4.5f, "75x95x170", 95.0f, 30, 18);
        cg6 = new Congelator("NoFrost", 3, "Analog", 3, true, 55, "LG", "Congelator cu doua usi inferioare", "A", "ChillMaster FrostGuard 220", "Negru", "Sistem dezghetare - Automat; Preparare automata cuburi de gheata - Da; Iluminare interior - Nu; Maner - Da", 200.0f, 55, 1600.0f, 4.0f, "55x75x120", 75.0f, 24, 12);
        cg7 = new Congelator("NoFrost", 1, "Analog", 4, true, 38, "Indesit", "Congelator tip sertar", "A++", "GlacierTech FrostBlast X9", "Alb", "Sistem dezghetare - Manual; Preparare automata cuburi de gheata - Nu; Iluminare interior - Da; Maner - Nu", 180.0f, 35, 1200.0f, 4.2f, "60x80x150", 80.0f, 18, 10);
        cg8 = new Congelator("Static", 2, "Analog", 5, false, 43, "Beko", "Congelator sub tejghea", "A+", "FreezeZone ArcticWave 800", "Argintiu", "Sistem dezghetare - Automat; Preparare automata cuburi de gheata - Nu; Iluminare interior - Nu; Maner - Da", 220.0f, 50, 1400.0f, 4.8f, "70x90x160", 90.0f, 30, 24);
        cg9 = new Congelator("NoFrost", 2, "Digital", 3, true, 52, "Siemens", "Congelator cu usi franceze", "A", "CoolStream MegaFreeze 550", "Negru", "Sistem dezghetare - Manual; Preparare automata cuburi de gheata - Da; Iluminare interior - Da; Maner - Nu", 250.0f, 65, 1800.0f, 4.5f, "50x70x130", 70.0f, 36, 18);
        cg10 = new Congelator("Static", 1, "Analog", 4, true, 40, "Arctic", "Congelator cu usi multiple", "A++", "IceMaster ProChill 1200", "Alb", "Sistem dezghetare - Automat; Preparare automata cuburi de gheata - Da; Iluminare interior - Da; Maner - Nu", 200.0f, 40, 1300.0f, 4.0f, "65x85x140", 85.0f, 24, 12);
        cg11 = new Congelator("NoFrost", 1, "Digital", 4, true, 42, "Whirlpool", "Congelator cu usa superioara", "A++", "FreezeTech ChillBlast 500", "Inox", "Sistem dezghetare - Automat; Preparare automata cuburi de gheata - Da; Iluminare interior - Da; Maner - Da", 210.0f, 55, 1600.0f, 4.2f, "60x80x150", 80.0f, 24, 12);
        cg12 = new Congelator("Static", 2, "Analog", 5, false, 48, "LG", "Congelator sub tejghea", "A+", "ChillZone FrostGuard X6", "Negru", "Sistem dezghetare - Automat; Preparare automata cuburi de gheata - Nu; Iluminare interior - Nu; Maner - Da", 230.0f, 40, 1400.0f, 4.5f, "70x90x160", 90.0f, 30, 18);
        cg13 = new Congelator("NoFrost", 3, "Digital", 4, true, 50, "Samsung", "Congelator cu usa inferioara", "A++", "FrostMaster ProIce 700", "Alb", "Sistem dezghetare - Automat; Preparare automata cuburi de gheata - Da; Iluminare interior - Nu; Maner - Nu", 220.0f, 45, 1500.0f, 4.0f, "75x95x170", 95.0f, 36, 24);
        cg14 = new Congelator("Static", 1, "Analog", 3, false, 38, "Beko", "Congelator tip sertar", "A", "FreezeZone FrostBlast X4", "Argintiu", "Sistem dezghetare - Manual; Preparare automata cuburi de gheata - Nu; Iluminare interior - Da; Maner - Nu", 180.0f, 35, 1200.0f, 4.2f, "55x75x120", 75.0f, 18, 10);
        cg15 = new Congelator("NoFrost", 2, "Digital", 5, true, 55, "Siemens", "Congelator cu usi franceze", "A+", "CoolStream MegaFreeze 800", "Inox", "Sistem dezghetare - Automat; Preparare automata cuburi de gheata - Da; Iluminare interior - Da; Maner - Da", 240.0f, 60, 1700.0f, 4.8f, "65x85x140", 85.0f, 24, 12);

        
        f1 = new Frigider(true, "NoFrost", 1, "Digital", 5, true, false, 40, "Samsung", "Frigider cu o singura usa", "A++", "EliteCool Pro X200", "Alb", "Dispenser apa - Da; Material rafturi - Plastic; Iluminare interior - Da, neon; Picioare - Da, ajustabile spate; Lungime cablu - 1.8m", 200.0f, 50, 1500.0f, 4.5f, "60x80x150", 80.0f, 24, 12);
        f2 = new Frigider(true, "Static", 2, "Digital", 4, false, false, 45, "LG", "Frigider cu doua usi", "A+", "FreshFrost Ultra 3000", "Negru", "Functie dezghetare rapida - Da; Material rafturi - Metal; Iluminare interior - Da, LED; Picioare - Da, ajustabile fata; Lungime cablu - 1.6m", 250.0f, 30, 1200.0f, 4.0f, "70x90x160", 90.0f, 18, 10);
        f3 = new Frigider(true, "NoFrost", 2, "Digital", 3, true, true, 50, "Whirlpool", "Frigider cu doua usi", "A", "ArcticBreeze Elite Z", "Argintiu", "Sistem anti-amprenta - Da; Material rafturi - Sticla securizata; Iluminare interior - Da, halogen; Picioare - Da, ajustabile spate; Lungime cablu - 1.9m", 180.0f, 40, 1300.0f, 4.2f, "50x70x130", 70.0f, 12, 6);
        f4 = new Frigider(true, "Static", 1, "Analog", 4, false, false, 42, "Bosch", "Frigider cu o singura usa", "A++", "CoolMaster Inox 500", "Alb", "Sertar legume/fructe - Da; Material rafturi - Plastic; Iluminare interior - Da, LED; Picioare - Da, ajustabile fata; Lungime cablu - 1.7m", 220.0f, 60, 1700.0f, 4.8f, "65x85x140", 85.0f, 36, 24);
        f5 = new Frigider(false, "NoFrost", 2, "Digital", 5, true, true, 48, "Haier", "Frigider side-by-side", "A+", "IceTech Luxor 8000", "Rosu", "Functie economisire energie - Da; Material rafturi - Sticla securizata; Iluminare interior - Da, LED; Picioare - Da, ajustabile spate; Lungime cablu - 1.5m", 240.0f, 45, 1400.0f, 4.5f, "75x95x170", 95.0f, 30, 18);
        f6 = new Frigider(false, "Static", 3, "Analog", 3, false, false, 55, "Electrolux", "Frigider cu doua usi", "A", "ChillWave Platinum Plus", "Negru", "Sistem de filtrare aer - Da; Material rafturi - Metal; Iluminare interior - Da, neon; Picioare - Da, ajustabile fata; Lungime cablu - 1.8m", 200.0f, 55, 1600.0f, 4.0f, "55x75x120", 75.0f, 24, 12);
        f7 = new Frigider(true, "NoFrost", 2, "Digital", 4, true, true, 38, "Beko", "Frigider cu doua usi", "A++", "FrostGuardian Supreme 700", "Alb", "Dozator apa si gheata - Da; Material rafturi - Plastic; Iluminare interior - Da, halogen; Picioare - Da, ajustabile spate; Lungime cablu - 1.7m", 180.0f, 35, 1200.0f, 4.2f, "60x80x150", 80.0f, 18, 10);
        f8 = new Frigider(true, "Static", 2, "Analog", 5, false, false, 43, "Hotpoint", "Frigider cu doua usi", "A+", "CrystalChill Diamond 900", "Argintiu", "Functie vacanta - Da; Material rafturi - Sticla; Iluminare interior - Da, LED; Picioare - Da, ajustabile fata; Lungime cablu - 1.6m", 220.0f, 50, 1400.0f, 4.8f, "70x90x160", 90.0f, 30, 24);
        f9 = new Frigider(true, "NoFrost", 3, "Digital", 3, true, true, 52, "Siemens", "Frigider side-by-side", "A", "FreezeMax Innovate X", "Negru", "Sertar FreshZone - Da; Material rafturi - Plastic; Iluminare interior - Da, neon; Picioare - Da, ajustabile spate; Lungime cablu - 1.9m", 250.0f, 65, 1800.0f, 4.5f, "50x70x130", 70.0f, 36, 18);
        f10 = new Frigider(false, "Static", 1, "Analog", 4, false, false, 40, "Indesit", "Frigider cu o singura usa", "A++", "PolarCool Galaxy Z3", "Rosu", "Functie super-racire - Da; Material rafturi - Metal; Iluminare interior - Da, halogen; Picioare - Da, ajustabile fata; Lungime cablu - 1.8m", 200.0f, 40, 1300.0f, 4.0f, "65x85x140", 85.0f, 24, 12);
        f11 = new Frigider(true, "NoFrost", 2, "Digital", 4, true, false, 42, "Sony", "Frigider cu doua usi", "A++", "SmartFreeze X3000", "Inox", "Dispenser apa - Da; Material rafturi - Sticla securizata; Iluminare interior - Da, LED; Picioare - Da, ajustabile spate; Lungime cablu - 1.8m", 230.0f, 53, 1550.0f, 4.3f, "68x88x158", 88.0f, 28, 15);
        f12 = new Frigider(false, "Static", 1, "Analog", 3, false, false, 40, "Panasonic", "Frigider cu o singura usa", "A+", "CoolBreeze Z200", "Alb", "Functie dezghetare automata - Da; Material rafturi - Plastic; Iluminare interior - Da, neon; Picioare - Da, ajustabile fata; Lungime cablu - 1.7m", 190.0f, 38, 1250.0f, 4.0f, "62x78x142", 78.0f, 20, 12);
        f13 = new Frigider(true, "NoFrost", 3, "Digital", 5, true, true, 48, "Sony", "Frigider cu doua usi", "A++", "IceMaster Z800", "Negru", "Sistem anti-amprenta - Da; Material rafturi - Sticla securizata; Iluminare interior - Da, LED; Picioare - Da, ajustabile spate; Lungime cablu - 1.9m", 260.0f, 48, 1450.0f, 4.5f, "70x90x160", 90.0f, 32, 18);
        f14 = new Frigider(false, "Static", 2, "Analog", 4, false, true, 40, "Panasonic", "Frigider cu doua usi", "A++", "FreshCool Z400", "Alb", "Functie economisire energie - Da; Material rafturi - Metal; Iluminare interior - Da, LED; Picioare - Da, ajustabile fata; Lungime cablu - 1.6m", 210.0f, 42, 1350.0f, 4.2f, "68x88x158", 88.0f, 24, 15);
        f15 = new Frigider(true, "NoFrost", 1, "Digital", 3, true, false, 44, "LG", "Frigider cu o singura usa", "A", "FreezeGuard X200", "Argintiu", "Sertar legume/fructe - Da; Material rafturi - Plastic; Iluminare interior - Da, halogen; Picioare - Da, ajustabile spate; Lungime cablu - 1.7m", 220.0f, 52, 1600.0f, 4.2f, "55x75x130", 75.0f, 22, 10);

        //folosim constructorul de copiere ca sa fie acolo, sa vada ca merge; comentarile le stergem cand prezentam proiectul nu? eu zic sa da
        a0 = new Aragaz(a1);
        c0 = new Cuptor(c3);
        r0 = new MasinaDeSpalatRufe(r5);
        v0 = new MasinaDeSpalatVase(v12);
        cg0 = new Congelator(cg3);
        f0 = new Frigider(f4);

//        am afisat constructorii de copiere de mai sus, daca vrea sa vada profa ca merg, doar sterge // cum a zis Alexia si da run
//        System.out.println("Constructorii de copiere: ");
//        System.out.println("\nCopie a1:\n" + a0);
//        System.out.println("\nCopie c3\n" + c3);
//        System.out.println("\nCopie r5\n" + r5);
//        System.out.println("\nCopie v12\n"+v0);
//        System.out.println("\nCopie cg3\n"+cg0);
//        System.out.println("\nCopie f4\n"+f0);
        //facem un vector "vectAragaze" in care o sa punem instantele
        // dupa facem un vector aragazeArray cu toate instantele ca sa pot face un for; altfel ar fi trebuit sa fac vectAragaze[0]=a1; vectAragaze[1]=a2;... de 10 ori!!!!!! 
        Aragaz[] vectAragaze = new Aragaz[15];
        Aragaz[] aragazeArray = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15};
        for (int i1 = 0; i1 < vectAragaze.length && i1 < aragazeArray.length; i1++) {
            vectAragaze[i1] = aragazeArray[i1];
        }

        Cuptor[] vectCuptoare = new Cuptor[15];
        Cuptor[] cuptoareArray = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15};
        for (int i2 = 0; i2 < vectCuptoare.length && i2 < cuptoareArray.length; i2++) {
            vectCuptoare[i2] = cuptoareArray[i2];
        }

        MasinaDeSpalatRufe[] vectMasinaDeSpalatRufe = new MasinaDeSpalatRufe[15];
        MasinaDeSpalatRufe[] MasinaDeSpalatRufe2Array = {r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15};
        for (int i3 = 0; i3 < vectMasinaDeSpalatRufe.length && i3 < MasinaDeSpalatRufe2Array.length; i3++) {
            vectMasinaDeSpalatRufe[i3] = MasinaDeSpalatRufe2Array[i3];
        }
        MasinaDeSpalatVase[] vectMasinaDeSpalatVase = new MasinaDeSpalatVase[15];
        MasinaDeSpalatVase[] MasinaDeSpalatVase2Array = {v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15};
        for (int i4 = 0; i4 < vectMasinaDeSpalatVase.length && i4 < MasinaDeSpalatVase2Array.length; i4++) {
            vectMasinaDeSpalatVase[i4] = MasinaDeSpalatVase2Array[i4];
        }
        Congelator[] vectCongelatoare = new Congelator[15];
        Congelator[] congelatoareArray = {cg1, cg2, cg3, cg4, cg5, cg6, cg7, cg8, cg9, cg10, cg11, cg12, cg13, cg14, cg15};
        for (int i5 = 0; i5 < vectCongelatoare.length && i5 < congelatoareArray.length; i5++) {
            vectCongelatoare[i5] = congelatoareArray[i5];
        }

        Frigider[] vectFrigidere = new Frigider[15];
        Frigider[] frigidereArray = {f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15};
        for (int i6 = 0; i6 < vectFrigidere.length && i6 < frigidereArray.length; i6++) {
            vectFrigidere[i6] = frigidereArray[i6];
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

                case 4 -> {
                    int numarAparitii = 1;
                    for (MasinaDeSpalatVase vectMasinaDeSpalatVase1 : vectMasinaDeSpalatVase) {
                        System.out.println("\n\n" + numarAparitii + "." + vectMasinaDeSpalatVase1);
                        numarAparitii++;
                    }
                }
                case 5 -> {
                    int numarAparitii = 1;
                    for (Frigider vectFrigidere1 : vectFrigidere) {
                        System.out.println("\n\n" + numarAparitii + "." + vectFrigidere1);
                        numarAparitii++;
                    }
                }
                case 6 -> {
                    int numarAparitii = 1;
                    for (Congelator vectCongelatoare1 : vectCongelatoare) {
                        System.out.println("\n\n" + numarAparitii + "." + vectCongelatoare1);
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

