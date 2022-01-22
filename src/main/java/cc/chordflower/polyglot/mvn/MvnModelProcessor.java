package cc.chordflower.polyglot.mvn;

import org.apache.maven.model.Model;
import org.apache.maven.model.building.ModelProcessor;
import org.apache.maven.model.io.ModelParseException;

import javax.inject.Named;
import javax.inject.Singleton;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Map;

@Named
@Singleton
public class MvnModelProcessor implements ModelProcessor {

  @Override
  public Model read( File input, Map< String, ? > options ) throws IOException, ModelParseException {
    return null;
  }

  @Override
  public Model read( Reader input, Map< String, ? > options ) throws IOException, ModelParseException {
    return null;
  }

  @Override
  public Model read( InputStream input, Map< String, ? > options ) throws IOException, ModelParseException {
    return null;
  }

  @Override
  public File locatePom( File projectDirectory ) {
    return null;
  }
}
