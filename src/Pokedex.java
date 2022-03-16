public class Pokedex {
    public static void main(String[] args) {



FirePokemon charmander = new FirePokemon("charmander", 44, 144, "Ember", "Roar", "Rocks");
WaterPokemon lapras = new WaterPokemon("lapras", 44, 1000, "fish");

charmander.setDistanceFire(11);

charmander.eat();

charmander.doPowerMove();

charmander.takeTemperature();

charmander.setDegreesCelsius(255);

charmander.takeTemperature();

lapras.eat();

lapras.getPercentageWater();

lapras.waterAttack();

lapras.setTypeOfWater("Mineral Water");

lapras.waterAttack();

    }
}
