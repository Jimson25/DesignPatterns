package buildermode.model;

public class BmwModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("bmw is start~");
    }

    @Override
    protected void alarm() {
        System.out.println("bmw is alarm~");
    }

    @Override
    protected void engineBoom() {
        System.out.println("bmw is engineBoom~");
    }

    @Override
    protected void stop() {
        System.out.println("bmw is stop~");
    }
}
