/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.AffectedRows
import io.swagger.client.model.CourseActivityPhotoRequest
import io.swagger.client.model.CourseActivityRearrangeRequest
import io.swagger.client.model.CourseActivityRequest
import io.swagger.client.model.CourseActivityResponse
import io.swagger.client.model.CourseDataCopyRequest
import io.swagger.client.model.CourseDataRequest
import io.swagger.client.model.CourseDataResponse
import io.swagger.client.model.CourseList
import io.swagger.client.model.CourseRollcallResponse
import io.swagger.client.model.InsertReturn
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object CourseApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : CourseActivityResponse (Successful operation)
   * 
   * @param token 
   * @param courseId 
   */
  def coursesCourseIdActivityGet(token: String, courseId: String): ApiRequest[CourseActivityResponse] =
    ApiRequest[CourseActivityResponse](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/courses/{course_id}/activity", "application/json")
      .withPathParam("course_id", courseId)
      .withHeaderParam("token", token)
      .withSuccessResponse[CourseActivityResponse](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : AffectedRows (Successful operation)
   * 
   * @param token 
   * @param courseId 
   * @param photoId 
   */
  def coursesCourseIdActivityPhotosPhotoIdDelete(token: String, courseId: Int, photoId: Int): ApiRequest[AffectedRows] =
    ApiRequest[AffectedRows](ApiMethods.DELETE, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/courses/{course_id}/activity/photos/{photo_id}", "application/json")
      .withPathParam("course_id", courseId)
      .withPathParam("photo_id", photoId)
      .withHeaderParam("token", token)
      .withSuccessResponse[AffectedRows](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (Successful operation)
   * 
   * @param token 
   * @param courseId 
   * @param body 
   */
  def coursesCourseIdActivityPhotosPost(token: String, courseId: String, body: Option[CourseActivityPhotoRequest] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/courses/{course_id}/activity/photos", "application/json")
      .withBody(body)
      .withPathParam("course_id", courseId)
      .withHeaderParam("token", token)
      .withSuccessResponse[Unit](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 201 :  (Successful operation)
   * 
   * @param token 
   * @param courseId 
   * @param body 
   */
  def coursesCourseIdActivityPost(token: String, courseId: String, body: Option[CourseActivityRequest] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/courses/{course_id}/activity", "application/json")
      .withBody(body)
      .withPathParam("course_id", courseId)
      .withHeaderParam("token", token)
      .withSuccessResponse[Unit](201)
        /**
   * 重組後，須由前端給 weight，後端照這個 weight 寫入排列順序
   * 
   * Expected answers:
   *   code 200 :  (Successful operation)
   * 
   * @param token 
   * @param courseId 
   * @param body 
   */
  def coursesCourseIdActivityRearrangePost(token: String, courseId: String, body: Option[CourseActivityRearrangeRequest] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/courses/{course_id}/activity/rearrange", "application/json")
      .withBody(body)
      .withPathParam("course_id", courseId)
      .withHeaderParam("token", token)
      .withSuccessResponse[Unit](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 201 : InsertReturn (successful operation)
   *   code 400 :  (Customized error message)
   * 
   * @param token 
   * @param courseId 
   * @param body 
   */
  def coursesCourseIdCopyPost(token: String, courseId: String, body: Option[CourseDataCopyRequest] = None): ApiRequest[InsertReturn] =
    ApiRequest[InsertReturn](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/courses/{course_id}/copy", "application/json")
      .withBody(body)
      .withPathParam("course_id", courseId)
      .withHeaderParam("token", token)
      .withSuccessResponse[InsertReturn](201)
      .withErrorResponse[Unit](400)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (successful operation)
   *   code 400 :  (Customized error message)
   * 
   * @param token 
   * @param courseId 
   */
  def coursesCourseIdDelete(token: String, courseId: Int): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/courses/{course_id}", "application/json")
      .withPathParam("course_id", courseId)
      .withHeaderParam("token", token)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](400)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : CourseDataResponse (successful operation)
   *   code 400 :  (Customized error message)
   * 
   * @param token 
   * @param courseId 
   */
  def coursesCourseIdGet(token: String, courseId: Int): ApiRequest[CourseDataResponse] =
    ApiRequest[CourseDataResponse](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/courses/{course_id}", "application/json")
      .withPathParam("course_id", courseId)
      .withHeaderParam("token", token)
      .withSuccessResponse[CourseDataResponse](200)
      .withErrorResponse[Unit](400)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (successful operation)
   *   code 400 :  (Customized error message)
   * 
   * @param token 
   * @param courseId 
   * @param body 
   */
  def coursesCourseIdPost(token: String, courseId: Int, body: Option[CourseDataRequest] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/courses/{course_id}", "application/json")
      .withBody(body)
      .withPathParam("course_id", courseId)
      .withHeaderParam("token", token)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](400)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : CourseRollcallResponse (Successful operation)
   *   code 400 :  (Customized error message)
   * 
   * @param token 
   * @param courseId 
   */
  def coursesCourseIdRollcallGet(token: String, courseId: String): ApiRequest[CourseRollcallResponse] =
    ApiRequest[CourseRollcallResponse](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/courses/{course_id}/rollcall", "application/json")
      .withPathParam("course_id", courseId)
      .withHeaderParam("token", token)
      .withSuccessResponse[CourseRollcallResponse](200)
      .withErrorResponse[Unit](400)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : CourseList (successful operation)
   * 
   * @param token 
   * @param page 
   */
  def coursesGet(token: String, page: Option[Int] = None): ApiRequest[CourseList] =
    ApiRequest[CourseList](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/courses", "application/json")
      .withQueryParam("page", page)
      .withHeaderParam("token", token)
      .withSuccessResponse[CourseList](200)
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
  def coursesPost(token: String, body: Option[CourseDataRequest] = None): ApiRequest[InsertReturn] =
    ApiRequest[InsertReturn](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/courses", "application/json")
      .withBody(body)
      .withHeaderParam("token", token)
      .withSuccessResponse[InsertReturn](201)
      .withErrorResponse[Unit](400)
      

}

