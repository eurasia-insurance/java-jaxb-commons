package tech.lapsa.java.jaxb.adapter;

import java.net.URI;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class XmlURIAdapter extends XmlAdapter<String, URI> {

    @Override
    public URI unmarshal(String v) throws Exception {
	if (v == null || v.isEmpty())
	    return null;
	return new URI(v);
    }

    @Override
    public String marshal(URI v) throws Exception {
	if (v == null)
	    return null;
	return v.toString();
    }
}
