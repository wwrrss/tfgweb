package com.tfg.modelos;

import com.tfg.modelos.Materia;
import com.tfg.modelos.Producto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-27T20:45:38")
@StaticMetamodel(FormulaProducto.class)
public class FormulaProducto_ { 

    public static volatile SingularAttribute<FormulaProducto, Integer> idFormula;
    public static volatile SingularAttribute<FormulaProducto, Materia> idMateria;
    public static volatile SingularAttribute<FormulaProducto, BigDecimal> cantidad;
    public static volatile SingularAttribute<FormulaProducto, Producto> idProducto;

}