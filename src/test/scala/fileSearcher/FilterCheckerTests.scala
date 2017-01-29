package fileSearcher

import java.io.File

import org.scalatest.FlatSpec

class FilterCheckerTests extends FlatSpec {
  "FilterChecker passed a list where one file matches the filter" should "return a list with that file" in {
    val matchingFile = FileObject(new File("match"))
    val listOfFiles = List(FileObject(new File("random")), matchingFile)
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfFiles

    assert(matchedFiles == List(matchingFile))
  }

  "FilterChecker passed a list with q directory that matches the filter" should "should not return the directory" in {
    val listOfIoObjects = List(FileObject(new File("random")), DirectoryObject(new File("match")))
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfIoObjects

    assert(matchedFiles.isEmpty)
  }
}
