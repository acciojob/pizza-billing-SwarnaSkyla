package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    final int extracheeseprice=80;
    final int extratoppingsforvegprice=70;
    final int extratoppingsforNonvegprice=120;
    final int bagpack=20;

    private int basepizzaprice;

    private boolean isExtraToppingsAdded=false;
    private boolean isExtraCheeseAdded=false;
    private boolean isOpted=false;

    private boolean isExtraToppingsveg=false;
    private boolean isExtraToppingsNonveg=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price=300;
        }
        else{
            this.price=400;
        }
         basepizzaprice=this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        isExtraCheeseAdded=true;
        this.price+=extracheeseprice;
    }

    public void addExtraToppings(){
        // your code goes here
        isExtraToppingsAdded=true;
        if(this.isVeg){
            this.price+=extratoppingsforvegprice;
        }
        else{
            this.price+=extratoppingsforNonvegprice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        isOpted=true;
        this.price+=bagpack;
    }

    public String getBill(){
        // your code goes here
        String bill="";

        System.out.println("Base Price Of The Pizza:"+basepizzaprice);

        if(isExtraCheeseAdded){
            bill+="Extra Cheese Added: "+extracheeseprice+"\n";
        }
        if(isExtraToppingsAdded){
            if(this.isVeg){
                bill+="Extra Toppings Added: "+extratoppingsforvegprice+"\n";
            }
            else{
                bill+="Extra Toppings Added: "+extratoppingsforNonvegprice+"\n";
            }
        }
        if(isOpted){
            bill+="Paperbag Added: "+bagpack+"\n";
        }
        bill+="Total Price:"+this.price+"\n";
        return bill;
    }
}
