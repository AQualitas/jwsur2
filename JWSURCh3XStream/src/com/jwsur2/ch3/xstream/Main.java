package com.jwsur2.ch3.xstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Main {
	public static void main(String[] args) {
		PersonNoProps bd = new PersonNoProps("Bjoern Daehlie", 49, "Male");
		// setup
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("skier", PersonNoProps.class);
		String xml = xstream.toXML(bd);
		System.out.println(xml);
		// dserialize and confirm
		PersonNoProps bdClone = (PersonNoProps) xstream.fromXML(xml);
		System.out.println(xstream.toXML(bdClone));
	}
}
