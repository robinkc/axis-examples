package in.kcrob.scalacommon

import org.slf4j.{Logger, LoggerFactory}

/**
  * Created by kcrob.in on 29/08/17.
  */
trait Logging {
  private val _LOG = LoggerFactory.getLogger(getClass)
  def LOG: Logger = _LOG
}
