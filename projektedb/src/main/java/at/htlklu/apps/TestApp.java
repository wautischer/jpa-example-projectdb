package at.htlklu.apps;

import at.htlklu.entities.Mitarbeiter;
import at.htlklu.entities.Projekte;
import at.htlklu.persistence.ProjekteDAO;

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

        //endregion
    }
}
