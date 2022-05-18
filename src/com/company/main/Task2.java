package com.company.main;
enum TrafficLightColor{
    RED, GREEN, YELLOW
}
 public class Task2 {
   TrafficLightColor tlc  = TrafficLightColor.RED;

   public void changeColor(){
       switch (tlc){
           case RED:
               tlc = TrafficLightColor.GREEN;
               break;
           case YELLOW:
               tlc = TrafficLightColor.RED;
               break;
           case GREEN:
               tlc = TrafficLightColor.YELLOW;
               break;

       }
   }
   public String toString() {
       return " " + tlc;
   }
}

class TrafficLight{
    public static void main(String[] args){
        Task2 tls = new Task2();
        for(int i = 0; i<9; i++){
            System.out.println(tls);
            tls.changeColor();
        }
    }
}