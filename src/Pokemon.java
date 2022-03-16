public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;


    public Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public Pokemon() {
    }

    public void eat(){
        System.out.println(name + " = eating standard pokemon food");
    }

   public void sleep(){
       System.out.println(name + "goes to sleep");
   }
}
