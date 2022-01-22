package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The `project` element is the root of the descriptor.
 *
 * <p>Java class for Model complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Model"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="parent" type="{https://chordflower.cc/schemas/maven}Parent" minOccurs="0"/&gt;
 *         &lt;element name="packaging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inceptionYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organization" type="{https://chordflower.cc/schemas/maven}Organization" minOccurs="0"/&gt;
 *         &lt;element name="licenses" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="license" type="{https://chordflower.cc/schemas/maven}License" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="developers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="developer" type="{https://chordflower.cc/schemas/maven}Developer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contributors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="contributor" type="{https://chordflower.cc/schemas/maven}Contributor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mailingLists" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mailingList" type="{https://chordflower.cc/schemas/maven}MailingList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="modules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="scm" type="{https://chordflower.cc/schemas/maven}Scm" minOccurs="0"/&gt;
 *         &lt;element name="issueManagement" type="{https://chordflower.cc/schemas/maven}IssueManagement" minOccurs="0"/&gt;
 *         &lt;element name="ciManagement" type="{https://chordflower.cc/schemas/maven}CiManagement" minOccurs="0"/&gt;
 *         &lt;element name="distributionManagement" type="{https://chordflower.cc/schemas/maven}DistributionManagement" minOccurs="0"/&gt;
 *         &lt;element name="properties" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="property" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dependencyManagement" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="dependency" type="{https://chordflower.cc/schemas/maven}Dependency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dependencies" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="dependency" type="{https://chordflower.cc/schemas/maven}Dependency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="repositories" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="repository" type="{https://chordflower.cc/schemas/maven}Repository" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pluginRepositories" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="pluginRepository" type="{https://chordflower.cc/schemas/maven}Repository" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="build" type="{https://chordflower.cc/schemas/maven}Build" minOccurs="0"/&gt;
 *         &lt;element name="reporting" type="{https://chordflower.cc/schemas/maven}Reporting" minOccurs="0"/&gt;
 *         &lt;element name="profiles" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="profile" type="{https://chordflower.cc/schemas/maven}Profile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="modelVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType( name = "Model", propOrder = {

} )
public class Model {

  @Valid
  private Parent parent;

  @XmlElement( defaultValue = "jar" )
  private String packaging = "jar";

  private String name;

  private String description;

  private String url;

  private String inceptionYear;

  @Valid
  private Organization organization;

  @Valid
  private Model.Licenses licenses;

  @Valid
  private Model.Developers developers;

  @Valid
  private Model.Contributors contributors;

  @Valid
  private Model.MailingLists mailingLists;

  @Valid
  private Model.Modules modules;

  @Valid
  private IssueManagement issueManagement;

  @Valid
  private CiManagement ciManagement;

  @Valid
  private DistributionManagement distributionManagement;

  @Valid
  private Model.Properties properties;

  @Valid
  private Model.DependencyManagement dependencyManagement;

  @Valid
  private Model.Dependencies dependencies;

  @Valid
  private Model.Repositories repositories;

  @Valid
  private Model.PluginRepositories pluginRepositories;

  @Valid
  private Build build;

  @Valid
  private Reporting reporting;

  @Valid
  private Model.Profiles profiles;

  @XmlAttribute( name = "modelVersion" )
  private String modelVersion;

  @XmlAttribute( name = "groupId" )
  private String groupId;
  @XmlAttribute( name = "artifactId", required = true )
  @NotNull
  private String artifactId;

  @XmlAttribute( name = "version" )
  private String version;

  @Valid
  private Scm scm = new Scm( );

  public Model( ) {
  }

  public Model( String modelVersion, String groupId, String artifactId, String version ) {
    this.modelVersion = modelVersion;
    this.groupId = groupId;
    this.artifactId = artifactId;
    this.version = version;
  }

  public Model( String name, String description, String modelVersion, String groupId, String artifactId, String version ) {
    this.name = name;
    this.description = description;
    this.modelVersion = modelVersion;
    this.groupId = groupId;
    this.artifactId = artifactId;
    this.version = version;
  }

  /**
   * Gets the value of the parent property.
   *
   * @return
   *     possible object is
   *     {@link Parent }
   *
   */
  public Parent getParent( ) {
    return parent;
  }

  /**
   * Sets the value of the parent property.
   *
   * @param value
   *     allowed object is
   *     {@link Parent }
   *
   */
  public void setParent( Parent value ) {
    this.parent = value;
  }

  /**
   * Sets the value of the packaging property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setPackaging( String value ) {
    this.packaging = value;
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
   * Gets the value of the description property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getDescription( ) {
    return description;
  }

  /**
   * Sets the value of the description property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setDescription( String value ) {
    this.description = value;
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
   * Gets the value of the inceptionYear property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getInceptionYear( ) {
    return inceptionYear;
  }

  /**
   * Sets the value of the inceptionYear property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setInceptionYear( String value ) {
    this.inceptionYear = value;
  }

  /**
   * Gets the value of the organization property.
   *
   * @return
   *     possible object is
   *     {@link Organization }
   *
   */
  public Organization getOrganization( ) {
    return organization;
  }

  /**
   * Sets the value of the organization property.
   *
   * @param value
   *     allowed object is
   *     {@link Organization }
   *
   */
  public void setOrganization( Organization value ) {
    this.organization = value;
  }

  /**
   * Gets the value of the licenses property.
   *
   * @return
   *     possible object is
   *     {@link Model.Licenses }
   *
   */
  public Model.Licenses getLicenses( ) {
    return licenses;
  }

  /**
   * Sets the value of the licenses property.
   *
   * @param value
   *     allowed object is
   *     {@link Model.Licenses }
   *
   */
  public void setLicenses( Model.Licenses value ) {
    this.licenses = value;
  }

  /**
   * Gets the value of the developers property.
   *
   * @return
   *     possible object is
   *     {@link Model.Developers }
   *
   */
  public Model.Developers getDevelopers( ) {
    return developers;
  }

  /**
   * Sets the value of the developers property.
   *
   * @param value
   *     allowed object is
   *     {@link Model.Developers }
   *
   */
  public void setDevelopers( Model.Developers value ) {
    this.developers = value;
  }

  /**
   * Gets the value of the contributors property.
   *
   * @return
   *     possible object is
   *     {@link Model.Contributors }
   *
   */
  public Model.Contributors getContributors( ) {
    return contributors;
  }

  /**
   * Sets the value of the contributors property.
   *
   * @param value
   *     allowed object is
   *     {@link Model.Contributors }
   *
   */
  public void setContributors( Model.Contributors value ) {
    this.contributors = value;
  }

  /**
   * Gets the value of the mailingLists property.
   *
   * @return
   *     possible object is
   *     {@link Model.MailingLists }
   *
   */
  public Model.MailingLists getMailingLists( ) {
    return mailingLists;
  }

  /**
   * Sets the value of the mailingLists property.
   *
   * @param value
   *     allowed object is
   *     {@link Model.MailingLists }
   *
   */
  public void setMailingLists( Model.MailingLists value ) {
    this.mailingLists = value;
  }

  /**
   * Gets the value of the modules property.
   *
   * @return
   *     possible object is
   *     {@link Model.Modules }
   *
   */
  public Model.Modules getModules( ) {
    return modules;
  }

  /**
   * Sets the value of the modules property.
   *
   * @param value
   *     allowed object is
   *     {@link Model.Modules }
   *
   */
  public void setModules( Model.Modules value ) {
    this.modules = value;
  }

  /**
   * Gets the value of the scm property.
   *
   * @return
   *     possible object is
   *     {@link Scm }
   *
   */
  public Scm getScm( ) {
    return scm;
  }

  /**
   * Sets the value of the scm property.
   *
   * @param value
   *     allowed object is
   *     {@link Scm }
   *
   */
  public void setScm( Scm value ) {
    this.scm = value;
  }

  /**
   * Gets the value of the issueManagement property.
   *
   * @return
   *     possible object is
   *     {@link IssueManagement }
   *
   */
  public IssueManagement getIssueManagement( ) {
    return issueManagement;
  }

  /**
   * Sets the value of the issueManagement property.
   *
   * @param value
   *     allowed object is
   *     {@link IssueManagement }
   *
   */
  public void setIssueManagement( IssueManagement value ) {
    this.issueManagement = value;
  }

  /**
   * Gets the value of the ciManagement property.
   *
   * @return
   *     possible object is
   *     {@link CiManagement }
   *
   */
  public CiManagement getCiManagement( ) {
    return ciManagement;
  }

  /**
   * Sets the value of the ciManagement property.
   *
   * @param value
   *     allowed object is
   *     {@link CiManagement }
   *
   */
  public void setCiManagement( CiManagement value ) {
    this.ciManagement = value;
  }

  /**
   * Gets the value of the distributionManagement property.
   *
   * @return
   *     possible object is
   *     {@link DistributionManagement }
   *
   */
  public DistributionManagement getDistributionManagement( ) {
    return distributionManagement;
  }

  /**
   * Sets the value of the distributionManagement property.
   *
   * @param value
   *     allowed object is
   *     {@link DistributionManagement }
   *
   */
  public void setDistributionManagement( DistributionManagement value ) {
    this.distributionManagement = value;
  }

  /**
   * Gets the value of the properties property.
   *
   * @return
   *     possible object is
   *     {@link Model.Properties }
   *
   */
  public Model.Properties getProperties( ) {
    return properties;
  }

  /**
   * Sets the value of the properties property.
   *
   * @param value
   *     allowed object is
   *     {@link Model.Properties }
   *
   */
  public void setProperties( Model.Properties value ) {
    this.properties = value;
  }

  /**
   * Gets the value of the dependencyManagement property.
   *
   * @return
   *     possible object is
   *     {@link Model.DependencyManagement }
   *
   */
  public Model.DependencyManagement getDependencyManagement( ) {
    return dependencyManagement;
  }

  /**
   * Sets the value of the dependencyManagement property.
   *
   * @param value
   *     allowed object is
   *     {@link Model.DependencyManagement }
   *
   */
  public void setDependencyManagement( Model.DependencyManagement value ) {
    this.dependencyManagement = value;
  }

  /**
   * Gets the value of the dependencies property.
   *
   * @return
   *     possible object is
   *     {@link Model.Dependencies }
   *
   */
  public Model.Dependencies getDependencies( ) {
    return dependencies;
  }

  /**
   * Sets the value of the dependencies property.
   *
   * @param value
   *     allowed object is
   *     {@link Model.Dependencies }
   *
   */
  public void setDependencies( Model.Dependencies value ) {
    this.dependencies = value;
  }

  /**
   * Gets the value of the repositories property.
   *
   * @return
   *     possible object is
   *     {@link Model.Repositories }
   *
   */
  public Model.Repositories getRepositories( ) {
    return repositories;
  }

  /**
   * Sets the value of the repositories property.
   *
   * @param value
   *     allowed object is
   *     {@link Model.Repositories }
   *
   */
  public void setRepositories( Model.Repositories value ) {
    this.repositories = value;
  }

  /**
   * Gets the value of the pluginRepositories property.
   *
   * @return
   *     possible object is
   *     {@link Model.PluginRepositories }
   *
   */
  public Model.PluginRepositories getPluginRepositories( ) {
    return pluginRepositories;
  }

  /**
   * Sets the value of the pluginRepositories property.
   *
   * @param value
   *     allowed object is
   *     {@link Model.PluginRepositories }
   *
   */
  public void setPluginRepositories( Model.PluginRepositories value ) {
    this.pluginRepositories = value;
  }

  /**
   * Gets the value of the build property.
   *
   * @return
   *     possible object is
   *     {@link Build }
   *
   */
  public Build getBuild( ) {
    return build;
  }

  /**
   * Sets the value of the build property.
   *
   * @param value
   *     allowed object is
   *     {@link Build }
   *
   */
  public void setBuild( Build value ) {
    this.build = value;
  }

  /**
   * Gets the value of the reporting property.
   *
   * @return
   *     possible object is
   *     {@link Reporting }
   *
   */
  public Reporting getReporting( ) {
    return reporting;
  }

  /**
   * Sets the value of the reporting property.
   *
   * @param value
   *     allowed object is
   *     {@link Reporting }
   *
   */
  public void setReporting( Reporting value ) {
    this.reporting = value;
  }

  /**
   * Gets the value of the profiles property.
   *
   * @return
   *     possible object is
   *     {@link Model.Profiles }
   *
   */
  public Model.Profiles getProfiles( ) {
    return profiles;
  }

  /**
   * Sets the value of the profiles property.
   *
   * @param value
   *     allowed object is
   *     {@link Model.Profiles }
   *
   */
  public void setProfiles( Model.Profiles value ) {
    this.profiles = value;
  }

  /**
   * Gets the value of the modelVersion property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getModelVersion( ) {
    return modelVersion;
  }

  /**
   * Sets the value of the modelVersion property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setModelVersion( String value ) {
    this.modelVersion = value;
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
   * Gets the value of the packaging property.
   *
   */
  public String getPackaging( ) {
    if( null == packaging ) {
      return "jar";
    }
    return packaging;
  }

  public Model withParent( Parent value ) {
    setParent( value );
    return this;
  }

  public Model withPackaging( String value ) {
    setPackaging( value );
    return this;
  }

  public Model withName( String value ) {
    setName( value );
    return this;
  }

  public Model withDescription( String value ) {
    setDescription( value );
    return this;
  }

  public Model withUrl( String value ) {
    setUrl( value );
    return this;
  }

  public Model withInceptionYear( String value ) {
    setInceptionYear( value );
    return this;
  }

  public Model withOrganization( Organization value ) {
    setOrganization( value );
    return this;
  }

  public Model withLicenses( Model.Licenses value ) {
    setLicenses( value );
    return this;
  }

  public Model withDevelopers( Model.Developers value ) {
    setDevelopers( value );
    return this;
  }

  public Model withContributors( Model.Contributors value ) {
    setContributors( value );
    return this;
  }

  public Model withMailingLists( Model.MailingLists value ) {
    setMailingLists( value );
    return this;
  }

  public Model withModules( Model.Modules value ) {
    setModules( value );
    return this;
  }

  public Model withScm( Scm value ) {
    setScm( value );
    return this;
  }

  public Model withIssueManagement( IssueManagement value ) {
    setIssueManagement( value );
    return this;
  }

  public Model withCiManagement( CiManagement value ) {
    setCiManagement( value );
    return this;
  }

  public Model withDistributionManagement( DistributionManagement value ) {
    setDistributionManagement( value );
    return this;
  }

  public Model withProperties( Model.Properties value ) {
    setProperties( value );
    return this;
  }

  public Model withDependencyManagement( Model.DependencyManagement value ) {
    setDependencyManagement( value );
    return this;
  }

  public Model withDependencies( Model.Dependencies value ) {
    setDependencies( value );
    return this;
  }

  public Model withRepositories( Model.Repositories value ) {
    setRepositories( value );
    return this;
  }

  public Model withPluginRepositories( Model.PluginRepositories value ) {
    setPluginRepositories( value );
    return this;
  }

  public Model withBuild( Build value ) {
    setBuild( value );
    return this;
  }

  public Model withReporting( Reporting value ) {
    setReporting( value );
    return this;
  }

  public Model withProfiles( Model.Profiles value ) {
    setProfiles( value );
    return this;
  }

  public Model withModelVersion( String value ) {
    setModelVersion( value );
    return this;
  }

  public Model withGroupId( String value ) {
    setGroupId( value );
    return this;
  }

  public Model withArtifactId( String value ) {
    setArtifactId( value );
    return this;
  }

  public Model withVersion( String value ) {
    setVersion( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "parent=" + parent )
        .add( "packaging='" + packaging + "'" )
        .add( "name='" + name + "'" )
        .add( "description='" + description + "'" )
        .add( "url='" + url + "'" )
        .add( "inceptionYear='" + inceptionYear + "'" )
        .add( "organization=" + organization )
        .add( "licenses=" + licenses )
        .add( "developers=" + developers )
        .add( "contributors=" + contributors )
        .add( "mailingLists=" + mailingLists )
        .add( "modules=" + modules )
        .add( "issueManagement=" + issueManagement )
        .add( "ciManagement=" + ciManagement )
        .add( "distributionManagement=" + distributionManagement )
        .add( "properties=" + properties )
        .add( "dependencyManagement=" + dependencyManagement )
        .add( "dependencies=" + dependencies )
        .add( "repositories=" + repositories )
        .add( "pluginRepositories=" + pluginRepositories )
        .add( "build=" + build )
        .add( "reporting=" + reporting )
        .add( "profiles=" + profiles )
        .add( "modelVersion='" + modelVersion + "'" )
        .add( "groupId='" + groupId + "'" )
        .add( "artifactId='" + artifactId + "'" )
        .add( "version='" + version + "'" )
        .add( "scm=" + scm )
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
    var model = ( Model ) o;
    return Objects.equals( parent, model.parent ) && Objects.equals( packaging, model.packaging ) && Objects.equals( name, model.name ) && Objects.equals( description, model.description ) && Objects.equals( url, model.url ) && Objects.equals( inceptionYear, model.inceptionYear ) && Objects.equals( organization, model.organization ) && Objects.equals( licenses, model.licenses ) && Objects.equals( developers, model.developers ) && Objects.equals( contributors, model.contributors ) && Objects.equals( mailingLists, model.mailingLists ) && Objects.equals( modules, model.modules ) && Objects.equals( issueManagement, model.issueManagement ) && Objects.equals( ciManagement, model.ciManagement ) && Objects.equals( distributionManagement, model.distributionManagement ) && Objects.equals( properties, model.properties ) && Objects.equals( dependencyManagement, model.dependencyManagement ) && Objects.equals( dependencies, model.dependencies ) && Objects.equals( repositories, model.repositories ) && Objects.equals( pluginRepositories, model.pluginRepositories ) && Objects.equals( build, model.build ) && Objects.equals( reporting, model.reporting ) && Objects.equals( profiles, model.profiles ) && Objects.equals( modelVersion, model.modelVersion ) && Objects.equals( groupId, model.groupId ) && Objects.equals( artifactId, model.artifactId ) && Objects.equals( version, model.version ) && Objects.equals( scm, model.scm );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( parent, packaging, name, description, url, inceptionYear, organization, licenses, developers, contributors, mailingLists, modules, issueManagement, ciManagement, distributionManagement, properties, dependencyManagement, dependencies, repositories, pluginRepositories, build, reporting, profiles, modelVersion, groupId, artifactId, version, scm );
  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="contributor" type="{https://chordflower.cc/schemas/maven}Contributor" maxOccurs="unbounded" minOccurs="0"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   *
   *
   */
  @XmlAccessorType( XmlAccessType.FIELD )
  @XmlType( name = "", propOrder = {
      "contributor"
  } )
  public static class Contributors {

    @Valid
    private final List< Contributor > contributor = new ArrayList<>( );

    public Contributors( ) {
    }

    /**
     * Gets the value of the contributor property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributor property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributor().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contributor }
     *
     *
     */
    public List< Contributor > getContributor( ) {
      return this.contributor;
    }

    public Model.Contributors withContributor( Contributor... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getContributor( ).add( value ) );
      }
      return this;
    }

    public Model.Contributors withContributor( Collection< Contributor > values ) {
      if( values != null ) {
        getContributor( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "contributor=" + contributor )
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
      var that = ( Contributors ) o;
      return Objects.equals( contributor, that.contributor );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( contributor );
    }
  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="dependency" type="{https://chordflower.cc/schemas/maven}Dependency" maxOccurs="unbounded" minOccurs="0"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   *
   *
   */
  @XmlAccessorType( XmlAccessType.FIELD )
  @XmlType( name = "", propOrder = {
      "dependency"
  } )
  public static class Dependencies {

    @Valid
    private final List< Dependency > dependency = new ArrayList<>( );

    public Dependencies( ) {
    }

    /**
     * Gets the value of the dependency property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependency property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependency().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dependency }
     *
     *
     */
    public List< Dependency > getDependency( ) {
      return this.dependency;
    }

    public Model.Dependencies withDependency( Dependency... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getDependency( ).add( value ) );
      }
      return this;
    }

    public Model.Dependencies withDependency( Collection< Dependency > values ) {
      if( values != null ) {
        getDependency( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "dependency=" + dependency )
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
      var that = ( Dependencies ) o;
      return Objects.equals( dependency, that.dependency );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( dependency );
    }
  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="dependency" type="{https://chordflower.cc/schemas/maven}Dependency" maxOccurs="unbounded" minOccurs="0"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   *
   *
   */
  @XmlAccessorType( XmlAccessType.FIELD )
  @XmlType( name = "", propOrder = {
      "dependency"
  } )
  public static class DependencyManagement {

    @Valid
    private final List< Dependency > dependency = new ArrayList<>( );

    public DependencyManagement( ) {
    }

    /**
     * Gets the value of the dependency property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependency property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependency().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dependency }
     *
     *
     */
    public List< Dependency > getDependency( ) {
      return this.dependency;
    }

    public Model.DependencyManagement withDependency( Dependency... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getDependency( ).add( value ) );
      }
      return this;
    }

    public Model.DependencyManagement withDependency( Collection< Dependency > values ) {
      if( values != null ) {
        getDependency( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "dependency=" + dependency )
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
      var that = ( DependencyManagement ) o;
      return Objects.equals( dependency, that.dependency );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( dependency );
    }
  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="developer" type="{https://chordflower.cc/schemas/maven}Developer" maxOccurs="unbounded" minOccurs="0"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   *
   *
   */
  @XmlAccessorType( XmlAccessType.FIELD )
  @XmlType( name = "", propOrder = {
      "developer"
  } )
  public static class Developers {

    @Valid
    private final List< Developer > developer = new ArrayList<>( );

    public Developers( ) {
    }

    /**
     * Gets the value of the developer property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the developer property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeveloper().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Developer }
     *
     *
     */
    public List< Developer > getDeveloper( ) {
      return this.developer;
    }

    public Model.Developers withDeveloper( Developer... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getDeveloper( ).add( value ) );
      }
      return this;
    }

    public Model.Developers withDeveloper( Collection< Developer > values ) {
      if( values != null ) {
        getDeveloper( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "developer=" + developer )
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
      var that = ( Developers ) o;
      return Objects.equals( developer, that.developer );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( developer );
    }
  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="license" type="{https://chordflower.cc/schemas/maven}License" maxOccurs="unbounded" minOccurs="0"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   *
   *
   */
  @XmlAccessorType( XmlAccessType.FIELD )
  @XmlType( name = "", propOrder = {
      "license"
  } )
  public static class Licenses {

    @Valid
    private final List< License > license = new ArrayList<>( );

    public Licenses( ) {
    }

    /**
     * Gets the value of the license property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the license property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicense().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link License }
     *
     *
     */
    public List< License > getLicense( ) {
      return this.license;
    }

    public Model.Licenses withLicense( License... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getLicense( ).add( value ) );
      }
      return this;
    }

    public Model.Licenses withLicense( Collection< License > values ) {
      if( values != null ) {
        getLicense( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "license=" + license )
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
      var licenses = ( Licenses ) o;
      return Objects.equals( license, licenses.license );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( license );
    }
  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="mailingList" type="{https://chordflower.cc/schemas/maven}MailingList" maxOccurs="unbounded" minOccurs="0"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   *
   *
   */
  @XmlAccessorType( XmlAccessType.FIELD )
  @XmlType( name = "", propOrder = {
      "mailingList"
  } )
  public static class MailingLists {

    @Valid
    private final List< MailingList > mailingList = new ArrayList<>( );

    public MailingLists( ) {
    }

    /**
     * Gets the value of the mailingList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailingList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailingList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailingList }
     *
     *
     */
    public List< MailingList > getMailingList( ) {
      return this.mailingList;
    }

    public Model.MailingLists withMailingList( MailingList... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getMailingList( ).add( value ) );
      }
      return this;
    }

    public Model.MailingLists withMailingList( Collection< MailingList > values ) {
      if( values != null ) {
        getMailingList( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "mailingList=" + mailingList )
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
      var that = ( MailingLists ) o;
      return Objects.equals( mailingList, that.mailingList );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( mailingList );
    }
  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   *
   *
   */
  @XmlAccessorType( XmlAccessType.FIELD )
  @XmlType( name = "", propOrder = {
      "module"
  } )
  public static class Modules {

    private final List< String > module = new ArrayList<>( );

    public Modules( ) {
    }

    /**
     * Gets the value of the module property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the module property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModule().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List< String > getModule( ) {
      return this.module;
    }

    public Model.Modules withModule( String... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getModule( ).add( value ) );
      }
      return this;
    }

    public Model.Modules withModule( Collection< String > values ) {
      if( values != null ) {
        getModule( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "module=" + module )
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
      var modules = ( Modules ) o;
      return Objects.equals( module, modules.module );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( module );
    }
  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="pluginRepository" type="{https://chordflower.cc/schemas/maven}Repository" maxOccurs="unbounded" minOccurs="0"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   *
   *
   */
  @XmlAccessorType( XmlAccessType.FIELD )
  @XmlType( name = "", propOrder = {
      "pluginRepository"
  } )
  public static class PluginRepositories {

    @Valid
    private final List< Repository > pluginRepository = new ArrayList<>( );

    public PluginRepositories( ) {
    }

    /**
     * Gets the value of the pluginRepository property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pluginRepository property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPluginRepository().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Repository }
     *
     *
     */
    public List< Repository > getPluginRepository( ) {
      return this.pluginRepository;
    }

    public Model.PluginRepositories withPluginRepository( Repository... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getPluginRepository( ).add( value ) );
      }
      return this;
    }

    public Model.PluginRepositories withPluginRepository( Collection< Repository > values ) {
      if( values != null ) {
        getPluginRepository( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "pluginRepository=" + pluginRepository )
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
      var that = ( PluginRepositories ) o;
      return Objects.equals( pluginRepository, that.pluginRepository );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( pluginRepository );
    }
  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="profile" type="{https://chordflower.cc/schemas/maven}Profile" maxOccurs="unbounded" minOccurs="0"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   *
   *
   */
  @XmlAccessorType( XmlAccessType.FIELD )
  @XmlType( name = "", propOrder = {
      "profile"
  } )
  public static class Profiles {

    @Valid
    private final List< Profile > profile = new ArrayList<>( );

    public Profiles( ) {
    }

    /**
     * Gets the value of the profile property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profile property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfile().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Profile }
     *
     *
     */
    public List< Profile > getProfile( ) {
      return this.profile;
    }

    public Model.Profiles withProfile( Profile... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getProfile( ).add( value ) );
      }
      return this;
    }

    public Model.Profiles withProfile( Collection< Profile > values ) {
      if( values != null ) {
        getProfile( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "profile=" + profile )
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
      var profiles = ( Profiles ) o;
      return Objects.equals( profile, profiles.profile );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( profile );
    }
  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="property" maxOccurs="unbounded" minOccurs="0"&gt;
   *           &lt;complexType&gt;
   *             &lt;complexContent&gt;
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
   *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
   *               &lt;/restriction&gt;
   *             &lt;/complexContent&gt;
   *           &lt;/complexType&gt;
   *         &lt;/element&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   *
   *
   */
  @XmlAccessorType( XmlAccessType.FIELD )
  @XmlType( name = "", propOrder = {
      "property"
  } )
  public static class Properties {

    @Valid
    private final List< Model.Properties.Property > property = new ArrayList<>( );

    public Properties( ) {
    }

    /**
     * Gets the value of the property property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Model.Properties.Property }
     *
     *
     */
    public List< Model.Properties.Property > getProperty( ) {
      return this.property;
    }

    public Model.Properties withProperty( Model.Properties.Property... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getProperty( ).add( value ) );
      }
      return this;
    }

    public Model.Properties withProperty( Collection< Model.Properties.Property > values ) {
      if( values != null ) {
        getProperty( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "property=" + property )
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
      var that = ( Properties ) o;
      return Objects.equals( property, that.property );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( property );
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType( XmlAccessType.FIELD )
    @XmlType( name = "" )
    public static class Property {

      @XmlAttribute( name = "name", required = true )
      @NotNull
      private String name;

      @XmlAttribute( name = "value", required = true )
      @NotNull
      private String value;

      @Contract( pure = true )
      public Property( ) {
      }

      @Contract( pure = true )
      public Property( String name, String value ) {
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

      public Model.Properties.Property withName( String value ) {
        setName( value );
        return this;
      }

      public Model.Properties.Property withValue( String value ) {
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
        var property = ( Property ) o;
        return Objects.equals( name, property.name ) && Objects.equals( value, property.value );
      }

      @Override
      public int hashCode( ) {
        return Objects.hash( name, value );
      }
    }

  }


  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="repository" type="{https://chordflower.cc/schemas/maven}Repository" maxOccurs="unbounded" minOccurs="0"/&gt;
   *       &lt;/sequence&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   *
   *
   */
  @XmlAccessorType( XmlAccessType.FIELD )
  @XmlType( name = "", propOrder = {
      "repository"
  } )
  public static class Repositories {

    @Valid
    private final List< Repository > repository = new ArrayList<>( );

    public Repositories( ) {
    }

    /**
     * Gets the value of the repository property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repository property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepository().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Repository }
     *
     *
     */
    public List< Repository > getRepository( ) {
      return this.repository;
    }

    public Model.Repositories withRepository( Repository... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getRepository( ).add( value ) );
      }
      return this;
    }

    public Model.Repositories withRepository( Collection< Repository > values ) {
      if( values != null ) {
        getRepository( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "repository=" + repository )
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
      var that = ( Repositories ) o;
      return Objects.equals( repository, that.repository );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( repository );
    }
  }

}
