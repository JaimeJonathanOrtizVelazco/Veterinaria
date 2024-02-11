package Animales;

public class Canino extends Animal{

    public Canino(String nombre, int edad, String color, boolean esDomestico, float peso) {
        super(nombre, edad, color, esDomestico, peso);
        this.setEspecie("Canino");
    }

    @Override
    public void Sonido() {
        System.out.println(this.getNombre() + " esta ladrando");
    }

    public void Ladrar(){
        System.out.println(this.getNombre() + " esta ladrando");
    }
}