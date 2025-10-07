
package empleadoo;


public class PruebaEmpleadoo {
    public static void main(String[] args) {
        // Crear empleados usando diferentes constructores
        Empleadoo emp1 = new Empleadoo(1, "Ana García", "Desarrollador", 2500.0);
        Empleadoo emp2 = new Empleadoo("Luis Martínez", "Diseñador");
        Empleadoo emp3 = new Empleadoo("Carlos Rodríguez", "Analista");
        Empleadoo emp4 = new Empleadoo(4, "María López", "Gerente", 4000.0);

        // Mostrar información de empleados con toString()
        System.out.println("=== INFORMACIÓN DE EMPLEADOS ===");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());

        // Aplicar métodos actualizarSalario sobrecargados
        System.out.println("\n=== ACTUALIZACIÓN DE SALARIOS ===");

        // Aumento por porcentaje
        emp1.actualizarSalario(10.0); // 10% de aumento
        System.out.println("Después del 10% de aumento: " + emp1);

        // Aumento por cantidad fija
        emp2.actualizarSalario(500); // $500 de aumento
        System.out.println("Después de $500 de aumento: " + emp2);

        // Mostrar total de empleados usando método estático
        System.out.println("\n=== ESTADÍSTICAS ===");
        System.out.println("Total de empleados creados: " + Empleadoo.mostrarTotalEmpleados());

        // Probar los getters
        System.out.println("\n=== PRUEBA DE GETTERS ===");
        System.out.println("Nombre del empleado 1: " + emp1.getNombre());
        System.out.println("Puesto del empleado 2: " + emp2.getPuesto());
        System.out.println("Salario del empleado 3: " + emp3.getSalario());
    }
}