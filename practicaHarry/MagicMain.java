package practicaHarry;


public class MagicMain {public static void main(String[] args) {
    Aprendiz Harry = new Aprendiz("Harry James Potter", "Hombre", "Griffyndor", "Ciervo", "Dementor");
    Aprendiz Hermione = new Aprendiz("Hermione Jean Granger","Mujer","Griffyndor","Nutria","McGonagall");
    Aprendiz Ron = new Aprendiz("Ronald Bilius Weasley", "Hombre","Gryffindor","Jack Rusell Terrier","Arana gigante");
    Aprendiz Luna = new Aprendiz("Luna Lovegood","Mujer","Raenclaw","Liebre","Su padre X. Lovegood");
    Aprendiz Pansy = new Aprendiz("Pansy Parkinson","Mujer","Slytherin","Mariposa","Tiburon");

    Harry.show();
    Hermione.show();
    Ron.show();
    Luna.show();
    Pansy.show();
}
}