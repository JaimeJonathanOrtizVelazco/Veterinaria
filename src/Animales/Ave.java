package Animales;

public class Ave extends Animal{
    public Ave(String nombre, int edad, String color, boolean esDomestico, float peso) {
        super(nombre, edad, color, esDomestico, peso);
    }

    @Override
    public void Sonido() {
        System.out.println(this.getNombre() + " esta haciendole piopio");
    }
}