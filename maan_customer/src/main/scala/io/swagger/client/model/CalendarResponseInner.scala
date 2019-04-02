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

case class CalendarResponseInner (
  id: Option[Int] = None,
  theDate: Option[String] = None,
  /* 上午 or AM 09:00~10:00 */
  timePeriod: Option[String] = None,
  /* 1:課程, 2:行程 */
  `type`: Option[Int] = None,
  /* 課程 or 行程名稱 */
  name: Option[String] = None,
  /* 講師 or 主事者 */
  teacher: Option[String] = None,
  /* 上課地點 */
  location: Option[String] = None,
  color: Option[String] = None,
  bgcolor: Option[String] = None
) extends ApiModel


