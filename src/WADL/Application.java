
package WADL;
        //
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2017.05.03 � 01:42:31 AM WEST 
//


import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://wadl.dev.java.net/2009/02}doc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://wadl.dev.java.net/2009/02}grammars" minOccurs="0"/>
 *         &lt;element ref="{http://wadl.dev.java.net/2009/02}resources" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://wadl.dev.java.net/2009/02}resource_type"/>
 *           &lt;element ref="{http://wadl.dev.java.net/2009/02}method"/>
 *           &lt;element ref="{http://wadl.dev.java.net/2009/02}representation"/>
 *           &lt;element ref="{http://wadl.dev.java.net/2009/02}param"/>
 *         &lt;/choice>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "doc",
    "grammars",
    "resources",
    "resourceTypeOrMethodOrRepresentation",
    "any"
})
@XmlRootElement(name = "application")
public class Application {

    protected List<Doc> doc;
    protected Grammars grammars;
    protected List<Resources> resources;
    @XmlElements({
        @XmlElement(name = "resource_type", type = ResourceType.class),
        @XmlElement(name = "method", type = Method.class),
        @XmlElement(name = "representation", type = Representation.class),
        @XmlElement(name = "param", type = Param.class)
    })
    protected List<Object> resourceTypeOrMethodOrRepresentation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     *
     * Gets the value of the doc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Doc }
     * 
     * 
     */
    public List<Doc> getDoc() {
        if (doc == null) {
            doc = new ArrayList<Doc>();
        }
        return this.doc;
    }

    /**
     * Obtient la valeur de la propri�t� grammars.
     * 
     * @return
     *     possible object is
     *     {@link Grammars }
     *     
     */
    public Grammars getGrammars() {
        return grammars;
    }

    /**
     * D�finit la valeur de la propri�t� grammars.
     * 
     * @param value
     *     allowed object is
     *     {@link Grammars }
     *     
     */
    public void setGrammars(Grammars value) {
        this.grammars = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resources }
     * 
     * 
     */
    public List<Resources> getResources() {
        if (resources == null) {
            resources = new ArrayList<Resources>();
        }
        return this.resources;
    }

    /**
     * Gets the value of the resourceTypeOrMethodOrRepresentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceTypeOrMethodOrRepresentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceTypeOrMethodOrRepresentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceType }
     * {@link Method }
     * {@link Representation }
     * {@link Param }
     * 
     * 
     */
    public List<Object> getResourceTypeOrMethodOrRepresentation() {
        if (resourceTypeOrMethodOrRepresentation == null) {
            resourceTypeOrMethodOrRepresentation = new ArrayList<Object>();
        }
        return this.resourceTypeOrMethodOrRepresentation;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }



    public void setDoc(List<Doc> doc) {
        this.doc = doc;
    }

    public void setResources(List<Resources> resources) {
        this.resources = resources;
    }

    public void setResourceTypeOrMethodOrRepresentation(List<Object> resourceTypeOrMethodOrRepresentation) {
        this.resourceTypeOrMethodOrRepresentation = resourceTypeOrMethodOrRepresentation;
    }

    public void setAny(List<Object> any) {
        this.any = any;
    }




    @Override
    public String toString() {
        return "Application{" +
                "doc=" + doc + '\n' +
                ", grammars=" + grammars + '\n' +
                ", resources=" + resources + '\n' +
                ", resourceTypeOrMethodOrRepresentation=" + resourceTypeOrMethodOrRepresentation + '\n' +
                ", any=" + any + '\n' +
                '}';
    }
}
