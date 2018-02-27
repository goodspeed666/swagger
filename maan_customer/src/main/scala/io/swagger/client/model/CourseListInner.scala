/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class CourseListInner (
  id: Option[Int],
  formId: Option[CourseListInnerFormId],
  courseName: Option[CourseListInnerCourseName],
  classTime: Option[String],
  quota: Option[Int],
  applied: Option[Int]
) extends ApiModel


