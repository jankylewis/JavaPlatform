package creationalPattern.builderPattern.sample2;

public class Computer {

    public Computer(ComputerBuilder computerBuilder) {
        _cpu = computerBuilder._cpu;
        _ram = computerBuilder._ram;
        _storage = computerBuilder._storage;
        _gpu = computerBuilder._gpu;
    }

    private final String _cpu;
    private final String _ram;
    private final String _storage;
    private final String _gpu;

    @Override
    public String toString() {
        return "Computer [CPU=" + _cpu + ", RAM=" + _ram + ", Storage=" + _storage + ", GPU=" + _gpu + "]";
    }
}
