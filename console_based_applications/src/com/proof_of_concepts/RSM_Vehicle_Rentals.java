package com.proof_of_concepts;

import java.util.ArrayList;
import java.util.Scanner;

public class RSM_Vehicle_Rentals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("                          !!------  Welcome to RSM Rentals  -----!!");
		double rent = 0;
		int count=0;
		double totalAmount=0;
		double driversPay=0;
		ArrayList<String> vehicleNames = new ArrayList<>();
		ArrayList<Double> vehicleRents = new ArrayList<>();
		String vyn = " ";
		System.out.println();
		do {
			System.out.println("Vehicles available: BIKES, CARS, BUSES, LORRY, MINI_VANS");
			System.out.println("Choose the Vehicle based on requirement: ");
			String vehicle = sc.next().toUpperCase();
			System.out.println("Number of days required: ");
			int num_days = sc.nextInt();
			int old_count=count;
			switch (vehicle) {
			case "BIKES" -> {
				String byn = " ";
				do {
					System.out.println("AVAILABLE BIKES: PULSAR, BMW, ROYALENFIELD, SUZUKI, HONDA, HERO, KTM, DUKE");
					System.out.println("Choose the available bike: ");
					String bike = sc.next().toUpperCase();
					switch (bike) {
					case "PULSAR" -> {
						System.out.println("MOST YOUTHFUL CLASSIC");
						System.out.println("RENT PER DAY IS 500");
						rent = num_days * 500;
						count++;
						vehicleNames.add("Pulsar");
						vehicleRents.add(rent);
						totalAmount+=rent;
					}
					case "BMW" -> {
						System.out.println("MOST PREMIUM BIKES");
						System.out.println("RENT PER DAY IS 1000");
						rent = 1000 * num_days;
						vehicleNames.add("BMW");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;
					}
					case "ROYALENFIELD" -> {
						System.out.println("MOST PREMIUM LOOK AND BEST");
						System.out.println("RENT PER DAY IS 1000");
						rent = 1000 * num_days;
						vehicleNames.add("Royal_Enfield");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;

					}
					case "SUZUKI" -> {
						System.out.println("RACING BIKE");
						System.out.println("RENT PER DAY IS 1200");
						rent = 1200 * num_days;
						vehicleNames.add("Suzuki Bike");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;
					}
					case "HONDA" -> {
						System.out.println("BEST FOR WEEKLY USE");
						System.out.println("RENT PER DAY IS 200");
						rent = 200*num_days;
						vehicleNames.add("Honda Bike");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;

					}
					case "HERO" -> {
						System.out.println("BEST FOR DAILY USE");
						System.out.println("RENT PER DAY IS 100");
						rent = 100*num_days;
						vehicleNames.add("Hero Bike");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;

					}
					case "KTM" -> {
						System.out.println("MOST YOUTH CHOOSEN");
						System.out.println("RENT PER DAY IS 800");
						rent = 800*num_days;
						vehicleNames.add("KTM Bike");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;

					}
					case "DUKE" -> {
						System.out.println("THE GOOD LOOKING BIKE");
						System.out.println("RENT PER DAY IS 1000");
						rent = 1000*num_days;
						vehicleNames.add("Duke Bike");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;
					}
					default -> System.out.println("The entered bike is not available!!!");
					}
					System.out.println("Do you want to choose another? yes/No");
					byn = sc.next();
				} while (byn.equalsIgnoreCase("yes"));
			}
			case "CARS" -> {
				String cyn = " ";
				do {
					System.out.println("AVAILABLE CARS: SKODA, BMW, TOYOTA, TATA, BENZ, FORD, KIA, LAMBORGIHINI ");
					System.out.println("Choose the car: ");
					String car = sc.next().toUpperCase();
					switch (car) {
					case "SKODA" -> {
						String skyn = " ";
						do {
							System.out.println("AVAILABLE SKODA CARS:OCTAVIA, RAPID, SCALA, SUPERB");
							System.out.println("CHOOSE MOST AFFORDABLE SKODA CARS: ");
							String skoda = sc.next().toUpperCase();
							switch (skoda) {
							case "OCTAVIA" -> {
								System.out.println("THE MOST AFFORDABLE octavia car");
								System.out.println("THE RENTAL FOR THE CAR IS 1500");
								rent = num_days * 1500;
								vehicleNames.add("Skoda Octavia car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "RAPID" -> {
								System.out.println("THE MOST AFFORDABLE rapid car");
								System.out.println("THE RENTAL FOR THE CAR IS 1600");
								rent = num_days * 1600;
								vehicleNames.add("Skoda rapid car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "SCALA" -> {
								System.out.println("THE MOST AFFORDABLE scala car");
								System.out.println("THE RENTAL FOR THE CAR IS 1300");
								rent = num_days * 1300;
								vehicleNames.add("Skoda Scala car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "SUPERB" -> {
								System.out.println("THE MOST AFFORDABLE skoda superb car");
								System.out.println("THE RENTAL FOR THE CAR IS 1200");
								rent = num_days * 1200;
								vehicleNames.add("Skoda Superb car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}

							default -> System.out.println("The skoda model is not available!!!");
							}
							System.out.println("Do you want to choose another skoda cars? yes/No");
							skyn = sc.next();
						} while (skyn.equalsIgnoreCase("yes"));
					}
					case "BMW" -> {
						String bmwyn = " ";
						do {
							System.out.println("AVAILABLE BMW CARS:XM, 2_SERIES, X5, I7");
							System.out.println("CHOOSE MOST PREMIUM BMW CARS: ");
							String bmw = sc.next().toUpperCase();
							switch (bmw) {
							case "XM" -> {
								System.out.println("THE MOST PREMIUM BMW XM CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 2500");
								rent = num_days * 2500;
								vehicleNames.add("BMW XM car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "2_SERIES" -> {
								System.out.println("THE MOST PREMIUM BMW 2 SERIES CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 1800");
								rent = num_days * 1800;
								vehicleNames.add("BMW 2-series car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "X5" -> {
								System.out.println("THE MOST PREMIUM BMW X5 CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 2200");
								rent = num_days * 2200;
								vehicleNames.add("BMW X5 car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "I7" -> {
								System.out.println("THE MOST PREMIUM BMW I7 CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 3000");
								rent = num_days * 3000;
								vehicleNames.add("BMW i7 car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							default -> System.out.println("The BMW model is not available!!!");
							}
							System.out.println("Do you want to choose another bmw cars? yes/No");
							bmwyn = sc.next();
						} while (bmwyn.equalsIgnoreCase("yes"));
					}
					case "TOYOTA" -> {
						String toyotayn = " ";
						do {
							System.out.println("AVAILABLE TOYOTA CARS: ALPHARD, FORTUNER, TUNDRA, HILUX ");
							System.out.println("CHOOSE MOST COMFORTABLE TOYOTA CARS: ");
							String toyota = sc.next().toUpperCase();
							switch (toyota) {
							case "ALPHARD" -> {
								System.out.println("THE MOST COMFORTABLE TOYOTA ALPHARD CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 2000");
								rent = num_days * 2000;
								vehicleNames.add("Toyota Alphard car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "FORTUNER" -> {
								System.out.println("THE MOST COMFORTABLE TOYOTA FORTUNER CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 1800");
								rent = num_days * 1800;
								vehicleNames.add("Toyota Fortuner car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "TUNDRA" -> {
								System.out.println("THE MOST COMFORTABLE TOYOTA TUNDRA CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 2200");
								rent = num_days * 2200;
								vehicleNames.add("Toyota Tundra car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "HILUX" -> {
								System.out.println("THE MOST COMFORTABLE TOYOTA HILUX CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 1600");
								rent = num_days * 1600;
								vehicleNames.add("Toyota Hilux car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							default -> System.out.println("The Toyota model is not available!!!");
							}
							System.out.println("Do you want to choose another toyota? yes/No");
							toyotayn = sc.next();
						} while (toyotayn.equalsIgnoreCase("yes"));

					}
					case "BENZ" -> {
						String benzyn = " ";
						do {
							System.out.println("AVAILABLE BENZ CARS:B-CLASS, E-CLASS, G-CLASS, AMG");
							System.out.println("CHOOSE MOST LUXURIOUS BENZ CARS: ");
							String benz = sc.next().toUpperCase();
							switch (benz) {
							case "B-CLASS" -> {
								System.out.println("THE MOST LUXURIOUS BENZ B-CLASS CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 2000");
								rent = num_days * 2000;
								vehicleNames.add("Benz B-class car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "E-CLASS" -> {
								System.out.println("THE MOST LUXURIOUS BENZ E-CLASS CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 2500");
								rent = num_days * 2500;
								vehicleNames.add("Benz E-class car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "G-CLASS" -> {
								System.out.println("THE MOST LUXURIOUS BENZ G-CLASS CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 3000");
								rent = num_days * 3000;
								vehicleNames.add("Benz G-class car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "AMG" -> {
								System.out.println("THE MOST LUXURIOUS BENZ AMG CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 3500");
								rent = num_days * 3500;
								vehicleNames.add("Benz AMG car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							default -> System.out.println("The Benz model is not available!!!");
							}
							System.out.println("Do you want to choose another benz cars? yes/No");
							benzyn = sc.next();
						} while (benzyn.equalsIgnoreCase("yes"));
					}
					case "FORD" -> {
						String fordyn = " ";
						do {
							System.out.println("AVAILABLE FORD CARS:MUSTANG, FOCUS, ECOSPORT, GT");
							System.out.println("CHOOSE MOST STYLISH FORD CARS: ");
							String ford = sc.next().toUpperCase();
							switch (ford) {
							case "MUSTANG" -> {
								System.out.println("THE MOST STYLISH FORD MUSTANG CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 2500");
								rent = num_days * 2500;
								vehicleNames.add("Ford Mustang car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "FOCUS" -> {
								System.out.println("THE MOST STYLISH FORD FOCUS CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 1500");
								rent = num_days * 1500;
								vehicleNames.add("Ford focus car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "ECOSPORT" -> {
								System.out.println("THE MOST STYLISH FORD ECOSPORT CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 1400");
								rent = num_days * 1400;
								vehicleNames.add("Ford Ecosport car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "GT" -> {
								System.out.println("THE MOST STYLISH FORD GT CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 3000");
								rent = num_days * 3000;
								vehicleNames.add("Ford GT car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							default -> System.out.println("The Ford model is not available!!!");
							}
							System.out.println("Do you want to choose another ford cars? yes/No");
							fordyn = sc.next();
						} while (fordyn.equalsIgnoreCase("yes"));

					}
					case "KIA" -> {
						String kiayn = " ";
						do {
							System.out.println("AVAILABLE KIA CARS: CARNIVAL, SELTOS, SONET, EV5 ");
							System.out.println("CHOOSE BEST KIA CARS: ");
							String kia = sc.next().toUpperCase();
							switch (kia) {
							case "CARNIVAL" -> {
								System.out.println("THE BEST KIA CARNIVAL CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 1800");
								rent = num_days * 1800;
								vehicleNames.add("Kia carnival car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "SELTOS" -> {
								System.out.println("THE BEST KIA SELTOS CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 1400");
								rent = num_days * 1400;
								vehicleNames.add("Kia Seltos car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "SONET" -> {
								System.out.println("THE BEST KIA SONET CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 1200");
								rent = num_days * 1200;
								vehicleNames.add("Kia Sonet car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "EV5" -> {
								System.out.println("THE BEST KIA EV5 CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 1600");
								rent = num_days * 1600;
								vehicleNames.add("Kia EV5 car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							default -> System.out.println("The Kia model is not available!!!");
							}
							System.out.println("Do you want to choose another kia cars? yes/No");
							kiayn = sc.next();
						} while (kiayn.equalsIgnoreCase("yes"));

					}
					case "TATA" -> {
						String tatayn = " ";
						do {
							System.out.println("AVAILABLE TATA CARS: SIERRA, TIAGO, SUMO, HARRIER");
							System.out.println("CHOOSE SAFEST TATA CARS: ");
							String tata = sc.next().toUpperCase();
							switch (tata) {
							case "SIERRA" -> {
								System.out.println("THE SAFEST TATA SIERRA CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 1700");
								rent = num_days * 1700;
								vehicleNames.add("Tata Sierra car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "TIAGO" -> {
								System.out.println("THE SAFEST TATA TIAGO CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 1200");
								rent = num_days * 1200;
								vehicleNames.add("Tata Tiago car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "SUMO" -> {
								System.out.println("THE SAFEST TATA SUMO CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 1300");
								rent = num_days * 1300;
								vehicleNames.add("Tata Sumo car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "HARRIER" -> {
								System.out.println("THE SAFEST TATA HARRIER CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 1800");
								rent = num_days * 1800;
								vehicleNames.add("Tata Harrier car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							default -> System.out.println("The Tata model is not available!!!");
							}
							System.out.println("Do you want to choose another tata cars? yes/No");
							tatayn = sc.next();
						} while (tatayn.equalsIgnoreCase("yes"));

					}
					case "LAMBORGHINI" -> {
						String lamborghinyn = " ";
						do {
							System.out.println("AVAILABLE LAMBORGHINI CARS:URUS, REVUELTO, HURACAN ");
							System.out.println("CHOOSE STYLISH LUXURY LAMBORGHINI CARS: ");
							String lamborghini = sc.next().toUpperCase();
							switch (lamborghini) {
							case "URUS" -> {
								System.out.println("THE STYLISH LUXURY LAMBORGHINI URUS CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 4000");
								rent = num_days * 4000;
								vehicleNames.add("Lamborghini urus car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "REVUELTO" -> {
								System.out.println("THE STYLISH LUXURY LAMBORGHINI REVUELTO CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 5000");
								rent = num_days * 5000;
								vehicleNames.add("Lamborghini Revuelto car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							case "HURACAN" -> {
								System.out.println("THE STYLISH LUXURY LAMBORGHINI HURACAN CAR");
								System.out.println("THE RENTAL FOR THE CAR IS 4500");
								rent = num_days * 4500;
								vehicleNames.add("Lamborghini Huracan car");
								vehicleRents.add(rent);
								totalAmount+=rent;
								count++;
							}
							default -> System.out.println("The Lamborghini model is not available!!!");
							}
							System.out.println("Do you want to choose another lamborghini? yes/No");
							lamborghinyn = sc.next();
						} while (lamborghinyn.equalsIgnoreCase("yes"));

					}
					default -> System.out.println("THE CAR YOU HAVE CHOOSEN IS NOT AVAILABLE!!!");
					}
					System.out.println("Do you want to choose another cars? yes/No");
					cyn = sc.next();
				} while (cyn.equalsIgnoreCase("yes"));
			}
			case "BUSES" -> {
				String busyn = " ";
				System.out.println("How much distance are you willing to travel in km:");
				double km = sc.nextDouble();
				do {
					System.out.println("AVAILABLE BUSES: ASHOK, BMW, FLIX, MAHINDRA");
					System.out.println("CHOOSE YOUR BUS: ");
					String bus = sc.next().toUpperCase();
					switch (bus) {
					case "ASHOK" -> {
						System.out.println("THE POWERFUL ASHOK BUS");
						System.out.println("THE RENTAL FOR THE BUS PER KILO METER IS 55");
						rent = num_days * km * 55;
						vehicleNames.add("Ashok travels");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;
					}
					case "BMW" -> {
						System.out.println("THE LUXURIOUS BMW BUS");
						System.out.println("THE RENTAL FOR THE BUS PER KILO METER IS 100");
						rent = num_days * km * 100;
						vehicleNames.add("BMW Ranga travels");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;
					}
					case "FLIX" -> {
						System.out.println("THE COMFORTABLE FLIX BUS");
						System.out.println("THE RENTAL FOR THE BUS PER KILO METER IS 80");
						rent = num_days * km * 80;
						vehicleNames.add("Flix Travels");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;
					}
					case "MAHINDRA" -> {
						System.out.println("THE RELIABLE MAHINDRA BUS");
						System.out.println("THE RENTAL FOR THE BUS PER KILO METER IS 110");
						rent = num_days * km * 110;
						vehicleNames.add("Mahindra sain Travels");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;
					}
					default -> System.out.println("The bus model is not available!!!");
					}
					System.out.println("Do you want to choose another bus? yes/No");
					busyn = sc.next();
				} while (busyn.equalsIgnoreCase("yes"));

			}
			case "LORRY" -> {
				String lorryyn = " ";
				System.out.println("How much distance are you willing to travel in km:");
				double km = sc.nextDouble();
				do {
					System.out.println("AVAILABLE LORRIES: VIHAAN, SAIN, BMW");
					System.out.println("CHOOSE YOUR LORRY: ");
					String lorry = sc.next().toUpperCase();
					switch (lorry) {
					case "VIHAAN" -> {
						System.out.println("THE POWERFUL VIHAAN LORRY CARRIER");
						System.out.println("THE RENTAL FOR THE LORRY PER KILO METER IS 100");
						rent = num_days * km * 100;
						vehicleNames.add("Vihaan carriers");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;
					}
					case "SAIN" -> {
						System.out.println("THE STRONG SAIN LORRY CARRIER");
						System.out.println("THE RENTAL FOR THE LORRY PER KILO METER IS 150");
						rent = num_days * km * 150;
						vehicleNames.add("Sain Carriers");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;
					}
					case "BMW" -> {
						System.out.println("THE HEAVYLOAD CARRIER BMW LORRY");
						System.out.println("THE RENTAL FOR THE LORRY PER KILO METER IS 120");
						rent = num_days * km * 120;
						vehicleNames.add("BMW Carriers");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;
					}
					default -> System.out.println("The lorry model is not available!!!");
					}
					System.out.println("Do you want to choose another lorry? yes/No");
					lorryyn = sc.next();
				} while (lorryyn.equalsIgnoreCase("yes"));

			}
			case "MINI_VANS" -> {
				String minivanyn = " ";
				System.out.println("How much distance are you willing to travel in km:");
				double km = sc.nextDouble();
				do {
					System.out.println("AVAILABLE MINI VANS: TOYOTA, FORD, MAHINDRA, MAXX, KIA");
					System.out.println("CHOOSE YOUR MINI VAN: ");
					String minivan = sc.next().toUpperCase();
					switch (minivan) {
					case "TOYOTA" -> {
						System.out.println("THE COMFORTABLE TOYOTA MINI VAN");
						System.out.println("THE RENTAL FOR THE MINI VAN PER KILO METER IS 23");
						rent = num_days * km * 23;
						vehicleNames.add("Toyota mini van");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;
					}
					case "FORD" -> {
						System.out.println("THE STYLISH FORD MINI VAN");
						System.out.println("THE RENTAL FOR THE MINI VAN PER KILO METER IS 19");
						rent = num_days * km * 19;
						vehicleNames.add("Ford mini van");
						totalAmount+=rent;
						vehicleRents.add(rent);
						count++;
					}
					case "MAHINDRA" -> {
						System.out.println("THE POWERFUL MAHINDRA MINI VAN");
						System.out.println("THE RENTAL FOR THE MINI VAN PER KILO METER IS 18");
						rent = num_days * km * 18;
						vehicleNames.add("Mahindra van");
						totalAmount+=rent;
						vehicleRents.add(rent);
						count++;
					}
					case "MAXX" -> {
						System.out.println("THE RELIABLE MAXX MINI VAN");
						System.out.println("THE RENTAL FOR THE MINI VAN PER KILO METER IS 15");
						rent = num_days * km * 15;
						vehicleNames.add("MAXX  Mini van");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;
					}
					case "KIA" -> {
						System.out.println("THE LUXURIOUS KIA MINI VAN");
						System.out.println("THE RENTAL FOR THE MINI VAN PER KILO METER IS 20");
						rent = num_days * km * 20;
						vehicleNames.add("Kia Mini van");
						vehicleRents.add(rent);
						totalAmount+=rent;
						count++;
					}
					default -> System.out.println("The mini van model is not available!!!");
					}
					System.out.println("Do you want to choose another mini van? yes/No");
					minivanyn = sc.next();
				} while (minivanyn.equalsIgnoreCase("yes"));
			}
			default -> {
				System.out.println("Invalid Input");
			}
			}System.out.println();
			if(count > old_count) {
			    System.out.println();
			    System.out.println("Do you Require Drivers then mention the number of drivers based on requirement: ");
			    int drivers = sc.nextInt();
			    driversPay += num_days * drivers * 500;
			}
			System.out.println("Do you want to choose different Vehicles? yes/No");
			vyn = sc.next();
		} while (vyn.equalsIgnoreCase("yes"));
		System.out.println("--------------  Vehicles Booked  ---------------------");
		System.out.println("The total vehicles booked: "+count);
		System.out.println();
		for(int i=0;i<vehicleNames.size();i++) {
			System.out.println(vehicleNames.get(i)+" : "+vehicleRents.get(i));
		}
		System.out.println();
		System.out.println("Drivers pay: "+driversPay);
		System.out.println("Total rent for the vehicles--> " + totalAmount);
		System.out.println("Total Amount for vehicle and drivers-->"+(totalAmount+driversPay));
		System.out.println("Thanks for Visiting !!");
		System.out.println("-------------------------------------------------------");
		System.out.println();
		System.out.println("Terms and Conditions: 1. In case of any major scrath on the vehicle the rented person should bare the expenses upto 50%");
		System.out.println("2. If any accident due to druken you need to pay the total cost of the vehicle");
		System.out.println("3. If any accident by unknowingly the insurance will be applied for the Vehicle no resposibility for the people so drive safe. ");
		System.out.println();
		System.out.println("Signature for acceptance:   ________________________ ");
	}

}
