package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;
import org.w3c.dom.Element;

import javax.validation.Valid;
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
 * The `execution` element contains informations required for the execution of a plugin.
 *
 * <p>Java class for PluginExecution complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PluginExecution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="goals" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="goal" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
 *       &lt;/all&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" default="default" /&gt;
 *       &lt;attribute name="inherited" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="phase" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "PluginExecution", propOrder = {

} )
public class PluginExecution {

  @Valid
  private PluginExecution.Goals goals;

  @Valid
  private PluginExecution.Configuration configuration;

  @XmlAttribute( name = "id" )
  private String id;

  @XmlAttribute( name = "inherited" )
  private Boolean inherited;

  @XmlAttribute( name = "phase" )
  private String phase;

  @Contract( pure = true )
  public PluginExecution( ) {
  }

  /**
   * Gets the value of the goals property.
   *
   * @return
   *     possible object is
   *     {@link PluginExecution.Goals }
   *
   */
  public PluginExecution.Goals getGoals( ) {
    return goals;
  }

  /**
   * Sets the value of the goals property.
   *
   * @param value
   *     allowed object is
   *     {@link PluginExecution.Goals }
   *
   */
  public void setGoals( PluginExecution.Goals value ) {
    this.goals = value;
  }

  /**
   * Gets the value of the configuration property.
   *
   * @return
   *     possible object is
   *     {@link PluginExecution.Configuration }
   *
   */
  public PluginExecution.Configuration getConfiguration( ) {
    return configuration;
  }

  /**
   * Sets the value of the configuration property.
   *
   * @param value
   *     allowed object is
   *     {@link PluginExecution.Configuration }
   *
   */
  public void setConfiguration( PluginExecution.Configuration value ) {
    this.configuration = value;
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

  /**
   * Gets the value of the phase property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getPhase( ) {
    return phase;
  }

  /**
   * Sets the value of the phase property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setPhase( String value ) {
    this.phase = value;
  }

  public PluginExecution withGoals( PluginExecution.Goals value ) {
    setGoals( value );
    return this;
  }

  public PluginExecution withConfiguration( PluginExecution.Configuration value ) {
    setConfiguration( value );
    return this;
  }

  public PluginExecution withId( String value ) {
    setId( value );
    return this;
  }

  public PluginExecution withInherited( Boolean value ) {
    setInherited( value );
    return this;
  }

  public PluginExecution withPhase( String value ) {
    setPhase( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "goals=" + goals )
        .add( "configuration=" + configuration )
        .add( "id='" + id + "'" )
        .add( "inherited=" + inherited )
        .add( "phase='" + phase + "'" )
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
    var that = ( PluginExecution ) o;
    return Objects.equals( goals, that.goals ) && Objects.equals( configuration, that.configuration ) && Objects.equals( id, that.id ) && Objects.equals( inherited, that.inherited ) && Objects.equals( phase, that.phase );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( goals, configuration, id, inherited, phase );
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

    public PluginExecution.Configuration withAny( Element... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getAny( ).add( value ) );
      }
      return this;
    }

    public PluginExecution.Configuration withAny( Collection< Element > values ) {
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

    @Contract( value = "null -> false", pure = true )
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
   *         &lt;element name="goal" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "goal"
  } )
  public static class Goals {

    private final List< String > goal = new ArrayList<>( );

    public Goals( ) {
    }

    /**
     * Gets the value of the goal property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goal property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoal().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List< String > getGoal( ) {
      return this.goal;
    }

    public PluginExecution.Goals withGoal( String... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getGoal( ).add( value ) );
      }
      return this;
    }

    public PluginExecution.Goals withGoal( Collection< String > values ) {
      if( values != null ) {
        getGoal( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "goal=" + goal )
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
      var goals = ( Goals ) o;
      return Objects.equals( goal, goals.goal );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( goal );
    }
  }

}
