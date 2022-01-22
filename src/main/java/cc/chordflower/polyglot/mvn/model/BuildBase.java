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
 * Generic informations for a build.
 *
 * <p>Java class for BuildBase complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BuildBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
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
@XmlType( name = "BuildBase", propOrder = {

} )
public class BuildBase {

  @Valid
  private BuildBase.Resources resources;

  @Valid
  private BuildBase.TestResources testResources;

  @Valid
  private BuildBase.Filters filters;

  @Valid
  private BuildBase.PluginManagement pluginManagement;

  @Valid
  private BuildBase.Plugins plugins;

  @XmlAttribute( name = "defaultGoal" )
  private String defaultGoal;

  @XmlAttribute( name = "directory" )
  private String directory;

  @XmlAttribute( name = "finalName" )
  private String finalName;

  @Contract( pure = true )
  public BuildBase( ) {
  }

  /**
   * Gets the value of the resources property.
   *
   * @return
   *     possible object is
   *     {@link BuildBase.Resources }
   *
   */
  public BuildBase.Resources getResources( ) {
    return resources;
  }

  /**
   * Sets the value of the resources property.
   *
   * @param value
   *     allowed object is
   *     {@link BuildBase.Resources }
   *
   */
  public void setResources( BuildBase.Resources value ) {
    this.resources = value;
  }

  /**
   * Gets the value of the testResources property.
   *
   * @return
   *     possible object is
   *     {@link BuildBase.TestResources }
   *
   */
  public BuildBase.TestResources getTestResources( ) {
    return testResources;
  }

  /**
   * Sets the value of the testResources property.
   *
   * @param value
   *     allowed object is
   *     {@link BuildBase.TestResources }
   *
   */
  public void setTestResources( BuildBase.TestResources value ) {
    this.testResources = value;
  }

  /**
   * Gets the value of the filters property.
   *
   * @return
   *     possible object is
   *     {@link BuildBase.Filters }
   *
   */
  public BuildBase.Filters getFilters( ) {
    return filters;
  }

  /**
   * Sets the value of the filters property.
   *
   * @param value
   *     allowed object is
   *     {@link BuildBase.Filters }
   *
   */
  public void setFilters( BuildBase.Filters value ) {
    this.filters = value;
  }

  /**
   * Gets the value of the pluginManagement property.
   *
   * @return
   *     possible object is
   *     {@link BuildBase.PluginManagement }
   *
   */
  public BuildBase.PluginManagement getPluginManagement( ) {
    return pluginManagement;
  }

  /**
   * Sets the value of the pluginManagement property.
   *
   * @param value
   *     allowed object is
   *     {@link BuildBase.PluginManagement }
   *
   */
  public void setPluginManagement( BuildBase.PluginManagement value ) {
    this.pluginManagement = value;
  }

  /**
   * Gets the value of the plugins property.
   *
   * @return
   *     possible object is
   *     {@link BuildBase.Plugins }
   *
   */
  public BuildBase.Plugins getPlugins( ) {
    return plugins;
  }

  /**
   * Sets the value of the plugins property.
   *
   * @param value
   *     allowed object is
   *     {@link BuildBase.Plugins }
   *
   */
  public void setPlugins( BuildBase.Plugins value ) {
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

  public BuildBase withResources( BuildBase.Resources value ) {
    setResources( value );
    return this;
  }

  public BuildBase withTestResources( BuildBase.TestResources value ) {
    setTestResources( value );
    return this;
  }

  public BuildBase withFilters( BuildBase.Filters value ) {
    setFilters( value );
    return this;
  }

  public BuildBase withPluginManagement( BuildBase.PluginManagement value ) {
    setPluginManagement( value );
    return this;
  }

  public BuildBase withPlugins( BuildBase.Plugins value ) {
    setPlugins( value );
    return this;
  }

  public BuildBase withDefaultGoal( String value ) {
    setDefaultGoal( value );
    return this;
  }

  public BuildBase withDirectory( String value ) {
    setDirectory( value );
    return this;
  }

  public BuildBase withFinalName( String value ) {
    setFinalName( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
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
    BuildBase buildBase = ( BuildBase ) o;
    return Objects.equals( resources, buildBase.resources ) && Objects.equals( testResources, buildBase.testResources ) && Objects.equals( filters, buildBase.filters ) && Objects.equals( pluginManagement, buildBase.pluginManagement ) && Objects.equals( plugins, buildBase.plugins ) && Objects.equals( defaultGoal, buildBase.defaultGoal ) && Objects.equals( directory, buildBase.directory ) && Objects.equals( finalName, buildBase.finalName );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( resources, testResources, filters, pluginManagement, plugins, defaultGoal, directory, finalName );
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

    public BuildBase.Filters withFilter( String... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getFilter( ).add( value ) );
      }
      return this;
    }

    public BuildBase.Filters withFilter( Collection< String > values ) {
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

    public BuildBase.PluginManagement withPlugin( Plugin... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getPlugin( ).add( value ) );
      }
      return this;
    }

    public BuildBase.PluginManagement withPlugin( Collection< Plugin > values ) {
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

    public BuildBase.Plugins withPlugin( Plugin... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getPlugin( ).add( value ) );
      }
      return this;
    }

    public BuildBase.Plugins withPlugin( Collection< Plugin > values ) {
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

    public BuildBase.Resources withResource( Resource... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getResource( ).add( value ) );
      }
      return this;
    }

    public BuildBase.Resources withResource( Collection< Resource > values ) {
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

    public BuildBase.TestResources withTestResource( Resource... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getTestResource( ).add( value ) );
      }
      return this;
    }

    public BuildBase.TestResources withTestResource( Collection< Resource > values ) {
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

}
