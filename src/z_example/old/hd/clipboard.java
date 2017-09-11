package z_example.old.hd;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;



public final class clipboard implements ClipboardOwner 
{	
    //
	// Do Nothing
	public void lostOwnership( Clipboard aClipboard, Transferable aContents) 
	{
		//do nothing
	}
	
	
	//
	//Set ClipBoard Data.
	public void setClipBoard( String aString )
	{
		StringSelection stringSelection = new StringSelection( aString );
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents( stringSelection, this );
	}

	
	//
	//Get ClipBoard Data.
	public String getClipBoard() 
	{
		String result = "";
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable contents = clipboard.getContents(null);
		boolean hasTransferableText = (contents != null) && contents.isDataFlavorSupported(DataFlavor.stringFlavor);
			
		if ( hasTransferableText ) 
		{
			try 
			{
				result = (String)contents.getTransferData(DataFlavor.stringFlavor);
			}
			catch (UnsupportedFlavorException ex)
			{
				//highly unlikely since we are using a standard DataFlavor
				System.out.println(ex);
				ex.printStackTrace();
			}
			catch (IOException ex) 
			{
				System.out.println(ex);
				ex.printStackTrace();
			}
		}
		return result;
	}
}
	
/*	public static void main (String...  aArguments )
	{
		TextTransfer textTransfer = new TextTransfer();

		//display what is currently on the clipboard
		System.out.println("Clipboard contains:" + textTransfer.getClipBoard() );

		//change the contents and then re-display
		textTransfer.setClipBoard("Nothing Else Matter");
		System.out.println("Clipboard contains:" + textTransfer.getClipBoard() );
	}*/

