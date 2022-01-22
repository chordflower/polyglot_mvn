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
 * This element describes all of the classpath resources associated with a project or unit tests.
 *
 * <p>Java class for Resource complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Resource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="includes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="include" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="excludes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="exclude" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="targetPath" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="filtering" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="directory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "Resource", propOrder = {

} )
public class Resource {

  @Valid
  private Resource.Includes includes;

  @Valid
  private Resource.Excludes excludes;

  @XmlAttribute( name = "targetPath" )
  private String targetPath;

  @XmlAttribute( name = "filtering" )
  private Boolean filtering;

  @XmlAttribute( name = "directory" )
  private String directory;

  @Contract( pure = true )
  public Resource( ) {
  }

  @Contract( pure = true )
  public Resource( Includes includes, Excludes excludes, String targetPath, Boolean filtering, String directory ) {
    this.includes = includes;
    this.excludes = excludes;
    this.targetPath = targetPath;
    this.filtering = filtering;
    this.directory = directory;
  }

  /**
   * Gets the value of the includes property.
   *
   * @return
   *     possible object is
   *     {@link Resource.Includes }
   *
   */
  public Resource.Includes getIncludes( ) {
    return includes;
  }

  /**
   * Sets the value of the includes property.
   *
   * @param value
   *     allowed object is
   *     {@link Resource.Includes }
   *
   */
  public void setIncludes( Resource.Includes value ) {
    this.includes = value;
  }

  /**
   * Gets the value of the excludes property.
   *
   * @return
   *     possible object is
   *     {@link Resource.Excludes }
   *
   */
  public Resource.Excludes getExcludes( ) {
    return excludes;
  }

  /**
   * Sets the value of the excludes property.
   *
   * @param value
   *     allowed object is
   *     {@link Resource.Excludes }
   *
   */
  public void setExcludes( Resource.Excludes value ) {
    this.excludes = value;
  }

  /**
   * Gets the value of the targetPath property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getTargetPath( ) {
    return targetPath;
  }

  /**
   * Sets the value of the targetPath property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setTargetPath( String value ) {
    this.targetPath = value;
  }

  /**
   * Gets the value of the filtering property.
   * This getter has been renamed from isFiltering() to getFiltering() by cxf-xjc-boolean plugin.
   *
   * @return
   *     possible object is
   *     {@link Boolean }
   *
   */
  public boolean getFiltering( ) {
    return Objects.requireNonNullElse( filtering, false );
  }

  /**
   * Sets the value of the filtering property.
   *
   * @param value
   *     allowed object is
   *     {@link Boolean }
   *
   */
  public void setFiltering( Boolean value ) {
    this.filtering = value;
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

  public Resource withIncludes( Resource.Includes value ) {
    setIncludes( value );
    return this;
  }

  public Resource withExcludes( Resource.Excludes value ) {
    setExcludes( value );
    return this;
  }

  public Resource withTargetPath( String value ) {
    setTargetPath( value );
    return this;
  }

  public Resource withFiltering( Boolean value ) {
    setFiltering( value );
    return this;
  }

  public Resource withDirectory( String value ) {
    setDirectory( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "includes=" + includes )
        .add( "excludes=" + excludes )
        .add( "targetPath='" + targetPath + "'" )
        .add( "filtering=" + filtering )
        .add( "directory='" + directory + "'" )
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
    Resource resource = ( Resource ) o;
    return Objects.equals( includes, resource.includes ) && Objects.equals( excludes, resource.excludes ) && Objects.equals( targetPath, resource.targetPath ) && Objects.equals( filtering, resource.filtering ) && Objects.equals( directory, resource.directory );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( includes, excludes, targetPath, filtering, directory );
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
   *         &lt;element name="exclude" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "exclude"
  } )
  public static class Excludes {

    private final List< String > exclude = new ArrayList<>( );

    @Contract( pure = true )
    public Excludes( ) {
    }

    /**
     * Gets the value of the exclude property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclude property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclude().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List< String > getExclude( ) {
      return this.exclude;
    }

    public Resource.Excludes withExclude( String... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getExclude( ).add( value ) );
      }
      return this;
    }

    public Resource.Excludes withExclude( Collection< String > values ) {
      if( values != null ) {
        getExclude( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "exclude=" + exclude )
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
      Excludes excludes = ( Excludes ) o;
      return Objects.equals( exclude, excludes.exclude );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( exclude );
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
   *         &lt;element name="include" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "include"
  } )
  public static class Includes {

    private final List< String > include = new ArrayList<>( );

    @Contract( pure = true )
    public Includes( ) {
    }

    /**
     * Gets the value of the include property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the include property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclude().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List< String > getInclude( ) {
      return this.include;
    }

    public Resource.Includes withInclude( String... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getInclude( ).add( value ) );
      }
      return this;
    }

    public Resource.Includes withInclude( Collection< String > values ) {
      if( values != null ) {
        getInclude( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "include=" + include )
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
      Includes includes = ( Includes ) o;
      return Objects.equals( include, includes.include );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( include );
    }
  }

}
