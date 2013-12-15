package k2b6s9j.Seasons

import java.util.logging.{Level, Logger}
import cpw.mods.fml.common.FMLLog

object Log {

  def log: Logger = Logger.getLogger("Seasons")

  def info(msg:String) {
    log.setParent(FMLLog.getLogger)
    log.log(Level.INFO, msg)
  }

  def warning(msg:String) {
    log.setParent(FMLLog.getLogger)
    log.log(Level.WARNING, msg)
  }

  def severe(msg:String) {
    log.setParent(FMLLog.getLogger)
    log.log(Level.SEVERE, msg)
  }

  def getLogger()  {
    log.setParent(FMLLog.getLogger)
    log
  }

}