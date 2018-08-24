package ru.job4j.calculate; 

/**
    *Класс выводит на экран надпись Привет мир!
	*@author antonshmakov (antonixs2017@mail.ru)
    *@since 22.08.2018
    *@version 1
    *
*/
 public class Calculate {

 /**
	*@param args - args.
	*/
        public static void main(String[] args)  {
			System.out.println("Hello World"); 
		} 
		
		/**
     * Method echo.
     * @param name Your name.
     * @return Echo plus your name.
     */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }
		}
	