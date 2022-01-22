package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;
import org.w3c.dom.Element;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The `plugin` element contains informations required for a plugin.
 *
 * <p>Java class for Plugin complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Plugin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="executions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="execution" type="{https://chordflower.cc/schemas/maven}PluginExecution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dependency" type="{https://chordflower.cc/schemas/maven}Dependency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="configuration" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="groupId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="artifactId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="extensions" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="inherited" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "Plugin", propOrder = {
    "executions",
    "dependency",
    "configuration"
} )
public class Plugin {

  private final List< Plugin.Executions > executions = new ArrayList<>( );

  private final List< Dependency > dependency = new ArrayList<>( );

  private final List< Plugin.Configuration > configuration = new ArrayList<>( );

  @XmlAttribute( name = "groupId", required = true )
  @NotNull
  private String groupId;

  @XmlAttribute( name = "artifactId", required = true )
  @NotNull
  private String artifactId;

  @XmlAttribute( name = "version" )
  private String version;

  @XmlAttribute( name = "extensions" )
  private Boolean extensions;

  @XmlAttribute( name = "inherited" )
  private Boolean inherited;

  public Plugin( ) {
  }

  public Plugin( String groupId, String artifactId, String version ) {
    this.groupId = groupId;
    this.artifactId = artifactId;
    this.version = version;
  }

  /**
   * Gets the value of the executions property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the executions property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getExecutions().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Plugin.Executions }
   *
   *
   */
  public List< Plugin.Executions > getExecutions( ) {
    return this.executions;
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

  /**
   * Gets the value of the configuration property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the configuration property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getConfiguration().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Plugin.Configuration }
   *
   *
   */
  public List< Plugin.Configuration > getConfiguration( ) {
    return this.configuration;
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
   * Gets the value of the extensions property.
   * This getter has been renamed from isExtensions() to getExtensions() by cxf-xjc-boolean plugin.
   *
   * @return
   *     possible object is
   *     {@link Boolean }
   *
   */
  public boolean getExtensions( ) {
    return Objects.requireNonNullElse( extensions, false );
  }

  /**
   * Sets the value of the extensions property.
   *
   * @param value
   *     allowed object is
   *     {@link Boolean }
   *
   */
  public void setExtensions( Boolean value ) {
    this.extensions = value;
  }

  /**
   * Gets the value of the inherited property.
   * This getter has been renamed from isInherited() to getInherited() by cxf-xjc-boolean plugin.
   *
   * @return
   *     possible object is
   *     {@link Boolean }
   *
   */
  public boolean getInherited( ) {
    return Objects.requireNonNullElse( inherited, true );
  }

  /**
   * Sets the value of the inherited property.
   *
   * @param value
   *     allowed object is
   *     {@link Boolean }
   *
   */
  public void setInherited( Boolean value ) {
    this.inherited = value;
  }

  public Plugin withExecutions( Plugin.Executions... values ) {
    if( values != null ) {
      Arrays.stream( values ).forEach( value -> getExecutions( ).add( value ) );
    }
    return this;
  }

  public Plugin withExecutions( Collection< Plugin.Executions > values ) {
    if( values != null ) {
      getExecutions( ).addAll( values );
    }
    return this;
  }

  public Plugin withDependency( Dependency... values ) {
    if( values != null ) {
      Arrays.stream( values ).forEach( value -> getDependency( ).add( value ) );
    }
    return this;
  }

  public Plugin withDependency( Collection< Dependency > values ) {
    if( values != null ) {
      getDependency( ).addAll( values );
    }
    return this;
  }

  public Plugin withConfiguration( Plugin.Configuration... values ) {
    if( values != null ) {
      Arrays.stream( values ).forEach( value -> getConfiguration( ).add( value ) );
    }
    return this;
  }

  public Plugin withConfiguration( Collection< Plugin.Configuration > values ) {
    if( values != null ) {
      getConfiguration( ).addAll( values );
    }
    return this;
  }

  public Plugin withGroupId( String value ) {
    setGroupId( value );
    return this;
  }

  public Plugin withArtifactId( String value ) {
    setArtifactId( value );
    return this;
  }

  public Plugin withVersion( String value ) {
    setVersion( value );
    return this;
  }

  public Plugin withExtensions( Boolean value ) {
    setExtensions( value );
    return this;
  }

  public Plugin withInherited( Boolean value ) {
    setInherited( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "executions=" + executions )
        .add( "dependency=" + dependency )
        .add( "configuration=" + configuration )
        .add( "groupId='" + groupId + "'" )
        .add( "artifactId='" + artifactId + "'" )
        .add( "version='" + version + "'" )
        .add( "extensions=" + extensions )
        .add( "inherited=" + inherited )
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
    var plugin = ( Plugin ) o;
    return Objects.equals( executions, plugin.executions ) && Objects.equals( dependency, plugin.dependency ) && Objects.equals( configuration, plugin.configuration ) && Objects.equals( groupId, plugin.groupId ) && Objects.equals( artifactId, plugin.artifactId ) && Objects.equals( version, plugin.version ) && Objects.equals( extensions, plugin.extensions ) && Objects.equals( inherited, plugin.inherited );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( executions, dependency, configuration, groupId, artifactId, version, extensions, inherited );
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
   *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "any"
  } )
  public static class Configuration {

    @XmlAnyElement
    private final List< Element > any = new ArrayList<>( );

    public Configuration( ) {
    }

    /**
     * Gets the value of the any property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     *
     *
     */
    public List< Element > getAny( ) {
      return this.any;
    }

    public Plugin.Configuration withAny( Element... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getAny( ).add( value ) );
      }
      return this;
    }

    public Plugin.Configuration withAny( Collection< Element > values ) {
      if( values != null ) {
        getAny( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "any=" + any )
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
      var that = ( Configuration ) o;
      return Objects.equals( any, that.any );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( any );
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
   *         &lt;element name="execution" type="{https://chordflower.cc/schemas/maven}PluginExecution" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "execution"
  } )
  public static class Executions {

    @Valid
    private final List< PluginExecution > execution = new ArrayList<>( );

    public Executions( ) {
    }

    /**
     * Gets the value of the execution property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the execution property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecution().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PluginExecution }
     *
     *
     */
    public List< PluginExecution > getExecution( ) {
      return this.execution;
    }

    public Plugin.Executions withExecution( PluginExecution... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getExecution( ).add( value ) );
      }
      return this;
    }

    public Plugin.Executions withExecution( Collection< PluginExecution > values ) {
      if( values != null ) {
        getExecution( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "execution=" + execution )
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
      var that = ( Executions ) o;
      return Objects.equals( execution, that.execution );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( execution );
    }
  }

}
