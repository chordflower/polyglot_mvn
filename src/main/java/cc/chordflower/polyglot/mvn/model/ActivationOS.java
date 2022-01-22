package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * This is an activator which will detect an operating system's attributes in order to activate its profile.
 *
 * <p>Java class for ActivationOS complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActivationOS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="arch" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "ActivationOS" )
public class ActivationOS {

  @XmlAttribute( name = "name" )
  private String name;
  
  @XmlAttribute( name = "family" )
  private String family;

  @XmlAttribute( name = "arch" )
  private String arch;

  @XmlAttribute( name = "version" )
  private String version;

  @Contract( pure = true )
  public ActivationOS( String name, String family, String arch, String version ) {
    this.name = name;
    this.family = family;
    this.arch = arch;
    this.version = version;
  }

  @Contract( pure = true )
  public ActivationOS( ) {
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
   * Gets the value of the family property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getFamily( ) {
    return family;
  }

  /**
   * Sets the value of the family property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setFamily( String value ) {
    this.family = value;
  }

  /**
   * Gets the value of the arch property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getArch( ) {
    return arch;
  }

  /**
   * Sets the value of the arch property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setArch( String value ) {
    this.arch = value;
  }

  /**
   * Gets the value of the version property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getVersion( ) {
    return version;
  }

  /**
   * Sets the value of the version property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setVersion( String value ) {
    this.version = value;
  }

  public ActivationOS withName( String value ) {
    setName( value );
    return this;
  }

  public ActivationOS withFamily( String value ) {
    setFamily( value );
    return this;
  }

  public ActivationOS withArch( String value ) {
    setArch( value );
    return this;
  }

  public ActivationOS withVersion( String value ) {
    setVersion( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "name='" + name + "'" )
        .add( "family='" + family + "'" )
        .add( "arch='" + arch + "'" )
        .add( "version='" + version + "'" )
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
    ActivationOS that = ( ActivationOS ) o;
    return Objects.equals( name, that.name ) && Objects.equals( family, that.family ) && Objects.equals( arch, that.arch ) && Objects.equals( version, that.version );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( name, family, arch, version );
  }
}
