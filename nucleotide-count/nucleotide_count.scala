class DNA(strand: String) {
  private val allNucleotides = Set('A','T','C','G', 'U')
  private val dnaNucleotides = allNucleotides - 'U'

  require(strand.toCharArray forall (dnaNucleotides contains _), "Please use a valid DNA strand.")

  def count(nucleotide: Char): Int = {
    require(allNucleotides contains nucleotide, "Bad argument in count.")
    nucleotideCounts(nucleotide)
  }

  lazy val nucleotideCounts =
    Map(
      'A' -> strand.count(_ == 'A'),
      'T' -> strand.count(_ == 'T'),
      'C' -> strand.count(_ == 'C'),
      'G' -> strand.count(_ == 'G')
    ).withDefaultValue(0)

}
