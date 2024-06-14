package com.aqiu.pattern.memento.write_box;

public class Client {
    public static void main(String[] args) {
        System.out.println("------------大战Boss前------------");
        GameRole gameRole=new GameRole();
        RoleStateMemento state = gameRole.saveState();
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleStateMemento(state);
        gameRole.stateDisplay();
        System.out.println("------------大战Boss后------------");
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("------------恢复------------");
        gameRole.recoverState(caretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
