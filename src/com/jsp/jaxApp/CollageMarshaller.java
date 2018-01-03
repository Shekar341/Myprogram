package com.jsp.jaxApp;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class CollageMarshaller 
{
	public static void objectToXml(Collage c) throws JAXBException
	{
		JAXBContext context=JAXBContext.newInstance(Collage.class);
		Marshaller marshaller=context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(c, new File("d:\\j2ee\\college.xml"));
		System.out.println("Xml File is created");
	}
}
