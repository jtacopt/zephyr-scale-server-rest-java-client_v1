# TestResultApi

All URIs are relative to *https://<JIRA_HOST>/rest/atm/1.0*

| Method                                                                                                                      | HTTP request                                                     | Description |
|-----------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------|-------------|
| [**createAttachmentsByTestResultId**](TestResultApi.md#createAttachmentsByTestResultId)                                     | **POST** /testresult/{testResultId}/attachments                  |             |
| [**createAttachmentsByTestResultIdAndStepIndex**](TestResultApi.md#createAttachmentsByTestResultIdAndStepIndex)             | **POST** /testresult/{testResultId}/step/{stepIndex}/attachments |             |
| [**createTestResult**](TestResultApi.md#createTestResult)                                                                   | **POST** /testresult                                             |             |
| [**getAttachmentsByTestResultId**](TestResultApi.md#getAttachmentsByTestResultId)                                           | **GET** /testresult/{testResultId}/attachments                   |             |
| [**getTestresultTestResultIdStepStepIndexAttachments**](TestResultApi.md#getTestresultTestResultIdStepStepIndexAttachments) | **GET** /testresult/{testResultId}/step/{stepIndex}/attachments  |             |

<a id="createAttachmentsByTestResultId"></a>

# **createAttachmentsByTestResultId**

> Object createAttachmentsByTestResultId(testResultId)



Create a new attachment on the specified Test Result.

### Example

```java

```

### Parameters

| Name             | Type        | Description                | Notes |
|------------------|-------------|----------------------------|-------|
| **testResultId** | **Integer** | The id of the Test Result. |       |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a id="createAttachmentsByTestResultIdAndStepIndex"></a>

# **createAttachmentsByTestResultIdAndStepIndex**

> Object createAttachmentsByTestResultIdAndStepIndex(testResultId, stepIndex)



Create a new attachment on the specified step of the Test Result.

### Example

```java

```

### Parameters

| Name             | Type        | Description                        | Notes |
|------------------|-------------|------------------------------------|-------|
| **testResultId** | **Integer** | The id of the Test Result.         |       |
| **stepIndex**    | **Integer** | The index of the Test Result step. |       |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a id="createTestResult"></a>

# **createTestResult**

> Object createTestResult(testResult)



Creates a new Test Result for a Test Case. Once created, a new Test Result can be seen on the \&quot;Execution\&quot;
tab of the specified Test Case. This Test Result is not linked with any Test Run. The fields
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

| Name           | Type                            | Description | Notes      |
|----------------|---------------------------------|-------------|------------|
| **testResult** | [**TestResult**](TestResult.md) |             | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a id="getAttachmentsByTestResultId"></a>

# **getAttachmentsByTestResultId**

> List&lt;Attachment&gt; getAttachmentsByTestResultId(testResultId)



Retrieve the Test Result Attachments matching the given id.

### Example

```java

```

### Parameters

| Name             | Type        | Description                | Notes |
|------------------|-------------|----------------------------|-------|
| **testResultId** | **Integer** | The id of the Test Result. |       |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a id="getTestresultTestResultIdStepStepIndexAttachments"></a>

# **getTestresultTestResultIdStepStepIndexAttachments**

> List&lt;Attachment&gt; getTestresultTestResultIdStepStepIndexAttachments(testResultId, stepIndex)



Retrieve the Test Result Step Attachments matching the given testResultId and stepIndex.

### Example

```java

```

### Parameters

| Name             | Type        | Description                        | Notes |
|------------------|-------------|------------------------------------|-------|
| **testResultId** | **Integer** | The id of the Test Result.         |       |
| **stepIndex**    | **Integer** | The index of the Test Result step. |       |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

