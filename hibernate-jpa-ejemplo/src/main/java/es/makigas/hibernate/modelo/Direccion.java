package es.makigas.hibernate.modelo;

import javax.persistence.*;

@Entity
@Table(name = "Direccion")
public class Direccion {

    @Id
    @Column(name = "Id_Direccion")
    private Long id;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "Localidad")
    private String localidad;

    @Column(name = "Provincia")
    private String provincia;

    @Column(name = "Pais")
    private String pais;

    @OneToOne(mappedBy = "direccion", fetch = FetchType.LAZY)
    private Empleado empleado;

    public Direccion() {

    }

    public Direccion(Long id, String direccion, String localidad, String provincia, String pais) {
        this.id = id;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
        this.pais = pais;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Direccion [id=" + id + ", direccion=" + direccion + ", localidad=" + localidad + ", provincia="
                + provincia + ", pais=" + pais + ", empleado=" + empleado.getCodigo() + "]";
    }


}
