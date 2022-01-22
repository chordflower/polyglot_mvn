package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * This element describes all of the mailing lists associated with a project. The auto-generated site references this information.
 *
 * <p>Java class for MailingList complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MailingList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="subscribe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unsubscribe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="post" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="archive" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="otherArchives" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="otherArchive" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "MailingList", propOrder = {

} )
public class MailingList {

  private String subscribe;

  private String unsubscribe;

  private String post;

  @XmlSchemaType( name = "anyURI" )
  private String archive;

  @Valid
  private MailingList.OtherArchives otherArchives;

  @XmlAttribute( name = "name" )
  private String name;

  @Contract( pure = true )
  public MailingList( ) {
  }

  @Contract( pure = true )
  public MailingList( String name ) {
    this.name = name;
  }

  @Contract( pure = true )
  public MailingList( String subscribe, String unsubscribe, String post, String name ) {
    this.subscribe = subscribe;
    this.unsubscribe = unsubscribe;
    this.post = post;
    this.name = name;
  }

  /**
   * Gets the value of the subscribe property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getSubscribe( ) {
    return subscribe;
  }

  /**
   * Sets the value of the subscribe property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setSubscribe( String value ) {
    this.subscribe = value;
  }

  /**
   * Gets the value of the unsubscribe property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getUnsubscribe( ) {
    return unsubscribe;
  }

  /**
   * Sets the value of the unsubscribe property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setUnsubscribe( String value ) {
    this.unsubscribe = value;
  }

  /**
   * Gets the value of the post property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getPost( ) {
    return post;
  }

  /**
   * Sets the value of the post property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setPost( String value ) {
    this.post = value;
  }

  /**
   * Gets the value of the archive property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getArchive( ) {
    return archive;
  }

  /**
   * Sets the value of the archive property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setArchive( String value ) {
    this.archive = value;
  }

  /**
   * Gets the value of the otherArchives property.
   *
   * @return
   *     possible object is
   *     {@link MailingList.OtherArchives }
   *
   */
  public MailingList.OtherArchives getOtherArchives( ) {
    return otherArchives;
  }

  /**
   * Sets the value of the otherArchives property.
   *
   * @param value
   *     allowed object is
   *     {@link MailingList.OtherArchives }
   *
   */
  public void setOtherArchives( MailingList.OtherArchives value ) {
    this.otherArchives = value;
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

  public MailingList withSubscribe( String value ) {
    setSubscribe( value );
    return this;
  }

  public MailingList withUnsubscribe( String value ) {
    setUnsubscribe( value );
    return this;
  }

  public MailingList withPost( String value ) {
    setPost( value );
    return this;
  }

  public MailingList withArchive( String value ) {
    setArchive( value );
    return this;
  }

  public MailingList withOtherArchives( MailingList.OtherArchives value ) {
    setOtherArchives( value );
    return this;
  }

  public MailingList withName( String value ) {
    setName( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "subscribe='" + subscribe + "'" )
        .add( "unsubscribe='" + unsubscribe + "'" )
        .add( "post='" + post + "'" )
        .add( "archive='" + archive + "'" )
        .add( "otherArchives=" + otherArchives )
        .add( "name='" + name + "'" )
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
    var that = ( MailingList ) o;
    return Objects.equals( subscribe, that.subscribe ) && Objects.equals( unsubscribe, that.unsubscribe ) && Objects.equals( post, that.post ) && Objects.equals( archive, that.archive ) && Objects.equals( otherArchives, that.otherArchives ) && Objects.equals( name, that.name );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( subscribe, unsubscribe, post, archive, otherArchives, name );
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
   *         &lt;element name="otherArchive" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
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
      "otherArchive"
  } )
  public static class OtherArchives {

    @XmlSchemaType( name = "anyURI" )
    private final List< String > otherArchive = new ArrayList<>( );

    public OtherArchives( ) {
    }

    /**
     * Gets the value of the otherArchive property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherArchive property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherArchive().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List< String > getOtherArchive( ) {
      return this.otherArchive;
    }

    public MailingList.OtherArchives withOtherArchive( String... values ) {
      if( values != null ) {
        Arrays.stream( values ).forEach( value -> getOtherArchive( ).add( value ) );
      }
      return this;
    }

    public MailingList.OtherArchives withOtherArchive( Collection< String > values ) {
      if( values != null ) {
        getOtherArchive( ).addAll( values );
      }
      return this;
    }

    @Override
    public String toString( ) {
      return new StringJoiner( ",\n ", "[", "]" )
          .add( "otherArchive=" + otherArchive )
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
      var that = ( OtherArchives ) o;
      return Objects.equals( otherArchive, that.otherArchive );
    }

    @Override
    public int hashCode( ) {
      return Objects.hash( otherArchive );
    }
  }

}
