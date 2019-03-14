/**
 * Maan Customer API for backend
 * define ok 代表已定義好，incomplete 代表尚未實作。 如果都沒有標注，代表該 api 已可使用。
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import io.swagger.client.model.OrganizationBatchRequest
import io.swagger.client.model.OrganizationList
import io.swagger.client.model.OrganizationRequest
import io.swagger.client.model.OrganizationResponse
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object OrganizationApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (successful operation)
   * 
   * @param token 
   * @param body 
   */
  def organizationBatchPost(token: String, body: Option[OrganizationBatchRequest] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/organization/batch", "application/json")
      .withBody(body)
      .withHeaderParam("token", token)
      .withSuccessResponse[Unit](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : OrganizationList (successful operation)
   * 
   * @param token 
   */
  def organizationGet(token: String): ApiRequest[OrganizationList] =
    ApiRequest[OrganizationList](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/organization", "application/json")
      .withHeaderParam("token", token)
      .withSuccessResponse[OrganizationList](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : OrganizationList (successful operation)
   * 
   * @param token 
   * @param id 
   */
  def organizationIdDelete(token: String, id: Int): ApiRequest[OrganizationList] =
    ApiRequest[OrganizationList](ApiMethods.DELETE, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/organization/{id}", "application/json")
      .withPathParam("id", id)
      .withHeaderParam("token", token)
      .withSuccessResponse[OrganizationList](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (successful operation)
   * 
   * @param token 
   * @param id 
   * @param body 
   */
  def organizationIdPost(token: String, id: Int, body: Option[OrganizationRequest] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/organization/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withHeaderParam("token", token)
      .withSuccessResponse[Unit](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 201 : OrganizationResponse (successful operation)
   * 
   * @param token 
   * @param body 
   */
  def organizationPost(token: String, body: Option[OrganizationRequest] = None): ApiRequest[OrganizationResponse] =
    ApiRequest[OrganizationResponse](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/organization", "application/json")
      .withBody(body)
      .withHeaderParam("token", token)
      .withSuccessResponse[OrganizationResponse](201)
      

}

