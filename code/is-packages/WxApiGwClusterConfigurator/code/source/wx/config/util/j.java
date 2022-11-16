package wx.config.util;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.wm.app.b2b.server.PackageManager;
import com.wm.app.b2b.server.cluster.CMException;
import com.wm.app.b2b.server.cluster.ClusterManager;
import com.wm.util.EncUtil;
import com.wm.app.log.impl.sc.LevelTranslator;
import com.wm.lang.flow.IDataWmPathProcessor;
import com.wm.util.JournalLogger;
import com.entrust.toolkit.util.ByteArray;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.lang.reflect.*;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.*;
// --- <<IS-END-IMPORTS>> ---

public final class j

{
	// ---( internal utility methods )---

	final static j _instance = new j();

	static j _newInstance() { return new j(); }

	static j _cast(Object o) { return (j)o; }

	// ---( server methods )---




	public static final void fileExists (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(fileExists)>> ---
		// @sigtype java 3.5
		// [i] field:0:required fullPathFileName
		// [o] field:0:required bExists
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	fullPathFileName = IDataUtil.getString( pipelineCursor, "fullPathFileName" );
		pipelineCursor.destroy();
		
		boolean bExists = false;
		
		if(null != fullPathFileName && fullPathFileName.length()>0){
		    File f = new File(fullPathFileName); 
		    bExists = f.exists();
		}
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "bExists", ""+bExists );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void getCurrentPipeline (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getCurrentPipeline)>> ---
		// @sigtype java 3.5
		// [o] record:0:required currentPipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "currentPipeline", pipeline );
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void getEnvVar (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getEnvVar)>> ---
		// @sigtype java 3.5
		// [i] field:0:required envVarName
		// [o] field:0:required envVarValue
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	envVarName = IDataUtil.getString( pipelineCursor, "envVarName" );
		pipelineCursor.destroy();
		
		if ( null != envVarName && 0 < envVarName.length() ){
			// pipeline
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "envVarValue", System.getenv(envVarName));
			pipelineCursor_1.destroy();
		}
		// --- <<IS-END>> ---

                
	}



	public static final void readFileAsBytes (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(readFileAsBytes)>> ---
		// @sigtype java 3.5
		// [i] field:0:required filename
		// [o] object:0:required fileBytes
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	filename = IDataUtil.getString( pipelineCursor, "filename" );
		pipelineCursor.destroy();
		
		byte[] array = null;
		try {
			array = Files.readAllBytes(Paths.get(filename));
		} catch (IOException e) {
			throw new ServiceException(e);
		}			
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "fileBytes", array );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}

	// --- <<IS-START-SHARED>> ---

	
	// --- <<IS-END-SHARED>> ---
}

