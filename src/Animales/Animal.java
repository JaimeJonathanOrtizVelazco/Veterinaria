package Animales;

public abstract class Animal {
    private String Especie;
    private String Color;
    private float Peso;
    private float Altura;
    private String Nombre;
    private boolean Sexo;
    /// historia de vacunas
    private int Edad;
    private String Base_Alimenticia;
    private String Descripcion;
    private boolean esDomestico;
    public Animal(){

    }
    public Animal(String nombre, int edad, String color, boolean esDomestico, float peso){
        this.Nombre = nombre;
        this.Edad = edad;
        this.Color = color;
        this.esDomestico = esDomestico;
        this.Peso = peso;
    }
    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float altura) {
        Altura = altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public boolean isSexo() {
        return Sexo;
    }

    public void setSexo(boolean sexo) {
        Sexo = sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getBase_Alimenticia() {
        return Base_Alimenticia;
    }

    public void setBase_Alimenticia(String base_Alimenticia) {
        Base_Alimenticia = base_Alimenticia;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public void Comer(){
        System.out.println(this.Nombre + " esta comiendo");
    }

    public abstract void Sonido();
    @Override
    public String toString() {
        return "Animal{" +
                "Especie='" + Especie + '\'' +
                ", Color='" + Color + '\'' +
                ", Peso=" + Peso +
                ", Altura=" + Altura +
                ", Nombre='" + Nombre + '\'' +
                ", Sexo=" + Sexo +
                ", Edad=" + Edad +
                ", Base_Alimenticia='" + Base_Alimenticia + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                ", esDomestico=" + esDomestico +
                '}';
    }
}