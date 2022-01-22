package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * This is the file specification used to activate the profile. The `missing` value
 *         is the location of a file that needs to exist, and if it doesn't, the profile will be activated. On the other hand, `exists` will test for the existence of the file and if it is
 *         there, the profile will be activated.
 *         Variable interpolation for these file specifications is limited to `${basedir}`, System properties and request properties.
 *
 * <p>Java class for ActivationFile complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActivationFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="missing" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="exists" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "ActivationFile" )
public class ActivationFile {

  @XmlAttribute( name = "missing" )
  private String missing;

  @XmlAttribute( name = "exists" )
  private String exists;

  @Contract( pure = true )
  public ActivationFile( ) {
  }

  /**
   * Gets the value of the missing property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getMissing( ) {
    return missing;
  }

  /**
   * Sets the value of the missing property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setMissing( String value ) {
    this.missing = value;
  }

  /**
   * Gets the value of the exists property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getExists( ) {
    return exists;
  }

  /**
   * Sets the value of the exists property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setExists( String value ) {
    this.exists = value;
  }

  public ActivationFile withMissing( String value ) {
    setMissing( value );
    return this;
  }

  public ActivationFile withExists( String value ) {
    setExists( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "missing='" + missing + "'" )
        .add( "exists='" + exists + "'" )
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
    ActivationFile that = ( ActivationFile ) o;
    return Objects.equals( missing, that.missing ) && Objects.equals( exists, that.exists );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( missing, exists );
  }
}
