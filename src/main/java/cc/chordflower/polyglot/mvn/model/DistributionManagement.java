package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * This elements describes all that pertains to distribution for a project. It is primarily used for deployment of artifacts and the site produced by the build.
 *
 * <p>Java class for DistributionManagement complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DistributionManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="repository" type="{https://chordflower.cc/schemas/maven}DeploymentRepository" minOccurs="0"/&gt;
 *         &lt;element name="snapshotRepository" type="{https://chordflower.cc/schemas/maven}DeploymentRepository" minOccurs="0"/&gt;
 *         &lt;element name="site" type="{https://chordflower.cc/schemas/maven}Site" minOccurs="0"/&gt;
 *         &lt;element name="downloadUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relocation" type="{https://chordflower.cc/schemas/maven}Relocation" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "DistributionManagement", propOrder = {

} )
public class DistributionManagement {

  @Valid
  private DeploymentRepository repository;

  @Valid
  private DeploymentRepository snapshotRepository;

  @Valid
  private Site site;

  private String downloadUrl;

  @Valid
  private Relocation relocation;

  @Contract( pure = true )
  public DistributionManagement( ) {
  }

  /**
   * Gets the value of the repository property.
   *
   * @return
   *     possible object is
   *     {@link DeploymentRepository }
   *
   */
  public DeploymentRepository getRepository( ) {
    return repository;
  }

  /**
   * Sets the value of the repository property.
   *
   * @param value
   *     allowed object is
   *     {@link DeploymentRepository }
   *
   */
  public void setRepository( DeploymentRepository value ) {
    this.repository = value;
  }

  /**
   * Gets the value of the snapshotRepository property.
   *
   * @return
   *     possible object is
   *     {@link DeploymentRepository }
   *
   */
  public DeploymentRepository getSnapshotRepository( ) {
    return snapshotRepository;
  }

  /**
   * Sets the value of the snapshotRepository property.
   *
   * @param value
   *     allowed object is
   *     {@link DeploymentRepository }
   *
   */
  public void setSnapshotRepository( DeploymentRepository value ) {
    this.snapshotRepository = value;
  }

  /**
   * Gets the value of the site property.
   *
   * @return
   *     possible object is
   *     {@link Site }
   *
   */
  public Site getSite( ) {
    return site;
  }

  /**
   * Sets the value of the site property.
   *
   * @param value
   *     allowed object is
   *     {@link Site }
   *
   */
  public void setSite( Site value ) {
    this.site = value;
  }

  /**
   * Gets the value of the downloadUrl property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getDownloadUrl( ) {
    return downloadUrl;
  }

  /**
   * Sets the value of the downloadUrl property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setDownloadUrl( String value ) {
    this.downloadUrl = value;
  }

  /**
   * Gets the value of the relocation property.
   *
   * @return
   *     possible object is
   *     {@link Relocation }
   *
   */
  public Relocation getRelocation( ) {
    return relocation;
  }

  /**
   * Sets the value of the relocation property.
   *
   * @param value
   *     allowed object is
   *     {@link Relocation }
   *
   */
  public void setRelocation( Relocation value ) {
    this.relocation = value;
  }

  public DistributionManagement withRepository( DeploymentRepository value ) {
    setRepository( value );
    return this;
  }

  public DistributionManagement withSnapshotRepository( DeploymentRepository value ) {
    setSnapshotRepository( value );
    return this;
  }

  public DistributionManagement withSite( Site value ) {
    setSite( value );
    return this;
  }

  public DistributionManagement withDownloadUrl( String value ) {
    setDownloadUrl( value );
    return this;
  }

  public DistributionManagement withRelocation( Relocation value ) {
    setRelocation( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "repository=" + repository )
        .add( "snapshotRepository=" + snapshotRepository )
        .add( "site=" + site )
        .add( "downloadUrl='" + downloadUrl + "'" )
        .add( "relocation=" + relocation )
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
    var that = ( DistributionManagement ) o;
    return Objects.equals( repository, that.repository ) && Objects.equals( snapshotRepository, that.snapshotRepository ) && Objects.equals( site, that.site ) && Objects.equals( downloadUrl, that.downloadUrl ) && Objects.equals( relocation, that.relocation );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( repository, snapshotRepository, site, downloadUrl, relocation );
  }
}
