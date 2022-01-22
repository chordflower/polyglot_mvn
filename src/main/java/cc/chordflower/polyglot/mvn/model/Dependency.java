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
 * The `dependency` element contains information about a dependency of the project.
 *
 * <p>Java class for Dependency complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Dependency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="exclusions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="exclusion" type="{https://chordflower.cc/schemas/maven}Exclusion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="groupId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="artifactId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" default="jar" /&gt;
 *       &lt;attribute name="classifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="scope" type="{https://chordflower.cc/schemas/maven}scope" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "Dependency", propOrder = {

} )
public class Dependency {

  @Valid
  private Dependency.Exclusions exclusions;

  @XmlAttribute( name = "optional" )
  private Boolean optional;

  @XmlAttribute( name = "groupId", required = true )
  @NotNull
  private String groupId;

  @XmlAttribute( name = "artifactId", required = true )
  @NotNull
  private String artifactId;

  @XmlAttribute( name = "version" )
  private String version;

  @XmlAttribute( name = "type" )
  private String type;

  @XmlAttribute( name = "classifier" )
  private String classifier;

  @XmlAttribute( name = "scope" )
  private Scope scope;

  @Contract( pure = true )
  public Dependency( String groupId, String artifactId, String version ) {
    this.groupId = groupId;
    this.artifactId = artifactId;
    this.version = version;
  }

  @Contract( pure = true )
  public Dependency( ) {
  }

  /**
   * Gets the value of the exclusions property.
   *
   * @return
   *     possible object is
   *     {@link Dependency.Exclusions }
   *
   */
  public Dependency.Exclusions getExclusions( ) {
    return exclusions;
  }

  /**
   * Sets the value of the exclusions property.
   *
   * @param value
   *     allowed object is
   *     {@link Dependency.Exclusions }
   *
   */
  public void setExclusions( Dependency.Exclusions value ) {
    this.exclusions = value;
  }

  /**
   * Gets the value of the optional property.
   * This getter has been renamed from isOptional() to getOptional() by cxf-xjc-boolean plugin.
   *
   * @return
   *     possible object is
   *     {@link Boolean }
   *
   */
  public Boolean getOptional( ) {
    return optional;
  }

  /**
   * Sets the value of the optional property.
   *
   * @param value
   *     allowed object is
   *     {@link Boolean }
   *
   */
  public void setOptional( Boolean value ) {
    this.optional = value;
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
   * Gets the value of the type property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getType( ) {
    if( type == null ) {
      return "jar";
    } else {
      return type;
    }
  }

  /**
   * Sets the value of the type property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setType( String value ) {
    this.type = value;
  }

  /**
   * Gets the value of the classifier property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getClassifier( ) {
    return classifier;
  }

  /**
   * Sets the value of the classifier property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setClassifier( String value ) {
    this.classifier = value;
  }

  /**
   * Sets the value of the scope property.
   *
   */
  public void setScope( Scope value ) {
    scope = value;
  }

  public void unsetScope( ) {
    scope = null;
  }

  /**
   * Gets the value of the scope property.
   *
   */
  public Scope getScope( ) {
    return scope;
  }

  public Dependency withExclusions( Dependency.Exclusions value ) {
    setExclusions( value );
    return this;
  }

  public Dependency withOptional( Boolean value ) {
    setOptional( value );
    return this;
  }

  public Dependency withGroupId( String value ) {
    setGroupId( value );
    return this;
  }

  public Dependency withArtifactId( String value ) {
    setArtifactId( value );
    return this;
  }

  public Dependency withVersion( String value ) {
    setVersion( value );
    return this;
  }

  public Dependency withType( String value ) {
    setType( value );
    return this;
  }

  public Dependency withClassifier( String value ) {
    setClassifier( value );
    return this;
  }

  public Dependency withScope( Scope value ) {
    setScope( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "exclusions=" + exclusions )
        .add( "optional=" + optional )
        .add( "groupId='" + groupId + "'" )
        .add( "artifactId='" + artifactId + "'" )
        .add( "version='" + version + "'" )
        .add( "type='" + type + "'" )
        .add( "classifier='" + classifier + "'" )
        .add( "scope=" + scope )
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
    Dependency that = ( Dependency ) o;
    return Objects.equals( exclusions, that.exclusions ) && Objects.equals( optional, that.optional ) && Objects.equals( groupId, that.groupId ) && Objects.equals( artifactId, that.artifactId ) && Objects.equals( version, that.version ) && Objects.equals( type, that.type ) && Objects.equals( classifier, that.classifier ) && scope == that.scope;
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( exclusions, optional, groupId, artifactId, version, type, classifier, scope );
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
   *         &lt;element name="exclusion" type="{https://chordflower.cc/schemas/maven}Exclusion" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "exclusion"
  } )
  public static class Exclusions {

    @Valid
    private final List< Exclusion > exclusion = new ArrayList<>( );

    public Exclusions( ) {
    }

    /**
     * Gets the value of the exclusion property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusion property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusion().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exclusion }
     *
     *
     */
    public List< Exclusion > getExclusion( ) {
      return this.exclusion;
    }

    public Dependency.Exclusions withExclusion( Exclusion... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getExclusion( ).add( value ) );
      }
      return this;
    }

    public Dependency.Exclusions withExclusion( Collection< Exclusion > values ) {
      if( values != null ) {
        getExclusion( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "exclusion=" + exclusion )
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
      Exclusions that = ( Exclusions ) o;
      return Objects.equals( exclusion, that.exclusion );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( exclusion );
    }
  }

}
