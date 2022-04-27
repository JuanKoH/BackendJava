package practicaMona;

public class OctoMain {
    public static void main(String[] args) {
        Mona Original = new Mona("Mona", "Negro","Original");
        MinionCat Minion = new MinionCat("Minioncat", "Amarillo","Overall talachero");
        RobotoCat Roboto = new RobotoCat("RobotoCat", "Gris","Metalica");
        Trekkie StarT = new Trekkie("Trekkie", "Negro y amarillo","Star Trek Uniform");
        MegaCat Mega = new MegaCat("Megacat", "Azul","Megaman");
        IronCat Icat = new IronCat("Ironcat", "Rojo y Amarillo","Harvis");
        DroidtoCat Droid = new DroidtoCat("Droidtocat","Amarillo, gris y blanco","Tipo Android");

        Original.showncs();
        Original.activity();

        Minion.showncs();
        Minion.activity();

        Roboto.showncs();
        Roboto.activity();

        StarT.showncs();
        StarT.activity();

        Mega.showncs();
        Mega.activity();

        Icat.showncs();
        Icat.activity();

        Droid.showncs();
        Droid.activity();
    }
}