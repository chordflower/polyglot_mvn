package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Download policy.
 *
 * <p>Java class for RepositoryPolicy complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RepositoryPolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="updatePolicy" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="checksumPolicy" type="{https://chordflower.cc/schemas/maven}checksumPolicy" default="warn" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "RepositoryPolicy" )
public class RepositoryPolicy {

  @XmlAttribute( name = "updatePolicy" )
  private String updatePolicy;

  @XmlAttribute( name = "enabled" )
  private Boolean enabled;

  @XmlAttribute( name = "checksumPolicy" )
  private ChecksumPolicy checksumPolicy;

  @Contract( pure = true )
  public RepositoryPolicy( String updatePolicy, Boolean enabled, ChecksumPolicy checksumPolicy ) {
    this.updatePolicy = updatePolicy;
    this.enabled = enabled;
    this.checksumPolicy = checksumPolicy;
  }

  @Contract( pure = true )
  public RepositoryPolicy( ) {
  }

  /**
   * Gets the value of the updatePolicy property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getUpdatePolicy( ) {
    return updatePolicy;
  }

  /**
   * Sets the value of the updatePolicy property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setUpdatePolicy( String value ) {
    this.updatePolicy = value;
  }

  /**
   * Gets the value of the enabled property.
   * This getter has been renamed from isEnabled() to getEnabled() by cxf-xjc-boolean plugin.
   *
   * @return
   *     possible object is
   *     {@link Boolean }
   *
   */
  public boolean getEnabled( ) {
    return Objects.requireNonNullElse( enabled, true );
  }

  /**
   * Sets the value of the enabled property.
   *
   * @param value
   *     allowed object is
   *     {@link Boolean }
   *
   */
  public void setEnabled( Boolean value ) {
    this.enabled = value;
  }

  /**
   * Sets the value of the checksumPolicy property.
   *
   * @param value
   *     allowed object is
   *     {@link ChecksumPolicy }
   *
   */
  public void setChecksumPolicy( ChecksumPolicy value ) {
    this.checksumPolicy = value;
  }

  /**
   * Gets the value of the checksumPolicy property.
   *
   */
  public ChecksumPolicy getChecksumPolicy( ) {
    if( null == checksumPolicy ) {
      return ChecksumPolicy.fromValue( "warn" );
    }
    return checksumPolicy;
  }

  public RepositoryPolicy withUpdatePolicy( String value ) {
    setUpdatePolicy( value );
    return this;
  }

  public RepositoryPolicy withEnabled( Boolean value ) {
    setEnabled( value );
    return this;
  }

  public RepositoryPolicy withChecksumPolicy( ChecksumPolicy value ) {
    setChecksumPolicy( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "updatePolicy='" + updatePolicy + "'" )
        .add( "enabled=" + enabled )
        .add( "checksumPolicy=" + checksumPolicy )
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
    RepositoryPolicy that = ( RepositoryPolicy ) o;
    return Objects.equals( updatePolicy, that.updatePolicy ) && Objects.equals( enabled, that.enabled ) && checksumPolicy == that.checksumPolicy;
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( updatePolicy, enabled, checksumPolicy );
  }
}
