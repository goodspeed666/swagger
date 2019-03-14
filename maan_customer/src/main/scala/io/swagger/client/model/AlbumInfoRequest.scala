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

case class AlbumInfoRequest (
  id: Option[Int] = None,
  name: Option[String] = None,
  description: Option[String] = None,
  actDate: Option[String] = None,
  branch: Option[Int] = None,
  photos: Option[Seq[AlbumInfoRequestPhotos]] = None
) extends ApiModel


