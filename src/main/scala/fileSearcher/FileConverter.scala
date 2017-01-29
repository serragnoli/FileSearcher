package fileSearcher

import java.io.File

object FileConverter {
  def convertToIoObject(file: File) = {
    if (file.isDirectory) DirectoryObject(file) else FileObject(file)
  }
}
