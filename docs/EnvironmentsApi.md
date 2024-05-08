# EnvironmentsApi

All URIs are relative to *https://<JIRA_HOST>/rest/atm/1.0*

| Method                                                          | HTTP request           | Description |
|-----------------------------------------------------------------|------------------------|-------------|
| [**createEnvironments**](EnvironmentsApi.md#createEnvironments) | **POST** /environments |             |
| [**getEnvironments**](EnvironmentsApi.md#getEnvironments)       | **GET** /environments  |             |

<a id="createEnvironments"></a>

# **createEnvironments**

> Object createEnvironments(body)



Creates a new Environment. The project must exist The project must have Zephyr Scale enabled The name must be unique

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

<a id="getEnvironments"></a>

# **getEnvironments**

> Object getEnvironments(projectKey)



Retrieve the Environments matching the given projectKey. The project must exist The project must have Zephyr Scale
enabled

### Parameters

| Name           | Type       | Description            | Notes |
|----------------|------------|------------------------|-------|
| **projectKey** | **String** | The key of the Project |       |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

