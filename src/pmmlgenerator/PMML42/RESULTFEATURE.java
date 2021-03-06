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
 * <p>Clase Java para RESULT-FEATURE.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RESULT-FEATURE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="predictedValue"/>
 *     &lt;enumeration value="predictedDisplayValue"/>
 *     &lt;enumeration value="transformedValue"/>
 *     &lt;enumeration value="decision"/>
 *     &lt;enumeration value="probability"/>
 *     &lt;enumeration value="affinity"/>
 *     &lt;enumeration value="residual"/>
 *     &lt;enumeration value="standardError"/>
 *     &lt;enumeration value="clusterId"/>
 *     &lt;enumeration value="clusterAffinity"/>
 *     &lt;enumeration value="entityId"/>
 *     &lt;enumeration value="entityAffinity"/>
 *     &lt;enumeration value="warning"/>
 *     &lt;enumeration value="ruleValue"/>
 *     &lt;enumeration value="reasonCode"/>
 *     &lt;enumeration value="antecedent"/>
 *     &lt;enumeration value="consequent"/>
 *     &lt;enumeration value="rule"/>
 *     &lt;enumeration value="ruleId"/>
 *     &lt;enumeration value="confidence"/>
 *     &lt;enumeration value="support"/>
 *     &lt;enumeration value="lift"/>
 *     &lt;enumeration value="leverage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RESULT-FEATURE")
@XmlEnum
public enum RESULTFEATURE {

    @XmlEnumValue("predictedValue")
    PREDICTED_VALUE("predictedValue"),
    @XmlEnumValue("predictedDisplayValue")
    PREDICTED_DISPLAY_VALUE("predictedDisplayValue"),
    @XmlEnumValue("transformedValue")
    TRANSFORMED_VALUE("transformedValue"),
    @XmlEnumValue("decision")
    DECISION("decision"),
    @XmlEnumValue("probability")
    PROBABILITY("probability"),
    @XmlEnumValue("affinity")
    AFFINITY("affinity"),
    @XmlEnumValue("residual")
    RESIDUAL("residual"),
    @XmlEnumValue("standardError")
    STANDARD_ERROR("standardError"),
    @XmlEnumValue("clusterId")
    CLUSTER_ID("clusterId"),
    @XmlEnumValue("clusterAffinity")
    CLUSTER_AFFINITY("clusterAffinity"),
    @XmlEnumValue("entityId")
    ENTITY_ID("entityId"),
    @XmlEnumValue("entityAffinity")
    ENTITY_AFFINITY("entityAffinity"),
    @XmlEnumValue("warning")
    WARNING("warning"),
    @XmlEnumValue("ruleValue")
    RULE_VALUE("ruleValue"),
    @XmlEnumValue("reasonCode")
    REASON_CODE("reasonCode"),
    @XmlEnumValue("antecedent")
    ANTECEDENT("antecedent"),
    @XmlEnumValue("consequent")
    CONSEQUENT("consequent"),
    @XmlEnumValue("rule")
    RULE("rule"),
    @XmlEnumValue("ruleId")
    RULE_ID("ruleId"),
    @XmlEnumValue("confidence")
    CONFIDENCE("confidence"),
    @XmlEnumValue("support")
    SUPPORT("support"),
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("leverage")
    LEVERAGE("leverage");
    private final String value;

    RESULTFEATURE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RESULTFEATURE fromValue(String v) {
        for (RESULTFEATURE c: RESULTFEATURE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
