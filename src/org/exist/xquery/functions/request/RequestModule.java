/*
 *  eXist Open Source Native XML Database
 *  Copyright (C) 2001-06 Wolfgang M. Meier
 *  wolfgang@exist-db.org
 *  http://exist.sourceforge.net
 *  
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *  
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *  
 *  $Id$
 */
package org.exist.xquery.functions.request;

import org.exist.dom.QName;
import org.exist.xquery.AbstractInternalModule;
import org.exist.xquery.FunctionDef;
import org.exist.xquery.XPathException;

/**
 * @author Wolfgang Meier (wolfgang@exist-db.org)
 */
public class RequestModule extends AbstractInternalModule {

	public static final String NAMESPACE_URI = "http://exist-db.org/xquery/request";
	public static final String PREFIX = "request";
	public static final QName REQUEST_VAR = new QName("request", NAMESPACE_URI, PREFIX);
	
	public static final FunctionDef[] functions = {
		new FunctionDef(GetCookieNames.signature, GetCookieNames.class),
		new FunctionDef(GetCookieValue.signature, GetCookieValue.class),
		new FunctionDef(GetData.signature, GetData.class),
		new FunctionDef(GetParameter.signature, GetParameter.class),
		new FunctionDef(GetParameterNames.signature, GetParameterNames.class),
		new FunctionDef(GetUploadedFile.signature, GetUploadedFile.class),
		new FunctionDef(GetUploadedFileName.signature, GetUploadedFileName.class),
		new FunctionDef(GetURI.signature, GetURI.class),
		new FunctionDef(GetURL.signature, GetURL.class),
		new FunctionDef(GetServerName.signature, GetServerName.class),
		new FunctionDef(GetServerPort.signature, GetServerPort.class),
		new FunctionDef(GetHostname.signature, GetHostname.class)
	};
	
	public RequestModule() throws XPathException {
		super(functions);
		// predefined module global variables:
		declareVariable(REQUEST_VAR, null);
	}

	/* (non-Javadoc)
	 * @see org.exist.xquery.Module#getDescription()
	 */
	public String getDescription() {
		return "Functions dealing with HTTP requests"; 
	}
	
	/* (non-Javadoc)
	 * @see org.exist.xquery.Module#getNamespaceURI()
	 */
	public String getNamespaceURI() {
		return NAMESPACE_URI;
	}

	/* (non-Javadoc)
	 * @see org.exist.xquery.Module#getDefaultPrefix()
	 */
	public String getDefaultPrefix() {
		return PREFIX;
	}

}
