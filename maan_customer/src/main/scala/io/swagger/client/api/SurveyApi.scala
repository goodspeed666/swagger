/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.GetSurvey
import io.swagger.client.model.GetSurveyReport
import io.swagger.client.model.GetSurveyTitle
import io.swagger.client.model.InsertReturn
import io.swagger.client.model.SurveyCommentResponse
import io.swagger.client.model.SurveyList
import io.swagger.client.model.SurveyRequest
import io.swagger.client.model.SurveyResponse
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object SurveyApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : SurveyCommentResponse (successful operation)
   * 
   * @param token 
   */
  def surveysCommentPost(token: String): ApiRequest[SurveyCommentResponse] =
    ApiRequest[SurveyCommentResponse](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys/comment", "application/json")
      .withHeaderParam("token", token)
      .withSuccessResponse[SurveyCommentResponse](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : SurveyList (successful operation)
   * 
   * @param token 
   */
  def surveysGet(token: String): ApiRequest[SurveyList] =
    ApiRequest[SurveyList](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys", "application/json")
      .withHeaderParam("token", token)
      .withSuccessResponse[SurveyList](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetSurveyTitle (successful operation)
   * 
   * @param token 
   */
  def surveysGetTitleGet(token: String): ApiRequest[GetSurveyTitle] =
    ApiRequest[GetSurveyTitle](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys/get_title", "application/json")
      .withHeaderParam("token", token)
      .withSuccessResponse[GetSurveyTitle](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 201 : InsertReturn (successful operation)
   * 
   * @param token 
   * @param body 
   */
  def surveysPost(token: String, body: Option[SurveyRequest] = None): ApiRequest[InsertReturn] =
    ApiRequest[InsertReturn](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys", "application/json")
      .withBody(body)
      .withHeaderParam("token", token)
      .withSuccessResponse[InsertReturn](201)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetSurveyReport (successful operation)
   * 
   * @param token 
   * @param sid 
   * @param tid 
   * @param startDate 
   * @param endDate 
   */
  def surveysReportGet(token: String, sid: Int, tid: Option[Int] = None, startDate: Option[String] = None, endDate: Option[String] = None): ApiRequest[GetSurveyReport] =
    ApiRequest[GetSurveyReport](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys/report", "application/json")
      .withQueryParam("sid", sid)
      .withQueryParam("tid", tid)
      .withQueryParam("start_date", startDate)
      .withQueryParam("end_date", endDate)
      .withHeaderParam("token", token)
      .withSuccessResponse[GetSurveyReport](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetSurvey (successful operation)
   * 
   * @param token 
   */
  def surveysSidGet(token: String): ApiRequest[GetSurvey] =
    ApiRequest[GetSurvey](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys/{sid}", "application/json")
      .withHeaderParam("token", token)
      .withSuccessResponse[GetSurvey](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (successful operation)
   * 
   * @param token 
   * @param sid 
   * @param tid 
   */
  def surveysSidTidDelete(token: String, sid: Int, tid: Int): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys/{sid}/{tid}", "application/json")
      .withPathParam("sid", sid)
      .withPathParam("tid", tid)
      .withHeaderParam("token", token)
      .withSuccessResponse[Unit](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : SurveyResponse (successful operation)
   * 
   * @param token 
   * @param sid 
   * @param tid 
   */
  def surveysSidTidPost(token: String, sid: Int, tid: Int): ApiRequest[SurveyResponse] =
    ApiRequest[SurveyResponse](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys/{sid}/{tid}", "application/json")
      .withPathParam("sid", sid)
      .withPathParam("tid", tid)
      .withHeaderParam("token", token)
      .withSuccessResponse[SurveyResponse](200)
      

}

