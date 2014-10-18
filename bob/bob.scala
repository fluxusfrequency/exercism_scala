class Bob {
  def hey(phrase: String): String = phrase match {
    case Yelling() => "Woah, chill out!"
    case Inquiring() => "Sure."
    case Ignoring() => "Fine. Be that way!"
    case _ => "Whatever."
  }

  case object Yelling {
    def unapply(phrase: String) = {
      phrase.matches(".*[A-Z].*") && phrase == phrase.toUpperCase
    }
  }

  case object Inquiring {
    def unapply(phrase: String) = {
      phrase.endsWith("?")
    }
  }

  case object Ignoring {
    def unapply(phrase: String) = {
      phrase.trim.isEmpty
    }
  }
}