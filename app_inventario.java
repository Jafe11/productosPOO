import javax.swing.JOptionPane;

public class app_inventario {
    static cls_Producto [] productos = new cls_Producto [100];
    static int int_pos = 0;
    static boolean bl_sw;
    static int int_p;
    public static void main(String[] args) {
        fnt_menu(true);
    }

    private static void fnt_registro(String nom, String desc, String codigo, int stock, float valorC, float ganan){
        productos [int_pos] = new cls_Producto(codigo, nom, desc, stock, valorC, ganan);
        int_pos ++;
        JOptionPane.showMessageDialog(null, "Productos registrado",
         "REGISTRO", JOptionPane.INFORMATION_MESSAGE);

    }
    
    public static void fnt_consultar(String codigo) {
        bl_sw = false;
        int_p = 0;
        for (int i = 0; i <int_pos; i++) {
            if (codigo.equals(productos [i].getStr_codigo())){
                bl_sw = true;
                int_pos = i;
                break;
            }
        }
        if (bl_sw = false){
            JOptionPane.showMessageDialog(null, "No se encontro el registro consultado");
        }else{
            JOptionPane.showMessageDialog(null, "Nombre: " + productos[int_p].getStr_nombre() +
            "\nDescripcion: " + productos[int_p].getStr_descripcion() + "\nStock: " +  productos[int_p].getInt_stock()+
            "\nValor de compra: " + productos[int_p].getFlt_valorCompra() + "\nGanancia (porcentaje): " + productos[int_p].getFlt_ganancia() +
            "\nValor de venta: " + productos[int_p].getFlt_valorVenta());
        }
    }
    
    private static void fnt_selector (int opcion){
        if (opcion == 1){
            String cod = JOptionPane.showInputDialog(null,"Ingresar codigo: ");
            String nom = JOptionPane.showInputDialog(null,"Ingresar nombre: ");
            String desc = JOptionPane.showInputDialog(null,"Ingresar descripcion: ");
            Integer stock = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar stock: "));
            float Vcompra = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresar valor de compra: "));
            float gan = Float.parseFloat(JOptionPane.showInputDialog(null,"Valor ganancia: "));
            fnt_registro(nom, desc, cod, stock, Vcompra, gan);
        }else if(opcion == 2){
            String cod = JOptionPane.showInputDialog(null, "ingrese el codigo del producto a consultar: ");
            fnt_consultar(cod);
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
