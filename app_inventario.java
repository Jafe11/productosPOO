import javax.swing.JOptionPane;

public class app_inventario {
    static cls_Producto [] productos = new cls_Producto [100];
    static int int_pos = 0;

    public static void main(String[] args) {
        fnt_menu(true);
    }

    private static void fnt_registro(String nom, String desc, String codigo, int stock, float valorC, float ganan){
        productos [int_pos] = new cls_Producto(codigo, nom, desc, stock, valorC, ganan);
        int_pos ++;
        JOptionPane.showMessageDialog(null, "Productos registrado",
         "REGISTRO", JOptionPane.INFORMATION_MESSAGE);

    }
    private static void fnt_selector (int opcion){
        if (opcion == 1){
            
        }
    }

    public static void fnt_menu (boolean m){
        while(m){
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu principal\n"+
            "1. Registrar\n"+
            "2. Consultar\n"+
            "3. Actualizar\n"+
            "4. Registro de compra\n"+
            "5. Reportes\n"+
            "6. Salir"));
            fnt_selector(menu);
        }
    }
}
