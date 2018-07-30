/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.InsertReturn
import io.swagger.client.model.UploadProfilePicRequest
import io.swagger.client.model.User
import io.swagger.client.model.UserChangePasswordRequest
import io.swagger.client.model.UserChangePasswordRequest2
import io.swagger.client.model.UserData
import io.swagger.client.model.UserList
import io.swagger.client.model.UserRequest
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object UserApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (successful operation)
   * 
   * @param token 
   * @param userId 
   * @param body 
   */
  def usersChangePassword2Post(token: String, userId: Int, body: Option[UserChangePasswordRequest2] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/users/change_password2", "application/json")
      .withBody(body)
      .withPathParam("user_id", userId)
      .withHeaderParam("token", token)
      .withSuccessResponse[Unit](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : UserList (successful operation)
   * 
   * @param token 
   * @param page 
   */
  def usersGet(token: String, page: Option[Int] = None): ApiRequest[UserList] =
    ApiRequest[UserList](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/users", "application/json")
      .withQueryParam("page", page)
      .withHeaderParam("token", token)
      .withSuccessResponse[UserList](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (successful operation)
   *   code 401 :  (Email or password is wrong)
   *   code 404 :  (Account does not exist)
   * 
   * @param account The user name for login
   * @param password The password for login in clear text
   */
  def usersLoginPost(account: String, password: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/users/login", "application/json")
      .withQueryParam("account", account)
      .withQueryParam("password", password)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](404)
        /**
   * 
   * 
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
   * @param token 
   */
  def usersLogoutPost(token: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/users/logout", "application/json")
      .withHeaderParam("token", token)
      .withDefaultSuccessResponse[Unit]
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : User (successful operation)
   *   code 400 :  (An error while decoding token.)
   * 
   * @param token 
   */
  def usersMeGet(token: String): ApiRequest[User] =
    ApiRequest[User](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/users/me", "application/json")
      .withHeaderParam("token", token)
      .withSuccessResponse[User](200)
      .withErrorResponse[Unit](400)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : UserData (successful operation)
   *   code 400 :  (An error while decoding token.)
   * 
   * @param token 
   */
  def usersMePost(token: String): ApiRequest[UserData] =
    ApiRequest[UserData](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/users/me", "application/json")
      .withHeaderParam("token", token)
      .withSuccessResponse[UserData](200)
      .withErrorResponse[Unit](400)
        /**
   * 
   * 
   * Expected answers:
   *   code 201 : InsertReturn (successful operation)
   * 
   * @param token 
   * @param body 
   */
  def usersPost(token: String, body: Option[UserRequest] = None): ApiRequest[InsertReturn] =
    ApiRequest[InsertReturn](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/users", "application/json")
      .withBody(body)
      .withHeaderParam("token", token)
      .withSuccessResponse[InsertReturn](201)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (successful operation)
   * 
   * @param token 
   * @param userId 
   * @param body 
   */
  def usersUserIdChangePasswordPost(token: String, userId: Int, body: Option[UserChangePasswordRequest] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/users/{user_id}/change_password", "application/json")
      .withBody(body)
      .withPathParam("user_id", userId)
      .withHeaderParam("token", token)
      .withSuccessResponse[Unit](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : UserData (successful operation)
   *   code 400 :  (An error while decoding token.)
   * 
   * @param token 
   * @param userId 
   */
  def usersUserIdPost(token: String, userId: Int): ApiRequest[UserData] =
    ApiRequest[UserData](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/users/{user_id}", "application/json")
      .withPathParam("user_id", userId)
      .withHeaderParam("token", token)
      .withSuccessResponse[UserData](200)
      .withErrorResponse[Unit](400)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (successful operation)
   * 
   * @param token 
   * @param userId 
   */
  def usersUserIdResetGet(token: String, userId: Int): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/users/{user_id}/reset", "application/json")
      .withPathParam("user_id", userId)
      .withHeaderParam("token", token)
      .withSuccessResponse[Unit](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 201 :  (successful operation)
   *   code 400 :  (no picture)
   * 
   * @param token 
   * @param userId 
   * @param body 
   */
  def usersUserIdUploadPost(token: String, userId: Int, body: Option[UploadProfilePicRequest] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/goodspeed666/maan_customer/1.0.0", "/users/{user_id}/upload", "application/json")
      .withBody(body)
      .withPathParam("user_id", userId)
      .withHeaderParam("token", token)
      .withSuccessResponse[Unit](201)
      .withErrorResponse[Unit](400)
      

}

