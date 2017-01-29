package fileSearcher

import java.io.File

case class Matcher(filter: String, rootLocation: String) {
  val rootIoObject: IoObject = FileConverter.convertToIoObject(new File(rootLocation))

  def execute(): List[String] = {
    val matchedFiles = rootIoObject match {
      case file: FileObject if FilterChecker(filter) matches file.name => List(file)
      case directory: DirectoryObject => ???
      case _ => List()
    }

    matchedFiles map (ioObject => ioObject.name)
  }
}
