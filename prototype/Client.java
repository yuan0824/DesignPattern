package com.demo.prototype;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cookie cookie = new CoconutCookie();
        CoconutCookie coconutCookie = (CoconutCookie)cookie.clone();
        coconutCookie.showCategory();
    }
}