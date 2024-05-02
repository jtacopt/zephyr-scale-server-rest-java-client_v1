# TestRunApi

| Method                                                                                                     | HTTP request                                                     | Description |
|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------|-------------|
| [**createAttachmentsByTestRunKey**](TestRunApi.md#createAttachmentsByTestRunKey)                           | **POST** /testrun/{testRunKey}/attachments                       |             |
| [**createTestResultByTestRunKeyAndTestCaseKey**](TestRunApi.md#createTestResultByTestRunKeyAndTestCaseKey) | **POST** /testrun/{testRunKey}/testcase/{testCaseKey}/testresult |             |
| [**createTestResultsByTestRunKey**](TestRunApi.md#createTestResultsByTestRunKey)                           | **POST** /testrun/{testRunKey}/testresults                       |             |
| [**createTestRun**](TestRunApi.md#createTestRun)                                                           | **POST** /testrun                                                |             |
| [**deleteTestRunByTestRunKey**](TestRunApi.md#deleteTestRunByTestRunKey)                                   | **DELETE** /testrun/{testRunKey}                                 |             |
| [**findTestRun**](TestRunApi.md#findTestRun)                                                               | **GET** /testrun/search                                          |             |
| [**getTestResultsByTestRunKey**](TestRunApi.md#getTestResultsByTestRunKey)                                 | **GET** /testrun/{testRunKey}/testresults                        |             |
| [**getTestRunAttachmentsByTestRunKey**](TestRunApi.md#getTestRunAttachmentsByTestRunKey)                   | **GET** /testrun/{testRunKey}/attachments                        |             |
| [**getTestRunByTestRunKey**](TestRunApi.md#getTestRunByTestRunKey)                                         | **GET** /testrun/{testRunKey}                                    |             |
| [**updateTestResultByTestRunKeyAndTestCaseKey**](TestRunApi.md#updateTestResultByTestRunKeyAndTestCaseKey) | **PUT** /testrun/{testRunKey}/testcase/{testCaseKey}/testresult  |             |

<a id="createAttachmentsByTestRunKey"></a>

# **createAttachmentsByTestRunKey**

> Object createAttachmentsByTestRunKey(testRunKey)



Create a new attachment on the specified Test Run.

### Example

```java

```

### Parameters

| Name           | Type       | Description              | Notes |
|----------------|------------|--------------------------|-------|
| **testRunKey** | **String** | The key of the Test Run. |       |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a id="createTestResultByTestRunKeyAndTestCaseKey"></a>

# **createTestResultByTestRunKeyAndTestCaseKey**

> Object createTestResultByTestRunKeyAndTestCaseKey(testCaseKey, testRunKey, environment, userKey, body)



Creates a new Test Result on the specified Test Run, looking for an item that matches the
&#x60;&#x60;&#x60;testCaseKey&#x60;&#x60;&#x60; and the query string filter parameters. If more than one item is found
using the specified parameters, only the first one of them will have the new Test Result created. Once created, the new
Test Result can be seen inside the specified Test Run, looking for a Test Case that matches the request parameters. The
fields &#x60;&#x60;&#x60;actualStartDate&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;actualEndDate&#x60;&#x60;&#x60; and
&#x60;&#x60;&#x60;status&#x60;&#x60;&#x60; will be set to default values if not defined. Deprecation notice - The fields
&#x60;&#x60;&#x60;executionDate&#x60;&#x60;&#x60; and &#x60;&#x60;&#x60;userKey&#x60;&#x60;&#x60; are deprecated. Please
use their new equivalents:  &#x60;&#x60;&#x60;executionDate&#x60;&#x60;&#x60; is now represented by
&#x60;&#x60;&#x60;actualEndDate&#x60;&#x60;&#x60; &#x60;&#x60;&#x60;userKey&#x60;&#x60;&#x60; is now represented by
&#x60;&#x60;&#x60;executedBy&#x60;&#x60;&#x60;

### Example

```java

```

### Parameters

| Name            | Type       | Description                                                          | Notes      |
|-----------------|------------|----------------------------------------------------------------------|------------|
| **testCaseKey** | **String** | The key of the Test Case                                             |            |
| **testRunKey**  | **String** | The key of the Test Run.                                             |            |
| **environment** | **String** | The environment to be optionally matched by an item on the Test Run. |            |
| **userKey**     | **String** | The user key to be optionally matched by an item on the Test Run.    |            |
| **body**        | **String** |                                                                      | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a id="createTestResultsByTestRunKey"></a>

# **createTestResultsByTestRunKey**

> Object createTestResultsByTestRunKey(testRunKey, environment, userKey, body)



Create new Test Results on the specified Test Run, looking for items that match the
&#x60;&#x60;&#x60;testCaseKey&#x60;&#x60;&#x60; for each body item. Once created, the new Test Results can be seen
inside the specified Test Run, looking for Test Cases that match the request parameters. The fields
&#x60;&#x60;&#x60;actualStartDate&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;actualEndDate&#x60;&#x60;&#x60; and
&#x60;&#x60;&#x60;status&#x60;&#x60;&#x60; will be set to default values if not defined. Deprecation notice - The fields
&#x60;&#x60;&#x60;executionDate&#x60;&#x60;&#x60; and &#x60;&#x60;&#x60;userKey&#x60;&#x60;&#x60; are deprecated. Please
use their new equivalents:  &#x60;&#x60;&#x60;executionDate&#x60;&#x60;&#x60; is now represented by
&#x60;&#x60;&#x60;actualEndDate&#x60;&#x60;&#x60; &#x60;&#x60;&#x60;userKey&#x60;&#x60;&#x60; is now represented by
&#x60;&#x60;&#x60;executedBy&#x60;&#x60;&#x60;

### Example

```java

```

### Parameters

| Name            | Type       | Description                                                          | Notes      |
|-----------------|------------|----------------------------------------------------------------------|------------|
| **testRunKey**  | **String** | The key of the Test Run.                                             |            |
| **environment** | **String** | The environment to be optionally matched by an item on the Test Run. |            |
| **userKey**     | **String** | The user key to be optionally matched by an item on the Test Run.    |            |
| **body**        | **String** |                                                                      | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a id="createTestRun"></a>

# **createTestRun**

> Object createTestRun(body)



Creates a new Test Run. The fields &#x60;&#x60;&#x60;plannedStartDate&#x60;&#x60;&#x60; and
&#x60;&#x60;&#x60;plannedEndDate&#x60;&#x60;&#x60; will be set to default values if not defined. The field
&#x60;&#x60;&#x60;status&#x60;&#x60;&#x60; will be automatically inferred based on the status of Test Run Items (field
&#x60;&#x60;&#x60;items&#x60;&#x60;&#x60;). The Test Run can be linked to a Test Plan, by setting a valid value on field
testPlanKey. Also, it can be linked to an issue, by setting a valid value on field issueKey. All Test Result fields are
allowed for Test Run Items (field &#x60;&#x60;&#x60;items&#x60;&#x60;&#x60;).

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

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a id="deleteTestRunByTestRunKey"></a>

# **deleteTestRunByTestRunKey**

> deleteTestRunByTestRunKey(testRunKey)



Delete the Test Run matching the given key.

### Example

```java

```

### Parameters

| Name           | Type       | Description              | Notes |
|----------------|------------|--------------------------|-------|
| **testRunKey** | **String** | The key of the Test Run. |       |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a id="findTestRun"></a>

# **findTestRun**

> Object findTestRun(fields, query, startAt, maxResults)



Retrieve the Test Runs that matches the query passed as parameter.

### Example

```java

```

### Parameters

| Name           | Type        | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Notes      |
|----------------|-------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------|
| **fields**     | **String**  | The fields of the Test Run to be included on the response. If not set, all fields will be returned. Inexistent fields will be ignored.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | [optional] |
| **query**      | **String**  | A query to filter Test Runs. The query syntax is similar to the JIRA JQL.  * Available fields: &#x60;&#x60;&#x60;projectKey&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;folder&#x60;&#x60;&#x60; * Available operators: &#x60;&#x60;&#x60;&#x3D;&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;IN&#x60;&#x60;&#x60; * Available logical operators: &#x60;&#x60;&#x60;AND&#x60;&#x60;&#x60;  The query syntax is very strict. The use of whitespaces between fields, operators and logical operators is required, as well as the use of double quotes for string values.  Usage example: * projectKey &#x3D; \&quot;JQA\&quot; * projectKey IN (\&quot;JQA\&quot;, \&quot;DEF\&quot;) * projectKey &#x3D; \&quot;JQA\&quot; AND folder &#x3D; \&quot;/Orbiter\&quot; * projectKey IN (\&quot;JQA\&quot;, \&quot;DEF\&quot;) AND folder &#x3D; \&quot;/Orbiter/Propellant\&quot; * folder &#x3D; \&quot;/Orbiter\&quot; | [optional] |
| **startAt**    | **Integer** | An offset to use with the query. This can be useful when paginating results.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | [optional] |
| **maxResults** | **Integer** | The max result count, limiting the query results. If not provided, the default value of 200 will be used.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a id="getTestResultsByTestRunKey"></a>

# **getTestResultsByTestRunKey**

> TestResult getTestResultsByTestRunKey(testRunKey)



Retrieve All Test Results linked to a Test Run.

### Example

```java

```

### Parameters

| Name           | Type       | Description              | Notes |
|----------------|------------|--------------------------|-------|
| **testRunKey** | **String** | The key of the Test Run. |       |

### Return type

[**TestResult**](TestResult.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a id="getTestRunAttachmentsByTestRunKey"></a>

# **getTestRunAttachmentsByTestRunKey**

> List&lt;Attachment&gt; getTestRunAttachmentsByTestRunKey(testRunKey)



Retrieve the Test Run Attachments matching the given key.

### Example

```java

```

### Parameters

| Name           | Type       | Description              | Notes |
|----------------|------------|--------------------------|-------|
| **testRunKey** | **String** | The key of the Test Run. |       |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a id="getTestRunByTestRunKey"></a>

# **getTestRunByTestRunKey**

> Object getTestRunByTestRunKey(testRunKey, fields)



Retrieve the Test Run matching the given key.

### Example

```java

```

### Parameters

| Name           | Type       | Description                                                                                                                            | Notes      |
|----------------|------------|----------------------------------------------------------------------------------------------------------------------------------------|------------|
| **testRunKey** | **String** | The key of the Test Run.                                                                                                               |            |
| **fields**     | **String** | The fields of the Test Run to be included on the response. If not set, all fields will be returned. Inexistent fields will be ignored. | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a id="updateTestResultByTestRunKeyAndTestCaseKey"></a>

# **updateTestResultByTestRunKeyAndTestCaseKey**

> Object updateTestResultByTestRunKeyAndTestCaseKey(testCaseKey, testRunKey, environment, userKey, body)



Updates the last Test Result on the specified Test Run, looking for an item that matches the testCaseKey and the query
string filter parameters. Only defined fields will be updated. If more than one item is found using the specified
parameters, only the first one of them will have the Test Result updated. The updated data can be seen inside the
specified Test Run, looking for the last Test Results of the Test Case that matches the request parameters.

### Example

```java

```

### Parameters

| Name            | Type       | Description                                                          | Notes      |
|-----------------|------------|----------------------------------------------------------------------|------------|
| **testCaseKey** | **String** | The key of the Test Case                                             |            |
| **testRunKey**  | **String** | The key of the Test Run.                                             |            |
| **environment** | **String** | The environment to be optionally matched by an item on the Test Run. |            |
| **userKey**     | **String** | The user key to be optionally matched by an item on the Test Run.    |            |
| **body**        | **String** |                                                                      | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

