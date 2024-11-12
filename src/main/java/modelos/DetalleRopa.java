package modelos;

public class DetalleRopa {
    private Integer id_detalle_ropa;
    private Integer id_producto;
    private String talla;
    private String color;

    public DetalleRopa() {
    }

    public DetalleRopa(Integer id_detalle_ropa, Integer id_producto, String talla, String color) {
        this.id_detalle_ropa = id_detalle_ropa;
        this.id_producto = id_producto;
        this.talla = talla;
        this.color = color;
    }

    public Integer getId_detalle_ropa() {
        return id_detalle_ropa;
    }

    public void setId_detalle_ropa(Integer id_detalle_ropa) {
        this.id_detalle_ropa = id_detalle_ropa;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "DetallesRopa{" +
                "id_detalle_ropa=" + id_detalle_ropa +
                ", id_producto=" + id_producto +
                ", talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}