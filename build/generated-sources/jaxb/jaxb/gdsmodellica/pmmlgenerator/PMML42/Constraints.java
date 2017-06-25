//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.06.18 a las 09:08:21 AM CEST 
//


package jaxb.gdsmodellica.pmmlgenerator.PMML42;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_2}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="minimumNumberOfItems" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" default="1" />
 *       &lt;attribute name="maximumNumberOfItems" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="minimumNumberOfAntecedentItems" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" default="1" />
 *       &lt;attribute name="maximumNumberOfAntecedentItems" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="minimumNumberOfConsequentItems" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" default="1" />
 *       &lt;attribute name="maximumNumberOfConsequentItems" type="{http://www.dmg.org/PMML-4_2}INT-NUMBER" />
 *       &lt;attribute name="minimumSupport" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" default="0" />
 *       &lt;attribute name="minimumConfidence" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" default="0" />
 *       &lt;attribute name="minimumLift" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" default="0" />
 *       &lt;attribute name="minimumTotalSequenceTime" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" default="0" />
 *       &lt;attribute name="maximumTotalSequenceTime" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *       &lt;attribute name="minimumItemsetSeparationTime" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" default="0" />
 *       &lt;attribute name="maximumItemsetSeparationTime" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *       &lt;attribute name="minimumAntConsSeparationTime" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" default="0" />
 *       &lt;attribute name="maximumAntConsSeparationTime" type="{http://www.dmg.org/PMML-4_2}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension"
})
@XmlRootElement(name = "Constraints")
public class Constraints {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "minimumNumberOfItems")
    protected BigInteger minimumNumberOfItems;
    @XmlAttribute(name = "maximumNumberOfItems")
    protected BigInteger maximumNumberOfItems;
    @XmlAttribute(name = "minimumNumberOfAntecedentItems")
    protected BigInteger minimumNumberOfAntecedentItems;
    @XmlAttribute(name = "maximumNumberOfAntecedentItems")
    protected BigInteger maximumNumberOfAntecedentItems;
    @XmlAttribute(name = "minimumNumberOfConsequentItems")
    protected BigInteger minimumNumberOfConsequentItems;
    @XmlAttribute(name = "maximumNumberOfConsequentItems")
    protected BigInteger maximumNumberOfConsequentItems;
    @XmlAttribute(name = "minimumSupport")
    protected Double minimumSupport;
    @XmlAttribute(name = "minimumConfidence")
    protected Double minimumConfidence;
    @XmlAttribute(name = "minimumLift")
    protected Double minimumLift;
    @XmlAttribute(name = "minimumTotalSequenceTime")
    protected Double minimumTotalSequenceTime;
    @XmlAttribute(name = "maximumTotalSequenceTime")
    protected Double maximumTotalSequenceTime;
    @XmlAttribute(name = "minimumItemsetSeparationTime")
    protected Double minimumItemsetSeparationTime;
    @XmlAttribute(name = "maximumItemsetSeparationTime")
    protected Double maximumItemsetSeparationTime;
    @XmlAttribute(name = "minimumAntConsSeparationTime")
    protected Double minimumAntConsSeparationTime;
    @XmlAttribute(name = "maximumAntConsSeparationTime")
    protected Double maximumAntConsSeparationTime;

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

    /**
     * Obtiene el valor de la propiedad minimumNumberOfItems.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNumberOfItems() {
        if (minimumNumberOfItems == null) {
            return new BigInteger("1");
        } else {
            return minimumNumberOfItems;
        }
    }

    /**
     * Define el valor de la propiedad minimumNumberOfItems.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNumberOfItems(BigInteger value) {
        this.minimumNumberOfItems = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumNumberOfItems.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfItems() {
        return maximumNumberOfItems;
    }

    /**
     * Define el valor de la propiedad maximumNumberOfItems.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfItems(BigInteger value) {
        this.maximumNumberOfItems = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumNumberOfAntecedentItems.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNumberOfAntecedentItems() {
        if (minimumNumberOfAntecedentItems == null) {
            return new BigInteger("1");
        } else {
            return minimumNumberOfAntecedentItems;
        }
    }

    /**
     * Define el valor de la propiedad minimumNumberOfAntecedentItems.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNumberOfAntecedentItems(BigInteger value) {
        this.minimumNumberOfAntecedentItems = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumNumberOfAntecedentItems.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfAntecedentItems() {
        return maximumNumberOfAntecedentItems;
    }

    /**
     * Define el valor de la propiedad maximumNumberOfAntecedentItems.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfAntecedentItems(BigInteger value) {
        this.maximumNumberOfAntecedentItems = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumNumberOfConsequentItems.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNumberOfConsequentItems() {
        if (minimumNumberOfConsequentItems == null) {
            return new BigInteger("1");
        } else {
            return minimumNumberOfConsequentItems;
        }
    }

    /**
     * Define el valor de la propiedad minimumNumberOfConsequentItems.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNumberOfConsequentItems(BigInteger value) {
        this.minimumNumberOfConsequentItems = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumNumberOfConsequentItems.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfConsequentItems() {
        return maximumNumberOfConsequentItems;
    }

    /**
     * Define el valor de la propiedad maximumNumberOfConsequentItems.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfConsequentItems(BigInteger value) {
        this.maximumNumberOfConsequentItems = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumSupport.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMinimumSupport() {
        if (minimumSupport == null) {
            return  0.0D;
        } else {
            return minimumSupport;
        }
    }

    /**
     * Define el valor de la propiedad minimumSupport.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumSupport(Double value) {
        this.minimumSupport = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumConfidence.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMinimumConfidence() {
        if (minimumConfidence == null) {
            return  0.0D;
        } else {
            return minimumConfidence;
        }
    }

    /**
     * Define el valor de la propiedad minimumConfidence.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumConfidence(Double value) {
        this.minimumConfidence = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumLift.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMinimumLift() {
        if (minimumLift == null) {
            return  0.0D;
        } else {
            return minimumLift;
        }
    }

    /**
     * Define el valor de la propiedad minimumLift.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumLift(Double value) {
        this.minimumLift = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumTotalSequenceTime.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMinimumTotalSequenceTime() {
        if (minimumTotalSequenceTime == null) {
            return  0.0D;
        } else {
            return minimumTotalSequenceTime;
        }
    }

    /**
     * Define el valor de la propiedad minimumTotalSequenceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumTotalSequenceTime(Double value) {
        this.minimumTotalSequenceTime = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumTotalSequenceTime.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumTotalSequenceTime() {
        return maximumTotalSequenceTime;
    }

    /**
     * Define el valor de la propiedad maximumTotalSequenceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumTotalSequenceTime(Double value) {
        this.maximumTotalSequenceTime = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumItemsetSeparationTime.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMinimumItemsetSeparationTime() {
        if (minimumItemsetSeparationTime == null) {
            return  0.0D;
        } else {
            return minimumItemsetSeparationTime;
        }
    }

    /**
     * Define el valor de la propiedad minimumItemsetSeparationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumItemsetSeparationTime(Double value) {
        this.minimumItemsetSeparationTime = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumItemsetSeparationTime.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumItemsetSeparationTime() {
        return maximumItemsetSeparationTime;
    }

    /**
     * Define el valor de la propiedad maximumItemsetSeparationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumItemsetSeparationTime(Double value) {
        this.maximumItemsetSeparationTime = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumAntConsSeparationTime.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMinimumAntConsSeparationTime() {
        if (minimumAntConsSeparationTime == null) {
            return  0.0D;
        } else {
            return minimumAntConsSeparationTime;
        }
    }

    /**
     * Define el valor de la propiedad minimumAntConsSeparationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumAntConsSeparationTime(Double value) {
        this.minimumAntConsSeparationTime = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumAntConsSeparationTime.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumAntConsSeparationTime() {
        return maximumAntConsSeparationTime;
    }

    /**
     * Define el valor de la propiedad maximumAntConsSeparationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumAntConsSeparationTime(Double value) {
        this.maximumAntConsSeparationTime = value;
    }

}
