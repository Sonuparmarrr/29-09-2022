package assisgnment4;

import java.util.LinkedList;

public class LinkedListofLan {
	public static void main(String[] args) {
		LinkedList<String> language = new LinkedList<>(); //declaration
		// add value in LinkedList
		language.add("C");
		language.add("C++");
		language.add("Java");
		language.add("Kotlin");
		language.add("Python");
		language.add("Perl");
		language.add("Ruby");
//Display the created list.
	System.out.println("List of Languages : " +language);
	System.out.println();
	
//Remove an element at index 5 and display the list
	language.remove(5);
	System.out.println("**********");
	System.out.println("Display all elements after remove index 5");
	
//Remove Kotlin and display the list
	language.remove("Kotlin");
	System.out.println("**********");
	System.out.println("Display all elements after remove Kotlin");

//	Remove all the scripting languages (Python, Ruby, Perl) with one statement and display the list.
	
	LinkedList<String>scriptingLanguage = new LinkedList<String>();
	scriptingLanguage.add("Python");
	scriptingLanguage.add("Ruby");
	scriptingLanguage.add("Perl");
	System.out.println("Display All Scripted Langages");
	language.removeAll(scriptingLanguage);
	System.out.println("List after removing Scrited language :" +language);
	System.out.println("*******************");
	
//Remove all the elements from the list and display the list.

	language.clear();
	System.out.println("List after removed all the elements" +language);
	
	
	
	
}}
