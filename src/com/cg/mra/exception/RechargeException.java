package com.cg.mra.exception;

public class RechargeException extends Exception{
	public RechargeException()
	{
		System.err.println("Cannot Recharge Amount as Given Mobile No Does Not Exists ");
	}
}
