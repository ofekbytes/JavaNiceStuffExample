package z_hd_old;

import java.io.File;



public class erase
{
	private   String[]   StStrSplit;    //target - array
	private   String     delimiter = ","; //delimiter for breaking the string
	private   String     tmpFile   = null;

	public erase (String stFileName)
	{

		//check if <stFileName> is empty/null.
		if (stFileName == null)
			return;

		StStrSplit = stFileName.split(delimiter);

		for (int i=0 ; i< StStrSplit.length;i++)
		{
			tmpFile = "./Tmp_OutPut_" + i + ".nof";
			File f = new File(tmpFile);

			// Make sure the file or directory exists and isn't write protected
			if (!f.exists())
			{
				continue;
			}
			/*         throw new IllegalArgumentException(
             "Delete: no such file or directory: " + tmpFile);
			 */
			if (!f.canWrite())
			{
				continue;
			}

			/*         throw new IllegalArgumentException("Delete: write protected: "
             + tmpFile);
			 */
			// If it is a directory, make sure it is empty
			/*       if (f.isDirectory()) {
         String[] files = f.list();
         if (files.length > 0)
           throw new IllegalArgumentException(
               "Delete: directory not empty: " + tmpFile);
			 */

			// Attempt to delete it
			boolean success = f.delete();

			if (!success)
			{
				log l = new log("event",tmpFile,"failed to erase file");
			}

			if (success)
			{
				log l = new log("event",tmpFile,"erase file was successful");
			}

		}
	}
}
