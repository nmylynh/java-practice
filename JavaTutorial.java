class LearnJava{
    public static void main(String[] args){
        String exclaim = addExclamationPoint("hot dogs");
        System.out.println(exclaim);
    }

    // in public static void, it really just defines the type that you bring back, so in public static void you're not returning anything, but change it to string you're expecting a string
    public static String addExclamationPoint(String s){
        return s + "!";
    }
}