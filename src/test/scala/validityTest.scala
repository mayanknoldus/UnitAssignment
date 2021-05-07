import org.scalatest.flatspec.AnyFlatSpec

class validityTest extends AnyFlatSpec {

  "validityTest" should "verify if the email is valid or not" in {

    assert(emailValidity.isValid("MAy.199@gmail.com") == true)

  }

}
