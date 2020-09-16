package com.subarna.lambda.runner;


import com.subarna.lambda.functions.MyPredicate;

/*




public class MyPredicateClass<String>  implements MyPredicate<String>  {

    @Overide
    public boolean predicateTest(String str){
    return str.length() > 10 ;

}

public interface MyPredicate<T> {

    public boolean predicateTest(T t);

}

 */
public class Java7Traditional {

    public static void main(String[] args) {

        MyPredicate<String> myPredicate = new MyPredicate<String>() {
            @Override
            public boolean predicateTest(String s) {
                return s.length() > 10;
            }
        };


        System.out.println(myPredicate.predicateTest("Hello"));

        MyPredicate<String> myPredicateWithLambda = x -> {
            System.out.println("Hello from lamba");
            return x.length() > 10;
        };

        System.out.println(myPredicateWithLambda.predicateTest("SaritGainewithlambda"));

        MyPredicate<String> myPredicateWithLambdaShortHand = x -> x.length() > 10;

        MyPredicate<String> myPredicateWithLambdaWithTypeInference = (String x) -> {
            System.out.println("Hello from lamba");
            return x.length() > 10;
        };


        System.out.println(myPredicateWithLambdaWithTypeInference.predicateTest("Hello from Sarit"));

        final boolean sarit = MyPredicate.staticCheck("Sarit");


    }

}
