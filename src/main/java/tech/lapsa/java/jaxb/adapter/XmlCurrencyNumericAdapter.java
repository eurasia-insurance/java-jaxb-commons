package tech.lapsa.java.jaxb.adapter;

import java.util.Currency;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import tech.lapsa.java.commons.function.MyExceptions;

public class XmlCurrencyNumericAdapter extends XmlAdapter<String, Currency> {

    @Override
    public Currency unmarshal(final String v) throws Exception {
	if (v == null || v.isEmpty())
	    return null;
	final int numeric = Integer.parseInt(v);
	return Currency.getAvailableCurrencies() //
		.stream() //
		.filter(x -> x.getNumericCode() == numeric) //
		.findAny() //
		.orElseThrow(MyExceptions.illegalArgumentSupplier("No currency for %1$s", v));
    }

    @Override
    public String marshal(final Currency v) throws Exception {
	if (v == null)
	    return null;
	return String.valueOf(v.getNumericCode());
    }
}
