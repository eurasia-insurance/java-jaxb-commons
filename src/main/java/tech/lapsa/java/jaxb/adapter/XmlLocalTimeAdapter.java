package tech.lapsa.java.jaxb.adapter;

import java.time.LocalTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class XmlLocalTimeAdapter extends XmlAdapter<String, LocalTime> {

    @Override
    public LocalTime unmarshal(String v) throws Exception {
	if (v == null || v.isEmpty())
	    return null;
	return LocalTime.parse(v);
    }

    @Override
    public String marshal(LocalTime v) throws Exception {
	if (v == null)
	    return null;
	return v.toString();
    }
}
