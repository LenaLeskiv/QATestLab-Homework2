import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = initChromeDriver();
//Скрипт А
        //driver.manage().window().maximize();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLogin&token=d251f363cceb5a849cb7330938c64dea");//открываем страницу
        WebElement login = driver.findElement(By.id("email")); //Поиск элемента по id
        login.sendKeys("webinar.test@gmail.com"); //Ввод значения в поле

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement button = driver.findElement(By.name("submitLogin")); //Поиск кнопки по названию
        waittime(); //вызов метода время ожидания загрузки
        button.submit(); //нажатиена кнопку
        waittime();

        WebElement link = driver.findElement(By.id("employee_infos"));
        link.click();
        waittime();

        WebElement logout = driver.findElement(By.id("header_logout"));
        logout.click();
//Скрипт Б
        WebElement login1 = driver.findElement(By.id("email"));
        login1.sendKeys("webinar.test@gmail.com");

        WebElement password1 = driver.findElement(By.id("passwd"));
        password1.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement button1 = driver.findElement(By.name("submitLogin"));
        waittime(); //вызов метода
        button1.submit();
        waittime();
        //Dashboard
        WebElement dashboard = driver.findElement(By.linkText("Dashboard")); //Поиск по тексту
        dashboard.click();
        System.out.println("Page title is:"+driver.getTitle()); //Вывести в консоль title
        driver.navigate().refresh(); //Обновить страницу
        //Заказы
        WebElement menu1 = driver.findElement(By.linkText("Заказы")); //Поиск по тексту
        menu1.click();
        System.out.println("Page title is:"+driver.getTitle()); //Вывести в консоль title
        driver.navigate().refresh(); //Обновить страницу
        //Каталог
        WebElement menu2 = driver.findElement(By.linkText("Каталог")); //Поиск по тексту
        menu2.click();
        System.out.println("Page title is:"+driver.getTitle()); //Вывести в консоль title
        driver.navigate().refresh(); //Обновить страницу
        //Клиенты
        WebElement menu3 = driver.findElement(By.linkText("Клиенты")); //Поиск по тексту
        menu3.click();
        System.out.println("Page title is:"+driver.getTitle());
        driver.navigate().refresh(); //Обновить страницу
        //Служба поддержки
        WebElement menu4 = driver.findElement(By.linkText("Служба поддержки")); //Поиск по тексту
        menu4.click();
        System.out.println("Page title is:"+driver.getTitle());
        driver.navigate().refresh(); //Обновить страницу
        //Статистика
        WebElement menu5 = driver.findElement(By.linkText("Статистика")); //Поиск по тексту
        menu5.click();
        System.out.println("Page title is:"+driver.getTitle());
        driver.navigate().refresh(); //Обновить страницу
        //Modules
        WebElement menu6 = driver.findElement(By.linkText("Modules")); //Поиск по тексту
        menu6.click();
        System.out.println("Page title is:"+driver.getTitle());
        driver.navigate().refresh(); //Обновить страницу
        //Design
        WebElement menu7 = driver.findElement(By.linkText("Design")); //Поиск по тексту
        menu7.click();
        System.out.println("Page title is:"+driver.getTitle());
        driver.navigate().refresh(); //Обновить страницу
        //Доставка
        WebElement menu8 = driver.findElement(By.linkText("Доставка")); //Поиск по тексту
        menu8.click();
        System.out.println("Page title is:"+driver.getTitle());
        driver.navigate().refresh(); //Обновить страницу
        //Способ оплаты
        WebElement menu9 = driver.findElement(By.linkText("Способ оплаты")); //Поиск по тексту
        menu9.click();
        System.out.println("Page title is:"+driver.getTitle());
        driver.navigate().refresh(); //Обновить страницу
        //International
        WebElement menu10 = driver.findElement(By.linkText("International")); //Поиск по тексту
        menu10.click();
        System.out.println("Page title is:"+driver.getTitle());
        driver.navigate().refresh(); //Обновить страницу
        //Shop Parameters
        WebElement menu11 = driver.findElement(By.linkText("Shop Parameters")); //Поиск по тексту
        menu11.click();
        System.out.println("Page title is:"+driver.getTitle());
        driver.navigate().refresh(); //Обновить страницу
        //Конфигурация
        WebElement menu12 = driver.findElement(By.linkText("Конфигурация")); //Поиск по тексту
        menu12.click();
        System.out.println("Page title is:"+driver.getTitle());
        driver.navigate().refresh(); //Обновить страницу

    }
        public static WebDriver initChromeDriver() {
            System.setProperty("webdriver.chrome.driver",Test.class.getResource("chromedriver.exe").getPath());
            return new ChromeDriver();
        }
        public static void waittime() {   //создание метода время ожидания загрузки
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
