package Utilities;

public class Action {
    private  int number;
    private String action;
    public Action(int number, String action){
        this.number=number;
        this.action=action;
    }
    public int getNumber(){
        return number;
    }
    public String getAction(){
        return action;
    }
    public String toString(){
        return "action NUMBER: "+number+"\nACTION: "+action+"\n";
    }
}
