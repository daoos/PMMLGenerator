//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.06.18 a las 09:08:24 AM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML43;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TIME-ANCHORS.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TIME-ANCHORS">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dateTimeMillisecondsSince[0]"/>
 *     &lt;enumeration value="dateTimeMillisecondsSince[1960]"/>
 *     &lt;enumeration value="dateTimeMillisecondsSince[1970]"/>
 *     &lt;enumeration value="dateTimeMillisecondsSince[1980]"/>
 *     &lt;enumeration value="dateTimeSecondsSince[0]"/>
 *     &lt;enumeration value="dateTimeSecondsSince[1960]"/>
 *     &lt;enumeration value="dateTimeSecondsSince[1970]"/>
 *     &lt;enumeration value="dateTimeSecondsSince[1980]"/>
 *     &lt;enumeration value="dateDaysSince[0]"/>
 *     &lt;enumeration value="dateDaysSince[1960]"/>
 *     &lt;enumeration value="dateDaysSince[1970]"/>
 *     &lt;enumeration value="dateDaysSince[1980]"/>
 *     &lt;enumeration value="dateMonthsSince[0]"/>
 *     &lt;enumeration value="dateMonthsSince[1960]"/>
 *     &lt;enumeration value="dateMonthsSince[1970]"/>
 *     &lt;enumeration value="dateMonthsSince[1980]"/>
 *     &lt;enumeration value="dateYearsSince[0]"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TIME-ANCHORS")
@XmlEnum
public enum TIMEANCHORS {

    @XmlEnumValue("dateTimeMillisecondsSince[0]")
    DATE_TIME_MILLISECONDS_SINCE_0("dateTimeMillisecondsSince[0]"),
    @XmlEnumValue("dateTimeMillisecondsSince[1960]")
    DATE_TIME_MILLISECONDS_SINCE_1960("dateTimeMillisecondsSince[1960]"),
    @XmlEnumValue("dateTimeMillisecondsSince[1970]")
    DATE_TIME_MILLISECONDS_SINCE_1970("dateTimeMillisecondsSince[1970]"),
    @XmlEnumValue("dateTimeMillisecondsSince[1980]")
    DATE_TIME_MILLISECONDS_SINCE_1980("dateTimeMillisecondsSince[1980]"),
    @XmlEnumValue("dateTimeSecondsSince[0]")
    DATE_TIME_SECONDS_SINCE_0("dateTimeSecondsSince[0]"),
    @XmlEnumValue("dateTimeSecondsSince[1960]")
    DATE_TIME_SECONDS_SINCE_1960("dateTimeSecondsSince[1960]"),
    @XmlEnumValue("dateTimeSecondsSince[1970]")
    DATE_TIME_SECONDS_SINCE_1970("dateTimeSecondsSince[1970]"),
    @XmlEnumValue("dateTimeSecondsSince[1980]")
    DATE_TIME_SECONDS_SINCE_1980("dateTimeSecondsSince[1980]"),
    @XmlEnumValue("dateDaysSince[0]")
    DATE_DAYS_SINCE_0("dateDaysSince[0]"),
    @XmlEnumValue("dateDaysSince[1960]")
    DATE_DAYS_SINCE_1960("dateDaysSince[1960]"),
    @XmlEnumValue("dateDaysSince[1970]")
    DATE_DAYS_SINCE_1970("dateDaysSince[1970]"),
    @XmlEnumValue("dateDaysSince[1980]")
    DATE_DAYS_SINCE_1980("dateDaysSince[1980]"),
    @XmlEnumValue("dateMonthsSince[0]")
    DATE_MONTHS_SINCE_0("dateMonthsSince[0]"),
    @XmlEnumValue("dateMonthsSince[1960]")
    DATE_MONTHS_SINCE_1960("dateMonthsSince[1960]"),
    @XmlEnumValue("dateMonthsSince[1970]")
    DATE_MONTHS_SINCE_1970("dateMonthsSince[1970]"),
    @XmlEnumValue("dateMonthsSince[1980]")
    DATE_MONTHS_SINCE_1980("dateMonthsSince[1980]"),
    @XmlEnumValue("dateYearsSince[0]")
    DATE_YEARS_SINCE_0("dateYearsSince[0]");
    private final String value;

    TIMEANCHORS(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIMEANCHORS fromValue(String v) {
        for (TIMEANCHORS c: TIMEANCHORS.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
