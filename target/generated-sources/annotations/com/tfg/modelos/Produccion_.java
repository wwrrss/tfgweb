package com.tfg.modelos;

import com.tfg.modelos.ProduccionMateria;
import com.tfg.modelos.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-27T20:45:38")
@StaticMetamodel(Produccion.class)
public class Produccion_ { 

    public static volatile ListAttribute<Produccion, ProduccionMateria> produccionesMateriasList;
    public static volatile SingularAttribute<Produccion, Integer> idProduccion;
    public static volatile SingularAttribute<Produccion, Date> fecha;
    public static volatile SingularAttribute<Produccion, Date> horaInicio;
    public static volatile SingularAttribute<Produccion, Date> horaFin;
    public static volatile SingularAttribute<Produccion, Integer> cantidad;
    public static volatile SingularAttribute<Produccion, Producto> producto;

}