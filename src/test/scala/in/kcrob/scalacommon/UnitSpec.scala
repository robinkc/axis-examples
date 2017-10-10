package in.kcrob.scalacommon

import org.scalatest._

/**
  * Created by kcrob.in on 28/08/17.
  */
abstract class UnitSpec
  extends FunSpec
    with Matchers
    with OptionValues
    with Inside
    with Inspectors
    with BeforeAndAfterAll
    with Logging
