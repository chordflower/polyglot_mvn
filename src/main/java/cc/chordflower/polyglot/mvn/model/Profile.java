package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Modifications to the build process which is activated based on environmental parameters or command line arguments.
 *
 * <p>Java class for Profile complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Profile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="activation" type="{https://chordflower.cc/schemas/maven}Activation" minOccurs="0"/&gt;
 *         &lt;element name="build" type="{https://chordflower.cc/schemas/maven}BuildBase" minOccurs="0"/&gt;
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
 *         &lt;element name="reporting" type="{https://chordflower.cc/schemas/maven}Reporting" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" default="default" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "Profile", propOrder = {

} )
public class Profile {

  @Valid
  private Activation activation;

  @Valid
  private BuildBase build;

  @Valid
  private Profile.Modules modules;

  @Valid
  private DistributionManagement distributionManagement;

  @Valid
  private Profile.Properties properties;

  @Valid
  private Profile.DependencyManagement dependencyManagement;

  @Valid
  private Profile.Dependencies dependencies;

  @Valid
  private Profile.Repositories repositories;

  @Valid
  private Profile.PluginRepositories pluginRepositories;

  @Valid
  private Reporting reporting;

  @XmlAttribute( name = "id" )
  private String id;

  @Contract( pure = true )
  public Profile( ) {
  }

  @Contract( pure = true )
  public Profile( String id ) {
    this.id = id;
  }

  /**
   * Gets the value of the activation property.
   *
   * @return
   *     possible object is
   *     {@link Activation }
   *
   */
  public Activation getActivation( ) {
    return activation;
  }

  /**
   * Sets the value of the activation property.
   *
   * @param value
   *     allowed object is
   *     {@link Activation }
   *
   */
  public void setActivation( Activation value ) {
    this.activation = value;
  }

  /**
   * Gets the value of the build property.
   *
   * @return
   *     possible object is
   *     {@link BuildBase }
   *
   */
  public BuildBase getBuild( ) {
    return build;
  }

  /**
   * Sets the value of the build property.
   *
   * @param value
   *     allowed object is
   *     {@link BuildBase }
   *
   */
  public void setBuild( BuildBase value ) {
    this.build = value;
  }

  /**
   * Gets the value of the modules property.
   *
   * @return
   *     possible object is
   *     {@link Profile.Modules }
   *
   */
  public Profile.Modules getModules( ) {
    return modules;
  }

  /**
   * Sets the value of the modules property.
   *
   * @param value
   *     allowed object is
   *     {@link Profile.Modules }
   *
   */
  public void setModules( Profile.Modules value ) {
    this.modules = value;
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
   *     {@link Profile.Properties }
   *
   */
  public Profile.Properties getProperties( ) {
    return properties;
  }

  /**
   * Sets the value of the properties property.
   *
   * @param value
   *     allowed object is
   *     {@link Profile.Properties }
   *
   */
  public void setProperties( Profile.Properties value ) {
    this.properties = value;
  }

  /**
   * Gets the value of the dependencyManagement property.
   *
   * @return
   *     possible object is
   *     {@link Profile.DependencyManagement }
   *
   */
  public Profile.DependencyManagement getDependencyManagement( ) {
    return dependencyManagement;
  }

  /**
   * Sets the value of the dependencyManagement property.
   *
   * @param value
   *     allowed object is
   *     {@link Profile.DependencyManagement }
   *
   */
  public void setDependencyManagement( Profile.DependencyManagement value ) {
    this.dependencyManagement = value;
  }

  /**
   * Gets the value of the dependencies property.
   *
   * @return
   *     possible object is
   *     {@link Profile.Dependencies }
   *
   */
  public Profile.Dependencies getDependencies( ) {
    return dependencies;
  }

  /**
   * Sets the value of the dependencies property.
   *
   * @param value
   *     allowed object is
   *     {@link Profile.Dependencies }
   *
   */
  public void setDependencies( Profile.Dependencies value ) {
    this.dependencies = value;
  }

  /**
   * Gets the value of the repositories property.
   *
   * @return
   *     possible object is
   *     {@link Profile.Repositories }
   *
   */
  public Profile.Repositories getRepositories( ) {
    return repositories;
  }

  /**
   * Sets the value of the repositories property.
   *
   * @param value
   *     allowed object is
   *     {@link Profile.Repositories }
   *
   */
  public void setRepositories( Profile.Repositories value ) {
    this.repositories = value;
  }

  /**
   * Gets the value of the pluginRepositories property.
   *
   * @return
   *     possible object is
   *     {@link Profile.PluginRepositories }
   *
   */
  public Profile.PluginRepositories getPluginRepositories( ) {
    return pluginRepositories;
  }

  /**
   * Sets the value of the pluginRepositories property.
   *
   * @param value
   *     allowed object is
   *     {@link Profile.PluginRepositories }
   *
   */
  public void setPluginRepositories( Profile.PluginRepositories value ) {
    this.pluginRepositories = value;
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
   * Gets the value of the id property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getId( ) {
    if( id == null ) {
      return "default";
    } else {
      return id;
    }
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

  public Profile withActivation( Activation value ) {
    setActivation( value );
    return this;
  }

  public Profile withBuild( BuildBase value ) {
    setBuild( value );
    return this;
  }

  public Profile withModules( Profile.Modules value ) {
    setModules( value );
    return this;
  }

  public Profile withDistributionManagement( DistributionManagement value ) {
    setDistributionManagement( value );
    return this;
  }

  public Profile withProperties( Profile.Properties value ) {
    setProperties( value );
    return this;
  }

  public Profile withDependencyManagement( Profile.DependencyManagement value ) {
    setDependencyManagement( value );
    return this;
  }

  public Profile withDependencies( Profile.Dependencies value ) {
    setDependencies( value );
    return this;
  }

  public Profile withRepositories( Profile.Repositories value ) {
    setRepositories( value );
    return this;
  }

  public Profile withPluginRepositories( Profile.PluginRepositories value ) {
    setPluginRepositories( value );
    return this;
  }

  public Profile withReporting( Reporting value ) {
    setReporting( value );
    return this;
  }

  public Profile withId( String value ) {
    setId( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "activation=" + activation )
        .add( "build=" + build )
        .add( "modules=" + modules )
        .add( "distributionManagement=" + distributionManagement )
        .add( "properties=" + properties )
        .add( "dependencyManagement=" + dependencyManagement )
        .add( "dependencies=" + dependencies )
        .add( "repositories=" + repositories )
        .add( "pluginRepositories=" + pluginRepositories )
        .add( "reporting=" + reporting )
        .add( "id='" + id + "'" )
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
    var profile = ( Profile ) o;
    return Objects.equals( activation, profile.activation ) && Objects.equals( build, profile.build ) && Objects.equals( modules, profile.modules ) && Objects.equals( distributionManagement, profile.distributionManagement ) && Objects.equals( properties, profile.properties ) && Objects.equals( dependencyManagement, profile.dependencyManagement ) && Objects.equals( dependencies, profile.dependencies ) && Objects.equals( repositories, profile.repositories ) && Objects.equals( pluginRepositories, profile.pluginRepositories ) && Objects.equals( reporting, profile.reporting ) && Objects.equals( id, profile.id );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( activation, build, modules, distributionManagement, properties, dependencyManagement, dependencies, repositories, pluginRepositories, reporting, id );
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

    public Profile.Dependencies withDependency( Dependency... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getDependency( ).add( value ) );
      }
      return this;
    }

    public Profile.Dependencies withDependency( Collection< Dependency > values ) {
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

    public Profile.DependencyManagement withDependency( Dependency... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getDependency( ).add( value ) );
      }
      return this;
    }

    public Profile.DependencyManagement withDependency( Collection< Dependency > values ) {
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

    public Profile.Modules withModule( String... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getModule( ).add( value ) );
      }
      return this;
    }

    public Profile.Modules withModule( Collection< String > values ) {
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

    public Profile.PluginRepositories withPluginRepository( Repository... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getPluginRepository( ).add( value ) );
      }
      return this;
    }

    public Profile.PluginRepositories withPluginRepository( Collection< Repository > values ) {
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
    private final List< Profile.Properties.Property > property = new ArrayList<>( );

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
     * {@link Profile.Properties.Property }
     *
     *
     */
    public List< Profile.Properties.Property > getProperty( ) {
      return this.property;
    }

    public Profile.Properties withProperty( Profile.Properties.Property... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getProperty( ).add( value ) );
      }
      return this;
    }

    public Profile.Properties withProperty( Collection< Profile.Properties.Property > values ) {
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

      public Profile.Properties.Property withName( String value ) {
        setName( value );
        return this;
      }

      public Profile.Properties.Property withValue( String value ) {
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

    public Profile.Repositories withRepository( Repository... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getRepository( ).add( value ) );
      }
      return this;
    }

    public Profile.Repositories withRepository( Collection< Repository > values ) {
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
