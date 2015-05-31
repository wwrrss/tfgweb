package com.tfg.modelos;

import com.tfg.modelos.FormulaProducto;
import com.tfg.modelos.ProduccionMateria;
import com.tfg.modelos.Unidad;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-27T20:45:38")
@StaticMetamodel(Materia.class)
public class Materia_ { 

    public static volatile ListAttribute<Materia, ProduccionMateria> produccionesMateriasList;
    public static volatile SingularAttribute<Materia, Unidad> idUnidadMedida;
    public static volatile ListAttribute<Materia, FormulaProducto> formulaProductoList;
    public static volatile SingularAttribute<Materia, Integer> idMateria;
    public static volatile SingularAttribute<Materia, BigDecimal> cantidad;
    public static volatile SingularAttribute<Materia, String> descripcion;

}