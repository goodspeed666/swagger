/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class CourseActivityResponse (
  courseId: Option[Int],
  formId: Option[CourseListInnerFormId],
  courseName: Option[CourseListInnerCourseName],
  classTime: Option[String],
  duration: Option[String],
  /* yyyy-mm-dd H:i */
  startTime: Option[String],
  /* yyyy-mm-dd H:i */
  endTime: Option[String],
  quota: Option[Int],
  appliedPeople: Option[CourseRollcallResponse],
  photos: Option[Seq[CourseActivityResponsePhotos]],
  /* 預定時間結束 */
  onTime: Option[Boolean]
) extends ApiModel


