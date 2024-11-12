package modelos;

import java.sql.Timestamp;

public class Venta {
    private Integer id_ventas;
    private Integer id_usuario;
    private Integer id_cliente;
    private Timestamp fecha;
    private Float total;

    public Venta() {
    }

    public Venta(Integer id_ventas, Integer id_usuario, Integer id_cliente, Timestamp fecha, Float total) {
        this.id_ventas = id_ventas;
        this.id_usuario = id_usuario;
        this.id_cliente = id_cliente;
        this.fecha = fecha;
        this.total = total;
    }

    public Integer getId_ventas() {
        return id_ventas;
    }

    public void setId_ventas(Integer id_ventas) {
        this.id_ventas = id_ventas;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Ventas{" +
                "id_ventas=" + id_ventas +
                ", id_usuario=" + id_usuario +
                ", id_cliente=" + id_cliente +
                ", fecha=" + fecha +
                ", total=" + total +
                '}';
    }
}