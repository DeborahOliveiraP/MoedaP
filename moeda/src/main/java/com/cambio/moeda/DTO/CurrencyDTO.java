package com.cambio.moeda.DTO;

import java.io.Serializable;
import java.util.Collection;

import org.hibernate.query.sqm.tree.expression.Conversion;

public class CurrencyDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String result;
	private String documentation;
	private String terms_of_use;
	private String base_code;
	

	
	
	
	public CurrencyDTO() {

	}

	public CurrencyDTO(String result, String documentation, String terms_of_use, String base_code ) {
		super();
		this.result = result;
		this.documentation = documentation;
		this.terms_of_use = terms_of_use;
		this.base_code = base_code;
		
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public String getTerms_of_use() {
		return terms_of_use;
	}

	public void setTerms_of_use(String terms_of_use) {
		this.terms_of_use = terms_of_use;
	}

	public String getBase_code() {
		return base_code;
	}

	public void setBase_code(String base_code) {
		this.base_code = base_code;
	}

	

}
