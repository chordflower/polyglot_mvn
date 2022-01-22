package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Repository contains the information needed for deploying to the remote repository.
 *
 * <p>Java class for DeploymentRepository complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DeploymentRepository"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="releases" type="{https://chordflower.cc/schemas/maven}RepositoryPolicy" minOccurs="0"/&gt;
 *         &lt;element name="snapshots" type="{https://chordflower.cc/schemas/maven}RepositoryPolicy" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="uniqueVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="url" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="layout" type="{https://chordflower.cc/schemas/maven}layout" default="default" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "DeploymentRepository", propOrder = {

} )
public class DeploymentRepository {

  @Valid
  private RepositoryPolicy releases;

  @Valid
  private RepositoryPolicy snapshots;

  @XmlAttribute( name = "uniqueVersion" )
  private Boolean uniqueVersion;

  @XmlAttribute( name = "id", required = true )
  @NotNull
  private String id;

  @XmlAttribute( name = "name" )
  private String name;

  @XmlAttribute( name = "url", required = true )
  @XmlSchemaType( name = "anyURI" )
  @NotNull
  private String url;

  @XmlAttribute( name = "layout" )
  private Layout layout;

  @Contract( pure = true )
  public DeploymentRepository( ) {
  }

  @Contract( pure = true )
  public DeploymentRepository( String id, String name, String url ) {
    this.id = id;
    this.name = name;
    this.url = url;
  }

  /**
   * Gets the value of the releases property.
   *
   * @return
   *     possible object is
   *     {@link RepositoryPolicy }
   *
   */
  public RepositoryPolicy getReleases( ) {
    return releases;
  }

  /**
   * Sets the value of the releases property.
   *
   * @param value
   *     allowed object is
   *     {@link RepositoryPolicy }
   *
   */
  public void setReleases( RepositoryPolicy value ) {
    this.releases = value;
  }

  /**
   * Gets the value of the snapshots property.
   *
   * @return
   *     possible object is
   *     {@link RepositoryPolicy }
   *
   */
  public RepositoryPolicy getSnapshots( ) {
    return snapshots;
  }

  /**
   * Sets the value of the snapshots property.
   *
   * @param value
   *     allowed object is
   *     {@link RepositoryPolicy }
   *
   */
  public void setSnapshots( RepositoryPolicy value ) {
    this.snapshots = value;
  }

  /**
   * Gets the value of the uniqueVersion property.
   * This getter has been renamed from isUniqueVersion() to getUniqueVersion() by cxf-xjc-boolean plugin.
   *
   * @return
   *     possible object is
   *     {@link Boolean }
   *
   */
  public boolean getUniqueVersion( ) {
    return Objects.requireNonNullElse( uniqueVersion, true );
  }

  /**
   * Sets the value of the uniqueVersion property.
   *
   * @param value
   *     allowed object is
   *     {@link Boolean }
   *
   */
  public void setUniqueVersion( Boolean value ) {
    this.uniqueVersion = value;
  }

  /**
   * Gets the value of the id property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getId( ) {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setId( String value ) {
    this.id = value;
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
   * Sets the value of the layout property.
   *
   * @param value
   *     allowed object is
   *     {@link Layout }
   *
   */
  public void setLayout( Layout value ) {
    this.layout = value;
  }

  /**
   * Gets the value of the layout property.
   *
   */
  public Layout getLayout( ) {
    if( null == layout ) {
      return Layout.fromValue( "default" );
    }
    return layout;
  }

  public DeploymentRepository withReleases( RepositoryPolicy value ) {
    setReleases( value );
    return this;
  }

  public DeploymentRepository withSnapshots( RepositoryPolicy value ) {
    setSnapshots( value );
    return this;
  }

  public DeploymentRepository withUniqueVersion( Boolean value ) {
    setUniqueVersion( value );
    return this;
  }

  public DeploymentRepository withId( String value ) {
    setId( value );
    return this;
  }

  public DeploymentRepository withName( String value ) {
    setName( value );
    return this;
  }

  public DeploymentRepository withUrl( String value ) {
    setUrl( value );
    return this;
  }

  public DeploymentRepository withLayout( Layout value ) {
    setLayout( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "releases=" + releases )
        .add( "snapshots=" + snapshots )
        .add( "uniqueVersion=" + uniqueVersion )
        .add( "id='" + id + "'" )
        .add( "name='" + name + "'" )
        .add( "url='" + url + "'" )
        .add( "layout=" + layout )
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
    var that = ( DeploymentRepository ) o;
    return Objects.equals( releases, that.releases ) && Objects.equals( snapshots, that.snapshots ) && Objects.equals( uniqueVersion, that.uniqueVersion ) && Objects.equals( id, that.id ) && Objects.equals( name, that.name ) && Objects.equals( url, that.url ) && layout == that.layout;
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( releases, snapshots, uniqueVersion, id, name, url, layout );
  }
}
