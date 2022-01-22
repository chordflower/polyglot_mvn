package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * This is the property specification used to activate a profile. If the value field
 *         is empty, then the existence of the named property will activate the profile, otherwise it does a case-sensitive match against the property value as well.
 *
 * <p>Java class for ActivationProperty complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActivationProperty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "ActivationProperty" )
public class ActivationProperty {

  @XmlAttribute( name = "name" )
  private String name;

  @XmlAttribute( name = "value" )
  private String value;

  @Contract( pure = true )
  public ActivationProperty( ) {
  }

  @Contract( pure = true )
  public ActivationProperty( String name, String value ) {
    this.name = name;
    this.value = value;
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
   * Gets the value of the value property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getValue( ) {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setValue( String value ) {
    this.value = value;
  }

  public ActivationProperty withName( String value ) {
    setName( value );
    return this;
  }

  public ActivationProperty withValue( String value ) {
    setValue( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "name='" + name + "'" )
        .add( "value='" + value + "'" )
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
    ActivationProperty that = ( ActivationProperty ) o;
    return Objects.equals( name, that.name ) && Objects.equals( value, that.value );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( name, value );
  }
}
