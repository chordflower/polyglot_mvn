[![License](https://img.shields.io/badge/License-Apache_2.0-green.svg)](https://opensource.org/licenses/Apache-2.0) ![Version](https://img.shields.io/badge/Version-0.1.0-green.svg)

# ChordFlower Mav

Mav is a maven extension that introduces a new syntax for the POM, eliminating some of the verbosity.


## Features

- Simplification of DependencyManagement and PluginManagement sections;
- Usage of attributes to simplify some things like Dependency declaration, which are now one liners;
- Usage of the XML format, instead of a full blown programming language masquerating as DSL;
- Complete adherance to maven processes and lifecycle.


## Building

### Building Requirements

For building this project you will need:

- A Java 11 JDK;
- A version of maven > 3.6.0+

### Compiling

Download the sources from a repository either using git or a source zip or tarball and in the folder where they are ( uncompressed if that is the case ), open a shell and do:

```bash
mvn clean install
```

In order to build the project and install it in the local repository.
## Installation

Install this project by using the chordflower-polyglot-mvn extension:

```xml
 <?xml version="1.0" encoding="UTF-8"?>
<extensions>
  <extension>
    <groupId>cc.chordflower.polyglot.mvn</groupId>
  <artifactId>chordflower-polyglot-mvn</artifactId>
  <version>0.1.0</version>
  </extension>
</extensions>
```

Place this file in ${project.basedir}/.mvn/extension.xml

Then create a project.xml file in ${project.basedir}, describing your build.
    
## Authors

- [@carddamom](https://github.com/carddamom)


## License

[Apache-2.0](https://www.apache.org/licenses/LICENSE-2.0)

