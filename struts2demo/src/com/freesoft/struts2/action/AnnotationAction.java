package com.freesoft.struts2.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value="struts-default")
@Namespace("struts2")
@Results(@Result(name="success", location="/result.jsp"))
public class AnnotationAction extends ActionSupport {

}
