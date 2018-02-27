/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class CourseDataResponse (
  courseId: Option[Int],
  formId: CourseListInnerFormId,
  courseName: CourseListInnerCourseName,
  classTime: String,
  duration: String,
  /* yyyy-mm-dd H:i */
  startTime: String,
  /* yyyy-mm-dd H:i */
  endTime: String,
  quota: Int,
  teacher: Option[String],
  location: String,
  isExtra: Option[Boolean],
  condition1: Option[String],
  condition2: Option[Int],
  status: Boolean
) extends ApiModel


