package ca.northdepot;

public class Response {
    static int allTimeCount = 0;

    public String version;
    public String colour;
    public int count;
    public long time;
    public String compute;
    public int loop;
    public int param;

    public Response() {
    }

    public Response(String version, String colour, int loop, int param) {
        this.version = version;
        this.colour = colour;
        this.count = ++allTimeCount;
        this.param = param;
        this.loop = loop;
        this.compute = "fib(" + param + ")";

        long start = System.currentTimeMillis();
        int i = loop;
        while (i-- > 0)
            fib(param);
        long end = System.currentTimeMillis();
        this.time = end - start;
    }

    private int fib(int n) {
        if (n < 3)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
}