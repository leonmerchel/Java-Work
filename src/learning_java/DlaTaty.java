package learning_java;

import java.util.*;

public class DlaTaty {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Jakie masz imie?");
		String name = reader.nextLine();
		if((name.equalsIgnoreCase("rafal"))) {
			System.out.println("Chesc tata, to ja, Leon. Chce tobie zyczyc duzo szczescia, duzo zdrowia,");
			System.out.println("duzo pieniedzy, duzo usciskow, z okazji dnia taty. Mam nadzieje  ze ty bedziesz mial wolne i zebysmy poszli na ta gore hike to co mowiles.");
			System.out.println("Mam nadzieje tez ze odpoczniesz od ciezkiej pracy i zebys mial fajne wakacje, wiec ja mam pare slow dla ciebie. Napisz gotowy jak skonczysz to czytac");
		}
		String ready = reader.nextLine();
		if((ready.equalsIgnoreCase("gotowy"))) {
			int i = 0;
			while (i <= 100) {
				System.out.println("Dziekuje, i kocham");
				i++;
			}
		}
	}
}
