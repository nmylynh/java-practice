import java.util.HashMap;

class HashMapAwesomeness {
    public static void main(String[] args){
        // int a = 10;
        // int b = 3;
        // int c = 88;

        // HashMap<String, Integer> happy = new HashMap<String, Integer>();
        // happy.put("a", 10);
        // happy.put("b", 3);
        // happy.put("c", 88);

        // System.out.println(happy.get("c"));

        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("bobbyJoe1996", "FluffyP0nies!");
        fun.put("hellKittyFan21", "AloeVera?");
        fun.put("coolguyswag", "password123");

        fun.remove("helloKittyFan21");

        // get keys and values:
        // keys:
        System.out.println(fun.containsKey("coolguyswag"));
        // outputs true

        // values:
        System.out.println(fun.containsValue("password123"));
        // outputs true

        // prints out hashmap
        System.out.println(fun);
        // prints out keys
        System.out.println(fun.keySet());
        // prints out values
        System.out.println(fun.values());
    }
}