package com.softserve.hw06;

import java.util.Scanner;

enum HttpResponce {
	E401("Although the HTTP standard specifies 'unauthorized', semantically this response means 'unauthenticated'. That is, the client must authenticate itself to get the requested response."),
	E404("The server can not find the requested resource. In the browser, this means the URL is not recognized.");
	
	private String description;
	//
	private HttpResponce(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return description;
	}
}

public class ApplHttp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Code = ");
		String code = sc.nextLine();
		HttpResponce httpRes = null;
		try {
			httpRes = HttpResponce.valueOf(code.toUpperCase());
		} catch (Exception e) {
		}
		if (httpRes != null) {
			System.out.println("Description = " + httpRes);
		} else {
			System.out.println("Invalid code");
		}
	}
}
