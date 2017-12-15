package tech.lapsa.java.jaxb.adapter;

import java.time.Instant;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class XmlInstantAdapter extends XmlAdapter<String, Instant> {

    @Override
    public Instant unmarshal(final String v) throws Exception {
	if (v == null || v.isEmpty())
	    return null;
	return Instant.parse(v);
    }

    @Override
    public String marshal(final Instant v) throws Exception {
	if (v == null)
	    return null;
	return v.toString();
    }
}
