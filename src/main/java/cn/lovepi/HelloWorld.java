package cn.lovepi;

public class HelloWorld {
    private String userNme;

    public HelloWorld() {
        System.out.println("HelloWorld Non Parametric Constructor");
    }

    public String getUserNme() {
        return "Hello "+userNme;
    }

    public void setUserNme(String userNme) {
        this.userNme = userNme;
    }

}
