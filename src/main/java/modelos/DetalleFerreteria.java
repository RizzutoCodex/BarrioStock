package modelos;

public class DetalleFerreteria {
    private Integer id_detalle_ferreteria;
    private Integer id_producto;
    private String material;
    private String dimensiones;

    public DetalleFerreteria() {
    }

    public DetalleFerreteria(Integer id_detalle_ferreteria, Integer id_producto, String material, String dimensiones) {
        this.id_detalle_ferreteria = id_detalle_ferreteria;
        this.id_producto = id_producto;
        this.material = material;
        this.dimensiones = dimensiones;
    }

    public Integer getId_detalle_ferreteria() {
        return id_detalle_ferreteria;
    }

    public void setId_detalle_ferreteria(Integer id_detalle_ferreteria) {
        this.id_detalle_ferreteria = id_detalle_ferreteria;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    @Override
    public String toString() {
        return "DetallesFerreteria{" +
                "id_detalle_ferreteria=" + id_detalle_ferreteria +
                ", id_producto=" + id_producto +
                ", material='" + material + '\'' +
                ", dimensiones='" + dimensiones + '\'' +
                '}';
    }
}