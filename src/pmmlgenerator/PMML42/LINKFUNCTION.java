//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.07.12 a las 12:57:26 PM CEST 
//


package pmmlgenerator.PMML42;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LINK-FUNCTION.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="LINK-FUNCTION">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cloglog"/>
 *     &lt;enumeration value="identity"/>
 *     &lt;enumeration value="log"/>
 *     &lt;enumeration value="logc"/>
 *     &lt;enumeration value="logit"/>
 *     &lt;enumeration value="loglog"/>
 *     &lt;enumeration value="negbin"/>
 *     &lt;enumeration value="oddspower"/>
 *     &lt;enumeration value="power"/>
 *     &lt;enumeration value="probit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LINK-FUNCTION")
@XmlEnum
public enum LINKFUNCTION {

    @XmlEnumValue("cloglog")
    CLOGLOG("cloglog"),
    @XmlEnumValue("identity")
    IDENTITY("identity"),
    @XmlEnumValue("log")
    LOG("log"),
    @XmlEnumValue("logc")
    LOGC("logc"),
    @XmlEnumValue("logit")
    LOGIT("logit"),
    @XmlEnumValue("loglog")
    LOGLOG("loglog"),
    @XmlEnumValue("negbin")
    NEGBIN("negbin"),
    @XmlEnumValue("oddspower")
    ODDSPOWER("oddspower"),
    @XmlEnumValue("power")
    POWER("power"),
    @XmlEnumValue("probit")
    PROBIT("probit");
    private final String value;

    LINKFUNCTION(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LINKFUNCTION fromValue(String v) {
        for (LINKFUNCTION c: LINKFUNCTION.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
