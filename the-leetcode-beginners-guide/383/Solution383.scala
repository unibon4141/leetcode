object Solution383 extends App {
  def canConstruct(ransomNote: String, magazine: String): Boolean = {
    def strTrim(ransomNote: String, ransomTmp: String, magazine: String, targetIndex: Int): Boolean = {
      (ransomNote == ransomTmp, magazine.length) match {
        case (true, _) => true
        case (_, 0)    => false
        case _ =>
          val index = magazine.indexOf(ransomNote(targetIndex))
          if (index >= 0) {
            strTrim(ransomNote, ransomTmp :+ ransomNote(targetIndex), magazine.patch(index, "", 1), targetIndex + 1)
          } else
            false
      }

    }

    strTrim(ransomNote, "", magazine, 0)

  }
}
