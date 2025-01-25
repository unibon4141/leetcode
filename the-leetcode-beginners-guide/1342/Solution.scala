object Solution {
  def numberOfSteps(num: Int): Int = {
    def step(num: Int, cnt: Int): Int = {
      num match {
        case 0                 => cnt
        case _ if num % 2 == 0 => step(num / 2, cnt + 1)
        case _ if num % 2 == 1 => step(num - 1, cnt + 1)
      }
    }
    step(num, 0)

  }
//   println(numberOfSteps(14))
}
