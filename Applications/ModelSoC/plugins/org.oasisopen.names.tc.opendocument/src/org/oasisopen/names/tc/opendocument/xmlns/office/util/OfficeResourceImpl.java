/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * Extended to use the 'content.xml' inside a open document zip for loading/saving.
 * <!-- end-user-doc -->
 * 
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.util.OfficeResourceFactoryImpl
 * @generated
 */
public class OfficeResourceImpl extends XMLResourceImpl {
	/**
	 * Creates an instance of the resource. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public OfficeResourceImpl(URI uri) {
		super(uri);
	}
	
	//method copied from super class and modified
	@Override
	public void load(Map<?, ?> options) throws IOException {
		if (!isLoaded) {
			URIConverter uriConverter = getURIConverter();
			Map<?, ?> response = options == null ? null : (Map<?, ?>) options
					.get(URIConverter.OPTION_RESPONSE);
			if (response == null) {
				response = new HashMap<Object, Object>();
			}

			InputStream inputStream = null;
			try {
				inputStream = uriConverter
						.createInputStream(getContentXmlURI(), options); //modification
			} catch (IOException exception) {
				Notification notification = setLoaded(true);
				isLoading = true;
				if (errors != null) {
					errors.clear();
				}
				if (warnings != null) {
					warnings.clear();
				}
				isLoading = false;
				if (notification != null) {
					eNotify(notification);
				}
				setModified(false);

				throw exception;
			}

			try {
				load(inputStream, options);
			} finally {
				inputStream.close();
				Long timeStamp = (Long) response
						.get(URIConverter.RESPONSE_TIME_STAMP_PROPERTY);
				if (timeStamp != null) {
					setTimeStamp(timeStamp);
				}
			}
			
			//=== ADDED
			InputStream zipInputStream = null;
			zipInputStream = uriConverter.createInputStream(getURI(), options);
			EAnnotation zipContent = EcoreFactory.eINSTANCE.createEAnnotation();
			zipContent.setSource("zipContent");
			BufferedInputStream   bis = new BufferedInputStream(zipInputStream);
			ByteArrayOutputStream buf = new ByteArrayOutputStream();
			int result = bis.read();
			while (result != -1) {
				byte b = (byte) result;
				buf.write(b);
				result = bis.read();
			}
			zipContent.getDetails().put("bytes", buf.toString());
			zipInputStream.close();
			getContents().add(zipContent);
			//===
		}
	}
	
	//method copied from super class and modified
	@Override
	public void save(Map<?, ?> options) throws IOException {
		//save with buffer options removed	
		Map<?, ?> response = options == null ? null : (Map<?, ?>) options
				.get(URIConverter.OPTION_RESPONSE);
		if (response == null) {
			response = new HashMap<Object, Object>();
		}
		URIConverter uriConverter = getURIConverter();
		
		//=== ADDED
		if (getContents().size() == 2 && getContents().get(1) instanceof EAnnotation) {
			EAnnotation zipContent = (EAnnotation) getContents().get(1);
			OutputStream zipOutputStream = uriConverter.createOutputStream(getURI(), options);
			zipOutputStream.write(zipContent.getDetails().get("bytes").getBytes());
			zipOutputStream.flush();
			zipOutputStream.close();
			getContents().remove(1);
		}

		//===
		
		OutputStream outputStream = uriConverter.createOutputStream(
				getContentXmlURI(), options); //modification
		try {
			save(outputStream, options);
		} finally {
			outputStream.close();
			Long timeStamp = (Long) response
					.get(URIConverter.RESPONSE_TIME_STAMP_PROPERTY);
			if (timeStamp != null) {
				setTimeStamp(timeStamp);
			}
		}	
	}

	private URI getContentXmlURI() {
		return URI.createURI("archive:" + getURI()
				+ "!/content.xml");
	}

} // OfficeResourceImpl
