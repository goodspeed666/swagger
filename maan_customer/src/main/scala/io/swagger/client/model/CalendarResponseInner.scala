/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class CalendarResponseInner (
  id: Option[Int],
  theDate: Option[String],
  timePeriod: Option[String],
  `type`: Option[Int],
  name: Option[String],
  teacher: Option[String],
  location: Option[String],
  temporarily: Option[Boolean],
  color: Option[String],
  bgcolor: Option[String]
) extends ApiModel


