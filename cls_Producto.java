public class cls_Producto{
    private String str_codigo;
    private String str_nombre;
    private String str_descripcion;
    private int int_stock;
    private Float flt_valorCompra;
    private float flt_ganancia;
    private float flt_valorVenta;

    public cls_Producto (String codigo, String str_nombre, String str_descrip, int int_stock, Float flt_valorCompra, float flt_ganancia){
        this.str_codigo = codigo;
        this.str_nombre = str_nombre;
        this.str_descripcion = str_descrip;
        this.int_stock = int_stock;
        this.flt_valorCompra = flt_valorCompra;
        this.flt_ganancia = flt_ganancia;

        // Calculo del valor de la venta
        this.flt_valorVenta = (flt_valorCompra * flt_ganancia) + flt_valorCompra;
    }
    public void setStr_nombre(String str_nombre) {this.str_nombre = str_nombre;}
    public void setStr_descripcion(String str_descripcion) {this.str_descripcion = str_descripcion;}
    public void setInt_stock(int int_stock) {this.int_stock = int_stock;}
    public void setFlt_valorCompra(Float flt_valorCompra) {this.flt_valorCompra = flt_valorCompra;}
    public void setFlt_ganancia(float flt_ganancia) {this.flt_ganancia = flt_ganancia;}
    public void setFlt_valorVenta(float flt_valorVenta) {this.flt_valorVenta = flt_valorVenta;}


    public String getStr_nombre() {return str_nombre;}
    public String getStr_descripcion() {return str_descripcion;}
    public String getStr_codigo() {return str_codigo;}
    public int getInt_stock() {return int_stock;}
    public Float getFlt_valorCompra() {return flt_valorCompra;}
    public float getFlt_ganancia() {return flt_ganancia;}
    public float getFlt_valorVenta() {return flt_valorVenta;}
    
}