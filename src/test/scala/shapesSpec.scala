import org.specs2.mutable.Specification
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

// Create tests for classes Square and Circle
@RunWith(classOf[JUnitRunner])
class ShapesSpec extends Specification {

  "Square" should {
    "have correct area" in {
      Square(5).area mustEqual 25
    }
    "have correct perimeter" in {
      Square(5).perimeter mustEqual 20
    }
  }

  "Circle" should {
    "have correct area" in {
      Circle(3).area mustEqual 28.274333882308138
    }
    "have correct perimeter" in {
      Circle(3).perimeter mustEqual 18.84955592153876
    }
  }
}


