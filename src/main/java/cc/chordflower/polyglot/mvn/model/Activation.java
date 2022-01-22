package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The conditions within the build runtime environment which will trigger the
 *       automatic inclusion of the build profile. Multiple conditions can be defined, which must be all satisfied to activate the profile.
 *
 * <p>Java class for Activation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Activation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="jdk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="os" type="{https://chordflower.cc/schemas/maven}ActivationOS" minOccurs="0"/&gt;
 *         &lt;element name="property" type="{https://chordflower.cc/schemas/maven}ActivationProperty" minOccurs="0"/&gt;
 *         &lt;element name="file" type="{https://chordflower.cc/schemas/maven}ActivationFile" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="activeByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "Activation", propOrder = {

} )
public class Activation {

  private String jdk;

  @Valid
  private ActivationOS os;

  @Valid
  private ActivationProperty property;

  @Valid
  private ActivationFile file;

  @XmlAttribute( name = "activeByDefault" )
  private Boolean activeByDefault;

  @Contract( pure = true )
  public Activation( ) {
  }

  /**
   * Gets the value of the jdk property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getJdk( ) {
    return jdk;
  }

  /**
   * Sets the value of the jdk property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setJdk( String value ) {
    this.jdk = value;
  }

  /**
   * Gets the value of the os property.
   *
   * @return
   *     possible object is
   *     {@link ActivationOS }
   *
   */
  public ActivationOS getOs( ) {
    return os;
  }

  /**
   * Sets the value of the os property.
   *
   * @param value
   *     allowed object is
   *     {@link ActivationOS }
   *
   */
  public void setOs( ActivationOS value ) {
    this.os = value;
  }

  /**
   * Gets the value of the property property.
   *
   * @return
   *     possible object is
   *     {@link ActivationProperty }
   *
   */
  public ActivationProperty getProperty( ) {
    return property;
  }

  /**
   * Sets the value of the property property.
   *
   * @param value
   *     allowed object is
   *     {@link ActivationProperty }
   *
   */
  public void setProperty( ActivationProperty value ) {
    this.property = value;
  }

  /**
   * Gets the value of the file property.
   *
   * @return
   *     possible object is
   *     {@link ActivationFile }
   *
   */
  public ActivationFile getFile( ) {
    return file;
  }

  /**
   * Sets the value of the file property.
   *
   * @param value
   *     allowed object is
   *     {@link ActivationFile }
   *
   */
  public void setFile( ActivationFile value ) {
    this.file = value;
  }

  /**
   * Gets the value of the activeByDefault property.
   * This getter has been renamed from isActiveByDefault() to getActiveByDefault() by cxf-xjc-boolean plugin.
   *
   * @return
   *     possible object is
   *     {@link Boolean }
   *
   */
  public boolean getActiveByDefault( ) {
    return Objects.requireNonNullElse( activeByDefault, false );
  }

  /**
   * Sets the value of the activeByDefault property.
   *
   * @param value
   *     allowed object is
   *     {@link Boolean }
   *
   */
  public void setActiveByDefault( Boolean value ) {
    this.activeByDefault = value;
  }

  public Activation withJdk( String value ) {
    setJdk( value );
    return this;
  }

  public Activation withOs( ActivationOS value ) {
    setOs( value );
    return this;
  }

  public Activation withProperty( ActivationProperty value ) {
    setProperty( value );
    return this;
  }

  public Activation withFile( ActivationFile value ) {
    setFile( value );
    return this;
  }

  public Activation withActiveByDefault( Boolean value ) {
    setActiveByDefault( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "jdk='" + jdk + "'" )
        .add( "os=" + os )
        .add( "property=" + property )
        .add( "file=" + file )
        .add( "activeByDefault=" + activeByDefault )
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
    Activation that = ( Activation ) o;
    return Objects.equals( jdk, that.jdk ) && Objects.equals( os, that.os ) && Objects.equals( property, that.property ) && Objects.equals( file, that.file ) && Objects.equals( activeByDefault, that.activeByDefault );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( jdk, os, property, file, activeByDefault );
  }
}
