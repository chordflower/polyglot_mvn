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
 * The `plugin` element contains informations required for a report plugin.
 *
 * <p>Java class for ReportPlugin complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ReportPlugin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="reportSets" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="reportSet" type="{https://chordflower.cc/schemas/maven}ReportSet" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *       &lt;attribute name="groupId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="artifactId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="inherited" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "ReportPlugin", propOrder = {

} )
public class ReportPlugin {

  @Valid
  private ReportPlugin.ReportSets reportSets;

  @Valid
  private ReportPlugin.Configuration configuration;

  @XmlAttribute( name = "groupId", required = true )
  @NotNull
  private String groupId;

  @XmlAttribute( name = "artifactId", required = true )
  @NotNull
  private String artifactId;

  @XmlAttribute( name = "version" )
  private String version;

  @XmlAttribute( name = "inherited" )
  private Boolean inherited;

  @Contract( pure = true )
  public ReportPlugin( ) {
  }

  @Contract( pure = true )
  public ReportPlugin( String groupId, String artifactId, String version ) {
    this.groupId = groupId;
    this.artifactId = artifactId;
    this.version = version;
  }

  /**
   * Gets the value of the reportSets property.
   *
   * @return
   *     possible object is
   *     {@link ReportPlugin.ReportSets }
   *
   */
  public ReportPlugin.ReportSets getReportSets( ) {
    return reportSets;
  }

  /**
   * Sets the value of the reportSets property.
   *
   * @param value
   *     allowed object is
   *     {@link ReportPlugin.ReportSets }
   *
   */
  public void setReportSets( ReportPlugin.ReportSets value ) {
    this.reportSets = value;
  }

  /**
   * Gets the value of the configuration property.
   *
   * @return
   *     possible object is
   *     {@link ReportPlugin.Configuration }
   *
   */
  public ReportPlugin.Configuration getConfiguration( ) {
    return configuration;
  }

  /**
   * Sets the value of the configuration property.
   *
   * @param value
   *     allowed object is
   *     {@link ReportPlugin.Configuration }
   *
   */
  public void setConfiguration( ReportPlugin.Configuration value ) {
    this.configuration = value;
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

  public ReportPlugin withReportSets( ReportPlugin.ReportSets value ) {
    setReportSets( value );
    return this;
  }

  public ReportPlugin withConfiguration( ReportPlugin.Configuration value ) {
    setConfiguration( value );
    return this;
  }

  public ReportPlugin withGroupId( String value ) {
    setGroupId( value );
    return this;
  }

  public ReportPlugin withArtifactId( String value ) {
    setArtifactId( value );
    return this;
  }

  public ReportPlugin withVersion( String value ) {
    setVersion( value );
    return this;
  }

  public ReportPlugin withInherited( Boolean value ) {
    setInherited( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "reportSets=" + reportSets )
        .add( "configuration=" + configuration )
        .add( "groupId='" + groupId + "'" )
        .add( "artifactId='" + artifactId + "'" )
        .add( "version='" + version + "'" )
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
    ReportPlugin that = ( ReportPlugin ) o;
    return Objects.equals( reportSets, that.reportSets ) && Objects.equals( configuration, that.configuration ) && Objects.equals( groupId, that.groupId ) && Objects.equals( artifactId, that.artifactId ) && Objects.equals( version, that.version ) && Objects.equals( inherited, that.inherited );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( reportSets, configuration, groupId, artifactId, version, inherited );
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

    public ReportPlugin.Configuration withAny( Element... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getAny( ).add( value ) );
      }
      return this;
    }

    public ReportPlugin.Configuration withAny( Collection< Element > values ) {
      if( values != null ) {
        getAny( ).addAll( values );
      }
      return this;
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
      Configuration that = ( Configuration ) o;
      return Objects.equals( any, that.any );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( any );
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "any=" + any )
          .toString( );
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
   *         &lt;element name="reportSet" type="{https://chordflower.cc/schemas/maven}ReportSet" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "reportSet"
  } )
  public static class ReportSets {

    @Valid
    private final List< ReportSet > reportSet = new ArrayList<>( );

    public ReportSets( ) {
    }

    /**
     * Gets the value of the reportSet property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportSet property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportSet().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportSet }
     *
     *
     */
    public List< ReportSet > getReportSet( ) {
      return this.reportSet;
    }

    public ReportPlugin.ReportSets withReportSet( ReportSet... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getReportSet( ).add( value ) );
      }
      return this;
    }

    public ReportPlugin.ReportSets withReportSet( Collection< ReportSet > values ) {
      if( values != null ) {
        getReportSet( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "reportSet=" + reportSet )
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
      ReportSets that = ( ReportSets ) o;
      return Objects.equals( reportSet, that.reportSet );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( reportSet );
    }
  }

}
