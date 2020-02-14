class BooleanInJava {
    public static void main(String[] args){
        // comparison operators
        int a = 0;
        boolean b = a == 0; // evals to true

        System.out.println(b);

        boolean passedDoor = true;
        boolean missedDoor = false;
        int doorCount = 0;

        if(passedDoor){
            System.out.println("We are in the if statement!");
            doorCount++;
        }
        if(missedDoor){
            System.out.println("We passed the second door!");
        }
        if(passedDoor){
            System.out.println("We passed the third door!");
            doorCount++;
        }

        if(doorCount == 3){
            System.out.println("Congrats you passed all doors!!");
        } else {
            System.out.println("You passed jack.");
        }
    }
}