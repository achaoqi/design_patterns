package diagram.pattern.facade;

import diagram.pattern.facade.pagemaker.PageMaker;

public class Client {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com","welcome.html");
    }
}
