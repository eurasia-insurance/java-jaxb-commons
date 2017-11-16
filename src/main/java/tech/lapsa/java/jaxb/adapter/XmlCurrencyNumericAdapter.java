package tech.lapsa.java.jaxb.adapter;

import java.util.Currency;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import tech.lapsa.java.commons.function.MyExceptions;

public class XmlCurrencyNumericAdapter extends XmlAdapter<String, Currency> {

    @Override
    public Currency unmarshal(String v) throws Exception {
	if (v == null || v.isEmpty())
	    return null;
	final int numeric = Integer.parseInt(v);
	return Currency.getAvailableCurrencies() //
		.stream() //
		.filter(x -> x.getNumericCode() == numeric) //
		.findAny() //
		.orElseThrow(MyExceptions.illegalArgumentSupplierFormat("No currency for %1$s", v));
    }

    @Override
    public String marshal(Currency v) throws Exception {
	if (v == null)
	    return null;
	return String.valueOf(v.getNumericCode());
    }
}
