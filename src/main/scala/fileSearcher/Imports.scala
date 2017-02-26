package fileSearcher

import importables.{Importable1, Importable2}

class Imports {

  val myImp = new Importable1
  val myOutImp2 = new Importable2

  def myImp1 = myImp.fromImportable1

  def testImport = {
    import importables.Importable2

    val myImp2 = new Importable2
    print(myImp2.fromImportable2)
  }

}
