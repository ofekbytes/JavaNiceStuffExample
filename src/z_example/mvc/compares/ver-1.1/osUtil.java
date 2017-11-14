package compares;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class osUtil 
{
	private static int count=0;
	private String userId = "";
	private String osName = "";
	private String fullName = "";
	
	
	public String getOsName() {
		return osName;
	}


	public String getUserId() {
		return userId;
	}

	
	
	public void setInformation() 
	{
 		
		String osName = System.getProperty( "os.name" ).toLowerCase();
		String className = null;
		String methodName = "getUsername";

		String fullName = System.getProperty("os.getSimpleName");
		
		if( osName.contains( "windows" ) ){
		    className = "com.sun.security.auth.module.NTSystem";
		    methodName = "getName";
		    
		}
		else if( osName.contains( "linux" ) ){
		    className = "com.sun.security.auth.module.UnixSystem";
		}
		else if( osName.contains( "solaris" ) || osName.contains( "sunos" ) ){
		    className = "com.sun.security.auth.module.SolarisSystem";
		}

		if( className != null )
		{
			
		    try {
				Class<?> c = Class.forName( className );
				Method method = c.getDeclaredMethod( methodName );
				Object o = c.newInstance();
				//System.out.println( method.invoke( o ) );
				
				//
				//attributes.
				this.osName = osName;
				this.userId =  (String) method.invoke( o );				
				//
				//
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			    
		}
		
		
	}

	
	
	public static boolean getCount() 
	{
		System.out.println(" count == " + count);
		if (count == 2)
			return true;
		else
			return false;
	}
	
	

	/***
	 * IsfileExist()
	 * @param StFileName - file name
	 */
	private void IsfileExist(String StFileName) 
	{
        //count exist files.
		if (this.count == 2)
			this.count = 0;

		
		Path file = Paths.get(StFileName);
		boolean isRegularExecutableFile = Files.isRegularFile(file) &
		         Files.isReadable(file) & Files.isExecutable(file);
		
		if (isRegularExecutableFile == true)
		{
			System.out.println(StFileName + " >>>  File Exist >>> OK");
			this.count++;
		}
		else
		{
			System.out.println(StFileName + " >>> File Not-Exist >>> NOT-OK");
		}

	}
	
	
	
 
	/*
	 * osFiles - constructor 
	 * - get 2 String files.
	 */
//	public osUtil (String file1, String file2) 
//	{
//		IsfileExist(file1);
//		IsfileExist(file2);
//	}

	
	
	
	
	public osUtil() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
