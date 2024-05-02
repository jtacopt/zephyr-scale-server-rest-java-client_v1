# TestCasesApi


| Method                                                                                                                               | HTTP request                                                  | Description |
|--------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------|-------------|
| [**createTestCase**](TestCasesApi.md#createTestCase)                                                                                 | **POST** /testcase                                            |             |
| [**createTestCaseAttachments**](TestCasesApi.md#createTestCaseAttachments)                                                           | **POST** /testcase/{testCaseKey}/attachments                  |             |
| [**createTestCaseStepAttachmentsByTestCaseKeyAndStepIndex**](TestCasesApi.md#createTestCaseStepAttachmentsByTestCaseKeyAndStepIndex) | **POST** /testcase/{testCaseKey}/step/{stepIndex}/attachments |             |
| [**deleteTestCaseByTestCaseKey**](TestCasesApi.md#deleteTestCaseByTestCaseKey)                                                       | **DELETE** /testcase/{testCaseKey}                            |             |
| [**findTestCase**](TestCasesApi.md#findTestCase)                                                                                     | **GET** /testcase/search                                      |             |
| [**getAttachmentsFromStepByTestCaseKey**](TestCasesApi.md#getAttachmentsFromStepByTestCaseKey)                                       | **GET** /testcase/{testCaseKey}/step/{stepIndex}/attachments  |             | 
| [**getLastTestResultByTestCaseKey**](TestCasesApi.md#getLastTestResultByTestCaseKey)                                                 | **GET** /testcase/{testCaseKey}/testresult/latest             |             |
| [**getTestCaseAttachments**](TestCasesApi.md#getTestCaseAttachments)                                                                 | **GET** /testcase/{testCaseKey}/attachments                   |             |
| [**getTestCaseByTestCaseKey**](TestCasesApi.md#getTestCaseByTestCaseKey)                                                             | **GET** /testcase/{testCaseKey}                               |             |
| [**updateTestCaseByTestCaseKey**](TestCasesApi.md#updateTestCaseByTestCaseKey)                                                       | **PUT** /testcase/{testCaseKey}                               |             |

<a id="createTestCase"></a>

# **createTestCase**

> Object createTestCase(testCase)



Creates a new Test Case. Whitespace is not allowed for labels, and it will be replaced by an underscore character. The
field &#x60;&#x60;&#x60;type&#x60;&#x60;&#x60; of Test Script can have the values
&#x60;&#x60;&#x60;PLAIN_TEXT&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;STEP_BY_STEP&#x60;&#x60;&#x60; or
&#x60;&#x60;&#x60;BDD&#x60;&#x60;&#x60;. The field &#x60;&#x60;&#x60;text&#x60;&#x60;&#x60; describes the content of the
plain text or BDD test script; otherwise, the steps can be described as objects using the field
&#x60;&#x60;&#x60;steps&#x60;&#x60;&#x60;. Call To Tests can be added to the steps list by using the field
&#x60;&#x60;&#x60;testCaseKey&#x60;&#x60;&#x60; with a Test Case key as value. The optional field
&#x60;&#x60;&#x60;folder&#x60;&#x60;&#x60;, if defined, must contain an existent folder name. No folder will be created.
The fields &#x60;&#x60;&#x60;status&#x60;&#x60;&#x60; and &#x60;&#x60;&#x60;priority&#x60;&#x60;&#x60; will be set to
default values if not defined. The optional field parameters has two attributes: variables and entries. For attribute
variables, two types are allowed: FREE_TEXT and DATA_SET. If using DATA_SET, an extra field should be informed, having
the name of the dataset. If the dataset doesn’t exist, it will be automatically created. Attribute entries must only
have values matching the informed variables. If a value of a dataset doesn’t exist, it will be automatically created for
that dataset. Check the examples below for more details.

### Example

```java

```

### Parameters

| Name         | Type                        | Description | Notes      |
|--------------|-----------------------------|-------------|------------|
| **testCase** | [**TestCase**](TestCase.md) |             | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a id="createTestCaseAttachments"></a>

# **createTestCaseAttachments**

> Object createTestCaseAttachments(testCaseKey)



Create a new attachment on the specified Test Case.

### Parameters

| Name            | Type       | Description               | Notes |
|-----------------|------------|---------------------------|-------|
| **testCaseKey** | **String** | The key of the Test Case. |       |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a id="createTestCaseStepAttachmentsByTestCaseKeyAndStepIndex"></a>

# **createTestCaseStepAttachmentsByTestCaseKeyAndStepIndex**

> Object createTestCaseStepAttachmentsByTestCaseKeyAndStepIndex(stepIndex, testCaseKey)



Create a new attachment on the specified Step of a Test Case.

### Parameters

| Name            | Type        | Description                      | Notes |
|-----------------|-------------|----------------------------------|-------|
| **stepIndex**   | **Integer** | The index of the Test Case step. |       |
| **testCaseKey** | **String**  | The key of the Test Case.        |       |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a id="deleteTestCaseByTestCaseKey"></a>

# **deleteTestCaseByTestCaseKey**

> deleteTestCaseByTestCaseKey(testCaseKey)


Delete the Test Case matching the given key.

### Parameters

| Name            | Type       | Description               | Notes |
|-----------------|------------|---------------------------|-------|
| **testCaseKey** | **String** | The key of the Test Case. |       |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a id="findTestCase"></a>

# **findTestCase**

> Object findTestCase(fields, query, startAt, maxResults)



Retrieve the Test Cases that matches the query passed as parameter.


### Parameters

| Name           | Type        | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | Notes      |
|----------------|-------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------|
| **fields**     | **String**  | The fields of the Test Case to be included on the response. If not set, all fields will be returned. Inexistent fields will be ignored.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | [optional] |
| **query**      | **String**  | A query to filter Test Cases. The query syntax is similar to the JIRA JQL.  * Available fields: &#x60;&#x60;&#x60;projectKey&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;key&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;name&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;status&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;priority&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;component&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;folder&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;estimatedTime&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;labels&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;owner&#x60;&#x60;&#x60; and custom fields. When filtering by custom fields, the field name must be quoted. * Available operators: &#x60;&#x60;&#x60;&#x3D;&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;&gt;&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;&gt;&#x3D;&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;&lt;&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;&lt;&#x3D;&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;IN&#x60;&#x60;&#x60; * For Single and Multi Choice custom fields, operator \&quot;&#x3D;\&quot; is not supported, use \&quot;IN\&quot; instead * Available logical operators: &#x60;&#x60;&#x60;AND&#x60;&#x60;&#x60;  It is always a good idea considering using the &#x60;&#x60;&#x60;projectKey&#x60;&#x60;&#x60; field to match values that only belongs to that project, such as statuses, folders, etc.  Folders always have to start with a \&quot;/\&quot;, for instance: \&quot;/a folder\&quot;. The \&quot;/\&quot; matches the root, above all folders.  The query syntax is very strict. The use of whitespaces between fields, operators and logical operators is required, as well as the use of double quotes for string values.  Usage examples: * projectKey &#x3D; \&quot;JQA\&quot; AND status &#x3D; \&quot;Draft\&quot; AND priority &#x3D; \&quot;High\&quot; * projectKey &#x3D; \&quot;JQA\&quot; AND status IN (\&quot;Draft\&quot;, \&quot;Deprecated\&quot;) AND labels IN (\&quot;Functional\&quot;, \&quot;UI\&quot;) * projectKey &#x3D; \&quot;JQA\&quot; AND status IN (\&quot;Draft\&quot;, \&quot;Deprecated\&quot;) AND labels IN (\&quot;Functional\&quot;, \&quot;UI\&quot;) * projectKey &#x3D; \&quot;JQA\&quot; AND status &#x3D; \&quot;Draft\&quot; AND folder &#x3D; \&quot;/\&quot; * projectKey &#x3D; \&quot;JQA\&quot; AND folder &#x3D; \&quot;/folder with some test cases\&quot; * projectKey &#x3D; \&quot;JQA\&quot; AND folder &#x3D; \&quot;/folder with some test cases/child folder\&quot; * projectKey &#x3D; \&quot;JQA\&quot; AND folder IN (\&quot;/parent folder\&quot;, \&quot;/parent folder/child folder\&quot;) * projectKey &#x3D; \&quot;JQA\&quot; AND \&quot;My Custom Field\&quot; &#x3D; \&quot;Some value\&quot; * projectKey &#x3D; \&quot;JQA\&quot; AND \&quot;Single Choice Custom Field\&quot; IN (\&quot;Some value\&quot;) * projectKey &#x3D; \&quot;JQA\&quot; AND \&quot;Multi Choice Custom Field\&quot; IN (\&quot;Some value\&quot;, \&quot;Another value\&quot;) * projectKey &#x3D; \&quot;JQA\&quot; AND issueKeys IN (\&quot;JQA-5\&quot;, \&quot;JQA-4\&quot;) * key IN (\&quot;JQA-T50\&quot;, \&quot;JTQ-T90\&quot;) * key IN (\&quot;JQA-T50\&quot;, \&quot;JTQ-T90\&quot;) AND name &#x3D; \&quot;My Test Case Name\&quot; | [optional] |
| **startAt**    | **Integer** | An offset to use with the query. This can be useful when paginating results.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | [optional] |
| **maxResults** | **Integer** | The max result count, limiting the query results. If not provided, the default value of 200 will be used.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a id="getAttachmentsFromStepByTestCaseKey"></a>

# **getAttachmentsFromStepByTestCaseKey**

> List&lt;Attachment&gt; getAttachmentsFromStepByTestCaseKey(stepIndex, testCaseKey)



Retrieve the attachments for a test case step


### Parameters

| Name            | Type        | Description                      | Notes |
|-----------------|-------------|----------------------------------|-------|
| **stepIndex**   | **Integer** | The index of the Test Case step. |       |
| **testCaseKey** | **String**  | The key of the Test Case.        |       |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a id="getLastTestResultByTestCaseKey"></a>

# **getLastTestResultByTestCaseKey**

> TestResult getLastTestResultByTestCaseKey(testCaseKey)



Retrieve the last test result for a given key

### Parameters

| Name            | Type       | Description               | Notes |
|-----------------|------------|---------------------------|-------|
| **testCaseKey** | **String** | The key of the Test Case. |       |

### Return type

[**TestResult**](TestResult.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a id="getTestCaseAttachments"></a>

# **getTestCaseAttachments**

> List&lt;Attachment&gt; getTestCaseAttachments(testCaseKey)



Retrieve the Test Case Attachments matching the given key.


### Parameters

| Name            | Type       | Description               | Notes |
|-----------------|------------|---------------------------|-------|
| **testCaseKey** | **String** | The key of the Test Case. |       |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a id="getTestCaseByTestCaseKey"></a>

# **getTestCaseByTestCaseKey**

> Object getTestCaseByTestCaseKey(testCaseKey, fields)



Retrieve the Test Case matching the given key.


### Parameters

| Name            | Type       | Description                                                                                                                             | Notes      |
|-----------------|------------|-----------------------------------------------------------------------------------------------------------------------------------------|------------|
| **testCaseKey** | **String** | The key of the Test Case.                                                                                                               |            |
| **fields**      | **String** | The fields of the Test Case to be included on the response. If not set, all fields will be returned. Inexistent fields will be ignored. | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a id="updateTestCaseByTestCaseKey"></a>

# **updateTestCaseByTestCaseKey**

> updateTestCaseByTestCaseKey(testCaseKey, testCase)



Updates a Test Case. Whitespace is not allowed for labels, and it will be replaced by an underscore character. The field
&#x60;&#x60;&#x60;type&#x60;&#x60;&#x60; of Test Script can have the values
&#x60;&#x60;&#x60;PLAIN_TEXT&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;STEP_BY_STEP&#x60;&#x60;&#x60; or
&#x60;&#x60;&#x60;BDD&#x60;&#x60;&#x60;. The field &#x60;&#x60;&#x60;text&#x60;&#x60;&#x60; describes the content of the
plain text or BDD test script; otherwise, the steps can be described as objects using the field
&#x60;&#x60;&#x60;steps&#x60;&#x60;&#x60;. The field &#x60;&#x60;&#x60;folder&#x60;&#x60;&#x60;, if defined, must
contain an existent folder name. No folder will be created. Only fields present on the body will be updated. The field
&#x60;&#x60;&#x60;projectKey&#x60;&#x60;&#x60; cannot be changed. Call To Tests can be added to the steps list by using
the field &#x60;&#x60;&#x60;testCaseKey&#x60;&#x60;&#x60; with a Test Case key as value. The optional field parameters
has two attributes: variables and entries. For attribute variables, two types are allowed: FREE_TEXT and DATA_SET. If
using DATA_SET, an extra field should be informed, having the name of the dataset. If the dataset doesn’t exist, it will
be automatically created. Attribute entries must only have values matching the informed variables. If a value of a
dataset doesn’t exist, it will be automatically created for that dataset. Check the examples below for more details. For
the field &#x60;&#x60;&#x60;testScript&#x60;&#x60;&#x60;, when it is a step-by-step script: * If some step is missing in
comparison to the target Test Case, it will be deleted. * Steps not having &#x60;&#x60;&#x60;id&#x60;&#x60;&#x60; will
be considered as a new step and will be created. * Steps having &#x60;&#x60;&#x60;id&#x60;&#x60;&#x60; will be
considered as existing steps and will be updated.


### Parameters

| Name            | Type                        | Description               | Notes      |
|-----------------|-----------------------------|---------------------------|------------|
| **testCaseKey** | **String**                  | The key of the Test Case. |            |
| **testCase**    | [**TestCase**](TestCase.md) |                           | [optional] |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

