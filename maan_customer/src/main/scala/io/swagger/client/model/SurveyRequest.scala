/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class SurveyRequest (
  `type`: Int,
  title: String,
  startTime: String,
  during: Int,
  target: Int,
  targetList: Option[Seq[CourseActivityRequestAppliedPeople]],
  targetDueStart: Option[String],
  targetDueEnd: Option[String],
  notify: Option[Boolean],
  status: Option[Boolean],
  header: Option[String],
  footer: Option[String],
  questions: Seq[SurveyRequestQuestions]
) extends ApiModel


