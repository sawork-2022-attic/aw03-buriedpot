# WebPOS

The demo shows a simple POS system in MVC architecture, which replaces the shell interface in aw02 with a pos web ui (https://github.com/bshbsh404/simple-pos-ui
).

![](screenshot.png)

To run

```shell
mvn clean spring-boot:run
```

Currently, it just lists the products for sale with a cart with one item (just for demonstration). 

Please read the tutorial at  https://www.baeldung.com/spring-boot-crud-thymeleaf and make the POS system robust and fully functional. You can also refer to other articles, for instance https://www.baeldung.com/tag/thymeleaf/ .



And please elaborate your understanding in MVC architecture via this homework in your README.md.



# My understanding in MVC

MVC divides the software system into three basic parts. They are model, view and controller.

Model: Store data.

View: Show data.

Controller: Handle input and output. Transfer data from view to model.



**Advantages**:

Low coupling, high reuse, high maintainability,



**Disadvantages**:

Not suitable for small scale programs, low efficiency.



**Example**:

A calculator's screen and keyboard are the View. The numbers need to be calculated are the Model. The calculate functions are the Controller.

