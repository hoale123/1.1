package com.company.composition;

public class AccountApplication {
    //main method to make it run.
    public static void main(String[] args) {
        BetterAccount betterAccount = new BetterAccount("Daniel", "Thanimal","dizzle");


//        betterAccount.setFirstName("Danimal");
//        betterAccount.setLastName("Thanimal");
//        betterAccount.setUsername("dizzle");
//        betterAccount.getFirstName();
//        betterAccount.getLastName();
//        betterAccount.getUsername();

        Address homeAddress = new Address();
        homeAddress.setStreet("1060 W Addison");
        homeAddress.setCity("Chicago");
        homeAddress.setState("Illinois");
        homeAddress.setZipcode("60600");

        betterAccount.setHomeAddress(homeAddress);

        //why this is composition; made up of other objects
//        Address shippingAddress = new Address();

        System.out.println("You have an account!");
        System.out.println(betterAccount.getHomeAddress());//two string
        System.out.println(betterAccount);

        GiftCard giftCard = new GiftCard("Macy", 500, 400);
        System.out.println(giftCard);
    }
}
