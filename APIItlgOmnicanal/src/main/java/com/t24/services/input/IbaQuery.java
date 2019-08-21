/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t24.services.input;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="IbaQuery")
@XmlType(propOrder={"head","body"})
public class IbaQuery {

	Head head;
	Body body;
	
	public Head getHead() {
		return head;
	}
	
	@XmlElement
	public void setHead(Head head) {
		this.head = head;
	}

	public Body getBody() {
		return body;
	}

	@XmlElement
	public void setBody(Body body) {
		this.body = body;
	}
	
	
	
}