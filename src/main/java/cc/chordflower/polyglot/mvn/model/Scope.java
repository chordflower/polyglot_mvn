package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jvnet.jaxb2_commons.lang.EnumValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scope.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="scope"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="compile"/&gt;
 *     &lt;enumeration value="runtime"/&gt;
 *     &lt;enumeration value="test"/&gt;
 *     &lt;enumeration value="system"/&gt;
 *     &lt;enumeration value="provided"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType( name = "scope" )
@XmlEnum
public enum Scope implements EnumValue< String > {

  @XmlEnumValue( "compile" )
  COMPILE( "compile" ),
  @XmlEnumValue( "runtime" )
  RUNTIME( "runtime" ),
  @XmlEnumValue( "test" )
  TEST( "test" ),
  @XmlEnumValue( "system" )
  SYSTEM( "system" ),
  @XmlEnumValue( "provided" )
  PROVIDED( "provided" );
  private final String value;

  @Contract( pure = true )
  Scope( String v ) {
    value = v;
  }

  @Contract( pure = true )
  public String value( ) {
    return value;
  }

  public static @NotNull Scope fromValue( String v ) {
    for( Scope c : Scope.values( ) ) {
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
