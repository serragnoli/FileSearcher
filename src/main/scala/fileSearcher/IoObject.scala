package fileSearcher

import java.io.File

trait IoObject {
  val file: File
  val name: String = file.getName
}

case class FileObject(file: File) extends IoObject

case class DirectoryObject(file: File) extends IoObject {
  def children(): List[IoObject with Product with Serializable] =
    try
      file.listFiles().toList map (file => FileConverter convertToIoObject file)
    catch {
      case _: NullPointerException => List()
    }

}
