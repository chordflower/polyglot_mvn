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
 * Describes the licenses for this project. This is used to generate the license
 *         page of the project's web site, as well as being taken into consideration in other reporting and validation. The licenses listed for the project are that of the project itself, and not
 *         of dependencies.
 *
 * <p>Java class for License complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="License"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="distribution" type="{https://chordflower.cc/schemas/maven}dist" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "License", propOrder = {

} )
public class License {

  @XmlSchemaType( name = "anyURI" )
  private String url;

  @XmlSchemaType( name = "string" )
  private Dist distribution;

  private String comments;

  @XmlAttribute( name = "name" )
  private String name;

  @Contract( pure = true )
  public License( ) {
  }

  @Contract( pure = true )
  public License( String url, String name ) {
    this.url = url;
    this.name = name;
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

  /**
   * Gets the value of the distribution property.
   *
   * @return
   *     possible object is
   *     {@link Dist }
   *
   */
  public Dist getDistribution( ) {
    return distribution;
  }

  /**
   * Sets the value of the distribution property.
   *
   * @param value
   *     allowed object is
   *     {@link Dist }
   *
   */
  public void setDistribution( Dist value ) {
    this.distribution = value;
  }

  /**
   * Gets the value of the comments property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getComments( ) {
    return comments;
  }

  /**
   * Sets the value of the comments property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setComments( String value ) {
    this.comments = value;
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

  public License withUrl( String value ) {
    setUrl( value );
    return this;
  }

  public License withDistribution( Dist value ) {
    setDistribution( value );
    return this;
  }

  public License withComments( String value ) {
    setComments( value );
    return this;
  }

  public License withName( String value ) {
    setName( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "url='" + url + "'" )
        .add( "distribution=" + distribution )
        .add( "comments='" + comments + "'" )
        .add( "name='" + name + "'" )
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
    License license = ( License ) o;
    return Objects.equals( url, license.url ) && distribution == license.distribution && Objects.equals( comments, license.comments ) && Objects.equals( name, license.name );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( url, distribution, comments, name );
  }
}
