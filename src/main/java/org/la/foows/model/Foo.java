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
 * The Class Foo.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Foo {

	/** The s. */
	private String s;
	
	/** The date. */
	@XmlElement(name = "date")
	@XmlSchemaType(name="date")
	private Date date;
	
	/** The bd. */
	private BigDecimal bd;
	
	/** The bar. */
	private Bar bar;
	
	/** The bar list. */
	private List<Bar> barList;

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
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Gets the bd.
	 *
	 * @return the bd
	 */
	public BigDecimal getBd() {
		return bd;
	}

	/**
	 * Sets the bd.
	 *
	 * @param bd the bd
	 */
	public void setBd(BigDecimal bd) {
		this.bd = bd;
	}

	/**
	 * Gets the bar.
	 *
	 * @return the bar
	 */
	public Bar getBar() {
		return bar;
	}

	/**
	 * Sets the bar.
	 *
	 * @param bar the bar
	 */
	public void setBar(Bar bar) {
		this.bar = bar;
	}

	/**
	 * Gets the bar list.
	 *
	 * @return the bar list
	 */
	public List<Bar> getBarList() {
		return barList;
	}

	/**
	 * Sets the bar list.
	 *
	 * @param barList the bar list
	 */
	public void setBarList(List<Bar> barList) {
		this.barList = barList;
	}
	
	
	
}
