package org.la.foows.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.la.foows.model.Bar;
import org.la.foows.model.Foo;

@WebService(name="FooWS", targetNamespace = "http://example.la.org/wsdl")
public class FooWS {

	@WebMethod
	public Foo fooBar(String word) {
		//create dummy FOO data
		Foo f = new Foo();
		f.setS(word);
		f.setDate(new Date());
		f.setBd(new BigDecimal("100.56"));
		Bar b = new Bar();
		b.setD(new Date());
		b.setS(word);
		List<BigDecimal> bdList = new ArrayList<BigDecimal>();
		bdList.add(new BigDecimal("10.0"));
		b.setBdList(bdList);
		f.setBar(b);
		f.setBarList(new ArrayList<Bar>());
		return f;
	}
}
