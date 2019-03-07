package com.cg.mra.exception;

public class EnquiryException extends Exception{
	public EnquiryException()
	{
		System.err.println("ERROR: Given Id Does Not Exist");
	}
}
