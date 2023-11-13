import java.util.Arrays;

public class OrdenarVendedores {
    public static void main(String[] args) {
        
        String[] vendedores = {"Ana", "Carlos", "Luis", "Pedro"};
        int[] ventas = {350, 200, 500, 150};

        System.out.println("Antes de ordenar:");
        mostrarVendedoresYVentas(vendedores, ventas);

        ordenarVentasYVendedores(ventas, vendedores);

        System.out.println("\nDespués de ordenar:");
        mostrarVendedoresYVentas(vendedores, ventas);
    }

    public static void mostrarVendedoresYVentas(String[] vendedores, int[] ventas) {
        for (int i = 0; i < vendedores.length; i++) {
            System.out.println(vendedores[i] + ": " + ventas[i]);
        }
    }

    public static void ordenarVentasYVendedores(int[] ventas, String[] vendedores) {
        
        int n = ventas.length;
        boolean intercambiado;

        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (ventas[j] > ventas[j + 1]) {
                    int tempVenta = ventas[j];
                    ventas[j] = ventas[j + 1];
                    ventas[j + 1] = tempVenta;

                    String tempVendedor = vendedores[j];
                    vendedores[j] = vendedores[j + 1];
                    vendedores[j + 1] = tempVendedor;

                    intercambiado = true;
                }
            }
            if (!intercambiado) {
                break;
            }
        }
    }
}
