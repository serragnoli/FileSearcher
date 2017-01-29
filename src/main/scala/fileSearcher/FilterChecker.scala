package fileSearcher

class FilterChecker(filter: String) {

  def matches(content: String): Boolean = content contains filter

  def findMatchedFiles(fileObjects: List[IoObject]): List[IoObject] =
    for (fileObject <- fileObjects
         if fileObject.isInstanceOf[FileObject]
         if matches(fileObject.name)
    ) yield fileObject
}

object FilterChecker {
  def apply(filter: String): FilterChecker = new FilterChecker(filter)
}
