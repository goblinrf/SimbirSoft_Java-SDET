package lection3.Interface.Vehicle;

public interface Loadable {
    <T extends Number> void load(T weight);

    void unload();
}
