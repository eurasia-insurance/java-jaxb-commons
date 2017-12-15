package tech.lapsa.java.jaxb.adapter;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class XmlLocalDateAdapter extends XmlAdapter<String, LocalDate> {

    @Override
    public LocalDate unmarshal(final String v) throws Exception {
	if (v == null || v.isEmpty())
	    return null;
	return LocalDate.parse(v);
    }

    @Override
    public String marshal(final LocalDate v) throws Exception {
	if (v == null)
	    return null;
	return v.toString();
    }
}
