// Exception as a class is java built-in
class InvalidAgeException extends Exception{   
    InvalidAgeException(String s){
        super(s);
    }
}

public class customexception {
    static void validate(int age) throws 
    InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("your age is not valid");
        }
        else{
            System.out.println("welcome to vote");
        }
    }
    public static void main(String[] args) {
        try{
            validate(15);
        }
        catch(Exception m){
            System.out.println("Exception occured: "+m);
        }
        System.out.println("rest");
    }
}
