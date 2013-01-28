  /** 
  * Descripci�n.: <br /> 
  * Autor.......: Sinergia Tecnol�gica (rse04m), 18/01/2007 <br /> 
  * Fichero.....: $Source: /data/cvs/adaptech/operativa/construccion/gefe/src/ddl/pack/ppp_expe.s.sql,v $ <br /> 
  * Id..........: $Id: ppp_expe.s.sql,v 1.1 2007/01/24 09:47:21 rse04m Exp $ <br /> 
  * Version.....: $Revision: 1.1 $ <br /> 
  * Alta CVS....: $Author: rse04m $ <br /> 
  * Fecha.......: $Date: 2007/01/24 09:47:21 $ <br /> 
  */


CREATE OR REPLACE PACKAGE PPP_EXPE IS


  /** 
  * Version CVS de la especificaci�n.  
  *
  */ 
  SPEC_RCS_VERSION CONSTANT VARCHAR2(30) := '$Revision: 1.1 $';

  ------------------------------------------------------------------------------
  --               Funciones control de versiones                             --
  ------------------------------------------------------------------------------
  -- getSpecRCSRev ------------------------------------------------------------
  /** 
  * Proporciona la versi�n de RCS del SPEC de paquete. 
  * 
  * @return Versi�n de la especificaci�n. 
  */ 
  FUNCTION getSpecRCSRev RETURN VARCHAR2 ;
  PRAGMA RESTRICT_REFERENCES(getSpecRCSRev, RNDS, WNDS, WNPS);

  --  getBodyRCSRev ------------------------------------------------------------
  /** 
  * Proporciona la versi�n de RCS del BODY de paquete. 
  * 
  * @return Versi�n del body. 
  */ 
  FUNCTION getBodyRCSRev RETURN VARCHAR2 ;
  PRAGMA RESTRICT_REFERENCES(getBodyRCSRev, RNDS, WNDS, WNPS);

  --  insertar ------------------------------------------------------------
  /** 
  * Inserta el registro que se le pasa como par�metro  
  *
  * @param  rPP_EXPE_ Registro que se va a insertar en la tabla
  */ 
  PROCEDURE insertar( rPP_EXPE_ PP_EXPE%ROWTYPE );
  PRAGMA RESTRICT_REFERENCES(insertar, RNPS, WNPS, RNDS);


  --  existe ------------------------------------------------------------
  /** 
  * Comprueba la existencia de un registro. Identificado de 
  * forma �nica con los par�metros de la funci�n. Actualiza 
  * el estado interno del Package para que los campos de 
  * la misma pueda ser recuperado por medio de una llamada 
  * a las funciones de campo.  
  *
  * @param  nIdexpe_  ID autonum�rico de expediente de preselecci�n de profesores.
  * @return Devuelve si existe o no un registro con la clave 
  *         primaria que se le pasa como par�metro
  */ 
  FUNCTION existe( 
            nIdexpe_ PP_EXPE.NIDEXPE%TYPE ) 
  RETURN BOOLEAN;
  PRAGMA RESTRICT_REFERENCES(existe, WNDS, RNPS);
END;
