package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Describes where an artifact has moved to. If any of the values are omitted, it is assumed to be the same as it was before.
 *
 * <p>Java class for Relocation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Relocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="groupId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="artifactId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "Relocation" )
public class Relocation {

  @XmlAttribute( name = "groupId", required = true )
  @NotNull
  private String groupId;

  @XmlAttribute( name = "artifactId", required = true )
  @NotNull
  private String artifactId;

  @XmlAttribute( name = "version", required = true )
  @NotNull
  private String version;

  @XmlAttribute( name = "message" )
  private String message;

  @Contract( pure = true )
  public Relocation( ) {
  }

  @Contract( pure = true )
  public Relocation( String groupId, String artifactId, String version, String message ) {
    this.groupId = groupId;
    this.artifactId = artifactId;
    this.version = version;
    this.message = message;
  }

  /**
   * Gets the value of the groupId property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getGroupId( ) {
    return groupId;
  }

  /**
   * Sets the value of the groupId property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setGroupId( String value ) {
    this.groupId = value;
  }

  /**
   * Gets the value of the artifactId property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getArtifactId( ) {
    return artifactId;
  }

  /**
   * Sets the value of the artifactId property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setArtifactId( String value ) {
    this.artifactId = value;
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

  /**
   * Gets the value of the message property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getMessage( ) {
    return message;
  }

  /**
   * Sets the value of the message property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setMessage( String value ) {
    this.message = value;
  }

  public Relocation withGroupId( String value ) {
    setGroupId( value );
    return this;
  }

  public Relocation withArtifactId( String value ) {
    setArtifactId( value );
    return this;
  }

  public Relocation withVersion( String value ) {
    setVersion( value );
    return this;
  }

  public Relocation withMessage( String value ) {
    setMessage( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "groupId='" + groupId + "'" )
        .add( "artifactId='" + artifactId + "'" )
        .add( "version='" + version + "'" )
        .add( "message='" + message + "'" )
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
    Relocation that = ( Relocation ) o;
    return Objects.equals( groupId, that.groupId ) && Objects.equals( artifactId, that.artifactId ) && Objects.equals( version, that.version ) && Objects.equals( message, that.message );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( groupId, artifactId, version, message );
  }
}
