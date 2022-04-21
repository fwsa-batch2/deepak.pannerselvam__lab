public class calculator{

    int number1,number2;

    calculator(int n1,int n2){
        number1=n1;
        number2=n2;
    }

    public static void main(String[] args){

        calculator inputs=new calculator(4,10);
        System.out.println(add(inputs.number1,inputs.number2));
        System.out.println(subtract(inputs.number1,inputs.number2));
        System.out.println(multiply(inputs.number1,inputs.number2));
        System.out.println(divide(inputs.number1,inputs.number2));


    }

    public static int add(int n1,int n2){
        return (n1+n2);
    }
    public static int subtract(int n1,int n2){
        return (n1-n2);
    }
    public static int multiply(int n1,int n2){
        return (n1*n2);
    }
    public static int divide(int n1,int n2){
        return (n1/n2);
    }


}