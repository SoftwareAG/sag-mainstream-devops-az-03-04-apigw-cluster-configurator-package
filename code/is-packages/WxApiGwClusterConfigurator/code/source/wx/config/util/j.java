package wx.config.util;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class j

{
	// ---( internal utility methods )---

	final static j _instance = new j();

	static j _newInstance() { return new j(); }

	static j _cast(Object o) { return (j)o; }

	// ---( server methods )---




	public static final void getEnvVar (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getEnvVar)>> ---
		// @sigtype java 3.5
		// [i] field:0:required envVarName
		// [o] field:0:required envVarValue
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	envVarName = IDataUtil.getString( pipelineCursor, "envVarName" );
		pipelineCursor.destroy();
		
		if ( null != envVarName && 0 < envVarName.length() ){
			// pipeline
			IDataCursor pipelineCursor_1 = pipeline.getCursor();
			IDataUtil.put( pipelineCursor_1, "envVarValue", "envVarValue" );
			pipelineCursor_1.destroy(); 
		}
		// --- <<IS-END>> ---

                
	}
}

