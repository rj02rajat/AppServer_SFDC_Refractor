package com.ltfs.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AttributesBean implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "Type", columnDefinition = "VARCHAR(100)")
	private String type;
	@Column(name = "Url", columnDefinition = "VARCHAR(200)")
	private String url;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public AttributesBean() {
		super();
	}
	public AttributesBean(String type, String url) {
		super();
		this.type = type;
		this.url = url;
	}
	@Override
	public String toString() {
		return "AttributesBean [type=" + type + ", url=" + url + "]";
	}
	
}
