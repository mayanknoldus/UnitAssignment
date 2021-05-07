class Que2 extends Fibonacci {

  def divide(x : Int,y : Int): Int = x/y
}

object myclass {
  def main(args: Array[String]): Unit = {

  val obj = new Que2
  obj.fib(6)
  obj.divide(10,2)
  }
}
