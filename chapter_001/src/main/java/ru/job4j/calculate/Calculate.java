package ru.job4j.calculate;

/**
* Вывод строки в консоль.
* @author Dmitry Olekhnovich
* @version $Id$
* @since 0.1
* 
*/


public class Calculate {

	/**
	* Main.
	* @param args -args.
	*/

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	/**
	* Metod echo.
	* @param name Your name.
	* @return Echo plus Your name.
	*/
	public String echo(String name) {
		return "Echo, echo, echo : " + name;
	}
}