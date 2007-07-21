package xps.api.model.document.page;

import xps.api.model.document.ILinkTargets;
import xps.impl.document.jaxb.CTCPLinkTargets;

public interface IPageContent {

	/**
	 * Gets the value of the pageContentLinkTargets property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link CTCPLinkTargets }
	 *     
	 */
	public abstract ILinkTargets getPageContentLinkTargets();

	/**
	 * Gets the value of the height property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *     
	 */
	public abstract Double getHeight();

	/**
	 * Gets the value of the source property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getSource();

	/**
	 * Gets the value of the width property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *     
	 */
	public abstract Double getWidth();

}