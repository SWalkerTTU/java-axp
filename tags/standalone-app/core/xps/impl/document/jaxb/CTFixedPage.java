//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.10.23 at 11:22:55 PM EDT 
//


package xps.impl.document.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import xps.api.model.document.page.IFixedPage;
import xps.api.model.document.page.IPageResources;


/**
 * <p>Java class for CT_FixedPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_FixedPage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}FixedPage.Resources" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}Path"/>
 *           &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}Glyphs"/>
 *           &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}Canvas"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://schemas.microsoft.com/xps/2005/06}AG_FixedPage"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_FixedPage", propOrder = {
    "fixedPageResources",
    "pathOrGlyphsOrCanvas"
})
public class CTFixedPage implements IFixedPage {

    @XmlElement(name = "FixedPage.Resources")
    protected CTCPResources fixedPageResources;
    @XmlElements({
        @XmlElement(name = "Path", type = CTPath.class),
        @XmlElement(name = "Glyphs", type = CTGlyphs.class),
        @XmlElement(name = "Canvas", type = CTCanvas.class)
    })
    protected List<Object> pathOrGlyphsOrCanvas;
    @XmlAttribute(name = "BleedBox")
    protected String bleedBox;
    @XmlAttribute(name = "ContentBox")
    protected String contentBox;
    @XmlAttribute(name = "Height", required = true)
    protected double height;
    @XmlAttribute(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String name;
    @XmlAttribute(name = "Width", required = true)
    protected double width;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    protected String lang;

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IFixedPage#getFixedPageResources()
	 */
    public IPageResources getFixedPageResources() {
        return fixedPageResources;
    }

    /**
     * Sets the value of the fixedPageResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTCPResources }
     *     
     */
    public void setFixedPageResources(CTCPResources value) {
        this.fixedPageResources = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IFixedPage#getPathOrGlyphsOrCanvas()
	 */
    public List<Object> getPathOrGlyphsOrCanvas() {
        if (pathOrGlyphsOrCanvas == null) {
            pathOrGlyphsOrCanvas = new ArrayList<Object>();
        }
        return this.pathOrGlyphsOrCanvas;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IFixedPage#getBleedBox()
	 */
    public String getBleedBox() {
        return bleedBox;
    }

    /**
     * Sets the value of the bleedBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBleedBox(String value) {
        this.bleedBox = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IFixedPage#getContentBox()
	 */
    public String getContentBox() {
        return contentBox;
    }

    /**
     * Sets the value of the contentBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentBox(String value) {
        this.contentBox = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IFixedPage#getHeight()
	 */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IFixedPage#getName()
	 */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IFixedPage#getWidth()
	 */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(double value) {
        this.width = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IFixedPage#getLang()
	 */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}