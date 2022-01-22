package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jvnet.jaxb2_commons.lang.EnumValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for checksumPolicy.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="checksumPolicy"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ignore"/&gt;
 *     &lt;enumeration value="fail"/&gt;
 *     &lt;enumeration value="warn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType( name = "checksumPolicy" )
@XmlEnum
public enum ChecksumPolicy
    implements EnumValue< String > {

  @XmlEnumValue( "ignore" )
  IGNORE( "ignore" ),

  @XmlEnumValue( "fail" )
  FAIL( "fail" ),

  @XmlEnumValue( "warn" )
  WARN( "warn" );

  private final String value;

  @Contract( pure = true )
  ChecksumPolicy( String v ) {
    value = v;
  }

  @Contract( pure = true )
  public String value( ) {
    return value;
  }

  public static @NotNull ChecksumPolicy fromValue( String v ) {
    for( ChecksumPolicy c : ChecksumPolicy.values( ) ) {
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
