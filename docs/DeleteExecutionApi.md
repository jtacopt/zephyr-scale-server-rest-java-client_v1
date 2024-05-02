# DeleteExecutionApi

All URIs are relative to *https://<JIRA_HOST>/rest/atm/1.0*

| Method                                                                         | HTTP request                             | Description |
|--------------------------------------------------------------------------------|------------------------------------------|-------------|
| [**deleteTestResults**](DeleteExecutionApi.md#deleteTestResults)               | **POST** /delete/executiondeletion       |             |
| [**getDeleteExecutionStatus**](DeleteExecutionApi.md#getDeleteExecutionStatus) | **GET** /delete/executiondeletion/status |             |

<a id="deleteTestResults"></a>

# **deleteTestResults**

> Object deleteTestResults(body)



Starts the deletion process of Test Executions (also known as Test Results). This process only removes executions older
than 3 months and it will keep the last test executions. &#x60;projectKey&#x60; is the key of the project to delete
executions from. If it is not provided, executions from all projects will be deleted. Only Jira Admin users can execute
this process.

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

<a id="getDeleteExecutionStatus"></a>

# **getDeleteExecutionStatus**

> Object getDeleteExecutionStatus()



Gets the status of the test execution deletion process. The statuses can be: IN_PROGRESS, FINISHED or FAILED.


### Parameters

This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

