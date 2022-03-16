public class FirePokemon extends Pokemon{

    private int degreesCelsius;
    private int distanceFire;
    private String powerMove;
    private String sound;
    private String favFood;


    public FirePokemon(String name, int level, int hp, String powerMove, String sound, String favFood) {
        super(name, level, hp);
        this.powerMove = powerMove;
        this.sound = sound;
        this.favFood = favFood;
    }

    public int getDegreesCelsius() {
        return degreesCelsius;
    }

    public void setDegreesCelsius(int degreesCelsius) {
        this.degreesCelsius = degreesCelsius;
    }

    public int getDistanceFire() {
        return distanceFire;
    }

    public void setDistanceFire(int distanceFire) {
        this.distanceFire = distanceFire;
    }

    @Override
    public void eat() {
        System.out.println( "eats " + favFood);
    }

    public void doPowerMove(){
            System.out.println("attacks with " + powerMove);

    }

    public void takeTemperature() {
        if ( degreesCelsius == 0) {
            System.out.println("Degrees Celcius has not been set yet");
        } else {
            System.out.println("temperature is " + degreesCelsius);
        }
    }
}
