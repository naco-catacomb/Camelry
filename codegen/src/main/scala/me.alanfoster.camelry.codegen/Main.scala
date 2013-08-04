package me.alanfoster.camelry.codegen

import org.slf4j.{LoggerFactory, Logger}

/**
 * The main class for external triggering of code generation.
 */
object Main {
  private val logger: Logger = LoggerFactory.getLogger(getClass)

  def main(args: Array[String]) {
    logger.info("Starting Code Generation")

    ScalateGenerator
      .generateFiles(
        "org.apache.camel.model",
        "org.apache.camel.core.xml"
      )

    logger.info("Completed code generation")
  }
}