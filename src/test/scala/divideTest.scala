import org.scalatest.flatspec.AnyFlatSpec

class divideTest extends AnyFlatSpec{

  it should "match" in {
    val obj = new Que2
    assert(obj.divide(10,2) == 5)
  }

}
