package fileSearcher

trait IoObject {
  val name: String
}

class FileObject(val name: String) extends IoObject {}
class DirectoryObject(val name: String) extends IoObject {}
