package org.la.foows.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;

/**
 * The Class Bar.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Bar {

	/** The date. */
	@XmlElement(name = "d")
	@XmlSchemaType(name="date")
	private Date d;
	
	/** The s. */
	private String s;
	
	/** The bd list. */
	private List<BigDecimal> bdList;

	/**
	 * Gets the d.
	 *
	 * @return the d
	 */
	public Date getD() {
		return d;
	}

	/**
	 * Sets the d.
	 *
	 * @param d the d
	 */
	public void setD(Date d) {
		this.d = d;
	}

	/**
	 * Gets the s.
	 *
	 * @return the s
	 */
	public String getS() {
		return s;
	}

	/**
	 * Sets the s.
	 *
	 * @param s the s
	 */
	public void setS(String s) {
		this.s = s;
	}

	/**
	 * Gets the bd list.
	 *
	 * @return the bd list
	 */
	public List<BigDecimal> getBdList() {
		return bdList;
	}

	/**
	 * Sets the bd list.
	 *
	 * @param bdList the bd list
	 */
	public void setBdList(List<BigDecimal> bdList) {
		this.bdList = bdList;
	}
	
}
