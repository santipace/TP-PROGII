public class Vehiculo {
    private final String marca;
    private final String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    public String mostrarInfo() {
        return "Vehículo { marca='" + marca + "', modelo='" + modelo + "' }";
    }
}