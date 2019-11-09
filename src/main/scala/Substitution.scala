object Main extends App{
  def Substitution (n: Int, count: Int): List[IndexedSeq[Int]] = {
    (1 to n).combinations(count).toList
  }
  println(Substitution(scala.io.StdIn.readInt(), scala.io.StdIn.readInt()))
}