class School {
  var db = scala.collection.mutable.Map[Int, Seq[String]]()

  def sorted: scala.collection.mutable.Map[Int, Seq[String]] = {
    return db
  }

  def add(student: String, grade: Int) {
    db = db.updated(grade :+ student)
  }
  def grade(grade: Int) {}
}