# FolderApi

All URIs are relative to *https://<JIRA_HOST>/rest/atm/1.0*

| Method                                                            | HTTP request               | Description |
|-------------------------------------------------------------------|----------------------------|-------------|
| [**createFolder**](FolderApi.md#createFolder)                     | **POST** /folder           |             |
| [**updateFolderByFolderId**](FolderApi.md#updateFolderByFolderId) | **PUT** /folder/{folderId} |             |

<a id="createFolder"></a>

# **createFolder**

> Object createFolder(body)



Creates a new folder for test cases, test plans or test runs. In order to create a new folder you must POST a json with
3 fields: projectKey, name and type. The field type can be filled with TEST_CASE, TEST_PLAN or TEST_RUN.


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

<a id="updateFolderByFolderId"></a>

# **updateFolderByFolderId**

> updateFolderByFolderId(folderId, body)



Updates a folder for test cases, test plans or test runs. You can only update the name or the custom field value of a
folder, in order to do that you must PUT a json with 2 fields: name and customFields. The field name is a String and
forward and backslashes are not allowed. The field customFields is an object with the key being the custom field name.


### Parameters

| Name         | Type        | Description           | Notes      |
|--------------|-------------|-----------------------|------------|
| **folderId** | **Integer** | The id of the Folder. |            |
| **body**     | **String**  |                       | [optional] |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

