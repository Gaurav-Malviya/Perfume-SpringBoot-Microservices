# Perfume SpringBoot Microservices
 My love for perfume is stronger than SHA 256 encryption 
Created a two microservices which are perfume microservice and user microservice. The perfume microservice talks to perfume database that contains all the perfumes which are available by the seller user. Other microservice, user microservice, talks to both buyer and seller user database. 
The functionality of microservices are :
1 Create a new buyer and seller.
2 Buyer and seller login using credentials.
3 Activate and deactivate a seller
4 Deleting a deactivated seller which will delete all the perfumes seller sell from the perfume database
5 Buyer can add a perfume to cart or remove a perfume from cart , which will change the available stock in perfume database.
6 Buyer can add a perfume to favourite, remove a perfume from favourite or move a perfume from favourite to cart.
7 One can search all perfume, search based on perfume id or search based on gender.
