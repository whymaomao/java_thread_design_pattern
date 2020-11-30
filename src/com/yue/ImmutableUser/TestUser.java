package com.yue.ImmutableUser;

public class TestUser extends Thread {
    private person testPerson;

    public TestUser(person testPerson){
        this.testPerson = testPerson;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName() + " prints " + testPerson);
        }
    }

    public static void main(String[] args){
        person testPerson = new person("Rob", "England");
        new TestUser(testPerson).start();
        new TestUser(testPerson).start();
        new TestUser(testPerson).start();

    }
}
