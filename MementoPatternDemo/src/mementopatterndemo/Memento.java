/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementopatterndemo;

/**
 *
 * @author Nicolas Sá de Souza
 */
public class Memento{
   private String state;

   public Memento(String state){
      this.state=state;
   }
   
   public String getState(){
      return state;
   }
}