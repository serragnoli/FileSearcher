package fileSearcher

import java.io.File

trait IoObject {
  val file: File
  val name: String = file.getName
}

case class FileObject(file: File) extends IoObject

case class DirectoryObject(file: File) extends IoObject
