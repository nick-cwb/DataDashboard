/**
 * 
 */
package com.data.dashboard.util;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月10日 下午2:13:40
 *
 */
public interface ErrorConstant {
	
	//认证失败
	public static final String CertificationFail = "00010";
	public static final String DESCCertificationFail = "认证失败";
	
	//系统异常
	public static final String Exception = "00001";
	public static final String DESCException = "系统异常";
	
	//空指针
	public static final String NullPoint = "00011";
	public static final String DESCNullPoint = "查无此数据";
	
	//操作码错误
	public static final String WrongOperationCode = "00100";
	public static final String DESCWrongOperationCode = "操作码错误";
	
	//code码无效
	public static final String NullCode = "00101";
	public static final String DESCNullCode = "Code码无效";
	
	//code码已被占用
	public static final String OccupiedCode = "00110";
	public static final String DESCOccupiedCode = "Code码已使用";

}
