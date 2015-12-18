import scala.io.Source._

object MethodKeys {
  def main(args: Array[String]) {
    val packageName = args.headOption.getOrElse("com.commercetools.pspadapter.payone.domain.ctp.paymentmethods")

    val lines = fromFile("Method-Keys.md").getLines
    
    val methodDefinitions = lines
      .filter(_.count('|' ==) == 4)
      .filterNot(_.startsWith("| Key"))
      .filterNot(_.startsWith("|---"))
      .filterNot(_.startsWith("|  |"))
      .map(_.split("\\|").map(_.trim).flatMap(s => if(s.isEmpty) List() else s :: List()))
      .map(_.toList)
      .map(m => toMethod(m.head, m.tail))
      .mkString

    val file = s"""package $packageName;

/**
 * This file is generated from Method-Keys.md. Do not edit!
 * See https://github.com/nkuehn/payment-integration-specifications/tree/scala-tools
 */
public class MethodKeys {
$methodDefinitions
}
"""
    
    println(file)
  }

  def toMethod(key: String, comments: List[String]): String = {
    val comment = toComment(comments)
    val keyEscaped = key.replace("-", "_")
    s"""$comment
    public static final String $keyEscaped = "$key";
    """
  }

  def toComment(comments: List[String]): String = comments match {
    case List(comment) => s"""
    /**
     * $comment
     */"""
    case List(line1, line2) => s"""
    /**
     * $line1
     * $line2
     */"""
    case _ => ""
  }
}
