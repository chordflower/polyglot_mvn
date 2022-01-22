package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.validation.Valid;
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
 * The `build` element contains informations required to build the project. Default values are defined in Super POM.
 *
 * <p>Java class for Build complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Build"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="sourceDirectories" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="sourceDirectory" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="scriptSourceDirectories" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="scriptSourceDirectory" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="testSourceDirectories" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="testSourceDirectory" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="outputDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="testOutputDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extensions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="extension" type="{https://chordflower.cc/schemas/maven}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="resources" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="resource" type="{https://chordflower.cc/schemas/maven}Resource" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="testResources" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="testResource" type="{https://chordflower.cc/schemas/maven}Resource" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="filters" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pluginManagement" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="plugin" type="{https://chordflower.cc/schemas/maven}Plugin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="plugins" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="plugin" type="{https://chordflower.cc/schemas/maven}Plugin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="defaultGoal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="directory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="finalName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "Build", propOrder = {

} )
public class Build {

  @Valid
  private Build.SourceDirectories sourceDirectories;

  @Valid
  private Build.TestSourceDirectories testSourceDirectories;

  private String outputDirectory;

  private String testOutputDirectory;

  @Valid
  private Build.Extensions extensions;

  @Valid
  private Build.Resources resources;

  @Valid
  private Build.TestResources testResources;

  @Valid
  private Build.Filters filters;

  @Valid
  private Build.PluginManagement pluginManagement;

  @Valid
  private Build.Plugins plugins;

  @XmlAttribute( name = "defaultGoal" )
  private String defaultGoal;

  @XmlAttribute( name = "directory" )
  private String directory;

  @XmlAttribute( name = "finalName" )
  private String finalName;

  @Contract( pure = true )
  public Build( ) {
  }

  /**
   * Gets the value of the sourceDirectories property.
   *
   * @return
   *     possible object is
   *     {@link Build.SourceDirectories }
   *
   */
  public Build.SourceDirectories getSourceDirectories( ) {
    return sourceDirectories;
  }

  /**
   * Sets the value of the sourceDirectories property.
   *
   * @param value
   *     allowed object is
   *     {@link Build.SourceDirectories }
   *
   */
  public void setSourceDirectories( Build.SourceDirectories value ) {
    this.sourceDirectories = value;
  }

  /**
   * Gets the value of the testSourceDirectories property.
   *
   * @return
   *     possible object is
   *     {@link Build.TestSourceDirectories }
   *
   */
  public Build.TestSourceDirectories getTestSourceDirectories( ) {
    return testSourceDirectories;
  }

  /**
   * Sets the value of the testSourceDirectories property.
   *
   * @param value
   *     allowed object is
   *     {@link Build.TestSourceDirectories }
   *
   */
  public void setTestSourceDirectories( Build.TestSourceDirectories value ) {
    this.testSourceDirectories = value;
  }

  /**
   * Gets the value of the outputDirectory property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getOutputDirectory( ) {
    return outputDirectory;
  }

  /**
   * Sets the value of the outputDirectory property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setOutputDirectory( String value ) {
    this.outputDirectory = value;
  }

  /**
   * Gets the value of the testOutputDirectory property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getTestOutputDirectory( ) {
    return testOutputDirectory;
  }

  /**
   * Sets the value of the testOutputDirectory property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setTestOutputDirectory( String value ) {
    this.testOutputDirectory = value;
  }

  /**
   * Gets the value of the extensions property.
   *
   * @return
   *     possible object is
   *     {@link Build.Extensions }
   *
   */
  public Build.Extensions getExtensions( ) {
    return extensions;
  }

  /**
   * Sets the value of the extensions property.
   *
   * @param value
   *     allowed object is
   *     {@link Build.Extensions }
   *
   */
  public void setExtensions( Build.Extensions value ) {
    this.extensions = value;
  }

  /**
   * Gets the value of the resources property.
   *
   * @return
   *     possible object is
   *     {@link Build.Resources }
   *
   */
  public Build.Resources getResources( ) {
    return resources;
  }

  /**
   * Sets the value of the resources property.
   *
   * @param value
   *     allowed object is
   *     {@link Build.Resources }
   *
   */
  public void setResources( Build.Resources value ) {
    this.resources = value;
  }

  /**
   * Gets the value of the testResources property.
   *
   * @return
   *     possible object is
   *     {@link Build.TestResources }
   *
   */
  public Build.TestResources getTestResources( ) {
    return testResources;
  }

  /**
   * Sets the value of the testResources property.
   *
   * @param value
   *     allowed object is
   *     {@link Build.TestResources }
   *
   */
  public void setTestResources( Build.TestResources value ) {
    this.testResources = value;
  }

  /**
   * Gets the value of the filters property.
   *
   * @return
   *     possible object is
   *     {@link Build.Filters }
   *
   */
  public Build.Filters getFilters( ) {
    return filters;
  }

  /**
   * Sets the value of the filters property.
   *
   * @param value
   *     allowed object is
   *     {@link Build.Filters }
   *
   */
  public void setFilters( Build.Filters value ) {
    this.filters = value;
  }

  /**
   * Gets the value of the pluginManagement property.
   *
   * @return
   *     possible object is
   *     {@link Build.PluginManagement }
   *
   */
  public Build.PluginManagement getPluginManagement( ) {
    return pluginManagement;
  }

  /**
   * Sets the value of the pluginManagement property.
   *
   * @param value
   *     allowed object is
   *     {@link Build.PluginManagement }
   *
   */
  public void setPluginManagement( Build.PluginManagement value ) {
    this.pluginManagement = value;
  }

  /**
   * Gets the value of the plugins property.
   *
   * @return
   *     possible object is
   *     {@link Build.Plugins }
   *
   */
  public Build.Plugins getPlugins( ) {
    return plugins;
  }

  /**
   * Sets the value of the plugins property.
   *
   * @param value
   *     allowed object is
   *     {@link Build.Plugins }
   *
   */
  public void setPlugins( Build.Plugins value ) {
    this.plugins = value;
  }

  /**
   * Gets the value of the defaultGoal property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getDefaultGoal( ) {
    return defaultGoal;
  }

  /**
   * Sets the value of the defaultGoal property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setDefaultGoal( String value ) {
    this.defaultGoal = value;
  }

  /**
   * Gets the value of the directory property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getDirectory( ) {
    return directory;
  }

  /**
   * Sets the value of the directory property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setDirectory( String value ) {
    this.directory = value;
  }

  /**
   * Gets the value of the finalName property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getFinalName( ) {
    return finalName;
  }

  /**
   * Sets the value of the finalName property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setFinalName( String value ) {
    this.finalName = value;
  }

  public Build withSourceDirectories( Build.SourceDirectories value ) {
    setSourceDirectories( value );
    return this;
  }

  public Build withTestSourceDirectories( Build.TestSourceDirectories value ) {
    setTestSourceDirectories( value );
    return this;
  }

  public Build withOutputDirectory( String value ) {
    setOutputDirectory( value );
    return this;
  }

  public Build withTestOutputDirectory( String value ) {
    setTestOutputDirectory( value );
    return this;
  }

  public Build withExtensions( Build.Extensions value ) {
    setExtensions( value );
    return this;
  }

  public Build withResources( Build.Resources value ) {
    setResources( value );
    return this;
  }

  public Build withTestResources( Build.TestResources value ) {
    setTestResources( value );
    return this;
  }

  public Build withFilters( Build.Filters value ) {
    setFilters( value );
    return this;
  }

  public Build withPluginManagement( Build.PluginManagement value ) {
    setPluginManagement( value );
    return this;
  }

  public Build withPlugins( Build.Plugins value ) {
    setPlugins( value );
    return this;
  }

  public Build withDefaultGoal( String value ) {
    setDefaultGoal( value );
    return this;
  }

  public Build withDirectory( String value ) {
    setDirectory( value );
    return this;
  }

  public Build withFinalName( String value ) {
    setFinalName( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "sourceDirectories=" + sourceDirectories )
        .add( "testSourceDirectories=" + testSourceDirectories )
        .add( "outputDirectory='" + outputDirectory + "'" )
        .add( "testOutputDirectory='" + testOutputDirectory + "'" )
        .add( "extensions=" + extensions )
        .add( "resources=" + resources )
        .add( "testResources=" + testResources )
        .add( "filters=" + filters )
        .add( "pluginManagement=" + pluginManagement )
        .add( "plugins=" + plugins )
        .add( "defaultGoal='" + defaultGoal + "'" )
        .add( "directory='" + directory + "'" )
        .add( "finalName='" + finalName + "'" )
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
    Build build = ( Build ) o;
    return Objects.equals( sourceDirectories, build.sourceDirectories ) && Objects.equals( testSourceDirectories, build.testSourceDirectories ) && Objects.equals( outputDirectory, build.outputDirectory ) && Objects.equals( testOutputDirectory, build.testOutputDirectory ) && Objects.equals( extensions, build.extensions ) && Objects.equals( resources, build.resources ) && Objects.equals( testResources, build.testResources ) && Objects.equals( filters, build.filters ) && Objects.equals( pluginManagement, build.pluginManagement ) && Objects.equals( plugins, build.plugins ) && Objects.equals( defaultGoal, build.defaultGoal ) && Objects.equals( directory, build.directory ) && Objects.equals( finalName, build.finalName );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( sourceDirectories, testSourceDirectories, outputDirectory, testOutputDirectory, extensions, resources, testResources, filters, pluginManagement, plugins, defaultGoal, directory, finalName );
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
   *         &lt;element name="extension" type="{https://chordflower.cc/schemas/maven}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "extension"
  } )
  public static class Extensions {

    @Valid
    private final List< Extension > extension = new ArrayList<>( );

    public Extensions( ) {
    }

    /**
     * Gets the value of the extension property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     *
     *
     */
    public List< Extension > getExtension( ) {
      return this.extension;
    }

    public Build.Extensions withExtension( Extension... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getExtension( ).add( value ) );
      }
      return this;
    }

    public Build.Extensions withExtension( Collection< Extension > values ) {
      if( values != null ) {
        getExtension( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "extension=" + extension )
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
      Extensions that = ( Extensions ) o;
      return Objects.equals( extension, that.extension );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( extension );
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
   *         &lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "filter"
  } )
  public static class Filters {

    private final List< String > filter = new ArrayList<>( );

    public Filters( ) {
    }

    /**
     * Gets the value of the filter property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List< String > getFilter( ) {
      return this.filter;
    }

    public Build.Filters withFilter( String... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getFilter( ).add( value ) );
      }
      return this;
    }

    public Build.Filters withFilter( Collection< String > values ) {
      if( values != null ) {
        getFilter( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "filter=" + filter )
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
      Filters filters = ( Filters ) o;
      return Objects.equals( filter, filters.filter );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( filter );
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
   *         &lt;element name="plugin" type="{https://chordflower.cc/schemas/maven}Plugin" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "plugin"
  } )
  public static class PluginManagement {

    @Valid
    private final List< Plugin > plugin = new ArrayList<>( );

    public PluginManagement( ) {
    }

    /**
     * Gets the value of the plugin property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plugin property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlugin().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Plugin }
     *
     *
     */
    public List< Plugin > getPlugin( ) {
      return this.plugin;
    }

    public Build.PluginManagement withPlugin( Plugin... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getPlugin( ).add( value ) );
      }
      return this;
    }

    public Build.PluginManagement withPlugin( Collection< Plugin > values ) {
      if( values != null ) {
        getPlugin( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "plugin=" + plugin )
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
      PluginManagement that = ( PluginManagement ) o;
      return Objects.equals( plugin, that.plugin );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( plugin );
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
   *         &lt;element name="plugin" type="{https://chordflower.cc/schemas/maven}Plugin" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "plugin"
  } )
  public static class Plugins {

    @Valid
    private final List< Plugin > plugin = new ArrayList<>( );

    public Plugins( ) {
    }

    /**
     * Gets the value of the plugin property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plugin property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlugin().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Plugin }
     *
     *
     */
    public List< Plugin > getPlugin( ) {
      return this.plugin;
    }

    public Build.Plugins withPlugin( Plugin... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getPlugin( ).add( value ) );
      }
      return this;
    }

    public Build.Plugins withPlugin( Collection< Plugin > values ) {
      if( values != null ) {
        getPlugin( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "plugin=" + plugin )
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
      Plugins plugins = ( Plugins ) o;
      return Objects.equals( plugin, plugins.plugin );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( plugin );
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
   *         &lt;element name="resource" type="{https://chordflower.cc/schemas/maven}Resource" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "resource"
  } )
  public static class Resources {

    @Valid
    private final List< Resource > resource = new ArrayList<>( );

    public Resources( ) {
    }

    /**
     * Gets the value of the resource property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResource().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resource }
     *
     *
     */
    public List< Resource > getResource( ) {
      return this.resource;
    }

    public Build.Resources withResource( Resource... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getResource( ).add( value ) );
      }
      return this;
    }

    public Build.Resources withResource( Collection< Resource > values ) {
      if( values != null ) {
        getResource( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "resource=" + resource )
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
      Resources resources = ( Resources ) o;
      return Objects.equals( resource, resources.resource );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( resource );
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
   *         &lt;element name="sourceDirectory" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "sourceDirectory"
  } )
  public static class SourceDirectories {

    private final List< String > sourceDirectory = new ArrayList<>( );

    public SourceDirectories( ) {
    }

    /**
     * Gets the value of the sourceDirectory property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceDirectory property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceDirectory().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List< String > getSourceDirectory( ) {
      return this.sourceDirectory;
    }

    public Build.SourceDirectories withSourceDirectory( String... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getSourceDirectory( ).add( value ) );
      }
      return this;
    }

    public Build.SourceDirectories withSourceDirectory( Collection< String > values ) {
      if( values != null ) {
        getSourceDirectory( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "sourceDirectory=" + sourceDirectory )
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
      SourceDirectories that = ( SourceDirectories ) o;
      return Objects.equals( sourceDirectory, that.sourceDirectory );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( sourceDirectory );
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
   *         &lt;element name="testResource" type="{https://chordflower.cc/schemas/maven}Resource" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "testResource"
  } )
  public static class TestResources {

    @Valid
    private final List< Resource > testResource = new ArrayList<>( );

    public TestResources( ) {
    }

    /**
     * Gets the value of the testResource property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testResource property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestResource().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resource }
     *
     *
     */
    public List< Resource > getTestResource( ) {
      return this.testResource;
    }

    public Build.TestResources withTestResource( Resource... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getTestResource( ).add( value ) );
      }
      return this;
    }

    public Build.TestResources withTestResource( Collection< Resource > values ) {
      if( values != null ) {
        getTestResource( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "testResource=" + testResource )
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
      TestResources that = ( TestResources ) o;
      return Objects.equals( testResource, that.testResource );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( testResource );
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
   *         &lt;element name="testSourceDirectory" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "testSourceDirectory"
  } )
  public static class TestSourceDirectories {

    private final List< String > testSourceDirectory = new ArrayList<>( );

    public TestSourceDirectories( ) {
    }

    /**
     * Gets the value of the testSourceDirectory property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSourceDirectory property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSourceDirectory().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List< String > getTestSourceDirectory( ) {
      return this.testSourceDirectory;
    }

    public Build.TestSourceDirectories withTestSourceDirectory( String... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getTestSourceDirectory( ).add( value ) );
      }
      return this;
    }

    public Build.TestSourceDirectories withTestSourceDirectory( Collection< String > values ) {
      if( values != null ) {
        getTestSourceDirectory( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "testSourceDirectory=" + testSourceDirectory )
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
      TestSourceDirectories that = ( TestSourceDirectories ) o;
      return Objects.equals( testSourceDirectory, that.testSourceDirectory );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( testSourceDirectory );
    }
  }

}
