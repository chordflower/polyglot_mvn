package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Information about the issue tracking (or bug tracking) system used to manage this project.
 *
 * <p>Java class for IssueManagement complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="IssueManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="system" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "IssueManagement" )
public class IssueManagement {

  @XmlAttribute( name = "system" )
  private String system;

  @XmlAttribute( name = "url" )
  @XmlSchemaType( name = "anyURI" )
  private String url;

  @Contract( pure = true )
  public IssueManagement( String system, String url ) {
    this.system = system;
    this.url = url;
  }

  @Contract( pure = true )
  public IssueManagement( ) {
  }

  /**
   * Gets the value of the system property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getSystem( ) {
    return system;
  }

  /**
   * Sets the value of the system property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setSystem( String value ) {
    this.system = value;
  }

  /**
   * Gets the value of the url property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getUrl( ) {
    return url;
  }

  /**
   * Sets the value of the url property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setUrl( String value ) {
    this.url = value;
  }

  public IssueManagement withSystem( String value ) {
    setSystem( value );
    return this;
  }

  public IssueManagement withUrl( String value ) {
    setUrl( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "system='" + system + "'" )
        .add( "url='" + url + "'" )
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
    var that = ( IssueManagement ) o;
    return Objects.equals( system, that.system ) && Objects.equals( url, that.url );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( system, url );
  }
}
