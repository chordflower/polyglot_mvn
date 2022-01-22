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
 * Describes a build extension to utilise.
 *
 * <p>Java class for Extension complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Extension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="groupId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="artifactId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "Extension" )
public class Extension {

  @XmlAttribute( name = "groupId", required = true )
  @NotNull
  private String groupId;

  @XmlAttribute( name = "artifactId", required = true )
  @NotNull
  private String artifactId;

  @XmlAttribute( name = "version" )
  private String version;

  @Contract( pure = true )
  public Extension( ) {
  }

  @Contract( pure = true )
  public Extension( String groupId, String artifactId, String version ) {
    this.groupId = groupId;
    this.artifactId = artifactId;
    this.version = version;
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

  public Extension withGroupId( String value ) {
    setGroupId( value );
    return this;
  }

  public Extension withArtifactId( String value ) {
    setArtifactId( value );
    return this;
  }

  public Extension withVersion( String value ) {
    setVersion( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "groupId='" + groupId + "'" )
        .add( "artifactId='" + artifactId + "'" )
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
    Extension extension = ( Extension ) o;
    return Objects.equals( groupId, extension.groupId ) && Objects.equals( artifactId, extension.artifactId ) && Objects.equals( version, extension.version );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( groupId, artifactId, version );
  }
}
