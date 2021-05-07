import org.scalatest.flatspec.AnyFlatSpec

class fibtest extends AnyFlatSpec{

  it should "match" in {
    val obj = new Que2
    assert(obj.fib(6) == 13)
  }

}
//11235813