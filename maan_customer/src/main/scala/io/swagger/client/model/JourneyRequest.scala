/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class JourneyRequest (
  startTime: String,
  endTime: Option[String],
  period: CourseListInnerCourseName,
  repeat: Option[Int],
  repeatPeriod: Option[Int],
  repeatPeriodUnit: Option[String],
  repeatDay: Option[Int],
  repeatTimes: Option[Int],
  name: String,
  keyman: Option[String],
  temporarily: Option[Boolean],
  cancel: Option[Boolean],
  branch: Option[Int]
) extends ApiModel


