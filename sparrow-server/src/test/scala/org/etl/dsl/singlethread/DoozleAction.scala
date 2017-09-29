package org.etl.dsl.singlethread


import org.etl.server.ProcessAST

import org.junit.Test
import org.etl.server.ProcessExecutor
import java.nio.charset.StandardCharsets._
import java.nio.file.{Files, Paths}

class DoozleTest {
  
  @Test def runProcess()={
    
    val instanceName = "test.doozle.process#1"
    val json = new String(Files.readAllBytes(Paths.get(this.getClass.getResource("sample.json").getPath)), UTF_8)
    val runtimeContext = ProcessAST.loadProcessAST(instanceName,json)
    try {
      
      val runtime = ProcessExecutor.execute("org.etl.process.onethread", runtimeContext)
      
    } catch {
      case ex: Throwable => {
        ex.printStackTrace()
      }
    } finally {
      
    }
  }
  
 /* @Test def relativePath {
    System.currentTimeMillis()
    val url = this.getClass.getClassLoader.getResource("auth/Dhuruva-BMS-fa750e3a8102.p12")
    println(url)
  }*/
}