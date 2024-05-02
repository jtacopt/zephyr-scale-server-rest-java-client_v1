# CustomFieldApi

| Method                                                                                                 | HTTP request                                 | Description |
|--------------------------------------------------------------------------------------------------------|----------------------------------------------|-------------|
| [**createCustomField**](CustomFieldApi.md#createCustomField)                                           | **POST** /customfield                        |             |
| [**createCustomFieldOptionByCustomFieldId**](CustomFieldApi.md#createCustomFieldOptionByCustomFieldId) | **POST** /customfield/{customFieldId}/option |             |

<a id="createCustomField"></a>

# **createCustomField**

> Object createCustomField(body)



Creates a new custom field for test cases, test plans, test runs, test result or folder. The custom fied name must be
unique by project and category. Custom fields must have one of these categories: &#x60;TEST_PLAN&#x60;,
&#x60;TEST_RUN&#x60;, &#x60;TEST_STEP&#x60;, &#x60;TEST_EXECUTION&#x60;, &#x60;TEST_CASE&#x60; or &#x60;FOLDER&#x60;.
Custom fields must have of these types: &#x60;SINGLE_LINE_TEXT&#x60;, &#x60;MULTI_LINE_TEXT&#x60;, &#x60;NUMBER&#x60;,
&#x60;DATE&#x60;, &#x60;SINGLE_CHOICE_SELECT_LIST&#x60;, &#x60;CHECKBOX&#x60;, &#x60;DECIMAL&#x60;,
&#x60;MULTI_CHOICE_SELECT_LIST&#x60; or &#x60;USER_LIST&#x60;.

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

<a id="createCustomFieldOptionByCustomFieldId"></a>

# **createCustomFieldOptionByCustomFieldId**

> Object createCustomFieldOptionByCustomFieldId(customFieldId, body)



Creates a new custom field option for &#x60;SINGLE_CHOICE_SELECT_LIST&#x60; or &#x60;MULTI_CHOICE_SELECT_LIST&#x60;
custom field.


### Parameters

| Name              | Type       | Description | Notes      |
|-------------------|------------|-------------|------------|
| **customFieldId** | **String** |             |            |
| **body**          | **String** |             | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

