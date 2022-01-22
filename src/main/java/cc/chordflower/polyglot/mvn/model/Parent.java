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
 *
 * The `parent` element contains information required to locate the parent project from which this project will inherit from.
 *
 * **Note:** The children of this element are not interpolated and must be given as literal values.
 *
 *
 * <p>Java class for Parent complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Parent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="groupId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="artifactId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="relativePath" type="{http://www.w3.org/2001/XMLSchema}string" default="../pom.xml" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "Parent" )
public class Parent {

  @XmlAttribute( name = "groupId", required = true )
  @NotNull
  private String groupId;

  @XmlAttribute( name = "artifactId", required = true )
  @NotNull
  private String artifactId;

  @XmlAttribute( name = "version", required = true )
  @NotNull
  private String version;

  @XmlAttribute( name = "relativePath" )
  private String relativePath;

  @Contract( pure = true )
  public Parent( ) {
  }

  @Contract( pure = true )
  public Parent( String groupId, String artifactId, String version ) {
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

  /**
   * Gets the value of the relativePath property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getRelativePath( ) {
    return Objects.requireNonNullElse( relativePath, "../pom.xml" );
  }

  /**
   * Sets the value of the relativePath property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setRelativePath( String value ) {
    this.relativePath = value;
  }

  public Parent withGroupId( String value ) {
    setGroupId( value );
    return this;
  }

  public Parent withArtifactId( String value ) {
    setArtifactId( value );
    return this;
  }

  public Parent withVersion( String value ) {
    setVersion( value );
    return this;
  }

  public Parent withRelativePath( String value ) {
    setRelativePath( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "groupId='" + groupId + "'" )
        .add( "artifactId='" + artifactId + "'" )
        .add( "version='" + version + "'" )
        .add( "relativePath='" + relativePath + "'" )
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
    var parent = ( Parent ) o;
    return Objects.equals( groupId, parent.groupId ) && Objects.equals( artifactId, parent.artifactId ) && Objects.equals( version, parent.version ) && Objects.equals( relativePath, parent.relativePath );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( groupId, artifactId, version, relativePath );
  }
}
