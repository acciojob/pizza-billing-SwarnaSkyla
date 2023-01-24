package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg==true){
            this.price+=300;
        }
        else{
            this.price+=400;
        }
        bill="Base Price Of The Pizza: "+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    boolean flaga=false;

    public void addExtraCheese(){
        // your code goes here
        if(flaga==false){
            this.price+=80;
            bill+="Extra Cheese Added: 80\n";
            flaga=true;
        }

    }

    boolean flagb=false;


    public void addExtraToppings(){
        // your code goes here
        if(flagb==false){
            if(isVeg==true){
                this.price+=70;
                bill+="Extra Toppings Added: "+70+"\n";
            }
            else{
                this.price+=120;
                bill+="Extra Toppings Added: "+120+"\n";
            }
            flagb=true;
        }

    }

    boolean flagc=false;
    public void addTakeaway(){
        // your code goes here
        if(flagc==false){
            this.price+=20;
            bill+="Paperbag Added: "+20+"\n";
            flagc=true;
        }

    }

    public String getBill(){
        // your code goes here
        this.bill = ("Base Price Of The Pizza: " + (isVeg?300:400)+
                (flaga?("\nExtra Cheese Added: 80"):" ") +
                (flagb?("\nExtra Toppings Added: "  + (isVeg?70:120)):"") +
                (flagc?("\nPaperbag Added: 20"):"") +
                "\nTotal Price: "+ this.price + "\n"
        );
        return this.bill;
    }
}
