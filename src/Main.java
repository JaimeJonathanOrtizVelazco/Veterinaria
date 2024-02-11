import Animales.Animal;
import Animales.Ave;
import Animales.Canino;
import Animales.Felino;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Felino felino = new Felino("Dasha",14,"Cafe",true,7.0f);
        Animal canino =  new Canino("Canela", 4, "Cafe", true, 10f);
        Animal ave = new Ave("Canario", 2, "Amarillo", true, .200f);
        List<Animal> animals = new ArrayList<>();
        animals.add(felino);
        animals.add(canino);
        animals.add(ave);
        for(Animal animal: animals){
            animal.Sonido();
        }
    }
}