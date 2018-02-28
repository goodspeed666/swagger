/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.OrganizationList
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object OrganizationApi {

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
   */
  def organizationPost(token: String): ApiRequest[OrganizationList] =
    ApiRequest[OrganizationList](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/organization", "application/json")
      .withHeaderParam("token", token)
      .withSuccessResponse[OrganizationList](200)
      

}

