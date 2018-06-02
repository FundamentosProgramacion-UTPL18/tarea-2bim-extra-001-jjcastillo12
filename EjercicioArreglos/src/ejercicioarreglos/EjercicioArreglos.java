/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarreglos;

/**
 *
 * @author Usuario
 */
public class EjercicioArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracioón de las listas
        String[] meses = {"Agosto", "Octubre", "Diciembre"};
        String[] sucursales = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};
        // Listas con valores asignados
        double[] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};
        // Variables para cálculo de operaciones
        double[] venta_total_sucursal = new double[4];
        double[] venta_promedio_sucursal = new double[4];
        double total_suma, total_promedio, final_total = 0;
        String reporte;
        // Encabezado del Reporte
        reporte = String.format("Reporte\n%-15s%-15s%-15s%-15s%-15s%-15s\n\n", "", meses[0], meses[1], meses[2], "Total", "Promedio");
        //Ciclo repetitivo para sumar los valores de la lista y promedios
        for (int contador = 0; contador < venta_total_sucursal.length; contador++) { 
            total_suma = ventas_mes_1[contador] + ventas_mes_2[contador] + ventas_mes_3[contador];
            total_promedio = total_suma / meses.length;
            venta_total_sucursal[contador] = total_suma;
            venta_promedio_sucursal[contador] = total_promedio;
            // Reporte con el encabezado + datos de resultados
            reporte = reporte + String.format("%-15s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f\n", sucursales[contador], ventas_mes_1[contador], ventas_mes_2[contador], ventas_mes_3[contador], venta_total_sucursal[contador], venta_promedio_sucursal[contador]);

        }
        // Ciclo repetitivo para sacar el valor total de las ventas 
        for (int contador = 0; contador < venta_total_sucursal.length; contador++) {
            final_total = venta_total_sucursal[contador] + final_total;
        }
        // Reporte con el encabezado y datos de resultados + resultado del valor total de las ventas 
        reporte = reporte + String.format("\nTotales de ventas de todas la sucursales es: %.2f", final_total);
        // Impresion del Reporte
        System.out.println(reporte);
    }

}
