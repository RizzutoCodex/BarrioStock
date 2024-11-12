package modelos;

import java.sql.Date;

public class DetalleViveres {

    private Integer id_detalle_viveres;
    private Integer id_producto;
    private Date fecha_vencimiento;

    public DetalleViveres() {
    }

    public DetalleViveres(Integer id_detalle_viveres, Integer id_producto, Date fecha_vencimiento) {
        this.id_detalle_viveres = id_detalle_viveres;
        this.id_producto = id_producto;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Integer getId_detalle_viveres() {
        return id_detalle_viveres;
    }

    public void setId_detalle_viveres(Integer id_detalle_viveres) {
        this.id_detalle_viveres = id_detalle_viveres;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    @Override
    public String toString() {
        return "DetallesViveres{"
                + "id_detalle_viveres=" + id_detalle_viveres
                + ", id_producto=" + id_producto
                + ", fecha_vencimiento=" + fecha_vencimiento + '}';
    }

}