package tech.lapsa.java.jaxb.adapter;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class XmlLocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

    @Override
    public LocalDateTime unmarshal(final String v) throws Exception {
	if (v == null || v.isEmpty())
	    return null;
	return LocalDateTime.parse(v);
    }

    @Override
    public String marshal(final LocalDateTime v) throws Exception {
	if (v == null)
	    return null;
	return v.toString();
    }
}
