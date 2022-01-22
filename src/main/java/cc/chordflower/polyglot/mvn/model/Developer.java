package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;
import org.w3c.dom.Element;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Information about one of the committers on this project.
 *
 * <p>Java class for Developer complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Developer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="organization" type="{https://chordflower.cc/schemas/maven}Organization" minOccurs="0"/&gt;
 *         &lt;element name="roles" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="properties" minOccurs="0"&gt;
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
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "Developer", propOrder = {

} )
public class Developer {

  private String name;

  private String email;

  @XmlSchemaType( name = "anyURI" )
  private String url;

  @Valid
  private Organization organization;

  @Valid
  private Developer.Roles roles;

  private String timezone;

  @Valid
  private Developer.Properties properties;

  @XmlAttribute( name = "id", required = true )
  @NotNull
  private String id;

  @Contract( pure = true )
  public Developer( ) {
  }

  @Contract( pure = true )
  public Developer( String name, String email, String url, String id ) {
    this.name = name;
    this.email = email;
    this.url = url;
    this.id = id;
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
   * Gets the value of the email property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getEmail( ) {
    return email;
  }

  /**
   * Sets the value of the email property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setEmail( String value ) {
    this.email = value;
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
   * Gets the value of the roles property.
   *
   * @return
   *     possible object is
   *     {@link Developer.Roles }
   *
   */
  public Developer.Roles getRoles( ) {
    return roles;
  }

  /**
   * Sets the value of the roles property.
   *
   * @param value
   *     allowed object is
   *     {@link Developer.Roles }
   *
   */
  public void setRoles( Developer.Roles value ) {
    this.roles = value;
  }

  /**
   * Gets the value of the timezone property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getTimezone( ) {
    return timezone;
  }

  /**
   * Sets the value of the timezone property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setTimezone( String value ) {
    this.timezone = value;
  }

  /**
   * Gets the value of the properties property.
   *
   * @return
   *     possible object is
   *     {@link Developer.Properties }
   *
   */
  public Developer.Properties getProperties( ) {
    return properties;
  }

  /**
   * Sets the value of the properties property.
   *
   * @param value
   *     allowed object is
   *     {@link Developer.Properties }
   *
   */
  public void setProperties( Developer.Properties value ) {
    this.properties = value;
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
    return id;
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

  public Developer withName( String value ) {
    setName( value );
    return this;
  }

  public Developer withEmail( String value ) {
    setEmail( value );
    return this;
  }

  public Developer withUrl( String value ) {
    setUrl( value );
    return this;
  }

  public Developer withOrganization( Organization value ) {
    setOrganization( value );
    return this;
  }

  public Developer withRoles( Developer.Roles value ) {
    setRoles( value );
    return this;
  }

  public Developer withTimezone( String value ) {
    setTimezone( value );
    return this;
  }

  public Developer withProperties( Developer.Properties value ) {
    setProperties( value );
    return this;
  }

  public Developer withId( String value ) {
    setId( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "name='" + name + "'" )
        .add( "email='" + email + "'" )
        .add( "url='" + url + "'" )
        .add( "organization=" + organization )
        .add( "roles=" + roles )
        .add( "timezone='" + timezone + "'" )
        .add( "properties=" + properties )
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
    var developer = ( Developer ) o;
    return Objects.equals( name, developer.name ) && Objects.equals( email, developer.email ) && Objects.equals( url, developer.url ) && Objects.equals( organization, developer.organization ) && Objects.equals( roles, developer.roles ) && Objects.equals( timezone, developer.timezone ) && Objects.equals( properties, developer.properties ) && Objects.equals( id, developer.id );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( name, email, url, organization, roles, timezone, properties, id );
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
  public static class Properties {

    @XmlAnyElement
    private final List< Element > any = new ArrayList<>( );

    public Properties( ) {
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

    public Developer.Properties withAny( Element... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getAny( ).add( value ) );
      }
      return this;
    }

    public Developer.Properties withAny( Collection< Element > values ) {
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
      var that = ( Properties ) o;
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
   *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "role"
  } )
  public static class Roles {

    private final List< String > role = new ArrayList<>( );

    public Roles( ) {
    }

    /**
     * Gets the value of the role property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List< String > getRole( ) {
      return this.role;
    }

    public Developer.Roles withRole( String... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getRole( ).add( value ) );
      }
      return this;
    }

    public Developer.Roles withRole( Collection< String > values ) {
      if( values != null ) {
        getRole( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "role=" + role )
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
      var roles = ( Roles ) o;
      return Objects.equals( role, roles.role );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( role );
    }
  }

}
