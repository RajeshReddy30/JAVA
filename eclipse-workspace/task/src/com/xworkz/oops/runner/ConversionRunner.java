package com.xworkz.oops.runner;

import com.xworkz.oops.service.Conversion;

public class ConversionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conversion conver=new Conversion();
		conver.number=988;
		conver.members=32;
		conver.count=24;
		conver.decimalNumbers=24332.436f;
		conver.largerDecimals=317868.8319758;
		conver.largeNumber=97987698879L;
		Integer integer=Integer.valueOf(conver.number);
		Byte bytes=Byte.valueOf(conver.members);
		Short shorts=Short.valueOf(conver.count);
		Float floats=Float.valueOf(conver.decimalNumbers);
		Double doubles=Double.valueOf(conver.largerDecimals);
		Boolean booleans=Boolean.valueOf(conver.isconverted);
		Long longs=Long.valueOf(conver.largeNumber);
		
		System.out.println("long to Long:"+conver.largeNumber);
		System.out.println("int to Integer:"+integer);
		System.out.println("byte to bytes:"+bytes);
		System.out.println("short to Short:"+conver.count);
		System.out.println("float to Float:"+conver.decimalNumbers);
		System.out.println("double to Double:"+conver.largerDecimals);
		System.out.println("boolean to Boolean:"+conver.isconverted);
		//non-primitive to primitive
		  String str = "123";
	        String floatStr = "123.45";
	        String doubleStr = "123.456";
	        String booleanStr = "true";

	        // 1. String to byte
	        byte byteValue = Byte.parseByte(str);
	        System.out.println("String to byte: "+ byteValue);

	        // 2. String to short
	        short shortValue = Short.parseShort(str);
	        System.out.println("String to short: "+ shortValue);

	        // 3. String to int
	        int intValue = Integer.parseInt(str);
	        System.out.println("String to int: "+ intValue);

	        // 4. String to long
	        long longValue = Long.parseLong(str);
	        System.out.println("String to long: "+ longValue);

	        // 5. String to float
	        float floatValue = Float.parseFloat(floatStr);
	        System.out.println("String to float: " + floatValue);

	        // 6. String to double
	        double doubleValue = Double.parseDouble(doubleStr);
	        System.out.println("String to double: " + doubleValue);

	        // 7. String to boolean
	        boolean booleanValue = Boolean.parseBoolean(booleanStr);
	        System.out.println("String to boolean: " + booleanValue);

	        // Converting primitive types to String
	        byte b = 10;
	        short s = 20;
	        int i = 30;
	        long l = 40L;
	        float f = 50.5f;
	        double d = 60.6;
	        char c = 'A';
	        boolean bool = true;

	        // 8. byte to String
	        String byteToStr = Byte.toString(b);
	        System.out.println("byte to String: " + byteToStr);

	        // 9. short to String
	        String shortToStr = Short.toString(s);
	        System.out.println("short to String: " + shortToStr);

	        // 10. int to String
	        String intToStr = Integer.toString(i);
	        System.out.println("int to String: " + intToStr);

	        // 11. long to String
	        String longToStr = Long.toString(l);
	        System.out.println("long to String: " + longToStr);

	        // 12. float to String
	        String floatToStr = Float.toString(f);
	        System.out.println("float to String: " + floatToStr);

	        // 13. double to String
	        String doubleToStr = Double.toString(d);
	        System.out.println("double to String: " + doubleToStr);

	        // 14. char to String
	        String charToStr = Character.toString(c);
	        System.out.println("char to String: " + charToStr);

	        // 15. boolean to String
	        String booleanToStr = Boolean.toString(bool);
	        System.out.println("boolean to String: " + booleanToStr);


	}

}
