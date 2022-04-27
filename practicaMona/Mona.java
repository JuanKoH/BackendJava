package practicaMona;

public class Mona {
    private String name, color, skin;
    public Mona(String name, String color, String skin){
        setName(name);
        setColor(color);
        setSkin(skin);
    }

    private String getName() {return this.name;}
    private String getColor() {return this.color;}
    private String getSkin() {return this.skin;}

    private boolean setName(String name){
        if (!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    private boolean setColor(String color){
        if (!color.isEmpty()){
            this.color = color;
            return true;
        } else
            return false;
    }

    private boolean setSkin(String skin){
        if (!skin.isEmpty()){
            this.skin = skin;
            return true;
        } else
            return false;
    }
    public void showncs(){
        System.out.println(

                "\nNombre: " + getName() +
                        "\nColor: " + getColor() +
                        "\nSkin: " + getSkin()
        );
    }
    public void activity(){
        System.out.println("Hola, estoy dejando caer una gota de agua mientras te saludo.\n");
    };
}
