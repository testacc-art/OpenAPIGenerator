---
title: Config Options for bash
sidebar_label: bash
---

| Option | Description | Values | Default |
| ------ | ----------- | ------ | ------- |
|allowUnicodeIdentifiers|boolean, toggles whether unicode identifiers are allowed in names or not, default is false| |false|
|apiKeyAuthEnvironmentVariable|Name of environment variable where API key can be defined (e.g. PETSTORE_APIKEY='kjhasdGASDa5asdASD')| |false|
|basicAuthEnvironmentVariable|Name of environment variable where username and password can be defined (e.g. PETSTORE_CREDS='username:password')| |null|
|curlOptions|Default cURL options| |null|
|ensureUniqueParams|Whether to ensure parameter names are unique in an operation (rename parameters that are not).| |true|
|generateBashCompletion|Whether to generate the Bash completion script| |false|
|generateZshCompletion|Whether to generate the Zsh completion script| |false|
|hostEnvironmentVariable|Name of environment variable where host can be defined (e.g. PETSTORE_HOST='http://api.openapitools.org:8080')| |null|
|legacyDiscriminatorBehavior|This flag is used by OpenAPITools codegen to influence the processing of the discriminator attribute in OpenAPI documents. This flag has no impact if the OAS document does not use the discriminator attribute. The default value of this flag is set in each language-specific code generator (e.g. Python, Java, go...)using the method toModelName. Note to developers supporting a language generator in OpenAPITools; to fully support the discriminator attribute as defined in the OAS specification 3.x, language generators should set this flag to true by default; however this requires updating the mustache templates to generate a language-specific discriminator lookup function that iterates over {{#mappedModels}} and does not iterate over {{children}}, {{#anyOf}}, or {{#oneOf}}.|<dl><dt>**true**</dt><dd>The mapping in the discriminator includes descendent schemas that allOf inherit from self and the discriminator mapping schemas in the OAS document.</dd><dt>**false**</dt><dd>The mapping in the discriminator includes any descendent schemas that allOf inherit from self, any oneOf schemas, any anyOf schemas, any x-discriminator-values, and the discriminator mapping schemas in the OAS document AND Codegen validates that oneOf and anyOf schemas contain the required discriminator and throws an error if the discriminator is missing.</dd></dl>|true|
|prependFormOrBodyParameters|Add form or body parameters to the beginning of the parameter list.| |false|
|processMarkdown|Convert all Markdown Markup into terminal formatting| |false|
|scriptName|The name of the script that will be generated (e.g. petstore-cli)| |null|
|sortModelPropertiesByRequiredFlag|Sort model properties to place required parameters before optional parameters.| |true|
|sortParamsByRequiredFlag|Sort method arguments to place required parameters before optional parameters.| |true|

## IMPORT MAPPING

| Type/Alias | Imports |
| ---------- | ------- |
|Array|java.util.List|
|ArrayList|java.util.ArrayList|
|BigDecimal|java.math.BigDecimal|
|Date|java.util.Date|
|DateTime|org.joda.time.*|
|File|java.io.File|
|HashMap|java.util.HashMap|
|List|java.util.*|
|LocalDate|org.joda.time.*|
|LocalDateTime|org.joda.time.*|
|LocalTime|org.joda.time.*|
|Map|java.util.Map|
|Set|java.util.*|
|Timestamp|java.sql.Timestamp|
|URI|java.net.URI|
|UUID|java.util.UUID|


## INSTANTIATION TYPES

| Type/Alias | Instantiated By |
| ---------- | --------------- |


## LANGUAGE PRIMITIVES

<ul class="column-ul">
<li>array</li>
<li>binary</li>
<li>boolean</li>
<li>float</li>
<li>integer</li>
<li>map</li>
<li>string</li>
</ul>

## RESERVED WORDS

<ul class="column-ul">
<li>case</li>
<li>do</li>
<li>done</li>
<li>elif</li>
<li>else</li>
<li>esac</li>
<li>fi</li>
<li>for</li>
<li>function</li>
<li>if</li>
<li>in</li>
<li>select</li>
<li>then</li>
<li>time</li>
<li>until</li>
<li>while</li>
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
