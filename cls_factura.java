public class cls_factura {
    private String str_cod_producto;
    private int int_cantidad;
    private float flt_valorVenta;
    private float flt_total;

    public cls_factura(String cod, int cantidad, float valorV) {
        this.str_cod_producto = cod;
        this.int_cantidad = cantidad;
        this.flt_valorVenta = valorV;
        this.flt_total = valorV*cantidad;
    }

    public String getStr_cod_producto() {return str_cod_producto;}
    public int getInt_cantidad() {return int_cantidad;}
    public float getFlt_valorVenta() {return flt_valorVenta;}
    public float getFlt_total() {return flt_total;}
}
