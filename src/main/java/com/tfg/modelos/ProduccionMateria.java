/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Willian
 */
@Entity
@Table(name = "producciones_materias")
@XmlRootElement

public class ProduccionMateria implements Serializable {
    @JoinColumn(name = "id_produccion", referencedColumnName = "id_produccion")
    @ManyToOne(optional = false)
    private Produccion idProduccion;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_produccion_materia")
    private Integer idProduccionMateria;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @JoinColumn(name = "id_materia", referencedColumnName = "id_materia")
    @ManyToOne(optional = false)
    private Materia materia;

    public ProduccionMateria() {
    }

    public ProduccionMateria(Integer idProduccionMateria) {
        this.idProduccionMateria = idProduccionMateria;
    }

    public ProduccionMateria(Integer idProduccionMateria, BigDecimal cantidad) {
        this.idProduccionMateria = idProduccionMateria;
        this.cantidad = cantidad;
    }

    public Integer getIdProduccionMateria() {
        return idProduccionMateria;
    }

    public void setIdProduccionMateria(Integer idProduccionMateria) {
        this.idProduccionMateria = idProduccionMateria;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduccionMateria != null ? idProduccionMateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProduccionMateria)) {
            return false;
        }
        ProduccionMateria other = (ProduccionMateria) object;
        if ((this.idProduccionMateria == null && other.idProduccionMateria != null) || (this.idProduccionMateria != null && !this.idProduccionMateria.equals(other.idProduccionMateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tfg.modelos.ProduccionesMaterias[ idProduccionMateria=" + idProduccionMateria + " ]";
    }

    public Produccion getIdProduccion() {
        return idProduccion;
    }

    public void setIdProduccion(Produccion idProduccion) {
        this.idProduccion = idProduccion;
    }
    
}
