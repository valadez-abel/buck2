// @generated
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: javacd.proto

package com.facebook.buck.cd.model.java;

@javax.annotation.Generated(value="protoc", comments="annotations:JavaCDProto.java.pb.meta")
public final class JavaCDProto {
  private JavaCDProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_BuildJavaCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_BuildJavaCommand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_BuildCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_BuildCommand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_BaseJarCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_BaseJarCommand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_BaseJarCommand_CompileTimeClasspathSnapshotPathsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_BaseJarCommand_CompileTimeClasspathSnapshotPathsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_BuildTargetValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_BuildTargetValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_OutputPathsValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_OutputPathsValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_OutputPathsValue_OutputPaths_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_OutputPathsValue_OutputPaths_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_ResolvedJavacOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_ResolvedJavacOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_ResolvedJavacOptions_JavacLanguageLevelOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_ResolvedJavacOptions_JavacLanguageLevelOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_ResolvedJavacOptions_JavacPluginParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_ResolvedJavacOptions_JavacPluginParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_ResolvedJavacOptions_ResolvedJavacPluginProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_ResolvedJavacOptions_ResolvedJavacPluginProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_ResolvedJavacOptions_ResolvedJavacPluginProperties_PathParamsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_ResolvedJavacOptions_ResolvedJavacPluginProperties_PathParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_JarParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_JarParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_JarParameters_RemoveClassesPatternsMatcher_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_JarParameters_RemoveClassesPatternsMatcher_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_ResolvedJavac_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_ResolvedJavac_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_ResolvedJavac_ExternalJavac_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_ResolvedJavac_ExternalJavac_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_javacd_api_v1_ResolvedJavac_JSR199Javac_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_javacd_api_v1_ResolvedJavac_JSR199Javac_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014javacd.proto\022\rjavacd.api.v1\032\014common.pr" +
      "oto\"p\n\020BuildJavaCommand\0221\n\014buildCommand\030" +
      "\001 \001(\0132\033.javacd.api.v1.BuildCommand\022)\n\017po" +
      "stBuildParams\030\003 \001(\0132\020.PostBuildParams\"r\n" +
      "\014BuildCommand\022+\n\tbuildMode\030\001 \001(\0162\030.javac" +
      "d.api.v1.BuildMode\0225\n\016baseJarCommand\030\002 \001" +
      "(\0132\035.javacd.api.v1.BaseJarCommand\"\377\006\n\016Ba" +
      "seJarCommand\022>\n\024abiCompatibilityMode\030\001 \001" +
      "(\0162 .javacd.api.v1.AbiGenerationMode\022;\n\021" +
      "abiGenerationMode\030\002 \001(\0162 .javacd.api.v1." +
      "AbiGenerationMode\022\"\n\032isRequiredForSource" +
      "OnlyAbi\030\003 \001(\010\022\027\n\017trackClassUsage\030\004 \001(\010\022\031" +
      "\n\021configuredBuckOut\030\006 \001(\t\0229\n\020buildTarget" +
      "Value\030\007 \001(\0132\037.javacd.api.v1.BuildTargetV" +
      "alue\0229\n\020outputPathsValue\030\010 \001(\0132\037.javacd." +
      "api.v1.OutputPathsValue\022!\n\031compileTimeCl" +
      "asspathPaths\030\t \003(\t\022\020\n\010javaSrcs\030\n \003(\t\022&\n\014" +
      "resourcesMap\030\r \003(\0132\020.RelPathMapEntry\0223\n\r" +
      "jarParameters\030\017 \001(\0132\034.javacd.api.v1.JarP" +
      "arameters\022\031\n\021buildCellRootPath\030\020 \001(\t\0223\n\r" +
      "resolvedJavac\030\021 \001(\0132\034.javacd.api.v1.Reso" +
      "lvedJavac\022A\n\024resolvedJavacOptions\030\022 \001(\0132" +
      "#.javacd.api.v1.ResolvedJavacOptions\022o\n!" +
      "compileTimeClasspathSnapshotPaths\030\023 \003(\0132" +
      "D.javacd.api.v1.BaseJarCommand.CompileTi" +
      "meClasspathSnapshotPathsEntry\022\025\n\rpathToC" +
      "lasses\030\024 \001(\t\022\022\n\nrootOutput\030\025 \001(\t\022\027\n\017anno" +
      "tationsPath\030\027 \001(\t\032H\n&CompileTimeClasspat" +
      "hSnapshotPathsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu" +
      "e\030\002 \001(\t:\0028\001\"\251\001\n\020BuildTargetValue\022\032\n\022full" +
      "yQualifiedName\030\001 \001(\t\0222\n\004type\030\002 \001(\0162$.jav" +
      "acd.api.v1.BuildTargetValue.Type\"E\n\004Type" +
      "\022\013\n\007UNKNOWN\020\000\022\013\n\007LIBRARY\020\001\022\016\n\nSOURCE_ABI" +
      "\020\002\022\023\n\017SOURCE_ONLY_ABI\020\003\"\302\003\n\020OutputPathsV" +
      "alue\022A\n\014libraryPaths\030\001 \001(\0132+.javacd.api." +
      "v1.OutputPathsValue.OutputPaths\022C\n\016sourc" +
      "eAbiPaths\030\002 \001(\0132+.javacd.api.v1.OutputPa" +
      "thsValue.OutputPaths\022G\n\022sourceOnlyAbiPat" +
      "hs\030\003 \001(\0132+.javacd.api.v1.OutputPathsValu" +
      "e.OutputPaths\022\'\n\037libraryTargetFullyQuali" +
      "fiedName\030\004 \001(\t\032\263\001\n\013OutputPaths\022\022\n\nclasse" +
      "sDir\030\001 \001(\t\022\030\n\020outputJarDirPath\030\002 \001(\t\022\022\n\n" +
      "abiJarPath\030\003 \001(\t\022\026\n\016annotationPath\030\004 \001(\t" +
      "\022\031\n\021pathToSourcesList\030\005 \001(\t\022\030\n\020workingDi" +
      "rectory\030\006 \001(\t\022\025\n\routputJarPath\030\007 \001(\t\"\275\007\n" +
      "\024ResolvedJavacOptions\022\025\n\rbootclasspath\030\001" +
      " \001(\t\022\031\n\021bootclasspathList\030\002 \003(\t\022[\n\024langu" +
      "ageLevelOptions\030\003 \001(\0132=.javacd.api.v1.Re" +
      "solvedJavacOptions.JavacLanguageLevelOpt" +
      "ions\022\r\n\005debug\030\004 \001(\010\022\017\n\007verbose\030\005 \001(\010\022\\\n\035" +
      "javaAnnotationProcessorParams\030\006 \001(\01325.ja" +
      "vacd.api.v1.ResolvedJavacOptions.JavacPl" +
      "uginParams\022X\n\031standardJavacPluginParams\030" +
      "\007 \001(\01325.javacd.api.v1.ResolvedJavacOptio" +
      "ns.JavacPluginParams\022\026\n\016extraArguments\030\010" +
      " \003(\t\032E\n\031JavacLanguageLevelOptions\022\023\n\013sou" +
      "rceLevel\030\001 \001(\t\022\023\n\013targetLevel\030\002 \001(\t\032\204\001\n\021" +
      "JavacPluginParams\022\022\n\nparameters\030\001 \003(\t\022[\n" +
      "\020pluginProperties\030\002 \003(\0132A.javacd.api.v1." +
      "ResolvedJavacOptions.ResolvedJavacPlugin" +
      "Properties\032\327\002\n\035ResolvedJavacPluginProper" +
      "ties\022\033\n\023canReuseClassLoader\030\001 \001(\010\022\030\n\020doe" +
      "sNotAffectAbi\030\002 \001(\010\022\'\n\037supportsAbiGenera" +
      "tionFromSource\030\003 \001(\010\022\026\n\016processorNames\030\004" +
      " \003(\t\022\021\n\tclasspath\030\005 \003(\t\022e\n\npathParams\030\006 " +
      "\003(\0132Q.javacd.api.v1.ResolvedJavacOptions" +
      ".ResolvedJavacPluginProperties.PathParam" +
      "sEntry\022\021\n\targuments\030\007 \003(\t\0321\n\017PathParamsE" +
      "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\363\003\n" +
      "\rJarParameters\022\023\n\013hashEntries\030\001 \001(\010\022\026\n\016m" +
      "ergeManifests\030\002 \001(\010\022\017\n\007jarPath\030\003 \001(\t\022W\n\024" +
      "removeEntryPredicate\030\004 \001(\01329.javacd.api." +
      "v1.JarParameters.RemoveClassesPatternsMa" +
      "tcher\022\024\n\014entriesToJar\030\005 \003(\t\022\034\n\024overrideE" +
      "ntriesToJar\030\006 \003(\t\022\021\n\tmainClass\030\007 \001(\t\022\024\n\014" +
      "manifestFile\030\010 \001(\t\022A\n\022duplicatesLogLevel" +
      "\030\t \001(\0162%.javacd.api.v1.JarParameters.Log" +
      "Level\0320\n\034RemoveClassesPatternsMatcher\022\020\n" +
      "\010patterns\030\001 \003(\t\"y\n\010LogLevel\022\013\n\007UNKNOWN\020\000" +
      "\022\007\n\003OFF\020\001\022\n\n\006SEVERE\020\002\022\013\n\007WARNING\020\003\022\010\n\004IN" +
      "FO\020\004\022\n\n\006CONFIG\020\005\022\010\n\004FINE\020\006\022\t\n\005FINER\020\007\022\n\n" +
      "\006FINEST\020\010\022\007\n\003ALL\020\t\"\350\001\n\rResolvedJavac\022C\n\r" +
      "externalJavac\030\001 \001(\0132*.javacd.api.v1.Reso" +
      "lvedJavac.ExternalJavacH\000\022?\n\013jsr199Javac" +
      "\030\002 \001(\0132(.javacd.api.v1.ResolvedJavac.JSR" +
      "199JavacH\000\0329\n\rExternalJavac\022\021\n\tshortName" +
      "\030\001 \001(\t\022\025\n\rcommandPrefix\030\002 \003(\t\032\r\n\013JSR199J" +
      "avacB\007\n\005javac*=\n\tBuildMode\022\032\n\026BUILD_MODE" +
      "_UNSPECIFIED\020\000\022\013\n\007LIBRARY\020\001\022\007\n\003ABI\020\002*f\n\021" +
      "AbiGenerationMode\022\013\n\007UNKNOWN\020\000\022\t\n\005CLASS\020" +
      "\001\022\n\n\006SOURCE\020\002\022\034\n\030MIGRATING_TO_SOURCE_ONL" +
      "Y\020\003\022\017\n\013SOURCE_ONLY\020\004B0\n\037com.facebook.buc" +
      "k.cd.model.javaB\013JavaCDProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.facebook.buck.cd.model.common.CommonCDProto.getDescriptor(),
        }, assigner);
    internal_static_javacd_api_v1_BuildJavaCommand_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_javacd_api_v1_BuildJavaCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_BuildJavaCommand_descriptor,
        new java.lang.String[] { "BuildCommand", "PostBuildParams", });
    internal_static_javacd_api_v1_BuildCommand_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_javacd_api_v1_BuildCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_BuildCommand_descriptor,
        new java.lang.String[] { "BuildMode", "BaseJarCommand", });
    internal_static_javacd_api_v1_BaseJarCommand_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_javacd_api_v1_BaseJarCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_BaseJarCommand_descriptor,
        new java.lang.String[] { "AbiCompatibilityMode", "AbiGenerationMode", "IsRequiredForSourceOnlyAbi", "TrackClassUsage", "ConfiguredBuckOut", "BuildTargetValue", "OutputPathsValue", "CompileTimeClasspathPaths", "JavaSrcs", "ResourcesMap", "JarParameters", "BuildCellRootPath", "ResolvedJavac", "ResolvedJavacOptions", "CompileTimeClasspathSnapshotPaths", "PathToClasses", "RootOutput", "AnnotationsPath", });
    internal_static_javacd_api_v1_BaseJarCommand_CompileTimeClasspathSnapshotPathsEntry_descriptor =
      internal_static_javacd_api_v1_BaseJarCommand_descriptor.getNestedTypes().get(0);
    internal_static_javacd_api_v1_BaseJarCommand_CompileTimeClasspathSnapshotPathsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_BaseJarCommand_CompileTimeClasspathSnapshotPathsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_javacd_api_v1_BuildTargetValue_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_javacd_api_v1_BuildTargetValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_BuildTargetValue_descriptor,
        new java.lang.String[] { "FullyQualifiedName", "Type", });
    internal_static_javacd_api_v1_OutputPathsValue_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_javacd_api_v1_OutputPathsValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_OutputPathsValue_descriptor,
        new java.lang.String[] { "LibraryPaths", "SourceAbiPaths", "SourceOnlyAbiPaths", "LibraryTargetFullyQualifiedName", });
    internal_static_javacd_api_v1_OutputPathsValue_OutputPaths_descriptor =
      internal_static_javacd_api_v1_OutputPathsValue_descriptor.getNestedTypes().get(0);
    internal_static_javacd_api_v1_OutputPathsValue_OutputPaths_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_OutputPathsValue_OutputPaths_descriptor,
        new java.lang.String[] { "ClassesDir", "OutputJarDirPath", "AbiJarPath", "AnnotationPath", "PathToSourcesList", "WorkingDirectory", "OutputJarPath", });
    internal_static_javacd_api_v1_ResolvedJavacOptions_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_javacd_api_v1_ResolvedJavacOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_ResolvedJavacOptions_descriptor,
        new java.lang.String[] { "Bootclasspath", "BootclasspathList", "LanguageLevelOptions", "Debug", "Verbose", "JavaAnnotationProcessorParams", "StandardJavacPluginParams", "ExtraArguments", });
    internal_static_javacd_api_v1_ResolvedJavacOptions_JavacLanguageLevelOptions_descriptor =
      internal_static_javacd_api_v1_ResolvedJavacOptions_descriptor.getNestedTypes().get(0);
    internal_static_javacd_api_v1_ResolvedJavacOptions_JavacLanguageLevelOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_ResolvedJavacOptions_JavacLanguageLevelOptions_descriptor,
        new java.lang.String[] { "SourceLevel", "TargetLevel", });
    internal_static_javacd_api_v1_ResolvedJavacOptions_JavacPluginParams_descriptor =
      internal_static_javacd_api_v1_ResolvedJavacOptions_descriptor.getNestedTypes().get(1);
    internal_static_javacd_api_v1_ResolvedJavacOptions_JavacPluginParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_ResolvedJavacOptions_JavacPluginParams_descriptor,
        new java.lang.String[] { "Parameters", "PluginProperties", });
    internal_static_javacd_api_v1_ResolvedJavacOptions_ResolvedJavacPluginProperties_descriptor =
      internal_static_javacd_api_v1_ResolvedJavacOptions_descriptor.getNestedTypes().get(2);
    internal_static_javacd_api_v1_ResolvedJavacOptions_ResolvedJavacPluginProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_ResolvedJavacOptions_ResolvedJavacPluginProperties_descriptor,
        new java.lang.String[] { "CanReuseClassLoader", "DoesNotAffectAbi", "SupportsAbiGenerationFromSource", "ProcessorNames", "Classpath", "PathParams", "Arguments", });
    internal_static_javacd_api_v1_ResolvedJavacOptions_ResolvedJavacPluginProperties_PathParamsEntry_descriptor =
      internal_static_javacd_api_v1_ResolvedJavacOptions_ResolvedJavacPluginProperties_descriptor.getNestedTypes().get(0);
    internal_static_javacd_api_v1_ResolvedJavacOptions_ResolvedJavacPluginProperties_PathParamsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_ResolvedJavacOptions_ResolvedJavacPluginProperties_PathParamsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_javacd_api_v1_JarParameters_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_javacd_api_v1_JarParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_JarParameters_descriptor,
        new java.lang.String[] { "HashEntries", "MergeManifests", "JarPath", "RemoveEntryPredicate", "EntriesToJar", "OverrideEntriesToJar", "MainClass", "ManifestFile", "DuplicatesLogLevel", });
    internal_static_javacd_api_v1_JarParameters_RemoveClassesPatternsMatcher_descriptor =
      internal_static_javacd_api_v1_JarParameters_descriptor.getNestedTypes().get(0);
    internal_static_javacd_api_v1_JarParameters_RemoveClassesPatternsMatcher_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_JarParameters_RemoveClassesPatternsMatcher_descriptor,
        new java.lang.String[] { "Patterns", });
    internal_static_javacd_api_v1_ResolvedJavac_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_javacd_api_v1_ResolvedJavac_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_ResolvedJavac_descriptor,
        new java.lang.String[] { "ExternalJavac", "Jsr199Javac", "Javac", });
    internal_static_javacd_api_v1_ResolvedJavac_ExternalJavac_descriptor =
      internal_static_javacd_api_v1_ResolvedJavac_descriptor.getNestedTypes().get(0);
    internal_static_javacd_api_v1_ResolvedJavac_ExternalJavac_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_ResolvedJavac_ExternalJavac_descriptor,
        new java.lang.String[] { "ShortName", "CommandPrefix", });
    internal_static_javacd_api_v1_ResolvedJavac_JSR199Javac_descriptor =
      internal_static_javacd_api_v1_ResolvedJavac_descriptor.getNestedTypes().get(1);
    internal_static_javacd_api_v1_ResolvedJavac_JSR199Javac_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_javacd_api_v1_ResolvedJavac_JSR199Javac_descriptor,
        new java.lang.String[] { });
    com.facebook.buck.cd.model.common.CommonCDProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
