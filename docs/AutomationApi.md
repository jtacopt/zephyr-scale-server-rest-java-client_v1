# AutomationApi

All URIs are relative to *https://<JIRA_HOST>/rest/atm/1.0*

| Method                                                                                                              | HTTP request                                         | Description |
|---------------------------------------------------------------------------------------------------------------------|------------------------------------------------------|-------------|
| [**createAutomationExecutionCucumberByProjectKey**](AutomationApi.md#createAutomationExecutionCucumberByProjectKey) | **POST** /automation/execution/cucumber/{projectKey} |             |
| [**createAutomationTestCycleByProjectKey**](AutomationApi.md#createAutomationTestCycleByProjectKey)                 | **POST** /automation/execution/{projectKey}          |             |
| [**getCucumberFeatureFiles**](AutomationApi.md#getCucumberFeatureFiles)                                             | **GET** /automation/testcases                        |             |

<a id="createAutomationExecutionCucumberByProjectKey"></a>

# **createAutomationExecutionCucumberByProjectKey**

> Object createAutomationExecutionCucumberByProjectKey(projectKey)



Creates a new Test Cycle based on provided automated test results. This endpoint receives a zip file containing one or
more [Cucumber Json Output file](https://relishapp.com/cucumber/cucumber/docs/formatters/json-output-formatter).
Optionally, you can send a &#x60;testCycle&#x60; part in your form data to customize the created Test Cycle.

### Parameters

| Name           | Type       | Description             | Notes |
|----------------|------------|-------------------------|-------|
| **projectKey** | **String** | The key of the Project. |       |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a id="createAutomationTestCycleByProjectKey"></a>

# **createAutomationTestCycleByProjectKey**

> Object createAutomationTestCycleByProjectKey(projectKey)



Creates a new Test Cycle based on provided automated test results. This endpoint receives a zip file containing one or
more Zephyr Scale Test Results File Format to create the Test Cycle.
See [Zephyr Scale JUnit Integration](https://bitbucket.org/smartbeartm4j/tm4j-junit-integration) to learn how to
generate this file. Optionally, you can send a &#x60;testCycle&#x60; part in your form data to customize the created
Test Cycle.

### Parameters

| Name           | Type       | Description             | Notes |
|----------------|------------|-------------------------|-------|
| **projectKey** | **String** | The key of the Project. |       |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a id="getCucumberFeatureFiles"></a>

# **getCucumberFeatureFiles**

> getCucumberFeatureFiles(tql)



Retrieve a zip file containing Cucumber Feature Files that matches the tql passed as parameter.

### Parameters

| Name    | Type       | Description                                                                                                                                                                                                                                                                                                                                                                              | Notes |
|---------|------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------|
| **tql** | **String** | A Zephyr Scale TQL to filter Test Cases. The param syntax is similar to the JIRA JQL.  * Available fields: &#x60;&#x60;&#x60;projectKey&#x60;&#x60;&#x60;. * Available operators: &#x60;&#x60;&#x60;&#x3D;&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;IN&#x60;&#x60;&#x60;  Usage examples: * testCase.projectKey &#x3D; &#39;JQA&#39; * testCase.projectKey IN (&#39;JQA&#39;, &#39;JQB&#39;) |       |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

