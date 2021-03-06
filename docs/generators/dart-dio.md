---
title: Config Options for dart-dio
sidebar_label: dart-dio
---

| Option | Description | Values | Default |
| ------ | ----------- | ------ | ------- |
|allowUnicodeIdentifiers|boolean, toggles whether unicode identifiers are allowed in names or not, default is false| |false|
|browserClient|Is the client browser based (for Dart 1.x only)| |null|
|dateLibrary|Option. Date library to use|<dl><dt>**core**</dt><dd>Dart core library (DateTime)</dd><dt>**timemachine**</dt><dd>Time Machine is date and time library for Flutter, Web, and Server with support for timezones, calendars, cultures, formatting and parsing.</dd></dl>|core|
|ensureUniqueParams|Whether to ensure parameter names are unique in an operation (rename parameters that are not).| |true|
|legacyDiscriminatorBehavior|This flag is used by OpenAPITools codegen to influence the processing of the discriminator attribute in OpenAPI documents. This flag has no impact if the OAS document does not use the discriminator attribute. The default value of this flag is set in each language-specific code generator (e.g. Python, Java, go...)using the method toModelName. Note to developers supporting a language generator in OpenAPITools; to fully support the discriminator attribute as defined in the OAS specification 3.x, language generators should set this flag to true by default; however this requires updating the mustache templates to generate a language-specific discriminator lookup function that iterates over {{#mappedModels}} and does not iterate over {{children}}, {{#anyOf}}, or {{#oneOf}}.|<dl><dt>**true**</dt><dd>The mapping in the discriminator includes descendent schemas that allOf inherit from self and the discriminator mapping schemas in the OAS document.</dd><dt>**false**</dt><dd>The mapping in the discriminator includes any descendent schemas that allOf inherit from self, any oneOf schemas, any anyOf schemas, any x-discriminator-values, and the discriminator mapping schemas in the OAS document AND Codegen validates that oneOf and anyOf schemas contain the required discriminator and throws an error if the discriminator is missing.</dd></dl>|true|
|nullableFields|Is the null fields should be in the JSON payload| |null|
|prependFormOrBodyParameters|Add form or body parameters to the beginning of the parameter list.| |false|
|pubAuthor|Author name in generated pubspec| |null|
|pubAuthorEmail|Email address of the author in generated pubspec| |null|
|pubDescription|Description in generated pubspec| |null|
|pubHomepage|Homepage in generated pubspec| |null|
|pubName|Name in generated pubspec| |null|
|pubVersion|Version in generated pubspec| |null|
|sortModelPropertiesByRequiredFlag|Sort model properties to place required parameters before optional parameters.| |true|
|sortParamsByRequiredFlag|Sort method arguments to place required parameters before optional parameters.| |true|
|sourceFolder|Source folder for generated code| |null|
|supportDart2|Support Dart 2.x (Dart 1.x support has been deprecated)| |true|
|useEnumExtension|Allow the 'x-enum-values' extension for enums| |null|

## IMPORT MAPPING

| Type/Alias | Imports |
| ---------- | ------- |
|BuiltList|package:built_collection/built_collection.dart|
|BuiltMap|package:built_collection/built_collection.dart|
|JsonObject|package:built_value/json_object.dart|
|Uint8List|dart:typed_data|


## INSTANTIATION TYPES

| Type/Alias | Instantiated By |
| ---------- | --------------- |
|array|List|
|map|Map|


## LANGUAGE PRIMITIVES

<ul class="column-ul">
<li>String</li>
<li>bool</li>
<li>double</li>
<li>int</li>
<li>num</li>
</ul>

## RESERVED WORDS

<ul class="column-ul">
<li>abstract</li>
<li>as</li>
<li>assert</li>
<li>async</li>
<li>await</li>
<li>break</li>
<li>case</li>
<li>catch</li>
<li>class</li>
<li>const</li>
<li>continue</li>
<li>covariant</li>
<li>default</li>
<li>deferred</li>
<li>do</li>
<li>dynamic</li>
<li>else</li>
<li>enum</li>
<li>export</li>
<li>extends</li>
<li>extension</li>
<li>external</li>
<li>factory</li>
<li>false</li>
<li>final</li>
<li>finally</li>
<li>for</li>
<li>function</li>
<li>get</li>
<li>hide</li>
<li>if</li>
<li>implements</li>
<li>import</li>
<li>in</li>
<li>inout</li>
<li>interface</li>
<li>is</li>
<li>late</li>
<li>library</li>
<li>mixin</li>
<li>native</li>
<li>new</li>
<li>null</li>
<li>of</li>
<li>on</li>
<li>operator</li>
<li>out</li>
<li>part</li>
<li>patch</li>
<li>required</li>
<li>rethrow</li>
<li>return</li>
<li>set</li>
<li>show</li>
<li>source</li>
<li>static</li>
<li>super</li>
<li>switch</li>
<li>sync</li>
<li>this</li>
<li>throw</li>
<li>true</li>
<li>try</li>
<li>typedef</li>
<li>var</li>
<li>void</li>
<li>while</li>
<li>with</li>
<li>yield</li>
</ul>

## FEATURE SET


### Client Modification Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|BasePath|???|ToolingExtension
|Authorizations|???|ToolingExtension
|UserAgent|???|ToolingExtension

### Data Type Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Custom|???|OAS2,OAS3
|Int32|???|OAS2,OAS3
|Int64|???|OAS2,OAS3
|Float|???|OAS2,OAS3
|Double|???|OAS2,OAS3
|Decimal|???|ToolingExtension
|String|???|OAS2,OAS3
|Byte|???|OAS2,OAS3
|Binary|???|OAS2,OAS3
|Boolean|???|OAS2,OAS3
|Date|???|OAS2,OAS3
|DateTime|???|OAS2,OAS3
|Password|???|OAS2,OAS3
|File|???|OAS2
|Array|???|OAS2,OAS3
|Maps|???|ToolingExtension
|CollectionFormat|???|OAS2
|CollectionFormatMulti|???|OAS2
|Enum|???|OAS2,OAS3
|ArrayOfEnum|???|ToolingExtension
|ArrayOfModel|???|ToolingExtension
|ArrayOfCollectionOfPrimitives|???|ToolingExtension
|ArrayOfCollectionOfModel|???|ToolingExtension
|ArrayOfCollectionOfEnum|???|ToolingExtension
|MapOfEnum|???|ToolingExtension
|MapOfModel|???|ToolingExtension
|MapOfCollectionOfPrimitives|???|ToolingExtension
|MapOfCollectionOfModel|???|ToolingExtension
|MapOfCollectionOfEnum|???|ToolingExtension

### Documentation Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Readme|???|ToolingExtension
|Model|???|ToolingExtension
|Api|???|ToolingExtension

### Global Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Host|???|OAS2,OAS3
|BasePath|???|OAS2,OAS3
|Info|???|OAS2,OAS3
|Schemes|???|OAS2,OAS3
|PartialSchemes|???|OAS2,OAS3
|Consumes|???|OAS2
|Produces|???|OAS2
|ExternalDocumentation|???|OAS2,OAS3
|Examples|???|OAS2,OAS3
|XMLStructureDefinitions|???|OAS2,OAS3
|MultiServer|???|OAS3
|ParameterizedServer|???|OAS3
|ParameterStyling|???|OAS3
|Callbacks|???|OAS3
|LinkObjects|???|OAS3

### Parameter Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Path|???|OAS2,OAS3
|Query|???|OAS2,OAS3
|Header|???|OAS2,OAS3
|Body|???|OAS2
|FormUnencoded|???|OAS2
|FormMultipart|???|OAS2
|Cookie|???|OAS3

### Schema Support Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|Simple|???|OAS2,OAS3
|Composite|???|OAS2,OAS3
|Polymorphism|???|OAS2,OAS3
|Union|???|OAS3

### Security Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|BasicAuth|???|OAS2,OAS3
|ApiKey|???|OAS2,OAS3
|OpenIDConnect|???|OAS3
|BearerToken|???|OAS3
|OAuth2_Implicit|???|OAS2,OAS3
|OAuth2_Password|???|OAS2,OAS3
|OAuth2_ClientCredentials|???|OAS2,OAS3
|OAuth2_AuthorizationCode|???|OAS2,OAS3

### Wire Format Feature
| Name | Supported | Defined By |
| ---- | --------- | ---------- |
|JSON|???|OAS2,OAS3
|XML|???|OAS2,OAS3
|PROTOBUF|???|ToolingExtension
|Custom|???|OAS2,OAS3
