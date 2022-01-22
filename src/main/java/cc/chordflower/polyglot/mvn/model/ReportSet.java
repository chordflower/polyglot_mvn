package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;
import org.w3c.dom.Element;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Represents a set of reports and configuration to be used to generate them.
 *
 * <p>Java class for ReportSet complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ReportSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="reports" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="report" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="configuration" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" default="default" /&gt;
 *       &lt;attribute name="inherited" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "ReportSet", propOrder = {

} )
public class ReportSet {

  @Valid
  private ReportSet.Reports reports;

  @Valid
  private ReportSet.Configuration configuration;

  @XmlAttribute( name = "id" )
  private String id;

  @XmlAttribute( name = "inherited" )
  private Boolean inherited;

  @Contract( pure = true )
  public ReportSet( ) {
  }

  @Contract( pure = true )
  public ReportSet( Reports reports, Configuration configuration, String id, Boolean inherited ) {
    this.reports = reports;
    this.configuration = configuration;
    this.id = id;
    this.inherited = inherited;
  }

  /**
   * Gets the value of the reports property.
   *
   * @return
   *     possible object is
   *     {@link ReportSet.Reports }
   *
   */
  public ReportSet.Reports getReports( ) {
    return reports;
  }

  /**
   * Sets the value of the reports property.
   *
   * @param value
   *     allowed object is
   *     {@link ReportSet.Reports }
   *
   */
  public void setReports( ReportSet.Reports value ) {
    this.reports = value;
  }

  /**
   * Gets the value of the configuration property.
   *
   * @return
   *     possible object is
   *     {@link ReportSet.Configuration }
   *
   */
  public ReportSet.Configuration getConfiguration( ) {
    return configuration;
  }

  /**
   * Sets the value of the configuration property.
   *
   * @param value
   *     allowed object is
   *     {@link ReportSet.Configuration }
   *
   */
  public void setConfiguration( ReportSet.Configuration value ) {
    this.configuration = value;
  }

  /**
   * Gets the value of the id property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getId( ) {
    if( id == null ) {
      return "default";
    } else {
      return id;
    }
  }

  /**
   * Sets the value of the id property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setId( String value ) {
    this.id = value;
  }

  /**
   * Gets the value of the inherited property.
   * This getter has been renamed from isInherited() to getInherited() by cxf-xjc-boolean plugin.
   *
   * @return
   *     possible object is
   *     {@link Boolean }
   *
   */
  public boolean getInherited( ) {
    return Objects.requireNonNullElse( inherited, true );
  }

  /**
   * Sets the value of the inherited property.
   *
   * @param value
   *     allowed object is
   *     {@link Boolean }
   *
   */
  public void setInherited( Boolean value ) {
    this.inherited = value;
  }

  public ReportSet withReports( ReportSet.Reports value ) {
    setReports( value );
    return this;
  }

  public ReportSet withConfiguration( ReportSet.Configuration value ) {
    setConfiguration( value );
    return this;
  }

  public ReportSet withId( String value ) {
    setId( value );
    return this;
  }

  public ReportSet withInherited( Boolean value ) {
    setInherited( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "reports=" + reports )
        .add( "configuration=" + configuration )
        .add( "id='" + id + "'" )
        .add( "inherited=" + inherited )
        .toString( );
  }

  @Contract( value = "null -> false", pure = true )
  @Override
  public boolean equals( Object o ) {
    if( this == o ) {
      return true;
    }
    if( o == null || getClass( ) != o.getClass( ) ) {
      return false;
    }
    ReportSet reportSet = ( ReportSet ) o;
    return Objects.equals( reports, reportSet.reports ) && Objects.equals( configuration, reportSet.configuration ) && Objects.equals( id, reportSet.id ) && Objects.equals( inherited, reportSet.inherited );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( reports, configuration, id, inherited );
  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   *
   *
   */
  @XmlAccessorType( XmlAccessType.FIELD )
  @XmlType( name = "", propOrder = {
      "any"
  } )
  public static class Configuration {

    @XmlAnyElement
    private final List< Element > any = new ArrayList<>( );

    public Configuration( ) {
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
     * {@link Element }
     *
     *
     */
    public List< Element > getAny( ) {
      return this.any;
    }

    public ReportSet.Configuration withAny( Element... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getAny( ).add( value ) );
      }
      return this;
    }

    public ReportSet.Configuration withAny( Collection< Element > values ) {
      if( values != null ) {
        getAny( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "any=" + any )
          .toString( );
    }

    @Contract( value = "null -> false", pure = true )
    @Override
    public boolean equals( Object o ) {
      if( this == o ) {
        return true;
      }
      if( o == null || getClass( ) != o.getClass( ) ) {
        return false;
      }
      Configuration that = ( Configuration ) o;
      return Objects.equals( any, that.any );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( any );
    }
  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="report" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   *
   *
   */
  @XmlAccessorType( XmlAccessType.FIELD )
  @XmlType( name = "", propOrder = {
      "report"
  } )
  public static class Reports {

    private final List< String > report = new ArrayList<>( );

    public Reports( ) {
    }

    /**
     * Gets the value of the report property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the report property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReport().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List< String > getReport( ) {
      return this.report;
    }

    public ReportSet.Reports withReport( String... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getReport( ).add( value ) );
      }
      return this;
    }

    public ReportSet.Reports withReport( Collection< String > values ) {
      if( values != null ) {
        getReport( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "report=" + report )
          .toString( );
    }

    @Contract( value = "null -> false", pure = true )
    @Override
    public boolean equals( Object o ) {
      if( this == o ) {
        return true;
      }
      if( o == null || getClass( ) != o.getClass( ) ) {
        return false;
      }
      Reports reports = ( Reports ) o;
      return Objects.equals( report, reports.report );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( report );
    }
  }

}
