package com.bridgelabz.OOPS;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil 
{
	private static ObjectMapper mapper;
	static
	{
		mapper=new ObjectMapper();
	}
	
	public static String convertJavaToJson(Object obj)
	{
		String jsonResult="";
		try 
		{
			jsonResult=mapper.writeValueAsString(obj);
		} 
		catch (JsonGenerationException e) 
		{
			System.out.println("Exception Occured while converting Java Object into Json Object -->"+e.getMessage());
		}
		catch (JsonMappingException e) 
		{
			System.out.println("Exception Occured while converting Java Object into Json Object -->"+e.getMessage());
		}
		catch (IOException e) 
		{
			System.out.println("Exception Occured while converting Java Object into Json Object -->"+e.getMessage());
		}
		return jsonResult;
		
	}
	
	public static <T> T convertjsonToJava(String jsonResult,Class<T> cls)
	{
		T result=null;
		try
		{
			result=mapper.readValue(jsonResult, cls);
		}
		catch (JsonParseException e)
		{
			System.out.println("Exception Occured while converting Json Object into Java Object -->"+e.getMessage());
		}
		catch (JsonMappingException e)
		{
			System.out.println("Exception Occured while converting Json Object into Java Object -->"+e.getMessage());
		}
		catch (IOException e) 
		{
			System.out.println("Exception Occured while converting Json Object into Java Object -->"+e.getMessage());
		}
		return result;
		
	}
	
}
