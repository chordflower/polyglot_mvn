package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.util.StringJoiner;


/**
 * Contains the information needed for deploying websites.
 *
 * <p>Java class for Site complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Site"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "Site" )
public class Site {

  @XmlAttribute( name = "id", required = true )
  @NotNull
  private String id;

  @XmlAttribute( name = "name" )
  private String name;

  @XmlAttribute( name = "url" )
  @XmlSchemaType( name = "anyURI" )
  private String url;

  @Contract( pure = true )
  public Site( ) {
  }

  @Contract( pure = true )
  public Site( String id, String name, String url ) {
    this.id = id;
    this.name = name;
    this.url = url;
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
    return id;
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
   * Gets the value of the name property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getName( ) {
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
  public void setName( String value ) {
    this.name = value;
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

  public Site withId( String value ) {
    setId( value );
    return this;
  }

  public Site withName( String value ) {
    setName( value );
    return this;
  }

  public Site withUrl( String value ) {
    setUrl( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "id='" + id + "'" )
        .add( "name='" + name + "'" )
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
    Site site = ( Site ) o;
    return Objects.equals( id, site.id ) && Objects.equals( name, site.name ) && Objects.equals( url, site.url );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, name, url );
  }
}
