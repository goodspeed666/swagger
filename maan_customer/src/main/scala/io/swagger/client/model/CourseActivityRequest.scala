/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class CourseActivityRequest (
  courseId: Option[Int],
  formId: Option[String],
  /* Y-m-d H:i */
  startTime: Option[String],
  /* Y-m-d H:i */
  endTime: Option[String],
  appliedPeople: Option[Seq[CourseActivityRequestAppliedPeople]],
  /* 預定時間結束 */
  onTime: Option[Boolean]
) extends ApiModel


