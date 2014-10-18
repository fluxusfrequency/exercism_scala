class Phrase(saying: String) {
  def wordCount = grouped.mapValues(_.size)

  private def grouped = phrases.groupBy(p => p)

  private def phrases = cleaned.split("\\s+")

  private def cleaned = saying.toLowerCase.replaceAll("[^a-zA-Z0-9\'\\s]+", " ")
}
