public class WaterPokemon extends Pokemon {

    private int percentageWater;
    private String typeOfWater;
    private String favFood;

    public WaterPokemon(String name, int level, int hp, String favFood) {
        super(name, level, hp);
        this.favFood = favFood;
    }

    public int getPercentageWater() {
        return percentageWater;
    }

    public void setPercentageWater(int percentageWater) {
        this.percentageWater = percentageWater;
    }

    public String getTypeOfWater() {
        return typeOfWater;
    }

    public void setTypeOfWater(String typeOfWater) {
        this.typeOfWater = typeOfWater;
    }

    @Override
    public void eat() {
        System.out.println( "eats " + favFood);
    }

    public void waterAttack(){
        if (typeOfWater != null) {
            System.out.println("attacks with water of type " + typeOfWater);
        }else {
            System.out.println("type of water is not been declared yet");
        }
    }

}
