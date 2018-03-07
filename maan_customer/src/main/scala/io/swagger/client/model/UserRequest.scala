/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class UserRequest (
  account: String,
  password: String,
  name: String,
  email: String,
  dept: Option[String],
  role: Int,
  organization: Option[Int],
  branch: Int,
  status: Boolean,
  employeeId: Option[String]
) extends ApiModel


