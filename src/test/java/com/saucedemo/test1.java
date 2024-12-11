package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
    WebDriver driver;

    @BeforeTest
    public void conexion(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://institutoweb.com.ar/test/test2024/checkout/");
    }

    @Test
    public void mi_test() throws InterruptedException {
        WebElement nombre = driver.findElement(By.id("firstName"));
        WebElement apellido = driver.findElement(By.id("lastName"));
        nombre.sendKeys("Juan");
        apellido.sendKeys("Gomez");
        Thread.sleep(4000);
    }

    @AfterTest
    public void cerrar(){
        driver.quit();
    }
}

