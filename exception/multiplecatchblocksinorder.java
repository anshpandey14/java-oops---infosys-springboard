public class multiplecatchblocksinorder {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[5] = 30/1;
        }
        catch(ArithmeticException e){
            System.out.println("task1 is completed");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("task 2 completed");
        }
        catch(Exception e){
            System.out.println("common task completed.");
        }
        System.out.println("Rest of the code...");
    }
}
