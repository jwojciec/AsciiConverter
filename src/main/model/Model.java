package main.model;

import java.math.BigInteger;

public class Model {
	String asciiString = "";
	String hexString = "";
	String binString = "";
	BigInteger decimal = null;

	public void convertASCII(String inputString) throws Exception {
		asciiString = inputString;
		hexString = String.format("%x",
				new BigInteger(1, asciiString.getBytes()));
		decimal = new BigInteger(hexString, 16);
		binString = decimal.toString(2);
	}

	public void convertHEX(String inputString) throws Exception {
		hexString = inputString;
		byte[] bytes = new BigInteger(hexString, 16).toByteArray();
		asciiString = new String(bytes, "UTF-8");
		decimal = new BigInteger(hexString, 16);
		binString = decimal.toString(2);
	}

	public void convertDEC(String inputString) throws Exception {
		decimal = new BigInteger(inputString, 10);
		hexString = String.format("%x", decimal);
		byte[] bytes = new BigInteger(hexString, 16).toByteArray();
		asciiString = new String(bytes, "UTF-8");
		binString = decimal.toString(2);
	}

	public void convertBIN(String inputString) throws Exception {
		binString = inputString;
		decimal = new BigInteger(binString, 2);
		hexString = String.format("%x", decimal);
		byte[] bytes = new BigInteger(hexString, 16).toByteArray();
		asciiString = new String(bytes, "UTF-8");
	}

	public String getAscii() {
		return asciiString;
	}

	public String getHex() {
		return hexString;
	}

	public String getBin() {
		return binString;
	}

	public String getDec() {
		return decimal.toString();
	}
}