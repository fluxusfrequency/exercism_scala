class PhoneNumber(digits: String) {

  def number:String = {
    if (cleanNumber.length == 11 && cleanNumber(0) == '1') {
      cleanNumber.drop(1)
    } else if (cleanNumber.length != 10) {
      "0000000000"
    } else {
      cleanNumber
    }
  }

  def areaCode: String = {
    number.take(3)
  }

  def prefix: String = {
    number.drop(3).dropRight(4)
  }

  def suffix: String = {
    number.drop(6)
  }

  override def toString: String = {
    s"($areaCode) $prefix-$suffix"
  }

  private def cleanNumber:String = { digits.replaceAll( "\\W", "" ) }

}