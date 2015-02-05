
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides access to a file dialog. A file dialog can be used to prompt the user for file names to open or save to. 
 */
@JSName("adsk.core.FileDialog")
class FileDialog extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the filename specified by the user in the dialog. This property is used after the ShowOpen or ShowSave methods have been called to retrieve the filename specified by the user. The file name includes both the file path and the extension. If ShowOpen was used and IsMultiSelectEnabled is true, then this property will only display the first filename selected and the Filenames property should be used instead to retrieved the full list. Is ShowSave was used, then only a single file name is ever returned.
  */
  val filename: String = js.native
  /**
  * Gets the filenames specified by the user in the dialog. This property is used after the ShowOpen or ShowSave methods have been called to retrieve the filenames specified by the user. Each file name includes both the file path and the extension. If ShowOpen is used and IsMultiSelectEnabled is true, the user is able to select more than one file. This property returns all of the files that were selected. If ShowSave is used or IsMultiSelectEnabled is false then this array will contain the single file name.
  */
  val filenames: String = js.native
  /**
  * Gets or sets the current file name filter string, which determines the choices that appear in the "Save as file type" or "Files of type" box in the dialog box. For each filtering option, the filter string contains a description of the filter, followed by the vertical bar (|) and the filter pattern. The strings for different filtering options are separated by the vertical bar. The following is an example of a filter string: Text files (*.txt);;All files (*.*) You can add several filter patterns to a filter by separating the file types with semicolons, for example: Image Files (*.BMP;*.JPG;*.GIF);;All files (*.*)
  */
  var filter: String = js.native
  /**
  * Gets or sets the index of the filter currently selected in the file dialog box. Use the FilterIndex property to set which filtering option is shown first to the user. You can also use the value of FilterIndex after showing the file dialog to perform special file operations depending upon the filter chosen. The first item in the filter list is index 0.
  */
  var filterIndex: Integer = js.native
  /**
  * Gets or sets the initial directory displayed by the file dialog box.
  */
  var initialDirectory: String = js.native
  /**
  * Gets or sets a value indicating whether the dialog box allows multiple files to be selected.
  */
  var isMultiSelectEnabled: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Displays a modal open dialog, allowing the user to select one or more files. The return value can be used to determine if the dialog was cancelled without selecting a file. The Filename and Filenames properties can be used to get the selected files.
  */
  def showOpen(): DialogResults = js.native
  /**
  * Displays a modal save dialog, allowing the user to specify a file. The return value can be used to determine if the dialog was cancelled without selecting a file. The Filename and Filenames properties can be used to get the selected files.
  */
  def showSave(): DialogResults = js.native
  /**
  * Gets or sets the title displayed on the dialog.
  */
  var title: String = js.native
}
/** 
  * Provides access to a file dialog. A file dialog can be used to prompt the user for file names to open or save to. 
 */
@JSName("adsk.core.FileDialog")
object FileDialog extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Gets the filename specified by the user in the dialog. This property is used after the ShowOpen or ShowSave methods have been called to retrieve the filename specified by the user. The file name includes both the file path and the extension. If ShowOpen was used and IsMultiSelectEnabled is true, then this property will only display the first filename selected and the Filenames property should be used instead to retrieved the full list. Is ShowSave was used, then only a single file name is ever returned.
  */
  val filename: String = js.native
  /**
  * Gets the filenames specified by the user in the dialog. This property is used after the ShowOpen or ShowSave methods have been called to retrieve the filenames specified by the user. Each file name includes both the file path and the extension. If ShowOpen is used and IsMultiSelectEnabled is true, the user is able to select more than one file. This property returns all of the files that were selected. If ShowSave is used or IsMultiSelectEnabled is false then this array will contain the single file name.
  */
  val filenames: String = js.native
  /**
  * Gets or sets the current file name filter string, which determines the choices that appear in the "Save as file type" or "Files of type" box in the dialog box. For each filtering option, the filter string contains a description of the filter, followed by the vertical bar (|) and the filter pattern. The strings for different filtering options are separated by the vertical bar. The following is an example of a filter string: Text files (*.txt);;All files (*.*) You can add several filter patterns to a filter by separating the file types with semicolons, for example: Image Files (*.BMP;*.JPG;*.GIF);;All files (*.*)
  */
  var filter: String = js.native
  /**
  * Gets or sets the index of the filter currently selected in the file dialog box. Use the FilterIndex property to set which filtering option is shown first to the user. You can also use the value of FilterIndex after showing the file dialog to perform special file operations depending upon the filter chosen. The first item in the filter list is index 0.
  */
  var filterIndex: Integer = js.native
  /**
  * Gets or sets the initial directory displayed by the file dialog box.
  */
  var initialDirectory: String = js.native
  /**
  * Gets or sets a value indicating whether the dialog box allows multiple files to be selected.
  */
  var isMultiSelectEnabled: Boolean = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Displays a modal open dialog, allowing the user to select one or more files. The return value can be used to determine if the dialog was cancelled without selecting a file. The Filename and Filenames properties can be used to get the selected files.
  */
  def showOpen(): DialogResults = js.native
  /**
  * Displays a modal save dialog, allowing the user to specify a file. The return value can be used to determine if the dialog was cancelled without selecting a file. The Filename and Filenames properties can be used to get the selected files.
  */
  def showSave(): DialogResults = js.native
  /**
  * Gets or sets the title displayed on the dialog.
  */
  var title: String = js.native
}

  object FileDialogUtilities {
    // no toSeq

  }
       
