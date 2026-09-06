# RSM Vehicle Rentals — POC

A console-based (CLI) proof-of-concept for a vehicle rental booking system, built in Java. It lets a user browse and book from a catalog of bikes, cars, buses, lorries, and mini-vans, calculates rent based on category-specific pricing, optionally adds driver charges, and prints a final invoice-style summary.

## Overview

`RSM_Vehicle_Rentals` simulates a simple rental counter workflow:

1. The user picks a vehicle category.
2. The user drills down into a specific make/model within that category.
3. Rent is calculated and added to a running total.
4. The user can optionally hire drivers for that booking.
5. The user can repeat the process for more vehicles.
6. A final summary is printed, listing every vehicle booked, its rent, total driver pay, and the grand total.

This is a **proof of concept** — it's meant to demonstrate the booking flow and pricing logic, not to be a production-ready rental management system.

## Features

- **5 vehicle categories:** Bikes, Cars, Buses, Lorries, Mini-Vans
- **Nested sub-catalogs** for Cars (Skoda, BMW, Toyota, Benz, Ford, Kia, Tata, Lamborghini), each with 3–4 specific models
- **Two pricing models:**
  - **Flat daily rate** (Bikes, Cars) → `rent = rate_per_day × num_days`
  - **Distance-based rate** (Buses, Lorries, Mini-Vans) → `rent = rate_per_km × km × num_days`
- **Multi-booking support** — book multiple vehicles across multiple categories in a single session
- **Optional driver hire** per booking, charged at a flat rate per day per driver
- **Running invoice** — tracks every booked vehicle, its individual rent, total driver pay, and the combined grand total
- **Terms & conditions** printed at the end of the session, along with a signature line

## Requirements

- Java 17 or later (the code uses [arrow-style `switch` expressions](https://openjdk.org/jeps/361), a feature introduced in Java 14 and standardized in Java 17)
- A terminal / console to run the compiled program (input is read via `Scanner` from `System.in`)

## How to Run

```bash
# Compile
javac com/proof_of_concepts/RSM_Vehicle_Rentals.java

# Run
java com.proof_of_concepts.RSM_Vehicle_Rentals
```

> Make sure the file is placed inside a `com/proof_of_concepts/` directory structure to match its package declaration, or adjust the package statement to match your own project layout.

## Usage Walkthrough

1. **Choose a vehicle category** — type one of: `BIKES`, `CARS`, `BUSES`, `LORRY`, `MINI_VANS`
2. **Enter the number of rental days**
3. **For Buses / Lorries / Mini-Vans only:** enter the distance to be traveled (in km)
4. **Pick a specific model** from the category's menu (e.g., for Cars, first pick a brand like `TOYOTA`, then a model like `FORTUNER`)
5. Repeat the model selection if you want more than one vehicle from the same sub-menu (`yes`/`No`)
6. After finishing a category, you'll be asked if you want **drivers** for that booking — enter the number of drivers needed (drivers are billed at ₹500/day per driver)
7. Choose whether to book a **different vehicle category** — repeat from step 1, or finish
8. Review the final printed summary: all vehicles booked, individual rents, total driver pay, and grand total

### Sample Pricing Snapshot

| Category | Pricing Basis | Example |
|---|---|---|
| Bikes | Per day | Hero ₹100/day, BMW ₹1000/day |
| Cars | Per day | Skoda Superb ₹1200/day, Lamborghini Revuelto ₹5000/day |
| Buses | Per km × day | Ashok ₹55/km, Mahindra ₹110/km |
| Lorries | Per km × day | Vihaan ₹100/km, Sain ₹150/km |
| Mini-Vans | Per km × day | Maxx ₹15/km, Toyota ₹23/km |
| Drivers | Per day, per driver | ₹500/day/driver |

*(All amounts are illustrative POC values, not real market rates.)*

## Suggested Next Steps

- Refactor the vehicle catalog into a config-driven structure (map, enum, or class) to eliminate repeated code and make adding new vehicles trivial.
- Add input validation with try/catch around `Scanner` reads.
- Move driver-hiring logic to be per-vehicle rather than per-category.
- Add persistence (e.g., write bookings to a CSV or simple database) if this evolves beyond a POC.
- Add unit tests around the rent calculation logic.

## License / Status
RANGA SAI MANOJ

Internal proof-of-concept — not intended for production use.
