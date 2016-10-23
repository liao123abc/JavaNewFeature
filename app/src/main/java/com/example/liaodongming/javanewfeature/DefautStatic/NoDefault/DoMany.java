package com.example.liaodongming.javanewfeature.DefautStatic.NoDefault;

/**
 * Created by liaodongming on 2016/10/7.
 *
 * Designing interfaces have always been a tough job because if we want to
 * add additional methods in the interfaces, it will require change in all
 * the implementing classes. As interface grows old, the number of classes
 * implementing it might grow to an extent that it’s not possible to extend
 * interfaces. That’s why when designing an application, most of the frameworks
 * provide a base implementation class and then we extend it and override
 * methods that are applicable for our application.
 *
 */
public interface DoMany {

    public void methodA1();
    public void methodA2();

    public void methodB1();
    public void methodB2();

}
