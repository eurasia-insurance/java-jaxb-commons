package tech.lapsa.java.jaxb.adapter;

import java.util.Currency;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class XmlCurrencyAdapter extends XmlAdapter<String, Currency> {

    @Override
    public Currency unmarshal(String v) throws Exception {
	if (v == null || v.isEmpty())
	    return null;
	return Currency.getInstance(v);
    }

    @Override
    public String marshal(Currency v) throws Exception {
	if (v == null)
	    return null;
	return v.getCurrencyCode();
    }
}
