package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jvnet.jaxb2_commons.lang.EnumValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for dist.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dist"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="repo"/&gt;
 *     &lt;enumeration value="manual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType( name = "dist" )
@XmlEnum
public enum Dist implements EnumValue< String > {

  @XmlEnumValue( "repo" )
  REPO( "repo" ),

  @XmlEnumValue( "manual" )
  MANUAL( "manual" );

  private final String value;

  @Contract( pure = true )
  Dist( String v ) {
    value = v;
  }

  @Contract( pure = true )
  public String value( ) {
    return value;
  }

  public static @NotNull Dist fromValue( String v ) {
    for( Dist c : Dist.values( ) ) {
      if( c.value.equals( v ) ) {
        return c;
      }
    }
    throw new IllegalArgumentException( v );
  }

  @Contract( pure = true )
  public String enumValue( ) {
    return this.value( );
  }

}
