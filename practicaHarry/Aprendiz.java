package practicaHarry;

public class Aprendiz {

    private String nombre;
    private String genero;
    private String casa;
    private String patronus;
    private String boggart;

    public Aprendiz(String nombre, String genero, String casa, String patronus, String boggart) {
        setNombre(nombre);
        setGenero(genero);
        setCasa(casa);
        setPatronus(patronus);
        setBoggart(boggart);
    }

    private String getNombre()   {   return this.nombre;     }
    private String getGenero()   {   return this.genero;     }
    private String getCasa()     {   return this.casa;       }
    private String getPatronus() {   return this.patronus;   }
    private String getBoggart()  {   return this.boggart;    }

    private boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    private boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;
    }

    private boolean setCasa(String casa){
        if (!casa.isEmpty()){
            this.casa = casa;
            return true;
        } else
            return false;
    }

    private boolean setPatronus(String patronus){
        if (!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else
            return false;
    }

    private boolean setBoggart(String boggart){
        if (!boggart.isEmpty()) {
            this.boggart = boggart;
            return true;
        } else
            return false;
    }

    public void show(){
        System.out.println("Aprendiz de Hogwarts: " + getNombre() +
                "\nGenero: " + getGenero() +
                "\nCasa: " + getCasa() +
                "\nPatronus: " + getPatronus() +
                "\nBoggart: " + getBoggart() +
                "\n");
    }
}
