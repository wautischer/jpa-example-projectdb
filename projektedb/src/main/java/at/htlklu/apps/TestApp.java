package at.htlklu.apps;

import at.htlklu.entities.Arbeitspakete;
import at.htlklu.entities.Mitarbeiter;
import at.htlklu.entities.Projekte;
import at.htlklu.persistence.ProjekteDAO;

import java.beans.PropertyEditor;
import java.util.List;

public class TestApp {
    public static void main(String[] args) {
        List<Projekte> projekteList = ProjekteDAO.getAllProjekte();
        for (Projekte p:projekteList) {
            System.out.println(p);
        }

        //region Geben Sie alle Mitarbeiter aus.
        List<Mitarbeiter> mitarbeitersList = ProjekteDAO.getAllMitarbeiter();
        for (Mitarbeiter m:mitarbeitersList) {
            System.out.println(m);
        }
        //endregion

        //region Wo wohnt Mitarbeiterin X > soll als Übergabeparameter der Methode übergeben werden?
        List<Mitarbeiter> mitarbeiterAdress = ProjekteDAO.findAdress("Ollag");
        for (Mitarbeiter m:mitarbeiterAdress) {
            System.out.println(m.getStrasse());
        }
        //endregion

        //region Welche Vornamen kommen bei den Mitarbeitern öfter als einmal vor?
        List<String> mostFrequentFirstname = ProjekteDAO.getMostFrequentFirstname();
        for (String s:mostFrequentFirstname) {
            System.out.println(s);
        }
        //endregion

        //region Wer ist der jüngste Mitarbeiter, geben Sie dessen Daten aus?
        Mitarbeiter youngest = ProjekteDAO.getYoungestMitarbeiter();
        System.out.println(youngest);
        //endregion

        //region Welche Bezeichnung haben die Arbeitspakete des Projekts mit dem Code X > X soll als Übergabeparameter der Methode übergeben werden?
        List<Projekte> projekteByCodeList = ProjekteDAO.getProjectByCode("WSTP");
        for (Projekte p:projekteByCodeList) {
            System.out.println(p.getArbeitspaketesByNr());
        }
        //endregion

        //region Geben Sie zu allen Mitarbeitern deren Arbeitspaketen aus, an denen Sie beteiligt sind.
        List<Mitarbeiter> ma_list_all = ProjekteDAO.getAllMitarbeiter();
        //endregion
    }
}
