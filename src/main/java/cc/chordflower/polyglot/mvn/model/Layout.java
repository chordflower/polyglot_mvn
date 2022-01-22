package cc.chordflower.polyglot.mvn.model;

import org.jvnet.jaxb2_commons.lang.EnumValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for layout.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="layout"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="legacy"/&gt;
 *     &lt;enumeration value="default"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType( name = "layout" )
@XmlEnum
public enum Layout implements EnumValue< String > {

  @XmlEnumValue( "legacy" )
  LEGACY( "legacy" ),

  @XmlEnumValue( "default" )
  DEFAULT( "default" );

  private final String value;

  Layout( String v ) {
    value = v;
  }

  public String value( ) {
    return value;
  }

  public static Layout fromValue( String v ) {
    for( Layout c : Layout.values( ) ) {
      if( c.value.equals( v ) ) {
        return c;
      }
    }
    throw new IllegalArgumentException( v );
  }

  public String enumValue( ) {
    return this.value( );
  }

}
