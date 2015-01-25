
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  *   
 */
@JSName("adsk.fusion.ExportManager")
trait ExportManager extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates an FusionArchiveExportOptions object that's used to export a design in Fusion archive format. Creation of the FusionArchiveExportOptions object does not perform the export. You must pass this object to the ExportManager.execute method to perform the export. The FusionArchiveExportOptions supports any available options when exporting to Fusion archive format.
  */
  def createFusionArchiveExportOptions(filename: String): FusionArchiveExportOptions = js.native
  /**
  * Creates an IGESExportOptions object that's used to export a design in IGES format. Creation of the IGESExportOptions object does not perform the export. You must pass this object to the ExportManager.execute method to perform the export. The IGESExportOptions supports any available options when exporting to IGES format.
  */
  def createIGESExportOptions(filename: String): IGESExportOptions = js.native
  /**
  * Creates an SATExportOptions object that's used to export a design in SAT format. Creation of the SATExportOptions object does not perform the export. You must pass this object to the ExportManager.execute method to perform the export. The SATExportOptions supports any available options when exporting to SAT format.
  */
  def createSATExportOptions(filename: String): SATExportOptions = js.native
  /**
  * Creates an SMTExportOptions object that's used to export a design in SMT format. Creation of the SMTExportOptions object does not perform the export. You must pass this object to the ExportManager.execute method to perform the export. The SMTExportOptions supports any available options when exporting to SMT format.
  */
  def createSMTExportOptions(filename: String): SMTExportOptions = js.native
  /**
  * Creates an STEPExportOptions object that's used to export a design in STEP format. Creation of the STEPExportOptions object does not perform the export. You must pass this object to the ExportManager.execute method to perform the export. The STEPExportOptions supports any available options when exporting to STEP format.
  */
  def createSTEPExportOptions(filename: String): STEPExportOptions = js.native
  /**
  * Executes the export operation to create the file in the format specified by the input ExportOptions object.
  */
  def execute(exportOptions: ExportOptions): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  *   
 */
@JSName("adsk.fusion.ExportManager")
object ExportManager extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Creates an FusionArchiveExportOptions object that's used to export a design in Fusion archive format. Creation of the FusionArchiveExportOptions object does not perform the export. You must pass this object to the ExportManager.execute method to perform the export. The FusionArchiveExportOptions supports any available options when exporting to Fusion archive format.
  */
  def createFusionArchiveExportOptions(filename: String): FusionArchiveExportOptions = js.native
  /**
  * Creates an IGESExportOptions object that's used to export a design in IGES format. Creation of the IGESExportOptions object does not perform the export. You must pass this object to the ExportManager.execute method to perform the export. The IGESExportOptions supports any available options when exporting to IGES format.
  */
  def createIGESExportOptions(filename: String): IGESExportOptions = js.native
  /**
  * Creates an SATExportOptions object that's used to export a design in SAT format. Creation of the SATExportOptions object does not perform the export. You must pass this object to the ExportManager.execute method to perform the export. The SATExportOptions supports any available options when exporting to SAT format.
  */
  def createSATExportOptions(filename: String): SATExportOptions = js.native
  /**
  * Creates an SMTExportOptions object that's used to export a design in SMT format. Creation of the SMTExportOptions object does not perform the export. You must pass this object to the ExportManager.execute method to perform the export. The SMTExportOptions supports any available options when exporting to SMT format.
  */
  def createSMTExportOptions(filename: String): SMTExportOptions = js.native
  /**
  * Creates an STEPExportOptions object that's used to export a design in STEP format. Creation of the STEPExportOptions object does not perform the export. You must pass this object to the ExportManager.execute method to perform the export. The STEPExportOptions supports any available options when exporting to STEP format.
  */
  def createSTEPExportOptions(filename: String): STEPExportOptions = js.native
  /**
  * Executes the export operation to create the file in the format specified by the input ExportOptions object.
  */
  def execute(exportOptions: ExportOptions): Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
// no utilities
