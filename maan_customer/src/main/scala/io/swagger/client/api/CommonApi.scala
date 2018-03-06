/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.GetBranch
import io.swagger.client.model.GetConst
import io.swagger.client.model.GetCourseList
import io.swagger.client.model.GetCourseType
import io.swagger.client.model.GetPeriod
import io.swagger.client.model.SearchCustomer
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object CommonApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetConst (successful operation)
   * 
   * @param token 
   */
  def commonConstGet(token: String): ApiRequest[GetConst] =
    ApiRequest[GetConst](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/common/const", "application/json")
      .withHeaderParam("token", token)
      .withSuccessResponse[GetConst](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : SearchCustomer (successful operation)
   * 
   * @param token 
   * @param keyword 請輸入姓名或身分證字號或統一證號搜尋
   */
  def commonSearchCustomerGet(token: String, keyword: String): ApiRequest[SearchCustomer] =
    ApiRequest[SearchCustomer](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/common/search/customer", "application/json")
      .withQueryParam("keyword", keyword)
      .withHeaderParam("token", token)
      .withSuccessResponse[SearchCustomer](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetBranch (successful operation)
   * 
   * @param token 
   */
  def commonTypeBranchGet(token: String): ApiRequest[GetBranch] =
    ApiRequest[GetBranch](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/common/type/branch", "application/json")
      .withHeaderParam("token", token)
      .withSuccessResponse[GetBranch](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetCourseList (successful operation)
   *   code 404 :  (The type is empty or does not exist)
   * 
   * @param token 
   * @param formId 課程類別id
   */
  def commonTypeCourseGet(token: String, formId: String): ApiRequest[GetCourseList] =
    ApiRequest[GetCourseList](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/common/type/course", "application/json")
      .withQueryParam("form_id", formId)
      .withHeaderParam("token", token)
      .withSuccessResponse[GetCourseList](200)
      .withErrorResponse[Unit](404)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetCourseType (successful operation)
   *   code 404 :  (The type is empty or does not exist)
   * 
   * @param token 
   * @param branch 
   */
  def commonTypeCourseTypeGet(token: String, branch: Int): ApiRequest[GetCourseType] =
    ApiRequest[GetCourseType](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/common/type/course_type", "application/json")
      .withQueryParam("branch", branch)
      .withHeaderParam("token", token)
      .withSuccessResponse[GetCourseType](200)
      .withErrorResponse[Unit](404)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetPeriod (successful operation)
   * 
   * @param token 
   */
  def commonTypeNotificationGet(token: String): ApiRequest[GetPeriod] =
    ApiRequest[GetPeriod](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/common/type/notification", "application/json")
      .withHeaderParam("token", token)
      .withSuccessResponse[GetPeriod](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetPeriod (successful operation)
   * 
   * @param token 
   */
  def commonTypePeriodGet(token: String): ApiRequest[GetPeriod] =
    ApiRequest[GetPeriod](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/common/type/period", "application/json")
      .withHeaderParam("token", token)
      .withSuccessResponse[GetPeriod](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetPeriod (successful operation)
   * 
   * @param token 
   */
  def commonTypeRoleGet(token: String): ApiRequest[GetPeriod] =
    ApiRequest[GetPeriod](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/common/type/role", "application/json")
      .withHeaderParam("token", token)
      .withSuccessResponse[GetPeriod](200)
      

}

