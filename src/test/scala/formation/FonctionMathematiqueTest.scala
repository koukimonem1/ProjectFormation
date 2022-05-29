package formation

import org.scalatest.{FlatSpec, Matchers}

class FonctionMathematiqueTest extends FlatSpec with Matchers{

  "chaque multiplication par 0 " should "égale à 0" in {
    FonctionMathematique.mult(0, 5) shouldBe 0
    FonctionMathematique.mult(3, 0) shouldBe 0
  }
    "chaque multiplication par 1 " should "égale au meme nombre" in {
      FonctionMathematique.mult(1, 5) shouldBe 5
    }
      "la multuplication de x et y  " should "égale à x*y" in {
        FonctionMathematique.mult(3 ,5) shouldBe 15
  }

}
