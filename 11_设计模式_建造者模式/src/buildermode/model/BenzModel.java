package buildermode.model;

public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("benz is start~");
    }

    @Override
    protected void alarm() {
        System.out.println("benz is alarm~");
    }

    @Override
    protected void engineBoom() {
        System.out.println("benz is engineBoom~");
    }

    @Override
    protected void stop() {
        System.out.println("benz is stop~");
    }
}
