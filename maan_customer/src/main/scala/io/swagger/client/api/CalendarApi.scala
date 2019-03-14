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

import io.swagger.client.model.CalendarResponse
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object CalendarApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : CalendarResponse (successful operation)
   *   code 400 :  (Customized error message)
   * 
   * @param token 
   * @param branch 
   * @param year 年，非必填，但需要跟月一起填寫。預設當年
   * @param month 月，非必填，但需要跟年一起填寫。預設當月
   * @param cid 查詢個人行事曆用
   */
  def calendarGet(token: String, branch: Int, year: Option[String] = None, month: Option[String] = None, cid: Option[Int] = None): ApiRequest[CalendarResponse] =
    ApiRequest[CalendarResponse](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/calendar", "application/json")
      .withQueryParam("branch", branch)
      .withQueryParam("year", year)
      .withQueryParam("month", month)
      .withQueryParam("cid", cid)
      .withHeaderParam("token", token)
      .withSuccessResponse[CalendarResponse](200)
      .withErrorResponse[Unit](400)
      

}

