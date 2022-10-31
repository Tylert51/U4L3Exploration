public class Runner {
    public static void main(String[] args) {
        WhileLoopFun fun = new WhileLoopFun();
        System.out.println(fun.maxDoubles(4, 20));
        System.out.println(fun.maxDoubles(2, 65));
        System.out.println(fun.maxDoubles(5, 500));
        System.out.println(fun.maxDoubles(2, 64));
        System.out.println(fun.maxDoubles(2, 63));
        System.out.println(fun.maxDoubles(8, 10));
        System.out.println(fun.maxDoubles(8, 5));


    }
}
