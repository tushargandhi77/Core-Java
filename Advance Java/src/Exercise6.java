class invalidInputException extends Exception
{
    public String toString(){
        return "Cannot add 8 and 9";
    }
    public String getMassage(){
        return "I am getMassage";
    }
}
class CannotDivideByZero extends Exception
{
    public String toString(){
        return "Cannot divide by zero";
    }
    public String getMassage(){
        return "I am getMassage";
    }
}
class MaxInputException extends Exception
{
    public String toString(){
        return "Input greater than 100000";
    }
    public String getMassage(){
        return "I am getMassage";
    }
}

class CustomCalc{
    double add(double a,double b) throws invalidInputException,MaxInputException
    {
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a==8 || b==9)
        {
            throw new invalidInputException();
        }
        return a+b;
    }
    double subtract(double a,double b) throws MaxInputException
    {
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a,double b) throws MaxInputException
    {
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a*b;
    }
    double divide(double a,double b) throws CannotDivideByZero{
        if(b==0){
            throw new CannotDivideByZero();
        }
        return a/b;
    }

}
public class Exercise6 {
    public static void main(String[] args) throws invalidInputException, CannotDivideByZero ,MaxInputException{
        CustomCalc c = new CustomCalc();
        c.add(100000000,9);
//        c.divide(3,0);
    }
}
