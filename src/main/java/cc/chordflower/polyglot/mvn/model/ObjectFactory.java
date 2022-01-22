package cc.chordflower.polyglot.mvn.model;

import org.jetbrains.annotations.Contract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cc.chordflower.polyglot.mvn.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _Project_QNAME = new QName( "https://chordflower.cc/schemas/maven", "project" );

  public static final ObjectFactory INSTANCE = new ObjectFactory();

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cc.chordflower.polyglot.mvn.model
   *
   */
  @Contract( pure = true )
  private ObjectFactory( ) {
  }

  /**
   * Create an instance of {@link Build }
   *
   */
  public Build createBuild( ) {
    return new Build( );
  }

  /**
   * Create an instance of {@link Resource }
   *
   */
  public Resource createResource( ) {
    return new Resource( );
  }

  /**
   * Create an instance of {@link PluginExecution }
   *
   */
  public PluginExecution createPluginExecution( ) {
    return new PluginExecution( );
  }

  /**
   * Create an instance of {@link Plugin }
   *
   */
  public Plugin createPlugin( ) {
    return new Plugin( );
  }

  /**
   * Create an instance of {@link BuildBase }
   *
   */
  public BuildBase createBuildBase( ) {
    return new BuildBase( );
  }

  /**
   * Create an instance of {@link Profile }
   *
   */
  public Profile createProfile( ) {
    return new Profile( );
  }

  /**
   * Create an instance of {@link Profile.Properties }
   *
   */
  public Profile.Properties createProfileProperties( ) {
    return new Profile.Properties( );
  }

  /**
   * Create an instance of {@link ReportSet }
   *
   */
  public ReportSet createReportSet( ) {
    return new ReportSet( );
  }

  /**
   * Create an instance of {@link ReportPlugin }
   *
   */
  public ReportPlugin createReportPlugin( ) {
    return new ReportPlugin( );
  }

  /**
   * Create an instance of {@link Contributor }
   *
   */
  public Contributor createContributor( ) {
    return new Contributor( );
  }

  /**
   * Create an instance of {@link MailingList }
   *
   */
  public MailingList createMailingList( ) {
    return new MailingList( );
  }

  /**
   * Create an instance of {@link Developer }
   *
   */
  public Developer createDeveloper( ) {
    return new Developer( );
  }

  /**
   * Create an instance of {@link Dependency }
   *
   */
  public Dependency createDependency( ) {
    return new Dependency( );
  }

  /**
   * Create an instance of {@link Model }
   *
   */
  public Model createModel( ) {
    return new Model( );
  }

  /**
   * Create an instance of {@link Model.Properties }
   *
   */
  public Model.Properties createModelProperties( ) {
    return new Model.Properties( );
  }

  /**
   * Create an instance of {@link License }
   *
   */
  public License createLicense( ) {
    return new License( );
  }

  /**
   * Create an instance of {@link CiManagement }
   *
   */
  public CiManagement createCiManagement( ) {
    return new CiManagement( );
  }

  /**
   * Create an instance of {@link Scm }
   *
   */
  public Scm createScm( ) {
    return new Scm( );
  }

  /**
   * Create an instance of {@link IssueManagement }
   *
   */
  public IssueManagement createIssueManagement( ) {
    return new IssueManagement( );
  }

  /**
   * Create an instance of {@link Exclusion }
   *
   */
  public Exclusion createExclusion( ) {
    return new Exclusion( );
  }

  /**
   * Create an instance of {@link Parent }
   *
   */
  public Parent createParent( ) {
    return new Parent( );
  }

  /**
   * Create an instance of {@link Organization }
   *
   */
  public Organization createOrganization( ) {
    return new Organization( );
  }

  /**
   * Create an instance of {@link DistributionManagement }
   *
   */
  public DistributionManagement createDistributionManagement( ) {
    return new DistributionManagement( );
  }

  /**
   * Create an instance of {@link DeploymentRepository }
   *
   */
  public DeploymentRepository createDeploymentRepository( ) {
    return new DeploymentRepository( );
  }

  /**
   * Create an instance of {@link RepositoryPolicy }
   *
   */
  public RepositoryPolicy createRepositoryPolicy( ) {
    return new RepositoryPolicy( );
  }

  /**
   * Create an instance of {@link Relocation }
   *
   */
  public Relocation createRelocation( ) {
    return new Relocation( );
  }

  /**
   * Create an instance of {@link Site }
   *
   */
  public Site createSite( ) {
    return new Site( );
  }

  /**
   * Create an instance of {@link Reporting }
   *
   */
  public Reporting createReporting( ) {
    return new Reporting( );
  }

  /**
   * Create an instance of {@link Activation }
   *
   */
  public Activation createActivation( ) {
    return new Activation( );
  }

  /**
   * Create an instance of {@link ActivationProperty }
   *
   */
  public ActivationProperty createActivationProperty( ) {
    return new ActivationProperty( );
  }

  /**
   * Create an instance of {@link ActivationFile }
   *
   */
  public ActivationFile createActivationFile( ) {
    return new ActivationFile( );
  }

  /**
   * Create an instance of {@link ActivationOS }
   *
   */
  public ActivationOS createActivationOS( ) {
    return new ActivationOS( );
  }

  /**
   * Create an instance of {@link Repository }
   *
   */
  public Repository createRepository( ) {
    return new Repository( );
  }

  /**
   * Create an instance of {@link Extension }
   *
   */
  public Extension createExtension( ) {
    return new Extension( );
  }

  /**
   * Create an instance of {@link Build.SourceDirectories }
   *
   */
  public Build.SourceDirectories createBuildSourceDirectories( ) {
    return new Build.SourceDirectories( );
  }

  /**
   * Create an instance of {@link Build.TestSourceDirectories }
   *
   */
  public Build.TestSourceDirectories createBuildTestSourceDirectories( ) {
    return new Build.TestSourceDirectories( );
  }

  /**
   * Create an instance of {@link Build.Extensions }
   *
   */
  public Build.Extensions createBuildExtensions( ) {
    return new Build.Extensions( );
  }

  /**
   * Create an instance of {@link Build.Resources }
   *
   */
  public Build.Resources createBuildResources( ) {
    return new Build.Resources( );
  }

  /**
   * Create an instance of {@link Build.TestResources }
   *
   */
  public Build.TestResources createBuildTestResources( ) {
    return new Build.TestResources( );
  }

  /**
   * Create an instance of {@link Build.Filters }
   *
   */
  public Build.Filters createBuildFilters( ) {
    return new Build.Filters( );
  }

  /**
   * Create an instance of {@link Build.PluginManagement }
   *
   */
  public Build.PluginManagement createBuildPluginManagement( ) {
    return new Build.PluginManagement( );
  }

  /**
   * Create an instance of {@link Build.Plugins }
   *
   */
  public Build.Plugins createBuildPlugins( ) {
    return new Build.Plugins( );
  }

  /**
   * Create an instance of {@link Resource.Includes }
   *
   */
  public Resource.Includes createResourceIncludes( ) {
    return new Resource.Includes( );
  }

  /**
   * Create an instance of {@link Resource.Excludes }
   *
   */
  public Resource.Excludes createResourceExcludes( ) {
    return new Resource.Excludes( );
  }

  /**
   * Create an instance of {@link PluginExecution.Goals }
   *
   */
  public PluginExecution.Goals createPluginExecutionGoals( ) {
    return new PluginExecution.Goals( );
  }

  /**
   * Create an instance of {@link PluginExecution.Configuration }
   *
   */
  public PluginExecution.Configuration createPluginExecutionConfiguration( ) {
    return new PluginExecution.Configuration( );
  }

  /**
   * Create an instance of {@link Plugin.Executions }
   *
   */
  public Plugin.Executions createPluginExecutions( ) {
    return new Plugin.Executions( );
  }

  /**
   * Create an instance of {@link Plugin.Configuration }
   *
   */
  public Plugin.Configuration createPluginConfiguration( ) {
    return new Plugin.Configuration( );
  }

  /**
   * Create an instance of {@link BuildBase.Resources }
   *
   */
  public BuildBase.Resources createBuildBaseResources( ) {
    return new BuildBase.Resources( );
  }

  /**
   * Create an instance of {@link BuildBase.TestResources }
   *
   */
  public BuildBase.TestResources createBuildBaseTestResources( ) {
    return new BuildBase.TestResources( );
  }

  /**
   * Create an instance of {@link BuildBase.Filters }
   *
   */
  public BuildBase.Filters createBuildBaseFilters( ) {
    return new BuildBase.Filters( );
  }

  /**
   * Create an instance of {@link BuildBase.PluginManagement }
   *
   */
  public BuildBase.PluginManagement createBuildBasePluginManagement( ) {
    return new BuildBase.PluginManagement( );
  }

  /**
   * Create an instance of {@link BuildBase.Plugins }
   *
   */
  public BuildBase.Plugins createBuildBasePlugins( ) {
    return new BuildBase.Plugins( );
  }

  /**
   * Create an instance of {@link Profile.Modules }
   *
   */
  public Profile.Modules createProfileModules( ) {
    return new Profile.Modules( );
  }

  /**
   * Create an instance of {@link Profile.DependencyManagement }
   *
   */
  public Profile.DependencyManagement createProfileDependencyManagement( ) {
    return new Profile.DependencyManagement( );
  }

  /**
   * Create an instance of {@link Profile.Dependencies }
   *
   */
  public Profile.Dependencies createProfileDependencies( ) {
    return new Profile.Dependencies( );
  }

  /**
   * Create an instance of {@link Profile.Repositories }
   *
   */
  public Profile.Repositories createProfileRepositories( ) {
    return new Profile.Repositories( );
  }

  /**
   * Create an instance of {@link Profile.PluginRepositories }
   *
   */
  public Profile.PluginRepositories createProfilePluginRepositories( ) {
    return new Profile.PluginRepositories( );
  }

  /**
   * Create an instance of {@link Profile.Properties.Property }
   *
   */
  public Profile.Properties.Property createProfilePropertiesProperty( ) {
    return new Profile.Properties.Property( );
  }

  /**
   * Create an instance of {@link ReportSet.Reports }
   *
   */
  public ReportSet.Reports createReportSetReports( ) {
    return new ReportSet.Reports( );
  }

  /**
   * Create an instance of {@link ReportSet.Configuration }
   *
   */
  public ReportSet.Configuration createReportSetConfiguration( ) {
    return new ReportSet.Configuration( );
  }

  /**
   * Create an instance of {@link ReportPlugin.ReportSets }
   *
   */
  public ReportPlugin.ReportSets createReportPluginReportSets( ) {
    return new ReportPlugin.ReportSets( );
  }

  /**
   * Create an instance of {@link ReportPlugin.Configuration }
   *
   */
  public ReportPlugin.Configuration createReportPluginConfiguration( ) {
    return new ReportPlugin.Configuration( );
  }

  /**
   * Create an instance of {@link Contributor.Roles }
   *
   */
  public Contributor.Roles createContributorRoles( ) {
    return new Contributor.Roles( );
  }

  /**
   * Create an instance of {@link Contributor.Properties }
   *
   */
  public Contributor.Properties createContributorProperties( ) {
    return new Contributor.Properties( );
  }

  /**
   * Create an instance of {@link MailingList.OtherArchives }
   *
   */
  public MailingList.OtherArchives createMailingListOtherArchives( ) {
    return new MailingList.OtherArchives( );
  }

  /**
   * Create an instance of {@link Developer.Roles }
   *
   */
  public Developer.Roles createDeveloperRoles( ) {
    return new Developer.Roles( );
  }

  /**
   * Create an instance of {@link Developer.Properties }
   *
   */
  public Developer.Properties createDeveloperProperties( ) {
    return new Developer.Properties( );
  }

  /**
   * Create an instance of {@link Dependency.Exclusions }
   *
   */
  public Dependency.Exclusions createDependencyExclusions( ) {
    return new Dependency.Exclusions( );
  }

  /**
   * Create an instance of {@link Model.Licenses }
   *
   */
  public Model.Licenses createModelLicenses( ) {
    return new Model.Licenses( );
  }

  /**
   * Create an instance of {@link Model.Developers }
   *
   */
  public Model.Developers createModelDevelopers( ) {
    return new Model.Developers( );
  }

  /**
   * Create an instance of {@link Model.Contributors }
   *
   */
  public Model.Contributors createModelContributors( ) {
    return new Model.Contributors( );
  }

  /**
   * Create an instance of {@link Model.MailingLists }
   *
   */
  public Model.MailingLists createModelMailingLists( ) {
    return new Model.MailingLists( );
  }

  /**
   * Create an instance of {@link Model.Modules }
   *
   */
  public Model.Modules createModelModules( ) {
    return new Model.Modules( );
  }

  /**
   * Create an instance of {@link Model.DependencyManagement }
   *
   */
  public Model.DependencyManagement createModelDependencyManagement( ) {
    return new Model.DependencyManagement( );
  }

  /**
   * Create an instance of {@link Model.Dependencies }
   *
   */
  public Model.Dependencies createModelDependencies( ) {
    return new Model.Dependencies( );
  }

  /**
   * Create an instance of {@link Model.Repositories }
   *
   */
  public Model.Repositories createModelRepositories( ) {
    return new Model.Repositories( );
  }

  /**
   * Create an instance of {@link Model.PluginRepositories }
   *
   */
  public Model.PluginRepositories createModelPluginRepositories( ) {
    return new Model.PluginRepositories( );
  }

  /**
   * Create an instance of {@link Model.Profiles }
   *
   */
  public Model.Profiles createModelProfiles( ) {
    return new Model.Profiles( );
  }

  /**
   * Create an instance of {@link Model.Properties.Property }
   *
   */
  public Model.Properties.Property createModelPropertiesProperty( ) {
    return new Model.Properties.Property( );
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Model }{@code >}
   *
   * @param value
   *     Java instance representing xml element's value.
   * @return
   *     the new instance of {@link JAXBElement }{@code <}{@link Model }{@code >}
   */
  @XmlElementDecl( namespace = "https://chordflower.cc/schemas/maven", name = "project" )
  public JAXBElement< Model > createProject( Model value ) {
    return new JAXBElement<>( _Project_QNAME, Model.class, null, value );
  }

}
