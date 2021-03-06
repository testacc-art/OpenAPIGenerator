/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import java.io.ByteArrayInputStream;
import java.security.PrivateKey;
import java.util.Arrays;
import org.junit.Ignore;
import org.junit.Test;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.auth.HttpSignatureAuth;
import org.openapitools.client.model.Pet;
import org.tomitribe.auth.signatures.*;

/** API tests for FakeApi */
public class FakeApiTest {

  private final FakeApi api = new FakeApi();

  /**
   * Health check endpoint
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void fakeHealthGetTest() throws ApiException {
    // HealthCheckResult response = api.fakeHealthGet();
    // TODO: test validations
  }

  /**
   * test http signature authentication
   *
   * @throws Exception if the Api call fails
   */
  @Ignore
  @Test
  public void fakeHttpSignatureTestTest() throws Exception {

    final String privateKeyPem =
        "-----BEGIN RSA PRIVATE KEY-----\n"
            + "MIICXgIBAAKBgQDCFENGw33yGihy92pDjZQhl0C36rPJj+CvfSC8+q28hxA161QF\n"
            + "NUd13wuCTUcq0Qd2qsBe/2hFyc2DCJJg0h1L78+6Z4UMR7EOcpfdUE9Hf3m/hs+F\n"
            + "UR45uBJeDK1HSFHD8bH    KD6kv8FPGfJTotc+2xjJwoYi+1hqp1fIekaxsyQIDAQAB\n"
            + "AoGBAJR8ZkCUvx5kzv+utdl7T5MnordT1TvoXXJGXK7ZZ+UuvMNUCdN2QPc4sBiA\n"
            + "QWvLw1cSKt5DsKZ8UETpYPy8pPYnnDEz2dDYiaew9+xEpubyeW2oH4Zx71wqBtOK\n"
            + "kqwrXa/pzdpiucRRjk6vE6YY7EBBs/g7uanVpGibOVAEsqH1AkEA7DkjVH28WDUg\n"
            + "f1nqvfn2Kj6CT7nIcE3jGJsZZ7zlZmBmHFDONMLUrXR/Zm3pR5m0tCmBqa5RK95u\n"
            + "412jt1dPIwJBANJT3v8pnkth48bQo/fKel6uEYyboRtA5/uHuHkZ6FQF7OUkGogc\n"
            + "mSJluOdc5t6hI1VsLn0QZEjQZMEOWr+wKSMCQQCC4kXJEsHAve77oP6HtG/IiEn7\n"
            + "kpyUXRNvFsDE0czpJJBvL/aRFUJxuRK91jhjC68sA7NsKMGg5OXb5I5Jj36xAkEA\n"
            + "gIT7aFOYBFwGgQAQkWNKLvySgKbAZRTeLBacpHMuQdl1DfdntvAyqpAZ0lY0RKmW\n"
            + "G6aFKaqQfOXKCyWoUiVknQJAXrlgySFci/2ueKlIE1QqIiLSZ8V8OlpFLRnb1pzI\n"
            + "7U1yQXnTAEFYM560yJlzUpOb1V4cScGd365tiSMvxLOvTA==\n"
            + "-----END RSA PRIVATE KEY-----\n";

    PrivateKey privateKey = PEM.readPrivateKey(new ByteArrayInputStream(privateKeyPem.getBytes()));
    ApiClient client = api.getApiClient();
    HttpSignatureAuth auth = (HttpSignatureAuth) client.getAuthentication("http_signature_test");
    auth.setAlgorithm(Algorithm.RSA_SHA512);
    auth.setHeaders(Arrays.asList("(request-target)", "host", "date"));
    auth.setPrivateKey(privateKey);

    Pet pet = new Pet();
    pet.setId(10l);
    pet.setName("test http signature");
    String query1 = "hello world";
    String header1 = "empty header";
    api.fakeHttpSignatureTest(pet, query1, header1);
  }

  /**
   * Test serialization of outer boolean types
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void fakeOuterBooleanSerializeTest() throws ApiException {
    // Boolean body = null;
    // Boolean response = api.fakeOuterBooleanSerialize(body);
    // TODO: test validations
  }

  /**
   * Test serialization of object with outer number type
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void fakeOuterCompositeSerializeTest() throws ApiException {
    // OuterComposite outerComposite = null;
    // OuterComposite response = api.fakeOuterCompositeSerialize(outerComposite);
    // TODO: test validations
  }

  /**
   * Test serialization of outer number types
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void fakeOuterNumberSerializeTest() throws ApiException {
    // BigDecimal body = null;
    // BigDecimal response = api.fakeOuterNumberSerialize(body);
    // TODO: test validations
  }

  /**
   * Test serialization of outer string types
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void fakeOuterStringSerializeTest() throws ApiException {
    // String body = null;
    // String response = api.fakeOuterStringSerialize(body);
    // TODO: test validations
  }

  /**
   * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void testBodyWithFileSchemaTest() throws ApiException {
    // FileSchemaTestClass fileSchemaTestClass = null;
    // api.testBodyWithFileSchema(fileSchemaTestClass);
    // TODO: test validations
  }

  /** @throws ApiException if the Api call fails */
  @Test
  public void testBodyWithQueryParamsTest() throws ApiException {
    // String query = null;
    // User user = null;
    // api.testBodyWithQueryParams(query, user);
    // TODO: test validations
  }

  /**
   * To test \&quot;client\&quot; model
   *
   * <p>To test \&quot;client\&quot; model
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void testClientModelTest() throws ApiException {
    // Client client = null;
    // Client response = api.testClientModel(client);
    // TODO: test validations
  }

  /**
   * Fake endpoint for testing various parameters ????????? ??????????????????????????? ?????? ?????? ?????????
   *
   * <p>Fake endpoint for testing various parameters ????????? ??????????????????????????? ?????? ?????? ?????????
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void testEndpointParametersTest() throws ApiException {
    // BigDecimal number = null;
    // Double _double = null;
    // String patternWithoutDelimiter = null;
    // byte[] _byte = null;
    // Integer integer = null;
    // Integer int32 = null;
    // Long int64 = null;
    // Float _float = null;
    // String string = null;
    // File binary = null;
    // LocalDate date = null;
    // OffsetDateTime dateTime = null;
    // String password = null;
    // String paramCallback = null;
    // api.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32,
    // int64, _float, string, binary, date, dateTime, password, paramCallback);
    // TODO: test validations
  }

  /**
   * To test enum parameters
   *
   * <p>To test enum parameters
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void testEnumParametersTest() throws ApiException {
    // List<String> enumHeaderStringArray = null;
    // String enumHeaderString = null;
    // List<String> enumQueryStringArray = null;
    // String enumQueryString = null;
    // Integer enumQueryInteger = null;
    // Double enumQueryDouble = null;
    // List<String> enumFormStringArray = null;
    // String enumFormString = null;
    // api.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray,
    // enumQueryString, enumQueryInteger, enumQueryDouble, enumFormStringArray, enumFormString);
    // TODO: test validations
  }

  /**
   * Fake endpoint to test group parameters (optional)
   *
   * <p>Fake endpoint to test group parameters (optional)
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void testGroupParametersTest() throws ApiException {
    // Integer requiredStringGroup = null;
    // Boolean requiredBooleanGroup = null;
    // Long requiredInt64Group = null;
    // Integer stringGroup = null;
    // Boolean booleanGroup = null;
    // Long int64Group = null;
    // api.testGroupParameters()
    //        .requiredStringGroup(requiredStringGroup)
    //        .requiredBooleanGroup(requiredBooleanGroup)
    //        .requiredInt64Group(requiredInt64Group)
    //        .stringGroup(stringGroup)
    //        .booleanGroup(booleanGroup)
    //        .int64Group(int64Group)
    //        .execute();
    // TODO: test validations
  }

  /**
   * test inline additionalProperties
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void testInlineAdditionalPropertiesTest() throws ApiException {
    // Map<String, String> requestBody = null;
    // api.testInlineAdditionalProperties(requestBody);
    // TODO: test validations
  }

  /**
   * test json serialization of form data
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void testJsonFormDataTest() throws ApiException {
    // String param = null;
    // String param2 = null;
    // api.testJsonFormData(param, param2);
    // TODO: test validations
  }

  /**
   * To test the collection format in query parameters
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void testQueryParameterCollectionFormatTest() throws ApiException {
    // List<String> pipe = null;
    // List<String> ioutil = null;
    // List<String> http = null;
    // List<String> url = null;
    // List<String> context = null;
    // api.testQueryParameterCollectionFormat(pipe, ioutil, http, url, context);
    // TODO: test validations
  }
}
