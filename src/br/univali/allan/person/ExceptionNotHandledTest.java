package br.univali.allan.person;

public class ExceptionNotHandledTest {

    private void method1(){
        System.out.println("Entrei em method1()");
        System.out.println("method1() --> method2(): empilha o endereço " +
        "de method 1 e vai para o endereço de method 2");
        try {
            method2();
        }catch(ArithmeticException ex){
            System.out.println("********* Capturei a exceção em method1");
            System.out.println("********* mensagem default da exceção: " + ex.getMessage());
        }
        System.out.println("voltei para method1()");
    }

    private void method2(){
        System.out.println("Entrei em method2()");
        System.out.println("method2() --> method3(): empilha o endereço " +
                "de method 2 e vai para o endereço de method 3");
        method3();
        System.out.println("voltei para method2()");
        System.out.println("desempilha o endereço de method 1 e vai para " +
                "este endereço");
    }

    private void method3(){
        System.out.println("Entrei em method3()");
        try {
            int divisao = 100 / 0;
            System.out.println(divisao);
        }catch(ArithmeticException ex){
            System.out.println("********* mensagem default da exceção: " + ex.getClass() + " : " + ex.getMessage() +
                    " | " + ex.getCause());
        } finally{
            System.out.println("######### parte finally é sempre executada");
        }

        System.out.println("desempilha o endereço de method 2 e vai para " +
                "este endereço");
    }
    public void run(){
        System.out.printf("***** ExceptionNotHandledTest ***** \n");
        method1();
    }
}
