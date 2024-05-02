# IssueLinkApi

All URIs are relative to *https://<JIRA_HOST>/rest/atm/1.0*

| Method                                                               | HTTP request                            | Description |
|----------------------------------------------------------------------|-----------------------------------------|-------------|
| [**getIssueLinkByIssueKey**](IssueLinkApi.md#getIssueLinkByIssueKey) | **GET** /issuelink/{issueKey}/testcases |             |

<a id="getIssueLinkByIssueKey"></a>

# **getIssueLinkByIssueKey**

> Object getIssueLinkByIssueKey(issueKey, fields)



Retrieve all Test Cases linked to an Issue.

### Parameters

| Name         | Type       | Description                                                                                                                             | Notes      |
|--------------|------------|-----------------------------------------------------------------------------------------------------------------------------------------|------------|
| **issueKey** | **String** | The key of the linked Issue.                                                                                                            |            |
| **fields**   | **String** | The fields of the Test Case to be included on the response. If not set, all fields will be returned. Inexistent fields will be ignored. | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

