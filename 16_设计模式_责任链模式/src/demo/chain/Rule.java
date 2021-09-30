package demo.chain;

public interface Rule {

    void init();

    void end();

    void process();

    void before();

    void destroy();
}
