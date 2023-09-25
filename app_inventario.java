import javax.swing.JOptionPane;

public class app_inventario {
    static cls_Producto [] productos = new cls_Producto [100];
    static int int_pos = 0;

    public static void main(String[] args) {
        menu(true);
    }

    public static void menu (boolean m){
        while(m){
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu principal\n"+
            "1. Registrar\n"+
            "2. Consultar\n"+
            "3. Actualizar\n"+
            "4. Registro de compra\n"+
            "5. Reportes\n"+
            "6. Salir"));


            if (menu == 6){
                m = false;
            }
        }
    }
}
