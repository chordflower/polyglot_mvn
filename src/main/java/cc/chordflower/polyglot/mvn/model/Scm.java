package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The `scm` element contains informations required to the SCM (Source Control Management) of the project.
 *
 * <p>Java class for Scm complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Scm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="developerConnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "Scm", propOrder = {

} )
public class Scm {

  private String connection;

  private String developerConnection;

  @XmlElement( defaultValue = "HEAD" )
  private String tag = "HEAD";

  @XmlSchemaType( name = "anyURI" )
  private String url;

  @Contract( pure = true )
  public Scm( ) {
  }

  @Contract( pure = true )
  public Scm( String connection, String developerConnection, String tag, String url ) {
    this.connection = connection;
    this.developerConnection = developerConnection;
    this.tag = tag;
    this.url = url;
  }

  /**
   * Gets the value of the connection property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getConnection( ) {
    return connection;
  }

  /**
   * Sets the value of the connection property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setConnection( String value ) {
    this.connection = value;
  }

  /**
   * Gets the value of the developerConnection property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getDeveloperConnection( ) {
    return developerConnection;
  }

  /**
   * Sets the value of the developerConnection property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setDeveloperConnection( String value ) {
    this.developerConnection = value;
  }

  /**
   * Sets the value of the tag property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setTag( String value ) {
    this.tag = value;
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
   * Gets the value of the tag property.
   *
   */
  public String getTag( ) {
    if( null == tag ) {
      return "HEAD";
    }
    return tag;
  }

  public Scm withConnection( String value ) {
    setConnection( value );
    return this;
  }

  public Scm withDeveloperConnection( String value ) {
    setDeveloperConnection( value );
    return this;
  }

  public Scm withTag( String value ) {
    setTag( value );
    return this;
  }

  public Scm withUrl( String value ) {
    setUrl( value );
    return this;
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ",\n ", "[", "]" )
        .add( "connection='" + connection + "'" )
        .add( "developerConnection='" + developerConnection + "'" )
        .add( "tag='" + tag + "'" )
        .add( "url='" + url + "'" )
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
    Scm scm = ( Scm ) o;
    return Objects.equals( connection, scm.connection ) && Objects.equals( developerConnection, scm.developerConnection ) && Objects.equals( tag, scm.tag ) && Objects.equals( url, scm.url );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( connection, developerConnection, tag, url );
  }
}
