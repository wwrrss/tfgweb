package com.tfg.modelos;

import com.tfg.modelos.Materia;
import com.tfg.modelos.Produccion;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-27T20:45:38")
@StaticMetamodel(ProduccionMateria.class)
public class ProduccionMateria_ { 

    public static volatile SingularAttribute<ProduccionMateria, Produccion> idProduccion;
    public static volatile SingularAttribute<ProduccionMateria, Materia> materia;
    public static volatile SingularAttribute<ProduccionMateria, BigDecimal> cantidad;
    public static volatile SingularAttribute<ProduccionMateria, Integer> idProduccionMateria;

}