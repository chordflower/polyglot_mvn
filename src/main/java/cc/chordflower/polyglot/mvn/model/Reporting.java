package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Section for management of reports and their configuration.
 *
 * <p>Java class for Reporting complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Reporting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plugin" type="{https://chordflower.cc/schemas/maven}ReportPlugin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="excludeDefaults" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="outputDirectory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "Reporting", propOrder = {
    "plugin"
} )
public class Reporting {

  @Valid
  private final List< ReportPlugin > plugin = new ArrayList<>( );

  @XmlAttribute( name = "excludeDefaults" )
  private Boolean excludeDefaults;

  @XmlAttribute( name = "outputDirectory" )
  private String outputDirectory;

  public Reporting( ) {
  }

  /**
   * Gets the value of the plugin property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the plugin property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPlugin().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ReportPlugin }
   *
   *
   */
  public List< ReportPlugin > getPlugin( ) {
    return this.plugin;
  }

  /**
   * Gets the value of the excludeDefaults property.
   * This getter has been renamed from isExcludeDefaults() to getExcludeDefaults() by cxf-xjc-boolean plugin.
   *
   * @return
   *     possible object is
   *     {@link Boolean }
   *
   */
  public boolean getExcludeDefaults( ) {
    return Objects.requireNonNullElse( excludeDefaults, false );
  }

  /**
   * Sets the value of the excludeDefaults property.
   *
   * @param value
   *     allowed object is
   *     {@link Boolean }
   *
   */
  public void setExcludeDefaults( Boolean value ) {
    this.excludeDefaults = value;
  }

  /**
   * Gets the value of the outputDirectory property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getOutputDirectory( ) {
    return outputDirectory;
  }

  /**
   * Sets the value of the outputDirectory property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setOutputDirectory( String value ) {
    this.outputDirectory = value;
  }

  public Reporting withPlugin( ReportPlugin... values ) {
    if( values != null ) {
      Arrays.stream( values ).forEach( value -> getPlugin( ).add( value ) );
    }
    return this;
  }

  public Reporting withPlugin( Collection< ReportPlugin > values ) {
    if( values != null ) {
      getPlugin( ).addAll( values );
    }
    return this;
  }

  public Reporting withExcludeDefaults( Boolean value ) {
    setExcludeDefaults( value );
    return this;
  }

  public Reporting withOutputDirectory( String value ) {
    setOutputDirectory( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "plugin=" + plugin )
        .add( "excludeDefaults=" + excludeDefaults )
        .add( "outputDirectory='" + outputDirectory + "'" )
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
    Reporting reporting = ( Reporting ) o;
    return Objects.equals( plugin, reporting.plugin ) && Objects.equals( excludeDefaults, reporting.excludeDefaults ) && Objects.equals( outputDirectory, reporting.outputDirectory );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( plugin, excludeDefaults, outputDirectory );
  }
}
