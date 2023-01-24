package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extraCheesePrice=80;
    private int extraToppingsPriceforveg=70;
    private int extraToppingsPriceforNonveg=120;

    private int backPackPrice=20;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isExtraToppingsforVeg=false;
    private boolean isExtraToppingsforNonVeg=false;
    private boolean isOpted=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        isExtraCheeseAdded=true;
//       "Extra cheese added"
        this.price+=extraCheesePrice;

    }

    public void addExtraToppings(){
        // your code goes here
        isExtraToppingsAdded=true;
//       "Extra toppings Added"
        if(this.isVeg){
            this.price+=extraToppingsPriceforveg;
        }
        else{
            this.price+=extraToppingsPriceforNonveg;
        }

    }

    public void addTakeaway(){
        // your code goes here
        isOpted=true;
//       "Take Away opted";
        this.price+=backPackPrice;

    }

    public String getBill(){
        // your code goes here
        String bill="";
        System.out.println("Base Price Of The Pizza:"+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="Extra Cheese Added:"+extraCheesePrice+"\n";

        }
        if(isExtraToppingsAdded){
            if(isExtraToppingsforVeg) {
                bill += "Extra Toppings Added:" +extraToppingsPriceforveg + "\n";
            }
            else{
                bill+="Extra Toppings Added:"+ extraToppingsPriceforNonveg +"\n";
            }
        }
        if(isOpted){
            bill+="Paperbag Added:"+backPackPrice+"\n";
        }

        bill+="Total Price:"+this.price +" \n";

        return bill;
    }
}
