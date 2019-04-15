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

import io.swagger.client.model.GetSurvey
import io.swagger.client.model.GetSurveyDetail
import io.swagger.client.model.GetSurveyReport
import io.swagger.client.model.GetSurveyTitle
import io.swagger.client.model.InsertReturn
import io.swagger.client.model.SurveyCommentResponse
import io.swagger.client.model.SurveyList
import io.swagger.client.model.SurveyRequest
import io.swagger.client.model.SurveyResponse
import io.swagger.client.model.SurveySingleComment
import io.swagger.client.model.SurveySingleCommentList
import io.swagger.client.model.SurveySingleCommentRequest
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
   * @param unread 
   */
  def surveysCompletedGet(token: String, unread: Option[Int] = None): ApiRequest[SurveyList] =
    ApiRequest[SurveyList](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys/completed", "application/json")
      .withQueryParam("unread", unread)
      .withHeaderParam("token", token)
      .withSuccessResponse[SurveyList](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : SurveyList (successful operation)
   * 
   * @param token 
   * @param unread 
   */
  def surveysGet(token: String, unread: Option[Int] = None): ApiRequest[SurveyList] =
    ApiRequest[SurveyList](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys", "application/json")
      .withQueryParam("unread", unread)
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
   *   code 200 : GetSurveyDetail (successful operation)
   * 
   * @param token 
   * @param sid 
   * @param tid 
   * @param cid 
   */
  def surveysSidTidCidGet(token: String, sid: Int, tid: Int, cid: Int): ApiRequest[GetSurveyDetail] =
    ApiRequest[GetSurveyDetail](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys/{sid}/{tid}/{cid}", "application/json")
      .withPathParam("sid", sid)
      .withPathParam("tid", tid)
      .withPathParam("cid", cid)
      .withHeaderParam("token", token)
      .withSuccessResponse[GetSurveyDetail](200)
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
   *   code 200 : GetSurvey (successful operation)
   * 
   * @param token 
   * @param sid 
   * @param tid 
   */
  def surveysSidTidGet(token: String, sid: Int, tid: Int): ApiRequest[GetSurvey] =
    ApiRequest[GetSurvey](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys/{sid}/{tid}", "application/json")
      .withPathParam("sid", sid)
      .withPathParam("tid", tid)
      .withHeaderParam("token", token)
      .withSuccessResponse[GetSurvey](200)
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
        /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (successful operation)
   * 
   * @param token 
   * @param id 
   */
  def surveysSingleCommentIdDelete(token: String, id: Int): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys/single_comment/{id}", "application/json")
      .withPathParam("id", id)
      .withHeaderParam("token", token)
      .withSuccessResponse[Unit](200)
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
  def surveysSingleCommentIdPost(token: String, id: Int, body: Option[SurveySingleCommentRequest] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys/single_comment/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withHeaderParam("token", token)
      .withSuccessResponse[Unit](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : SurveySingleComment (successful operation)
   * 
   * @param token 
   * @param cfgid 
   * @param sid 
   * @param tid 
   * @param cid 
   * @param body 
   */
  def surveysSingleCommentListGet(token: String, cfgid: Int, sid: Int, tid: Int, cid: Int, body: Option[SurveySingleCommentList] = None): ApiRequest[SurveySingleComment] =
    ApiRequest[SurveySingleComment](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys/single_comment/list", "application/json")
      .withBody(body)
      .withQueryParam("cfgid", cfgid)
      .withQueryParam("sid", sid)
      .withQueryParam("tid", tid)
      .withQueryParam("cid", cid)
      .withHeaderParam("token", token)
      .withSuccessResponse[SurveySingleComment](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 201 : InsertReturn (successful operation)
   * 
   * @param token 
   * @param body 
   */
  def surveysSingleCommentPost(token: String, body: Option[SurveySingleCommentRequest] = None): ApiRequest[InsertReturn] =
    ApiRequest[InsertReturn](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/surveys/single_comment", "application/json")
      .withBody(body)
      .withHeaderParam("token", token)
      .withSuccessResponse[InsertReturn](201)
      

}

