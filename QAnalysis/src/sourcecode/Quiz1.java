package sourcecode;

public class Quiz1 {

    public static void main(String[] args) {

        String str = "10";
        int iVal = 0;
        Double dVal = 0.0;

        try{
            iVal = Integer.parseInt(str, 2);  //1
            if((dVal = Double.parseDouble(str)) == iVal){ //2
                System.out.println("Equal");

            }

        }catch(NumberFormatException e){
            System.out.println("Exception in parsing");
        }
        System.out.println(iVal+" "+dVal);
    }
}
