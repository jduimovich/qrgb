package ca.northdepot;

public class Response {
    final static int LOOP = 10;
    final static int PARAM = 12;
    static int allTimeCount = 0;

    public String version;
    public String colour;
    public String compute;
    public int count;
    public long time;
    public int loop;
    public String function;
    public int param;

    public Response() {
    }

    public Response(String version, String colour) {
        this.version = version;
        this.colour = colour;
        this.count = ++allTimeCount;
        this.compute = PARAM > 12 ? "slow" : "fast";
        long start = System.currentTimeMillis();
        this.param = PARAM;
        this.loop = LOOP;
        this.function = "fib(" + PARAM + ")";
        int i = LOOP;
        while (i-- > 0)
            fib(PARAM);
        long end = System.currentTimeMillis();
        this.time = end - start;
    }

    private int fib(int n) {
        if (n < 3)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
}