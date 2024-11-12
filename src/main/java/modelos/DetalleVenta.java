package modelos;

public class DetalleVenta {
    private Integer id_detalle;
    private Integer id_venta;
    private Integer id_producto;
    private Integer cantidad;
    private Float subtotal;

    public DetalleVenta() {
    }

    public DetalleVenta(Integer id_detalle, Integer id_venta, Integer id_producto, Integer cantidad, Float subtotal) {
        this.id_detalle = id_detalle;
        this.id_venta = id_venta;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public Integer getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(Integer id_detalle) {
        this.id_detalle = id_detalle;
    }

    public Integer getId_venta() {
        return id_venta;
    }

    public void setId_venta(Integer id_venta) {
        this.id_venta = id_venta;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "DetallesVenta{" +
                "id_detalle=" + id_detalle +
                ", id_venta=" + id_venta +
                ", id_producto=" + id_producto +
                ", cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                '}';
    }
}