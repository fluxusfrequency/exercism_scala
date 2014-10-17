class DNA(strand: String) {
  private val dnaNucleotides = Set('A','T','C','G')
  private val allNucleotides = dnaNucleotides + 'U'

  require(strand forall (dnaNucleotides contains _), "Please use a valid DNA strand.")

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
