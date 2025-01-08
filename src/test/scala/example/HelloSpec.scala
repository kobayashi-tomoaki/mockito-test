package example

import org.scalatest._
import org.scalatest.matchers.must.Matchers
import org.scalatestplus.mockito.MockitoSugar.mock
import org.mockito.Mockito.when

class MockitoTest extends flatspec.AnyFlatSpec with Matchers {
  case class A(value: Int)

  def testA(a: A): Int = {
    a match {
      case A(100) => 100
      case _ => 0
    } 
  }

  // OK
  "A mock" should "just mock" in {
    val a = mock[A]
    when(a.value).thenReturn(1)

    assert(a.value == 1)
  }

  // NG in Scala 3
  "A mock" should "stubbing for pattern matching" in {
    val a = mock[A]
    when(a.value).thenReturn(100)

    assert(testA(a) == 100)
  }
}
