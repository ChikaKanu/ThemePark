Theme Park Homework - Abstract Classes, Interfaces and Polymorphism
Learning Objectives
Practice modelling a large real world domain using:

classes
inheritance
abstract classes
interfaces
MVP
Classes and Abstract Classes
Model a ThemePark (with various Attraction and Stalls) and its Visitors.

Remember to model class diagrams first, then write tests, then write code.

Visitor has age, height, money
Using an Attraction abstract class (which has a name), create some subclasses for Rollercoaster, Dodgems, Park, Playground
Using a Stall abstract class (which has a name, ownerName and parkingSpot), create some classes for IceCreamStall, CandyFlossStall, TobaccoStall
Interfaces
Introduce some Interfaces to enable charging, restricting and reviewing attractions and stalls:

ITicketed promises double defaultPrice() and double priceFor(Visitor)

ISecurity promises boolean isAllowedTo(Visitor)

IReviewed promises int getRating() and String getName()

Have some of the classes implement these interfaces. Below are the rules about what the implementations should be:

Playground implements ISecurity because it has a maximum age of 15

TobaccoStall implements ISecurity because it has a minimum age of 18

Rollercoster implements ISecurity and requires a visitor to be over 145cm tall and over 12 years of age

Polymorphism
All Attractions and Stalls have a class variable int rating
All Attractions and Stalls implement IReviewed and implement a getter for int getRating() and String getName()
ThemePark has a method getAllReviewed() which returns an ArrayList of IReviewed
Extensions
Classes and Abstract Classes
ThemePark stores all Attractions and Stalls in it.
ThemePark has a method visit(Visitor, Attraction)
Interfaces
Note: Starting prices are: £8.40 Rollercoaster, £4.50 Dodgems, £2.80 IceCreamStall, £4.20 CandyFlossStall, £6.60 TobaccoStall

Rollercoaster implements ITicketed and charges tall people over 200cm double fee
Dodgems implements ITicketed and charge half price to children under 12 years old
All Stalls should implement ITicketed but each Stall charges a different amount (suggested prices above)
Park and Playground have no ticketing gate so do not implement ITicketed for these, but all other Attractions do.
Polymorphism
ThemePark has a method getAllAllowedFor(Visitor) which takes a Visitor and returns an ArrayList of IReviewed
ThemePark has a method that can return a string with all reviews, returning a String a little bit like this: Rollercoster: 4, Dodgems: 8, Park: 2, IceCream: 6, TobaccoStall: 1
