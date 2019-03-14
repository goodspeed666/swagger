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

import io.swagger.client.model.EmailDataRequest
import io.swagger.client.model.InsertReturn
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object MailApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 201 : InsertReturn (successful operation)
   *   code 400 :  (Customized error message)
   * 
   * @param token 
   * @param body 
   */
  def emailPost(token: String, body: Option[EmailDataRequest] = None): ApiRequest[InsertReturn] =
    ApiRequest[InsertReturn](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/email", "application/json")
      .withBody(body)
      .withHeaderParam("token", token)
      .withSuccessResponse[InsertReturn](201)
      .withErrorResponse[Unit](400)
      

}

