
package empleadoo;


public class Empleadoo {
    // Atributos con encapsulamiento (private)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // Atributo estático para contar empleados
    private static int totalEmpleados = 0;
    
    // Constructor que recibe todos los atributos
    public Empleadoo(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementa el contador estático
    }
    
    // Constructor sobrecargado - solo nombre y puesto
    public Empleadoo(String nombre, String puesto) {
        this.id = totalEmpleados + 1; // ID automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.0; // Salario por defecto
        totalEmpleados++; // Incrementa el contador estático
    }
    
    // Métodos sobrecargados actualizarSalario
    
    // Versión 1: Porcentaje de aumento
    public void actualizarSalario(double porcentaje) {
        double aumento = this.salario * (porcentaje / 100);
        this.salario += aumento;
    }
    
    // Versión 2: Cantidad fija
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }
    
    // Método toString() para representación legible
    @Override
    public String toString() {
        return String.format("Empleado[ID: %d, Nombre: %s, Puesto: %s, Salario: $%.2f]", 
                           id, nombre, puesto, salario);
    }
    
    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Getters y Setters (encapsulamiento)
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
