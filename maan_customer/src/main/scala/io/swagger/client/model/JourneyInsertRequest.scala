/**
 * Maan Customer API for backend
 * define ok 代表已定義好，incomplete 代表尚未實作。 如果都沒有標注，代表該 api 已可使用。
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class JourneyInsertRequest (
  startTime: String,
  endTime: Option[String] = None,
  period: Int,
  /* 行程名稱 */
  name: String,
  /* 講師/負責人 */
  keyman: Option[String] = None,
  /* 地點 */
  location: Option[String] = None,
  branch: Option[Int] = None
) extends ApiModel


