# TestPlanApi

All URIs are relative to *https://<JIRA_HOST>/rest/atm/1.0*

| Method                                                                                              | HTTP request                                 | Description |
|-----------------------------------------------------------------------------------------------------|----------------------------------------------|-------------|
| [**createTestPlan**](TestPlanApi.md#createTestPlan)                                                 | **POST** /testplan                           |             |
| [**createTestPlanAttachmentsByTestPlanKey**](TestPlanApi.md#createTestPlanAttachmentsByTestPlanKey) | **POST** /testplan/{testPlanKey}/attachments |             |
| [**deleteTestPlanByTestPlanKey**](TestPlanApi.md#deleteTestPlanByTestPlanKey)                       | **DELETE** /testplan/{testPlanKey}           |             |
| [**findTestPlan**](TestPlanApi.md#findTestPlan)                                                     | **GET** /testplan/search                     |             |
| [**getTestPlanAttachmentsByTestPlanKey**](TestPlanApi.md#getTestPlanAttachmentsByTestPlanKey)       | **GET** /testplan/{testPlanKey}/attachments  |             |
| [**getTestPlanByTestPlanKey**](TestPlanApi.md#getTestPlanByTestPlanKey)                             | **GET** /testplan/{testPlanKey}              |             |
| [**updateTestPlanByTestPlanKey**](TestPlanApi.md#updateTestPlanByTestPlanKey)                       | **PUT** /testplan/{testPlanKey}              |             | 

<a id="createTestPlan"></a>

# **createTestPlan**

> Object createTestPlan(body)



Creates a new Test Plan. Whitespace is not allowed for labels, and it will be replaced by an underscore character. The
optional field &#x60;&#x60;&#x60;folder&#x60;&#x60;&#x60;, if defined, must contain an existent folder name. No folder
will be created. The field &#x60;&#x60;&#x60;status&#x60;&#x60;&#x60; will be set to a default value if not defined.

### Example

```java

```

### Parameters

| Name     | Type       | Description | Notes      |
|----------|------------|-------------|------------|
| **body** | **String** |             | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a id="createTestPlanAttachmentsByTestPlanKey"></a>

# **createTestPlanAttachmentsByTestPlanKey**

> Object createTestPlanAttachmentsByTestPlanKey(testPlanKey)



Create a new attachment on the specified Test Plan.

### Example

```java

```

### Parameters

| Name            | Type       | Description               | Notes |
|-----------------|------------|---------------------------|-------|
| **testPlanKey** | **String** | The key of the Test Plan. |       |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a id="deleteTestPlanByTestPlanKey"></a>

# **deleteTestPlanByTestPlanKey**

> deleteTestPlanByTestPlanKey(testPlanKey)



Delete the Test Plan matching the given key.

### Example

```java

```

### Parameters

| Name            | Type       | Description               | Notes |
|-----------------|------------|---------------------------|-------|
| **testPlanKey** | **String** | The key of the Test Plan. |       |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a id="findTestPlan"></a>

# **findTestPlan**

> Object findTestPlan(fields, query, startAt, maxResults)



Retrieve the Test Plans that matches the query passed as parameter.

### Example

```java

```

### Parameters

| Name           | Type        | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Notes      |
|----------------|-------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------|
| **fields**     | **String**  | The fields of the Test Plan to be included on the response. If not set, all fields will be returned. Inexistent fields will be ignored.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | [optional] |
| **query**      | **String**  | A query to filter Test Plans. The query syntax is similar to the JIRA JQL.  * Available fields: &#x60;&#x60;&#x60;projectKey&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;key&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;name&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;status&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;folder&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;labels&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;owner&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;issueKeys&#x60;&#x60;&#x60; and custom fields. When filtering by custom fields, the field name must be quoted. * Available operators: &#x60;&#x60;&#x60;&#x3D;&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;&gt;&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;&gt;&#x3D;&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;&lt;&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;&lt;&#x3D;&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;IN&#x60;&#x60;&#x60; * For Single and Multi Choice custom fields, operator \&quot;&#x3D;\&quot; is not supported, use \&quot;IN\&quot; instead * Available logical operators: &#x60;&#x60;&#x60;AND&#x60;&#x60;&#x60;  It is always a good idea considering using the &#x60;&#x60;&#x60;projectKey&#x60;&#x60;&#x60; field to match values that only belongs to that project, such as statuses, folders, etc.  Folders always have to start with a \&quot;/\&quot;, for instance: \&quot;/a folder\&quot;. The \&quot;/\&quot; matches the root, above all folders.  The query syntax is very strict. The use of whitespaces between fields, operators and logical operators is required, as well as the use of double quotes for string values.  Usage examples: * projectKey &#x3D; \&quot;JQA\&quot; AND status &#x3D; \&quot;Draft\&quot; * projectKey &#x3D; \&quot;JQA\&quot; AND status IN (\&quot;Draft\&quot;, \&quot;Deprecated\&quot;) AND labels IN (\&quot;Functional\&quot;, \&quot;UI\&quot;) * projectKey &#x3D; \&quot;JQA\&quot; AND status &#x3D; \&quot;Draft\&quot; AND folder &#x3D; \&quot;/\&quot; * projectKey &#x3D; \&quot;JQA\&quot; AND folder &#x3D; \&quot;/folder with some test plans\&quot; * projectKey &#x3D; \&quot;JQA\&quot; AND folder &#x3D; \&quot;/folder with some test plans/child folder\&quot; * projectKey &#x3D; \&quot;JQA\&quot; AND folder IN (\&quot;/parent folder\&quot;, \&quot;/parent folder/child folder\&quot;) * projectKey &#x3D; \&quot;JQA\&quot; AND \&quot;My Custom Field\&quot; &#x3D; \&quot;Some value\&quot; * projectKey &#x3D; \&quot;JQA\&quot; AND \&quot;Single Choice Custom Field\&quot; IN (\&quot;Some value\&quot;) * projectKey &#x3D; \&quot;JQA\&quot; AND \&quot;Multi Choice Custom Field\&quot; IN (\&quot;Some value\&quot;, \&quot;Another value\&quot;) * projectKey &#x3D; \&quot;JQA\&quot; AND issueKeys IN (\&quot;JQA-5\&quot;, \&quot;JQA-4\&quot;) | [optional] |
| **startAt**    | **Integer** | An offset to use with the query. This can be useful when paginating results.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | [optional] |
| **maxResults** | **Integer** | The max result count, limiting the query results. If not provided, the default value of 200 will be used.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a id="getTestPlanAttachmentsByTestPlanKey"></a>

# **getTestPlanAttachmentsByTestPlanKey**

> List&lt;Attachment&gt; getTestPlanAttachmentsByTestPlanKey(testPlanKey)



Retrieve the Test Plan Attachments matching the given key.

### Example

```java

```

### Parameters

| Name            | Type       | Description               | Notes |
|-----------------|------------|---------------------------|-------|
| **testPlanKey** | **String** | The key of the Test Plan. |       |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a id="getTestPlanByTestPlanKey"></a>

# **getTestPlanByTestPlanKey**

> Object getTestPlanByTestPlanKey(testPlanKey, fields)



Retrieve the Test Plan matching the given key.

### Example

```java

```

### Parameters

| Name            | Type       | Description                                                                                                                             | Notes      |
|-----------------|------------|-----------------------------------------------------------------------------------------------------------------------------------------|------------|
| **testPlanKey** | **String** | The key of the Test Plan.                                                                                                               |            |
| **fields**      | **String** | The fields of the Test Plan to be included on the response. If not set, all fields will be returned. Inexistent fields will be ignored. | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a id="updateTestPlanByTestPlanKey"></a>

# **updateTestPlanByTestPlanKey**

> updateTestPlanByTestPlanKey(testPlanKey, body)



Updates a Test Plan. Whitespace is not allowed for labels, and it will be replaced by an underscore character. The
optional field &#x60;&#x60;&#x60;folder&#x60;&#x60;&#x60;, if defined, must contain an existent folder name. No folder
will be created. The field &#x60;&#x60;&#x60;status&#x60;&#x60;&#x60; will be set to a default value if not defined.

### Example

```java

```

### Parameters

| Name            | Type       | Description               | Notes      |
|-----------------|------------|---------------------------|------------|
| **testPlanKey** | **String** | The key of the Test Plan. |            |
| **body**        | **String** |                           | [optional] |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

