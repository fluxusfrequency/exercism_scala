case class Anagram(word: String) {
  def matches (args: Seq[String]): Seq[String] = {
    args.filter(compare).filterNot(isIdentical).distinct
  }

  private def compare(otherWord: String): Boolean = {
    word.toLowerCase.sorted == otherWord.toLowerCase.sorted
  }

  private def isIdentical(otherWord: String) =
    otherWord.toLowerCase == word.toLowerCase
}