object Solution {
  def maximumWealth(accounts: Array[Array[Int]]): Int = {
    accounts.map(_.foldLeft(0)(_ + _)).max
  }
}
