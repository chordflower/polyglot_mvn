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
 * The `exclusion` element contains informations required to exclude an artifact to the project.
 *
 * <p>Java class for Exclusion complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Exclusion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="artifactId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="groupId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "Exclusion" )
public class Exclusion {

  @XmlAttribute( name = "artifactId", required = true )
  @NotNull
  private String artifactId;

  @Contract( pure = true )
  public Exclusion( String artifactId, String groupId ) {
    this.artifactId = artifactId;
    this.groupId = groupId;
  }

  @Contract( pure = true )
  public Exclusion( ) {
  }

  @XmlAttribute( name = "groupId", required = true )
  @NotNull
  private String groupId;

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

  public Exclusion withArtifactId( String value ) {
    setArtifactId( value );
    return this;
  }

  public Exclusion withGroupId( String value ) {
    setGroupId( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "artifactId='" + artifactId + "'" )
        .add( "groupId='" + groupId + "'" )
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
    Exclusion exclusion = ( Exclusion ) o;
    return Objects.equals( artifactId, exclusion.artifactId ) && Objects.equals( groupId, exclusion.groupId );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( artifactId, groupId );
  }
}
